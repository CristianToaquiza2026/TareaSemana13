/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tareasemana13;

/**
 *
 * @author Cristian Toaquiza
 */
public class TareaSemana13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Datos para probar el programa
        double horasTrabajadas = 40;
        double pagoHora = 12.5;

        // Llamada al método para obtener el total
        double salarioFinal = calcularSalario(horasTrabajadas, pagoHora);
        
        System.out.println("El sueldo total es: " + salarioFinal);
    }

    // Método que calcula el sueldo multiplicando horas por pago
    public static double calcularSalario(double horas, double pago) {
        double total = horas * pago;
        return total;
    }
    
}