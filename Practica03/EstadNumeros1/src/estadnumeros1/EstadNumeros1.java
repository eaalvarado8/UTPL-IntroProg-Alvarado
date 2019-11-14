/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadnumeros1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EstadNumeros1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num, sum, cn;
        System.out.print("Ingrese numeros positivos y negativos (para terminar digite 0): ");
        num = 1;
        sum = 0;
        cn = 0;
        while(num != 0){
            num = sc.nextInt();
            if (num < 0){
                cn = cn +1;
            }
            sum = sum + num;
        }
        System.out.println("En total usted ingresó " + cn + " numeros negtivos");
        System.out.println("La suma de los numeros ingresados es " + sum);
    }
    
}
