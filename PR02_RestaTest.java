package PRACTICA02;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;



class PR02_RestaTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Prueba Unitaria Resta 01")
    void pr_resta() {

        double op1 = 5.0;
        double op2 = 4.5;
        double resultado_esperado = 0.50;
        double resultado_real = PR02_Resta.resta(op1,op2);
        assertEquals(resultado_esperado,resultado_real);

    }

    @Test
    @Disabled("Prueba Unitaria Resta 02 FALLO")
    void pr_resta2() {

        double op1 = 5.4;
        double op2 = 4.5;
        double resultado_esperado = 1.00;
        double resultado_real = PR02_Resta.resta(op1,op2);
        assertEquals(resultado_esperado,resultado_real);

    }

    @ParameterizedTest()
    @CsvSource({
         "5.0,4.5,0.5",
         "5.0,4.5,1.0"})

    void param_resta(double op1, double op2, double resultado_esperado) {
        assertEquals(resultado_esperado, PR02_Resta.resta(op1,op2));
    }



}