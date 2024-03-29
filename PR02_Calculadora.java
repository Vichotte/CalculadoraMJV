package PRACTICA02;

import java.util.Scanner;

public class PR02_Calculadora {

    /**
     * @author Marcos Jimenez Vicho
     * @version 1.0
     */


      static Scanner pide = new Scanner(System.in);

    public static void main(String[] args) {

        String opcion1 = "";
        double operando1 = 00.0;
        double operando2 = 0.0;


        do {

            //------------------------- MENU PRINCIPAL ------------------------------

            System.out.println();
            System.out.println("¡Bienvenido a la Calculadora!");
            System.out.println("¿Que operacion quieres realizar?");

            System.out.println("___ MENU ___");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.println("____________");

            System.out.print("> ");
            opcion1 = pide.next();

            //-----------------------------------------------------------------------

            /**
             * @param opcion1 La opcion numerica que el usuario introdujo anteriormente
             */


            switch(opcion1){

                case "0":
                    break;

                case "1":

                    System.out.println("Okay, vamos a SUMAR");
                    PR02_Suma Suma = new PR02_Suma();

                    /**
                     * @param operando1 El primer operando que el usuario introdujo en la suma
                     */

                    System.out.println("Indica el primer operando");
                    System.out.print("> ");
                    operando1 = pide.nextDouble();
                    Suma.setOperando1(operando1);

                    /**
                     * @param operando2 El segundo operando que el usuario introdujo en la suma
                     *
                     * Las sumas se realizaran en la clase {@link PR02_Suma }
                     * Las pruebas de esa clase se realizaran en {@link PR02_SumaTest}
                     */


                    System.out.println("Indica el segundo operando");
                    System.out.print("> ");
                    operando2 = pide.nextDouble();
                    Suma.setOperando2(operando2);

                    System.out.printf(">> El resultado de sumar " + Suma.getOperando1() + " y " + Suma.getOperando2() + " es " + "%.3f", Suma.suma(operando1,operando2));
                    break;

                case "2":

                    System.out.println("Okay, vamos a RESTAR");
                    PR02_Resta Resta = new PR02_Resta();

                    /**
                     * @param operando1 El primer operando que el usuario introdujo en la resta
                     */

                    System.out.println("Indica el primer operando");
                    System.out.print("> ");
                    operando1 = pide.nextDouble();
                    Resta.setOperando1(operando1);

                    /**
                     * @param operando2 El segundo operando que el usuario introdujo en la resta
                     *
                     * Las restas se realizaran en la clase {@link PR02_Resta }
                     * Las pruebas de esa clase se realizaran en {@link PR02_RestaTest}
                     */

                    System.out.println("Indica el segundo operando");
                    System.out.print("> ");
                    operando2 = pide.nextDouble();
                    Resta.setOperando2(operando2);

                    System.out.printf(">> El resultado de restar " + Resta.getOperando1() + " y " + Resta.getOperando2() + " es " + "%.3f", Resta.resta(operando1,operando2));
                    break;

                case "3":

                    System.out.println("Okay, vamos a MULTIPLICAR");
                    PR02_Multiplicacion Multiplicacion = new PR02_Multiplicacion();

                    /**
                     * @param operando1 El primer operando que el usuario introdujo en la multiplicacion
                     */

                    System.out.println("Indica el primer operando");
                    System.out.print("> ");
                    operando1 = pide.nextDouble();
                    Multiplicacion.setOperando1(operando1);

                    /**
                     * @param operando2 El segundo operando que el usuario introdujo en la multiplicacion
                     *
                     * Las multiplicaciones se realizaran en la clase {@link PR02_Multiplicacion }
                     * Las pruebas de esa clase se realizaran en {@link PR02_MultiplicacionTest}
                     */

                    System.out.println("Indica el segundo operando");
                    System.out.print("> ");
                    operando2 = pide.nextDouble();
                    Multiplicacion.setOperando2(operando2);

                    System.out.printf(">> El resultado de multiplicar " + Multiplicacion.getOperando1() + " y " + Multiplicacion.getOperando2() + " es " + "%.3f", Multiplicacion.multiplicacion(operando1,operando2));
                    break;

                case "4":

                    System.out.println("Okay, vamos a DIVIDIR");
                    PR02_Division Division = new PR02_Division();

                    /**
                     * @param operando1 El primer operando que el usuario introdujo en la division
                     */

                    System.out.println("Indica el primer operando");
                    System.out.print("> ");
                    operando1 = pide.nextDouble();
                    Division.setOperando1(operando1);

                    /**
                     * @param operando2 El segundo operando que el usuario introdujo en la division
                     *
                     * Las divisiones se realizaran en la clase {@link PR02_Division }
                     * Las pruebas de esa clase se realizaran en {@link PR02_DivisionTest}
                     */


                    System.out.println("Indica el segundo operando");
                    System.out.print("> ");
                    operando2 = pide.nextDouble();
                    Division.setOperando2(operando2);

                    System.out.printf(">> El resultado de " + Division.getOperando1() + " y " + Division.getOperando2() + " da como cociente " + "%.3f", Division.division(operando1,operando2));
                    break;

                default:
                    System.out.println("Valor no valido");
            }

            } while(!opcion1.equalsIgnoreCase("0"));


    }

}
