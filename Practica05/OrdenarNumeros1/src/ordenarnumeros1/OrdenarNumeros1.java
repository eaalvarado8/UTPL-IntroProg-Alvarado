/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenarnumeros1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class OrdenarNumeros1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, aux;
        
        System.out.print("Ingrese tamaño del vector: ");
        n= sc.nextInt();
        int [] num = new int [n];
        for (int i = 0; i < n; i++){
            System.out.print("Ingrese número: " + (i+1) + ": ");
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (num[j + 1] > num[j]) {
                    aux = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = aux;
                }
            }
        }
        System.out.println("Vector ordenado: ");
        for (int i = 0; i < n; i++){
            System.out.println(num[i]);
        }            
        
    }
    
}
