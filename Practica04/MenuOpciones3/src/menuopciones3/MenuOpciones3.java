/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuopciones3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MenuOpciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, valorAbs;
        byte seleccion;
        System.out.print("Ingrese número entero: ");
        n = sc.nextInt();
        System.out.println("\nOPERACIÓN A REALIZAR: ");
        System.out.println("   1) Determinar si es par");
        System.out.println("   2) Determinar si es múltiplo de 3");
        System.out.println("   3) Calcular valor absoluto");
        do {
            System.out.print("Elija una opción (1-3): ");
            seleccion = sc.nextByte();
            switch (seleccion) {
                case 1:
                    if (n % 2 == 0) {
                        System.out.println("\nEl número " + n + " SI es par");
                    } else {
                        System.out.println("\nEl número " + n + " NO es par");
                    }
                    break;
                case 2:
                    if (n % 3 == 0) {
                        System.out.println("\nEl número " + n + " SI es múltiplo de 3"); 
                    } else {
                        System.out.println("\nEl número " + n + " NO es múltiplo de 3");
                    }
                    break;
                case 3:
                    valorAbs = n;
                    if (n < 0) {
                        valorAbs = n * (-1);
                    }
                    System.out.println("\nValor absoluto de " + n + " es: " + valorAbs);
                    break;
            }
        }while(seleccion !=1 && seleccion != 2 && seleccion !=3);
    }
    
}
