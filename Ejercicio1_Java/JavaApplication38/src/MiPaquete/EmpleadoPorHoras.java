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
public class EmpleadoPorHoras extends Empleado {
    private double numeroh;
    private double valorh;
    /**
     * 
     * @param n
     * @param a
     * @param c
     * @param cf
     * @param nh
     * @param vh 
     */
    public EmpleadoPorHoras(String n, String a, String c, double cf, double nh, double vh){
        super(n,a,c,cf);
        setNumeroDeHoras(nh);
        setValorPorHoras(vh);
    }
    /**
     * 
     * @param nh 
     */
    public void setNumeroDeHoras(double nh){
        numeroh = nh;
    }
    /**
     * 
     * @return 
     */
    public double getNumeroDeHoras(){
        return numeroh;
    }
    /**
     * 
     * @param vh 
     */
    public void setValorPorHoras(double vh){
        valorh = vh;
    }
    /**
     * 
     * @return 
     */
    public double getValorPorHoras(){
        return valorh;
    }
    /**
     * 
     * @return 
     */
    public double calcular_Sueldo_Final(){
        double sueldo;
        sueldo = numeroh * valorh + comision_fija;
        return sueldo;
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString(){
    
        return String.format("%s - Numero de horas: %f - Valor por hora: %f - Sueldo Final: %f", super.toString(), getNumeroDeHoras(), getValorPorHoras(), calcular_Sueldo_Final());
    }
    
        
}
