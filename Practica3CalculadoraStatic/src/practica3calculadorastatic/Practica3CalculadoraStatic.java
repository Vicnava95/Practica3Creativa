/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3calculadorastatic;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author venm9
 */
public class Practica3CalculadoraStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean dato1= true;
        boolean dato2= true;
        String valor1 = "0";
        String valor2 = "0";
        Scanner scanner = new Scanner(System.in);
        //CalculadoraDigital c = new CalculadoraDigital(); //Ya no es necesario crear un objeto de CalculadoraDigital 
        System.out.println("Escoga el número de la operación que desea realizar \n1.Sumar \n2.Restar \n3.Multiplicar \n4.Dividir");
        Integer n = scanner.nextInt(); 
        
        while (dato1){
            System.out.println("Ingrese el primer valor: ");
            valor1 = scanner.next();
            dato1 = Calculadora.isNumeric(valor1);
            
        }
        double x = Double.parseDouble(valor1);
        
        while (dato2){
            System.out.println("Ingrese el segundo valor: ");
            valor2 = scanner.next();
            dato2 = Calculadora.isNumeric(valor2);
            
        }
        double y = Double.parseDouble(valor2);
        
        switch(n){
            case 1:
                System.out.println(Calculadora.sumar(x, y));
                break;
            case 2:
                System.out.println(Calculadora.restar(x, y));
                break;
            case 3:
                System.out.println(Calculadora.multiplicar(x, y));
                break;
            case 4:
                if (y == 0){
                    System.out.println("El segundo valor debe ser distinto de cero");
                }
                else {
                    System.out.println(Calculadora.dividir(x, y));
                }
                break;
        }
    }
}
