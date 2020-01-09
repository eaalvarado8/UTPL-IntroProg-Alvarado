/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ondenarmatriz1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class OndenarMatriz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n, m, p=0, z=0, N;
        System.out.print("Ingrese numero de filas[fila,comlumna]: ");
        n = sc.nextInt();
        System.out.print("Ingrese numero de columnas[fila,comlumna]: ");
        m = sc.nextInt();
        int[][] matriz = new int[n][m];
        for (int i = 0; i < n ; i++){
            for(int j = 0; j < m; j++){
                System.out.print("Elemento [" + (i+1) + "," + (j+1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        ImprimirMatriz(matriz);
        System.out.println();
        N = n * m;
        int[] vector = new int[N];
        while( p < N){
            for (int i = 0; i < n ; i++){
                for(int j = 0; j < m; j++){
                    vector[p] = matriz[i][j];
                    p++;
                }
            }
        }
        vector = OrdenarVector(vector);
        while( z < N){
            for (int i = 0; i < n ; i++){
                for(int j = 0; j < m; j++){
                    matriz[i][j] = vector[z];
                    z++;
                }
            }
        }
        ImprimirMatriz(matriz);
        System.out.println();
    }
    public static void ImprimirMatriz(int x[][]){
        for (int i = 0; i <= x.length - 1; i++) {
            for (int j = 0; j <= x[0].length - 1; j++) {
                System.out.print("+-----");
            }
            System.out.println("+");
            for (int j = 0; j <= x[0].length - 1; j++) {
                System.out.printf("| %3d ", x[i][j]);
            }
            System.out.println("|");
        }
        for (int j = 0; j <= x[0].length - 1; j++) {
            System.out.print("+-----");
        }
        System.out.println("+");
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
