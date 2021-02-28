/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg1;

import java.util.Scanner;


/**
 *
 * @author joseg
 */
public class EJERCICIO4 {
    /* Escriba un programa en Java que le solicite al usuario el valor del radio de una circunferencia y calcule su longitud y
    área. Imprima los resultados (con dos números decimales) */
    public static void main(String[] args) { 
        Scanner acceso = new Scanner(System.in);
        System.out.print ("dijite radio: ");
        double A,L;
        double r = acceso.nextDouble();
        A=  Math.PI * Math.pow(r,2) ;
        L= 2 * Math.PI * r;
        System.out.printf("Area = %.2f\n",A );
        System.out.printf("longitud = %.2f\n",L );          
    }  
}
