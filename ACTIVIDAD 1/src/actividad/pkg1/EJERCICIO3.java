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
public class EJERCICIO3 {
    /* Escriba una aplicación que reciben tres valores decimales del usuario y muestre la suma, promedio, producto, cociente
    y modulo. Los resultados se deben imprimir en formato decimal con dos cifras significativas */
    public static void main(String[] args) {
        Scanner acceso = new Scanner(System.in);
        System.out.println("introduzca el primer numero decimal:");
        double decimal1= acceso.nextDouble ();
        System.out.println("introduzca segundo numero decimal:");
        double decimal2= acceso.nextDouble ();
        System.out.println("introduzca tercer numero decimal");
        double decimal3 = acceso.nextDouble ();
        System.out.printf("suma decimal1 + decimal2 + decimal3=%.2f\n",decimal1 + decimal2 + decimal3);
        System.out.printf("promedio de decimal1 + decimal2 + decimal3=%.2f\n",(decimal1 + decimal2 + decimal3)/3);
        System.out.printf("producto de decimal1 * decimal2 * decimal3=%.2f\n", decimal1 * decimal2 * decimal3);
        
    }
        
}