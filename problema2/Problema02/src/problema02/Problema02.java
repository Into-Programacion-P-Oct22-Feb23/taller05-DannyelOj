/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada =  new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String pedido;
        double costoPedido;
        String descripcion;
        int cantidad;
        double precioUnitario;
        double descuento;
        
        System.out.println("Ingrese el nombre del articulo");
        pedido = entrada.nextLine();
        System.out.println("Ingrese la cantidad de su articulo");
        cantidad = entrada.nextInt();
        System.out.println("Ingrese el precio unitario del articulo");
        precioUnitario = entrada.nextDouble();
        
        descripcion = "El articulo es de muy buena calidad";
        costoPedido = precioUnitario * cantidad;
        
        if (cantidad > 50 ){
            descuento = costoPedido * 0.15;
            costoPedido = costoPedido - descuento;
        }
        
        System.out.println("El pedido es: " + pedido);
        System.out.println("Descripción: " + descripcion);
        System.out.println("El costo del pedido es: " + costoPedido);
    }
    
}
