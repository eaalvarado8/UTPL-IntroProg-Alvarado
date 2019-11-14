/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venta2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Venta2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float prec, sum ;
        System.out.print("Ingrese los precios de los articulos (para terminar digite 0): ");
        prec = 1;
        sum = 0;
        while(prec != 0){
            prec = sc.nextInt();
            sum = (float) (sum + prec * 1.12);
        }
        System.out.println("El total a pagar mas IVA es " + sum + "$");
    }
}
