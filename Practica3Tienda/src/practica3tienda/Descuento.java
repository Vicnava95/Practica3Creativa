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
public class Descuento {
    
    public static String descuento(double precio, int cantidad){
        double descuento;
        double resultado;
        double valor = precio * cantidad;
        if (valor >= 50){
            descuento = valor * 0.07;
            resultado = valor - descuento;
        }
        else if (valor >= 20){
            descuento = valor * 0.05;
            resultado = valor - descuento;
        }
        else {
            descuento = 0;
            resultado = valor;
        }
        String d = String.valueOf(descuento);
        String r = String.valueOf(resultado);
        return "\nEl descuento aplicado es de: $"+ d +"\nTotal: $"+ r;
    }
    
}
