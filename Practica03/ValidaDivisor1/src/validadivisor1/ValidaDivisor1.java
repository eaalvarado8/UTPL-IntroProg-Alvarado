/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validadivisor1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ValidaDivisor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1, num2, comprob;
        System.out.print("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        if ( num1 == num2 ){
            System.out.println("Los numeros ingresados son iguales");
        }
        if (num1 > num2) {
            if (num1 % num2 == 0){
                System.out.println("El numero menor si es divisor del otro");
            } else {
               System.out.println("El numero menor no es divisor del otro"); 
            }
        }
        if (num2 > num1) {
            if (num2 % num1 == 0){
                System.out.println("El numero menor si es divisor del otro");
            } else {
               System.out.println("El numero menor no es divisor del otro"); 
            }
        }
    }
}
