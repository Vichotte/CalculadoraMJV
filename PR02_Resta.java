package PRACTICA02;

public class PR02_Resta {

    private double operando1;
    private double operando2;

    public static double resta(double operando1, double operando2){

        double resul = operando1 - operando2;


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