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
public class EJERCICIO7 {
    /*Juan conoce el precio de compra y de venta de unos de los productos de su tienda y requiere conocer cuál es su % de
    utilidad. Desarrolle un programa en java que lo ayude con ese cálculo.*/
    public static void main(String[] args) { 
        Scanner acceso = new Scanner(System.in);
        System.out.print("precio de compra=");
        int compra=acceso.nextInt();
        System.out.print("precio de venta ");
        int venta=acceso.nextInt();
        int respuesta= venta - compra;
        System.out.printf("Porsentaje de utilidad es: %f",(respuesta /(double)venta)*100);
                
                
        
       
    }
    
}
