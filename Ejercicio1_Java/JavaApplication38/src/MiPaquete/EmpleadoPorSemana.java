/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiPaquete;

/**
 *
 * @author Josue
 */
public class EmpleadoPorSemana extends Empleado {
    private double numsema;
    private double valors;
    /**
     * 
     * @param n
     * @param a
     * @param c
     * @param cf
     * @param ns
     * @param vs 
     */
    public EmpleadoPorSemana(String n, String a, String c, double cf, double ns, double vs){
        super(n,a,c,cf);
        setNumeroDeSemana(ns);
        setValorPorSemana(vs);
    }
    /**
     * 
     * @param ns 
     */
    public void setNumeroDeSemana(double ns){
        numsema = ns;
    }
    /**
     * 
     * @return 
     */
    public double getNumeroDeSemana(){
        return numsema;
    }
    /**
     * 
     * @param vs 
     */
    public void setValorPorSemana(double vs){
        valors = vs;
    }
    /**
     * 
     * @return 
     */
    public double getValorPorSemana(){
        return valors;
    }
    /**
     * 
     * @return 
     */
    public double calcular_Sueldo_Final(){
        double sueldo;
        sueldo = numsema * valors + comision_fija;
        return sueldo;
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString(){
    
        return String.format("%s - Numero de Semanas: %f - Valor por Semana: %f - Sueldo Final: %f", super.toString(), getNumeroDeSemana(), getValorPorSemana(), calcular_Sueldo_Final());
    }
}
