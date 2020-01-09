/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorsinrepetidos1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VectorSinRepetidos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Ingrese tamaño vector: ");
        N = sc.nextInt();
        
        int [] arreglo = new int[N];
        
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            arreglo[i] = sc.nextInt();
            if (i >= 1) {
                for (int j = 0; j < i; j++) {
                    if (arreglo[i] == arreglo[j]) {
                        System.out.print("Numero repetido, por favor ingrese" + " otro valor para " + (i + 1) + ": ");
                        arreglo[i] = sc.nextInt();
                    }
                }
            }
        }
    }
}

