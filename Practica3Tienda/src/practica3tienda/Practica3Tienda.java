/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3tienda;

import java.util.Scanner;

/**
 *
 * @author venm9
 */
public class Practica3Tienda {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String valor= "";
        System.out.println("Ingrese el nombre del cliente");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el nombre del producto");
        String nomProducto = scanner.nextLine();
        System.out.println("Ingrese el precio del producto");
        double precio = scanner.nextDouble();
        System.out.println("Ingrese la cantidad");
        int cantidad = scanner.nextInt();
        Compra c = new Compra(nombre,nomProducto,precio,cantidad);
         System.out.println("Ingrese el número de la tienda donde ha realizado su compra "
                + "\n1.Área de Frutas \n2.Área de Verduras \n3.Área de Carnes \n4.Lácteos \n5.Granos básicos ");
        int n = scanner.nextInt();
        switch(n){
            case 1:
                valor = Descuento.descuento(precio,cantidad);
                break;
            case 2:
                valor = Descuento.descuento(precio,cantidad);
                break;
            case 3:
                valor = Descuento.descuento(precio,cantidad);
                break;
            default:
                double r = precio * cantidad;
                String resultado = String.valueOf(r);
                valor = "\nEl descuento aplicado es de: 0.0"+"\nTotal: $"+resultado;
                break;
        }
        System.out.println(c.toString() + valor);
    }
    
}
