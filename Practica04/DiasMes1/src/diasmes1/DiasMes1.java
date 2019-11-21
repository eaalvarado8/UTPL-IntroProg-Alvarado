/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diasmes1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class DiasMes1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num_mes;
        System.out.print("Ingrese el numero del mes: ");
        num_mes = sc.nextInt();
        if ( num_mes > 0 && num_mes < 13){
            if ( num_mes == 1 || num_mes == 3 || num_mes == 5 || num_mes == 7 || num_mes == 8 || num_mes == 10 || num_mes == 12){
            System.out.println("El mes " + num_mes + " tiene 31 días");
            } else if ( num_mes == 4 || num_mes == 6 || num_mes == 9 || num_mes ==11){
                System.out.println("El mes " + num_mes + " tiene 30 días");
            } else {
                System.out.println("El mes " + num_mes + " tiene 28");
            }
        } else {
            System.out.println("Dato incorrecto, ingrese un numero entre 1 y 12");
        }
    }
    
}
