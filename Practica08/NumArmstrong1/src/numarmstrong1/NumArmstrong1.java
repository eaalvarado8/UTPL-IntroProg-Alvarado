/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numarmstrong1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NumArmstrong1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, aux, j = 0, c = 0, sum =0;
        System.out.print("Ingrese numero: ");
        num = sc.nextInt();
        System.out.println();
        aux = num;
        while(aux > 0){ 
            c++;
            aux = aux/10;
        }
        int[] n = new int[c];
        aux = num;
        j = c - 1;
        while(aux > 0){
            n[j] = aux %10;
            aux = aux /10;
            j--;
        }
        for(int i = 0; i < c; i++){
            sum = (int) (sum + potencia(n[i], c));
        }
        if(num == sum){
           System.out.println("Sí, el número es de Armstrong."); 
        } else{
            System.out.println("No, el número es de Armstrong.");
        }
        
    }
    public static double potencia(int x, int y) {
        double p;
        if (y == 0) {
            p = 1;
        } else if (y < 0) {
            p = 1 / potencia(x, y * (-1));
        } else {
            p = x * potencia(x, y - 1);
        }
        return p;
    }
    
}
