/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Factorial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int fact, num, contador;
        contador = 2; 
        fact = 1;
        System.out.print("Ingrese numero: ");
        num = sc.nextInt();
        while (contador <= num) {            
            fact = fact * contador;
            contador = contador + 1;
        }
        System.out.println( num + "! = " + fact );
    }
    
}
