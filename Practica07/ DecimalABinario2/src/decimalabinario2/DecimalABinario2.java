/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimalabinario2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class DecimalABinario2 {

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
        int modulo;
        String binario = "";
        while(x > 0){
            modulo = x % 2;
            binario = modulo + binario;
            x = x / 2;
        }
        return binario;
    }
}
