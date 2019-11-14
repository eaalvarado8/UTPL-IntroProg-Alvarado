/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletoautobus1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class BoletoAutobus1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int prec, dia_sem;
        float km1;
        System.out.print("Ingrese los Km que va a recorrer: ");
        km1 = sc.nextFloat();
        System.out.print("Ingrese el dia de la semana en el que viajara (1-7): ");
        dia_sem = sc.nextInt();
        if (km1 > 0 && dia_sem >= 1 && dia_sem <= 7){
            if( km1 > 80 && dia_sem >= 1 && dia_sem <= 5 ){
                prec = (int) (km1 - (km1 * 5 * 0.15 * 0.05) ) ;
                System.out.print("El precio a pagar es " + prec + " centavos de dolar");
            }
            if( km1 <= 80 && dia_sem >= 1 && dia_sem <= 5 ){
                prec = (int) (km1 - (km1 * 5 * 0.05) ) ;
                System.out.println("El precio a pagar es " + prec + " centavos de dolar");
            }
            if( km1 <= 80 && dia_sem >= 6 ){
                prec = (int) (km1 * 5) ;
                System.out.println("El precio a pagar es " + prec + " centavos de dolar");
            }
            if( km1 >80 && dia_sem >= 6 ){
                prec = (int) (km1 - (km1 * 5 * 0.15) ) ;
                System.out.println("El precio a pagar es " + prec + " centavos de dolar");
            }
        } else{
            System.out.println("Datos erroneos!!");
        }
    }
}

