/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentacifras1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CuentaCifras1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int cifras = 1;
        System.out.print("Ingrese número entero positivo: ");
        numero = sc.nextInt();
        System.out.print("El numero de cifras de " + numero + " es ");
        if (numero > 0){
            while ( numero > 10){
                numero = numero / 10;
                cifras = cifras + 1;
            }
            System.out.println( cifras );
        } else {
            System.out.println("Numero incorrecto ingrese un numero entero positivo");
        }
            
    }
    
}
