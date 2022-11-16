/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada =  new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double costoKilovatio;
        double kilovatioNumero;
        double costoPlanilla;
        int edad;
        double descuento;
        
        System.out.println("Ingrese costo de kw/h");
        costoKilovatio = entrada.nextDouble();
        System.out.println("Ingrese el numero de kw consumidos en el mes");
        kilovatioNumero = entrada.nextDouble();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        
        costoPlanilla = costoKilovatio * kilovatioNumero;
        
        if (edad > 65) {
            descuento = costoPlanilla * 0.10;
            costoPlanilla = costoPlanilla - descuento;
        }
        System.out.println("El valor a cancelar es: " + costoPlanilla);
    } 
    
}
