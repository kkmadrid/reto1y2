/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author Usuario
 */
public class ClsCalculadora {

    public double Operador;
    public double Operando;

    public ClsCalculadora() {
    }

    public ClsCalculadora(double Operador, double Operando) {
        this.Operador = Operador;
        this.Operando = Operando;
    }

    public ClsCalculadora(double Operador) {
        this.Operador = Operador;
        this.Operando = Operando;
    }

    public double getOperador() {
        return Operador;
    }

    public void setOperador(double Operador) {
        this.Operador = Operador;
    }

    public double getOperando() {
        return Operando;
    }

    public void setOperando(double Operando) {
        this.Operando = Operando;
    }

    public void sumar() {
        DecimalFormat df = new DecimalFormat("#.00");
        double suma = this.Operador + this.Operando;
        JOptionPane.showMessageDialog(null, df.format(suma), "El resultado de la suma es", JOptionPane.INFORMATION_MESSAGE);
    }

    public void restar() {
        DecimalFormat df = new DecimalFormat("#.00");
        double resta = this.Operador - this.Operando;
        JOptionPane.showMessageDialog(null, df.format(resta), "El resultado de la resta es", JOptionPane.INFORMATION_MESSAGE);
    }

    public void multipliar() {
        DecimalFormat df = new DecimalFormat("#.00");
        double multi = this.Operador * this.Operando;
        JOptionPane.showMessageDialog(null, df.format(multi), "El resultado de la multiplicacion es", JOptionPane.INFORMATION_MESSAGE);
    }

    public void dividir() {
        DecimalFormat df = new DecimalFormat("#.00");
        double div = this.Operador / this.Operando;
        if (this.Operando != 0) {
            JOptionPane.showMessageDialog(null, df.format(div), "El resultado de la division es", JOptionPane.INFORMATION_MESSAGE);
        }else{
        JOptionPane.showMessageDialog(null,"Division por cero Indeterminada");
        }
    }

    public void potencia() {
        DecimalFormat df = new DecimalFormat("#.00");
        double pot = Math.pow(this.Operador, this.Operando);
        JOptionPane.showMessageDialog(null, df.format(pot), "El resultado de la potencia es", JOptionPane.INFORMATION_MESSAGE);
    }

    public void raiz() {
        DecimalFormat df = new DecimalFormat("#.00");
        double root = Math.sqrt(this.Operador);
        JOptionPane.showMessageDialog(null, df.format(root), "La raiz cuadrada de ", JOptionPane.INFORMATION_MESSAGE);
    }
}
