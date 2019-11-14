/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Fundamentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int dia, mes, anio, dia_sig, mes_sig, anio_sig;
        System.out.print("Ingrese dia: ");
        dia = sc.nextInt();
         System.out.print("Ingrese mes: ");
        mes = sc.nextInt();
         System.out.print("Ingrese anio: ");
        anio = sc.nextInt();
        if ( mes > 12 || mes <= 0 || dia > 31 || dia <= 0 || anio <0  ){
            System.out.println("Los datos ingresados son errones");
        } 
        if ( mes == 2 && dia == 29){
            dia_sig = 1;
            mes_sig = mes + 1;
            anio_sig = anio;
            System.out.println(dia_sig + "/" + mes_sig + "/" + anio_sig);
        } 
        if ( mes == 1 || mes == 3 || mes == 5 || mes ==7 || mes == 8 || mes == 10 && dia == 31){
            dia_sig = 1;
            mes_sig = mes + 1;
            anio_sig = anio;
            System.out.println(dia_sig + "/" + mes_sig + "/" + anio_sig);
        } 
        if ( mes == 4 && mes == 6 && mes == 9 && mes ==11 && dia == 30){
            dia_sig = 1;
            mes_sig = mes + 1;
            anio_sig = anio;
            System.out.println(dia_sig + "/" + mes_sig + "/" + anio_sig);
        } 
        if ( mes == 12 && dia == 31){
            dia_sig = 1;
            mes_sig = 1;
            anio_sig = anio + 1;
            System.out.println(dia_sig + "/" + mes_sig + "/" + anio_sig);
        }
        if ( mes == 1 || mes == 3 || mes == 5 || mes ==7 || mes == 8 || mes == 10 && dia < 31){
            dia_sig = dia + 1;
            mes_sig = mes;
            anio_sig = anio;
            System.out.println(dia_sig + "/" + mes_sig + "/" + anio_sig);
        } 
        if ( mes == 1 || mes == 3 || mes == 5 || mes ==7 || mes == 8 || mes == 10 && dia > 31) {
            System.out.println("Los datos ingresados son errones");
        } 
        if ( mes == 4 && mes == 6 && mes == 9 && mes == 11 && dia < 30){
            dia_sig = dia + 1;
            mes_sig = mes;
            anio_sig = anio;
            System.out.println(dia_sig + "/" + mes_sig + "/" + anio_sig);
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes ==11 && dia > 30) {
            System.out.println("Los datos ingresados son errones");
        } 
        if ( 2 == mes && dia < 29 ){
            dia_sig = dia + 1;
            mes_sig = mes;
            anio_sig = anio;
            System.out.println(dia_sig + "/" + mes_sig + "/" + anio_sig);
        } 
        if ( 2 == mes && dia > 29) {
            System.out.println("Los datos ingresados son errones");
        }
    }
}

        // TODO code application logic here
