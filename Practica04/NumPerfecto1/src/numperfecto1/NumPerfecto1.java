/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numperfecto1;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class NumPerfecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, c = 1, sumatoria = 0;
        boolean n = false;
        System.out.print("Ingrese número natural: ");
        numero = sc.nextInt();
        while ( c < numero ){
            if ( numero % 1 == 0){
                sumatoria = sumatoria + c;
                c = c + 1;
                if (sumatoria == numero ){
                n = true;
                }
            }
        }
        if ( n ){
            System.out.println("El numero " + numero + " es perfecto");
        } else {
            System.out.println("El numero " + numero + " no es perfecto"); 
        }
    }
    
}
