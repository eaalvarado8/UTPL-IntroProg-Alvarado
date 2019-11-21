/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Operation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    char Op;
    int mul,
    System.out.print("Ingrese edad: ");
    edad = sc.nextByte();
    System.out.print("Ingrese el género (M/F): ");
    genero = sc.next().charAt(0);
    if ( genero == 'F'){
        precio = precio * 0.5;
    }
    System.out.println("\nEl valor a pagar es USD: " + precio);
    }
    
}
