package PRACTICA02;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PR02_DivisionTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Prueba Unitaria Division 01")
    void pr_division() {

        double op1 = 5.0;
        double op2 = 5.0;
        double resultado_esperado = 1.00;
        double resultado_real = PR02_Division.division(op1,op2);
        assertEquals(resultado_esperado,resultado_real);

    }

    @Test
    @Disabled("Prueba Unitaria Division 02 FALLO")
    void pr_division2() {

        double op1 = 10.0;
        double op2 = 2.0;
        double resultado_esperado = 6.00;
        double resultado_real = PR02_Division.division(op1,op2);
        assertEquals(resultado_esperado,resultado_real);

    }

    @ParameterizedTest()
    @CsvSource({
         "5.0,5.0,1.0",
         "10.0,2.0,6.0"})

    void param_division(double op1, double op2, double resultado_esperado) {
        assertEquals(resultado_esperado, PR02_Division.division(op1,op2));
    }



}