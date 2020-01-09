/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriediferenciaprimos1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class SerieDiferenciaPrimos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, c=0, num=2;
        System.out.print("Ingrese tamaño de la serie: ");
        N = sc.nextInt();
        int[] dif = new int[N];
        int[] prim = new int[N+1];
        while (c <= N) {
            if (primo(num)){
                prim[c] = num;
                c++;
            }
            num = num + 1;
        }
        System.out.println("Números primos: ");
        for(int i = 0; i < N+1; i++){
            System.out.print(prim[i] + " ");
        }
        System.out.println();
        System.out.println("Diferencias: ");
        for(int i = 0; i < N; i++){
            dif[i] = prim[i+1] - prim[i];
            System.out.print(dif[i] + " ");
        }
        System.out.println();
    }
    public static boolean primo(int num) {
       boolean esPrimo = true;
       if(num==1){
           esPrimo = false;
       }
       int c = num - 1;
       while(c >= 2){
           if(num % c == 0){
               esPrimo = false;
               c = 1;
           } else{
               c--;
           }
       }
       return esPrimo;
    }
}
