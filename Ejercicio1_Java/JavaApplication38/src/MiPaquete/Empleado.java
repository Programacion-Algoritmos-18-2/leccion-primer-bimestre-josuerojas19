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
public class Empleado {
    private String nombre;
    private String apellido;
    private String cedula;
    public double comision_fija;
    
    public Empleado(String n, String a, String c, double cf){
        setNombre(n);
        setApellido(a);
        setCedula(c);
        setComisionFija(cf);
    }
    /**
     * Metodos get y set para agregar valoresa las variables
     * @param n 
     */
    public void setNombre(String n){
        nombre = n;
    }
    /**
     * 
     * @return 
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * 
     * @param c 
     */
    public void setApellido(String c){
        apellido = c;
    }
    /**
     * 
     * @return 
     */
    public String getApellido(){
        return apellido;
    }
    /**
     * 
     * @param c 
     */
    public void setCedula(String c){
        cedula = c;
    }
    /**
     * 
     * @return 
     */
    public String getCedula(){
        return cedula;
    }
    /**
     * 
     * @param cf 
     */
    public void setComisionFija(double cf){
        comision_fija = cf;
    }
    /**
     * 
     * @return 
     */
    public double getComisionFija(){
        return comision_fija;
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString(){
        return String.format("Nombre: %s - Apellido %s - Cedula %s - Comision Fija %f", 
                getNombre(), getApellido(), getCedula(), getComisionFija());
    }
    
}
