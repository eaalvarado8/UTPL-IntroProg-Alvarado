/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compraelectrodomestico1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CompraElectrodomestico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float total_pagar, total_elect, total_envio, prc_base, peso, distancia;
        char domic;
        System.out.print("Ingrese el precio del electromestico (sin IVA): ");
        prc_base = sc.nextFloat();
        System.out.print("Desea el servicio a domicilio S(SI) ó N(NO): ");
        domic = sc.next().charAt(0);
        total_elect = (float) (prc_base * 1.12);
        if (domic == 'S'){
            System.out.print("Ingrese el peso del electrodomestico en Kg: ");
            peso = sc.nextFloat();
            System.out.print("Ingrese la distancia del local a su domicilio en Km: ");
            distancia = sc.nextFloat();
            total_envio = (float) (distancia * 0.05 + peso * 0.05) ;
            total_pagar = (float) (total_envio + total_elect);
            System.out.println("Valor electrodomestico + IVA: $" + total_elect );
            System.out.println("Valor envio a domicilio: $" + total_envio );
            System.out.println("Total a cancelar: $" + total_pagar);
        } 
        if ( domic == 'N'){
            System.out.println("Valor electrodomestico + IVA: " + total_elect );
            System.out.println("Total a pagar: $" + total_elect );
        } 
        if ( domic != 'S' || domic != 'N' ){
            System.out.println("Dato #2 Erroneo");
        }
    }
}


