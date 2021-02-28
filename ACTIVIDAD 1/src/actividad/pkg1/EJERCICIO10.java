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
public class EJERCICIO10 {
    /*Escriba un programa en Java que lea el peso de un objeto (en kilogramos) e imprima su equivalencia en: gramos, libras,
    toneladas.*/
    public static void main(String[] args) { 
        Scanner acceso = new Scanner(System.in);
        System.out.print("INTRODUZCA EL PESO= ");
        double peso =acceso.nextDouble();
        double gr=1000;
        System.out.printf("peso en Kg equivalen a %.4f Gramos\n ", gr * peso );
        System.out.printf("peso en Kg equivalen a %.4f Libras\n ",peso * 2 );
        System.out.printf("peso en Kg equivalen a %.4f Toneladas\n ",peso / gr);
                        
    }
    
}
