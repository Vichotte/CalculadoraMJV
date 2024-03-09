package PRACTICA02;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PR02_MultiplicacionTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Prueba Unitaria Multiplicacion 01")
    void pr_multiplicacion() {

        double op1 = 5.0;
        double op2 = 5.0;
        double resultado_esperado = 25.00;
        double resultado_real = PR02_Multiplicacion.multiplicacion(op1,op2);
        assertEquals(resultado_esperado,resultado_real);

    }

    @Test
    @Disabled("Prueba Unitaria Multiplicacion 02 FALLO")
    void pr_multiplicacion2() {

        double op1 = 5.0;
        double op2 = 10.1;
        double resultado_esperado = 50.00;
        double resultado_real = PR02_Multiplicacion.multiplicacion(op1,op2);
        assertEquals(resultado_esperado,resultado_real);

    }

    @ParameterizedTest()
    @CsvSource({
         "5.0,5.0,25.0",
         "5.0,10.1,50.0"})

    void param_multiplicacion(double op1, double op2, double resultado_esperado) {
        assertEquals(resultado_esperado, PR02_Multiplicacion.multiplicacion(op1,op2));
    }



}