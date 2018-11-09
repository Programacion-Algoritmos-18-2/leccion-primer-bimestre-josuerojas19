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
public class EmpleadoFijo extends Empleado {
    private double sueldof;
    private double descuentos;
    /**
     * 
     * @param n
     * @param a
     * @param c
     * @param cf
     * @param sf
     * @param ds 
     */
    public EmpleadoFijo(String n, String a, String c, double cf, double sf, double ds){
        super(n,a,c,cf);
        setSueldoFijo(sf);
        setDescuentoSeguro(ds);
    }
    /**
     * 
     * @param sf 
     */
    public void setSueldoFijo(double sf){
        sueldof = sf; 
    }
    /**
     * 
     * @return 
     */
    public double getSueldoFijo(){
        return sueldof;
    }
    /**
     * 
     * @param ds 
     */
    public void setDescuentoSeguro(double ds){
        descuentos = ds;
    }
    /**
     * 
     * @return 
     */
    public double getDescuentoSeguro(){
        return descuentos;
    }
    /**
     * 
     * @return 
     */
    public double calcular_Sueldo_Final(){
        double sueldo;
        sueldo= (sueldof + comision_fija)-descuentos;
        return sueldo;
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString(){
    
        return String.format("%s -Sueldo Fijo: %f - Descuento Seguro: 2%f - Sueldo Final: 2%f", super.toString(), getSueldoFijo(), getDescuentoSeguro(), calcular_Sueldo_Final());
    }
}
    
