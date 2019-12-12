/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimalabinario1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class DecimalABinario1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,modulo;
        String binario = "";
        System.out.print("Ingrese un número: ");
        num = sc.nextInt();
        System.out.print("El número representado en el sistema binario es: ");
        while(num > 0){
            modulo = num % 2;
            binario = modulo + binario;
            num = num / 2;
        }
        System.out.println(binario);
    }
}
