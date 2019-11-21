/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradaestadio2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EntradaEstadio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char genero;
        float precio ;
        int entrada, edad, anio_nac;
        System.out.print("Ingrese año de nacimiento: ");
        anio_nac = sc.nextInt();
        System.out.print("Ingrese el género (M/F): ");
        genero = sc.next().charAt(0);
        System.out.print("Ingrese el precio de la entrada que desea(35/25/20/10): ");
        entrada = sc.nextInt();
        edad = (2019 - anio_nac);
        if ( anio_nac <= 2019 && anio_nac > 1900 ){
            if ( entrada == 35 || entrada == 25 || entrada == 20 || entrada ==10){
                if ( genero == 'F'){
                    if (edad < 13){
                        precio = (float) (entrada * 0.5); 
                        System.out.println("Total a cancelar del boleto $" + precio );
                    }
                    if (edad >= 13){
                        precio = (float) (entrada - entrada * 0.25);
                        System.out.println("Total a cancelar del boleto $" + precio );
                    }
                }
                if ( genero == 'M'){
                    if (edad < 13){
                        precio = (float) (entrada - entrada * 0.4); 
                        System.out.println("Total a cancelar del boleto $" + precio );
                    } else {
                        System.out.println("Total a cancelar del boleto $" + entrada ); 
                    } 
                }
            } else {
                System.out.println("Precio de la entrada incorrecto");
            }
        } else {
            System.out.println("El año de nacimiento es incorrecto");
        }
    }
}
