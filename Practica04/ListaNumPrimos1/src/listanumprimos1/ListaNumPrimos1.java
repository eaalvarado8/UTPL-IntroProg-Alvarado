/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listanumprimos1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ListaNumPrimos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        byte ele_mostrar, encontrados;
        int num, c;
        char  esPrimo ;
        c = 1 ;
        System.out.print("Ingrese la cantidad de primos a mostrar: ");
        ele_mostrar = sc.nextByte();
        encontrados = 0 ;
        num = 2 ;
        while (encontrados < ele_mostrar){
            esPrimo = 'S' ;
            c = num - 1 ;
            while ( c >= 2 ){
                if ( num % c == 0){
                    esPrimo = 'N' ;  
                }
                c = c - 1;
            }
            if (esPrimo == 'S'){
                System.out.println( num );
                encontrados = (byte) (encontrados + 1) ;
            }
            num = num + 1;
        }
    }
}