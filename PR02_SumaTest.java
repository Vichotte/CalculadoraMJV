package PRACTICA02;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Marcos Jimenez Vicho
 * @version 1.0
 */

class PR02_SumaTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Prueba Unitaria Suma 01")
    void pr_suma() {

        double op1 = 0.5;
        double op2 = 0.5;
        double resultado_esperado = 1.00;
        double resultado_real = PR02_Suma.suma(op1,op2);
        assertEquals(resultado_esperado,resultado_real);

        /**
         * @param op1 Operando numero uno dado en la propia prueba
         * @param op2 Operando numero dos dado en la propia prueba
         *
         * @param resultado_esperado Valor que se asigna en la propia prueba e indica el propio valor que se espera de la prueba
         * @param resultado_real Valor que se asigna en la propria prueba e indica el resultado real de la operacion
         */

    }

    @Test
    @Disabled("Prueba Unitaria Suma 02 FALLO")
    void pr_suma2() {

        double op1 = 0.4;
        double op2 = 0.5;
        double resultado_esperado = 1.00;
        double resultado_real = PR02_Suma.suma(op1,op2);
        assertEquals(resultado_esperado,resultado_real);

        /**
         * @deprecated Este test está creado a proposito para que falle y esta deshabilitado
         * @param op1 Operando numero uno dado en la propia prueba
         * @param op2 Operando numero dos dado en la propia prueba
         *
         * @param resultado_esperado Valor que se asigna en la propia prueba e indica el propio valor que se espera de la prueba
         * @param resultado_real Valor que se asigna en la propria prueba e indica el resultado real de la operacion
         */

    }

    @ParameterizedTest()
    @CsvSource({
         "0.5,0.5,1",
         "0.4,0.5,1"})

    void param_suma(double op1, double op2, double resultado_esperado) {
        assertEquals(resultado_esperado, PR02_Suma.suma(op1,op2));
    }

    /**
     * @param op1 Operando numero uno dado en la propia prueba parametrizada
     * @param op2 Operando numero dos dado en la propia prueba parametrizada
     *
     * @param resultado_esperado Valor que se asigna en la propia prueba e indica el propio valor que se espera de la prueba
     */

}