/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenarnumeros3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class OrdenarNumeros3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N;
        System.out.print("Ingrese el tamaño del vector: ");
        N = sc.nextInt(); 
        int[] vector = new int[N];
        for (int i = 0; i < N ; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        vector = OrdenarVector(vector);
        for (int i = 0; i < N ; i++) {
            System.out.print( vector[i]);
        }
    }  
    public static int[] OrdenarVector(int[] x) {
        int aux;
        for (int i = 1; i <  x.length - 1 ; i++) {
            for (int j = 0; j < x.length - i  ; j++) {
                if (x[j] > x[j + 1]) {
                    aux = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = aux;
                }
            }
        }
        return x;
    }
}
