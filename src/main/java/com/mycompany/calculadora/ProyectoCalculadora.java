/*
 * Click nbfJ://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.calculadora;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ProyectoCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        String opcion = "";
        String operacion = "";
        String operador, operando;
        boolean validar, validar2;

        do {
            opcion = (JOptionPane.showInputDialog(null, "Seleccione una opción\n" + "\n" + "1. Realizar una operacion\n" + "2. Salir", "                              Menu Principal", JOptionPane.INFORMATION_MESSAGE));
            validar = isNumber(opcion);
            if (isNumber(opcion)) {
                do {
                    switch (opcion) {
                        case "1":
                            operacion = (JOptionPane.showInputDialog(null, "Seleccione una operación\n" + "\n" + "1. Suma\n" + "2. Resta\n" + "3. Multiplicacion\n" + "4. Division\n" + "5. Potencia\n" + "6. Raiz cuadrada\n" + "7. Regresar al menu principal", "                              Menu Operacion", JOptionPane.INFORMATION_MESSAGE));
                            validar = isNumber(operacion);
                            if (isNumber(operacion)) {
                                switch (operacion) {
                                    case "1":
                                        operador = (JOptionPane.showInputDialog("Digite primer valor"));
                                        operando = (JOptionPane.showInputDialog("Digite segundo valor"));
                                        validar2 = isNumber2(operador, operando);
                                        if (validar2) {
                                            ClsCalculadora suma = new ClsCalculadora(Double.parseDouble(operador), Double.parseDouble(operando));
                                            suma.sumar();
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Digite Solo valores numericos");
                                        }
                                        break;
                                    case "2":
                                        operador = (JOptionPane.showInputDialog("Digite primer valor"));
                                        operando = (JOptionPane.showInputDialog("Digite segundo valor"));
                                        validar2 = isNumber2(operador, operando);
                                        if (validar2) {
                                            ClsCalculadora resta = new ClsCalculadora(Double.parseDouble(operador), Double.parseDouble(operando));
                                            resta.restar();
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Digite Solo valores numericos");
                                        }
                                        break;
                                    case "3":
                                        operador = (JOptionPane.showInputDialog("Digite primer valor"));
                                        operando = (JOptionPane.showInputDialog("Digite segundo valor"));
                                        validar2 = isNumber2(operador, operando);
                                        if (validar2) {
                                            ClsCalculadora multi = new ClsCalculadora(Double.parseDouble(operador), Double.parseDouble(operando));
                                            multi.multipliar();
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Digite Solo valores numericos");
                                        }
                                        break;
                                    case "4":
                                        operador = (JOptionPane.showInputDialog("Digite primer valor"));
                                        operando = (JOptionPane.showInputDialog("Digite segundo valor"));
                                        validar2 = isNumber2(operador, operando);
                                        if (validar2) {
                                            ClsCalculadora div = new ClsCalculadora(Double.parseDouble(operador), Double.parseDouble(operando));
                                            div.dividir();
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Digite Solo valores numericos");
                                        }
                                        break;
                                    case "5":
                                        operador = (JOptionPane.showInputDialog("Digite primer valor"));
                                        operando = (JOptionPane.showInputDialog("Digite segundo valor"));
                                        validar2 = isNumber2(operador, operando);
                                        if (validar2) {
                                            ClsCalculadora pot = new ClsCalculadora(Double.parseDouble(operador), Double.parseDouble(operando));
                                            pot.potencia();
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Digite Solo valores numericos");
                                        }
                                        break;
                                    case "6":
                                        operador = (JOptionPane.showInputDialog("Digite valor"));
                                        validar2 = isNumber(operador);
                                        if (validar2) {
                                            ClsCalculadora root = new ClsCalculadora(Double.parseDouble(operador));
                                            root.raiz();
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Digite solo valores numericos");
                                        }
                                        break;
                                    case "7":
                                        break;
                                }
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "Digite Solo valores numericos");
                                break;
                            }
                        case "2":
                            JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro programa");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Digite valores correctos\n" + "\n" + "1. Para realizar operacion\n" + "2. Para salir del programa");
                            break;
                    }
                } while ((validar == false) || ((Short.parseShort(operacion) >= 1) && (Short.parseShort(operacion) < 7)));
            } else {
                JOptionPane.showMessageDialog(null, "Digite valores correctos\n" + "\n" + "1. Para realizar operacion\n" + "2. Para salir del programa");
            }
        } while ((validar == false) || (Short.parseShort(opcion) <= 1 || Short.parseShort(opcion) > 2));

    }

    public static boolean isNumber(String in) {

        try {
            Integer.parseInt(in);
            return true;
        } catch (Exception E) {
            return false;
        }
    }

    public static boolean isNumber2(String in, String on) {

        try {
            Integer.parseInt(in);
            Integer.parseInt(on);
            return true;
        } catch (Exception E) {
            return false;
        }
    }

}
