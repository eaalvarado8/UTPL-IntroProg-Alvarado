
package multiplicamatriz1;

import java.util.Scanner;

public class MultiplicaMatriz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n, multiplicador;
        System.out.print("Ingrese numero de filas y columnas [fila,comlumna]: ");
        n = sc.nextInt();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n ; i++){
            for(int j = 0; j < n; j++){
                System.out.print("Elemento [" + (i+1) + "," + (j+1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.print("Multiplicar matriz por: ");
        multiplicador = sc.nextInt();
        System.out.println("\nMatriz original: ");
        ImprimirMatriz(matriz);
        System.out.println();
        for (int i = 0; i < n ; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = matriz[i][j] * multiplicador;
            }
        }
        System.out.println("\nMatriz resultante: ");
        ImprimirMatriz(matriz);
        System.out.println();
    }
    public static void ImprimirMatriz(int x[][]){
        int m = 0;
        while ( m < x.length){
            for(int c = m; c < x.length;c++ ){
                System.out.println();
                for(int i = m; i == c ; i++){
                    for(int j = 0; j < x.length; j++ ){
                      System.out.print("+------+");
                    }
                }
                System.out.println();
                for(int i = m; i == c ; i++){
                    for(int j = 0; j < x.length; j++ ){                   
                     System.out.printf("|  %2d  |",x[i][j]);
                    }
                }
                System.out.println();
                for(int i = m; i == c ; i++){
                    for(int j = 0; j < x.length; j++ ){
                        System.out.print("+------+");
                    }
                }
            m++;
            }
        }
    }
}
