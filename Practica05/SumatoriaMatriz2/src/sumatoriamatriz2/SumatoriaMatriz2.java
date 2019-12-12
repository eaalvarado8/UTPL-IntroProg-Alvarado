/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumatoriamatriz2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class SumatoriaMatriz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n, sum = 0;
        System.out.print("Ingrese numero de filas y columnas [fila,comlumna]: ");
        n = sc.nextInt();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n ; i++){
            for(int j = 0; j < n; j++){
                System.out.print("Elemento [" + (i+1) + "," + (j+1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("La matriz que usted ingresó es la siguiente: ");
        int m = 0;
        while ( m < n){
            for(int c = m; c < n;c++ ){
                System.out.println();
                for(int i = m; i == c ; i++){
                    for(int j = 0; j < n; j++ ){
                      System.out.print("+------+");
                    }
                }
                System.out.println();
                for(int i = m; i == c ; i++){
                    for(int j = 0; j < n; j++ ){                   
                     System.out.printf("|  %2d  |",matriz[i][j]);
                    }
                }
                System.out.println();
                for(int i = m; i == c ; i++){
                    for(int j = 0; j < n; j++ ){
                        System.out.print("+------+");
                    }
                }
            m++;
            }
        }
        for (int i = 0; i < n ; i++){
            for(int j = 0; j < n; j++){
                if(j > i){
                    sum += matriz[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("\nSumatoria sobre diagonal principal: " + sum);
    }
}
