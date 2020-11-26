/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3tienda;

/**
 *
 * @author venm9
 */
public class Compra {
    private String nombre;
    private String nombreProducto;
    private double precio; 
    private int cantidad; 

    public Compra() {
    }

    public Compra(String nombre, String nombreProducto, double precio, int cantidad) {
        this.nombre = nombre;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Nombre del cliente: " + nombre + "\nNombre del Producto: " + nombreProducto + "\nPrecio: $" + precio + "\nCantidad: " + cantidad;
    }
}
