/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invertirvector1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class InvertirVector1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.print("Digite la cantidad de numeros: ");
        int n = sc.nextInt();
        int arreglo[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Digite el numero " + (i+1) + ": ");
            arreglo[i]=sc.nextInt();
        }
        System.out.println("Vector ingresado:");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arreglo[i] + ", ");
        }
        System.out.println("\n -----------------------");
        System.out.println("Vector invertido:");
        int m=n;
        for (int i = 0 ; i <= m/2 ; i++){  
            int a = arreglo[i];
            arreglo[i]= arreglo[m-1];
            arreglo[m-1] = a;
            m--;  
        }
        for(int i = 0; i < n ; i++){
            System.out.print( arreglo[i]+ ", "); 
        }
    }
}
