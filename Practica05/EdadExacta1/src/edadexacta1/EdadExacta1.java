/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edadexacta1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EdadExacta1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int dia, mes, anio;
        int [] fech_nac = new int[3];
        int [] fech_act = new int[3];
        System.out.println("Fecha de nacimiento: ");
        System.out.print("\nDía: ");
        fech_nac[0] = sc.nextInt();
        System.out.print("Mes: ");
        fech_nac[1] = sc.nextInt();
        System.out.print("Año: ");
        fech_nac[2] = sc.nextInt();
        System.out.println("\nFecha actual: ");
        System.out.print("\nDía: ");
        fech_act[0] = sc.nextInt();
        System.out.print("Mes: ");
        fech_act[1] = sc.nextInt();
        System.out.print("Año: ");
        fech_act[2] = sc.nextInt();
        dia = fech_act[0] - fech_nac[0];
        mes = fech_act[1] - fech_nac[1];
        anio = fech_act[2] - fech_nac[2];
        if (anio >= 0){
            if(mes < 0){
                if(dia < 0){
                    dia = dia + 30;
                    mes = mes + 12 - 1;
                    anio = anio - 1;
                    System.out.println("Su edad actual es " + anio + " años con " + mes + " meses y " + dia + " dias.");
                }
            }
            if(mes > 0){
                if(dia < 0){
                    dia = dia + 30;
                    mes = mes - 1;
                    System.out.println("Su edad actual es " + anio + " años con " + mes + " meses y " + dia + " dias.");
                }
            }
            if(mes < 0){
                if(dia > 0){
                    mes = mes + 12;
                    anio = anio - 1;
                    System.out.println("Su edad actual es " + anio + " años con " + mes + " meses y " + dia + " dias.");
                }
            }
            if(mes > 0){
                if ( dia > 0 ){
                    System.out.println("Su edad actual es " + anio + " años con " + mes + " meses y " + dia + " dias.");
                }
            }
            System.out.println("Su edad actual es " + anio + " años con " + mes + " meses y " + dia + " dias.");
        } else {
            System.out.println("Datos incorrectos!!");
        }
    }
    
}
