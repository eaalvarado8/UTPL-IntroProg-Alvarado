/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venta5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Venta5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        float subtotal = 0, iva, total;
        System.out.print("Número de artículos: ");
        n = sc.nextInt();
        int [] cantidad = new int[n];
        float[] precio = new float[n];
        String [] nombre = new String [n];
        System.out.println("COMPRA DE ARTICULOS");
        System.out.println("===================\n");
        for(int i = 0; i < n; i++){
            System.out.println("ARTÍCULO " + (i + 1) + " |----- Nombre: ");
            nombre[i] = sc.next();
            System.out.print("           |----- Cantidad: ");
            cantidad[i] = sc.nextInt();
            System.out.print("           |----- Precio unitario: ");
            precio[i] = sc.nextFloat();
            subtotal += (cantidad[i] * precio[i]);
        }
        System.out.println("\n\nDETALLE DE COMPRA");
        System.out.println("=================");
        System.out.println("+------+-----------------------------------------"
                + "+--------------+--------------+");
        System.out.println("| Cant | Ítem                                    "
                + "| Precio Unit. | Precio Total |");
        System.out.println("+------+-----------------------------------------"
                + "+--------------+--------------+");
        for(int i = 0; i < n; i++){
            System.out.printf("| %4d | %-39s | %,12.2f | %,12.2f |%n", cantidad[i],
                nombre[i], precio[i], cantidad[i] * precio[i]);
        }
        iva = (float) (subtotal * 0.12);
        total = subtotal + iva;
        System.out.println("+------------------------------------------------"
                + "+--------------+--------------+");
        System.out.printf("| %46s | %12s | %,12.2f |%n", "", "Subtotal",
                subtotal);
        System.out.printf("| %46s | %12s | %,12.2f |%n", "", "IVA (12%)", iva);
        System.out.printf("| %46s | %12s | %,12.2f |%n", "", "Tot. Pagar",
                total);
        System.out.println("+------------------------------------------------"
                + "+--------------+--------------+");
        System.out.println("Gracias por su compra!\n");
    }
}