/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada =  new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int numeroDias;
        double precioHabitacion;
        double subtotal;
        double descuento;
        double total;
        
        System.out.println("Ingrese los dias de estancia");
        numeroDias = entrada.nextInt();
        System.out.println("Ingrese precio de la habitacion");
        precioHabitacion = entrada.nextDouble();
        
        if(numeroDias > 5){
            subtotal = precioHabitacion * numeroDias;
            descuento = subtotal * 0.10;
        } else{
                if((numeroDias > 10) && (numeroDias < 15)){
                    subtotal = precioHabitacion * numeroDias;
                    descuento = subtotal * 0.15;
                } else{
                    subtotal = precioHabitacion * numeroDias;
                    descuento = subtotal * 0.20;
                }
        }
        
        total = subtotal - descuento;
        System.out.println("El subtotal es: " + subtotal);
        System.out.println("IEl descuento es de: " + descuento);
        System.out.println("El total es: " + total);
    }
    
}
