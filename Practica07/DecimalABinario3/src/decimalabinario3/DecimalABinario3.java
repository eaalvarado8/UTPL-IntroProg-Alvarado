/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimalabinario3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class DecimalABinario3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un número: ");
        num = sc.nextInt();
        System.out.print("El número representado en el sistema binario es: ");
        System.out.print(Binario(num));
        System.out.println();
    }
    public static String Binario(int x) {
        String binario = "";
        if(x < 0){
            
        }else{
            binario = x % 2 + Binario(x / 2);
        }
        return binario;
    }
    
}
