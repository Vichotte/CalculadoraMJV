package PRACTICA02;

public class PR02_Multiplicacion {

    /**
     * @author Marcos Jimenez Vicho
     * @version 1.0
     */

    private double operando1;
    private double operando2;

    /**
     *
     * @param operando1 Es el operando numero 1 que el usuario mete en {@link PR02_Calculadora}
     * @param operando2 Es el operando numero 2 que el usuario mete en {@link PR02_Calculadora}
     * @return Devuelve el resultado de la multiplicacion
     * @serialData Hace una simple multiplicacion con los parametros pasados por consola al usuario
     */

    public static double multiplicacion(double operando1, double operando2){

        double resul = operando1 * operando2;


       return resul;

    }

    public double getOperando1() {
        return operando1;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }


}
