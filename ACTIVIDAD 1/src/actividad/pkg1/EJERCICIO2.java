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
public class EJERCICIO2 {
     
    public static void main(String[] args) {
        /* Escriba una aplicación que pida al usuario que escriba dos enteros, que obtenga los números del usuario e imprima la
        suma, producto, diferencia de los números. */
        Scanner acceso = new Scanner(System.in);
        System.out.println("introduzca el primer numero entero:");
        int numero1 = acceso.nextInt ();
        System.out.println("introduzca el segundo numero entero:");
        int numero2= acceso.nextInt ();
        System.out.printf("suma numero1 + numero2=%d\n",numero1 + numero2);
        System.out.printf("producto numero1 * numero2=%d\n",numero1 * numero2);
        System.out.printf("diferencia  numero1 - numero2=%d\n",numero1 - numero2);
    }
}            