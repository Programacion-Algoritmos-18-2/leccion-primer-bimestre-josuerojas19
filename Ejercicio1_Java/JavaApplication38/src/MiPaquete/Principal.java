/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiPaquete;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Datos Empleado");
        Empleado e1 = new Empleado ("Luis","Benitez","11115526",0);
        System.out.println(e1);
        System.out.println("");
        System.out.println("Empleado Fijo");
        EmpleadoFijo e2 = new EmpleadoFijo("Luis","Benitez","11115526",0.00,500.00,45);
        System.out.println(e2);
        System.out.println("");
        System.out.println("Empleado por Horas");
        EmpleadoPorHoras e3 = new EmpleadoPorHoras("Mario","Torres","4546678",50.00,40.00,35.00);
        System.out.println(e3);
        System.out.println("");
        System.out.println("Empleado por Semanas");
        EmpleadoPorSemana e4 =new EmpleadoPorSemana("Pedro","Castilo","44846266",100.00,8.00,200.00);
        System.out.println(e4);
       
    }
    
}
