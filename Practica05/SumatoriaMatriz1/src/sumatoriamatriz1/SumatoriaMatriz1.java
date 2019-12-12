/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumatoriamatriz1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class SumatoriaMatriz1 {

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
        for (int i = 0; i < n ; i++){
            for(int j = 0; j < n; j++){
                if(j > i){
                    sum += matriz[i][j];
                }
            }
        }
        System.out.println("Sumatoria sobre diagonal principal: " + sum);
    }
}
