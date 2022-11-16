/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada =  new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String marca;
        String origen;
        double costo = 0;
        double impuesto = 0;
        double precioVenta;
        
        System.out.println("Ingrese la marca del vehiculo");
        marca = entrada.nextLine();
        System.out.println("Ingrese el origen del vehiculo");
        origen = entrada.nextLine();
        System.out.println("Ingrese el precio del vehiculo");
        precioVenta = entrada.nextDouble();
        
        if(origen.equals("Alemania")){
            impuesto =  precioVenta * 0.20;
            costo = precioVenta + impuesto;         
        } else {
                if(origen.equals("Japon")){
                impuesto =  precioVenta * 0.30;
                costo = precioVenta + impuesto;
                }else{
                    if(origen.equals("italia")){
                    impuesto =  precioVenta * 0.15;
                    costo = precioVenta + impuesto;
                    }else{
                        if(origen.equals("italia")){
                        impuesto =  precioVenta * 0.08;
                        costo = precioVenta + impuesto;
                    } 
                    }
        
                }
        System.out.println("El impuesto del vehiculo es: " + impuesto);
        System.out.println("El costo del vehiculo es: " + costo);
        }
    }
    
}
