/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenu1u2;

import java.util.Scanner;

public class ExamenU1U2 {

    
    public static void main(String[] args) {
       Scanner videojuego = new Scanner(System.in);
       System.out.println("Ingrese los productos ");
       String p1 = videojuego.nextLine();
     
               
       String p2 = videojuego.nextLine();
       
       String p3 = videojuego.nextLine();
       System.out.println("El primer producto es: " + p1);
  
       
       System.out.println("El segundo producto es: " + p2);
    
       System.out.println("El tercer producto es: " + p3);
               
       System.out.println("Ingrese los precios: ");
       
         double pr1 = videojuego.nextDouble();
         double pr2 = videojuego.nextDouble();
         double pr3 = videojuego.nextDouble();
        System.out.println("Precio del primer producto es: " + pr1);
        System.out.println("Precio del segundo producto es: " + pr2);
        
        System.out.println("Precio del tercer producto es: " + pr3);
       
        final double producto1 = 0.30;
        final double producto2 = 0.65;
        final double producto3 = 0.15;
        
        double totaldes1 = pr1 * producto1;
        double totaldes2 = pr2 * producto2;
        double totaldes3 = pr3 *producto3;
        
        System.out.println("El descuento del primer juego es: " + totaldes1);
        System.out.println("El descuento del segundo juego es: " + totaldes2);
        System.out.println("El descuento del tercer juego es: " + totaldes3);
        
        double preciot1 = pr1 - totaldes1;
        double preciot2 = pr2 - totaldes2;
        double preciot3 = pr3- totaldes3;
        
        System.out.println("El precio final del videojuego1 es: " + preciot1);
        System.out.println("El precio final del videojuego2 es: " + preciot2);
        System.out.println("El precio final del videojuego3 es: " + preciot3);
        
                
        
        
        
        
        
       
       
     
    
       
        
       
       
    }
    
}
