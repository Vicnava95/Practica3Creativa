/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3calculadorastatic;

/**
 *
 * @author venm9
 */
public abstract class Calculadora {
    
        public static double sumar(double x, double y){
        double suma = x + y;
        return suma;
    }
    
    public static double restar (double x, double y){
        double restar = x - y;
        return restar;
    }
    
    public static double multiplicar (double x, double y){
        double multiplicar = x * y;
        return multiplicar;
    }
    
    public static double dividir (double x, double y){
        double dividir = x / y;
        return dividir;
    }
    
    public static boolean isNumeric(String cadena){
        try {
            Double.parseDouble(cadena);
            return false;
        }
        catch (NumberFormatException nfe){
            return true;
        }
    }
    
}
