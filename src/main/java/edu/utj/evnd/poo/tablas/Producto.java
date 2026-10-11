/*
 */
package edu.utj.evnd.poo.tablas;

/**
 *
 * @author Joshua Odin Montoya Flores
 */
public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    private String proveedor;
    
    public Producto(){
        this("", 0.0, 0, "");
    }
    
    public Producto(String nombre, double precio, int cantidad, String proveedor){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
        
    }
    
    public String getNombre() { 
       return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public String getProveedor(){
        return proveedor;
    }
    
    public void setProveedor(String proveedor){
        this.proveedor = proveedor;
    }
    
}
