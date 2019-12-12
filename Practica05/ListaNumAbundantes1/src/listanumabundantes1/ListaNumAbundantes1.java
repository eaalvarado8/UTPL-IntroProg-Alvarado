/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listanumabundantes1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ListaNumAbundantes1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, c, sum;
        System.out.println("Listar números abundantes comprendidos entre 0 y N: ");
        System.out.print("Ingrese N: ");
        N = sc.nextInt();
        System.out.print("Los números abundantes entre 0 y " + N + " son: ");
        N += 1;
        int [] num = new int[N];
        for(int i = 0 ; i < N ; i++){
            num[i] = i;
            c = 1;
            sum = 0;
            while(c < num[i]){
                if(num[i]%c==0){
                    sum += c;
                }
                c++;
            }
            if(sum > num[i]){
                System.out.print(num[i] + ", ");
            }
        }
        System.out.println();
    }
    
}
