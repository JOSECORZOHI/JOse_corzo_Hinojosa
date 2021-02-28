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
public class EJERCICIO5 {
     /* Escriba un programa en Java que lea un carácter e imprima su correspondiente valor numérico (utilizar la conversión
     de tipos).*/
    public static void main(String[] args) { 
    Scanner acceso = new Scanner(System.in);
    System.out.print("introduce un caracter: ");
    char h= acceso.next().charAt(0);
    int valor_numerico = h;
    System.out.printf("Valor numerico de h: %d\n", valor_numerico);
    
          
    }

}
    

