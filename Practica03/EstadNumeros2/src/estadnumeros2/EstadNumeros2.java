/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadnumeros2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EstadNumeros2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num, sum1, sum2, sum = 0, cn1, cn2, cn = 0;
        System.out.print("Ingrese numeros positivos y negativos (para terminar digite 0): ");
        num = 1;
        sum1 = 0;
        sum2 = 0;
        cn1 = 0;
        cn2 = 0;
        while(num != 0){
            num = sc.nextInt();
            if (num < 0){
                cn = cn +1;
                sum = (sum + num)/cn;
                System.out.println("En total usted ingresó " + cn + " numeros negativos "); 
                System.out.println("EL promedio total de los numeros negativos es " + sum);
            } else {
                cn = cn +1;
                sum = (sum + num)/cn;
                System.out.println("En total usted ingresó " + cn + " numeros positivos ");
                System.out.println("EL promedio total de los numeros positivos es " + sum);
            }
            sum = (sum + sum)/cn;
            cn = cn +cn;
        }
        System.out.println("En total usted ingresó " + cn + " numeros ");
        System.out.println("El promedio total de los numeros ingresados es " + sum);
    }
    
}
