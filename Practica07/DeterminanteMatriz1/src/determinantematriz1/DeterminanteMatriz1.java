/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package determinantematriz1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class DeterminanteMatriz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int sum1 = 0, sum2 = 2, mul1 , mul2  ;
        int[][] matriz = new int[3][3];
        int[][] matriz1 = new int[5][3];
        for (int i = 0; i < 3 ; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Elemento [" + (i+1) + "," + (j+1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
         for (int i = 0; i < 3 ; i++){
            for(int j = 0; j < 3; j++){
                matriz1[i][j] = matriz[i][j];
            }
        }
        System.out.println("Para la matriz: ");
        ImprimirMatriz(matriz);
        System.out.println();
        for (int i = 0; i < 2 ; i++){
            for(int j = 0; j < 3; j++){
                matriz1[i + 3][j] = matriz1[i][j];
            }
        }
        for (int i = 0; i < 3 ; i++){
            mul1 = matriz1[i][0] * matriz1[i + 1][1] * matriz1[i + 2][2];
            sum1 = mul1 + sum1;
        }
        for (int i = 0; i < 3 ; i++){
            mul2 = matriz1[i][2] * matriz1[i + 1][1] * matriz1[i + 2][0];
            sum2 = mul2 + sum2;
        }
        System.out.println("El valor del determinante es: " + (sum1 - sum2));
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
}
