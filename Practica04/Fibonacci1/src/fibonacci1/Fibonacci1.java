/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Fibonacci1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        byte n, c;
        int fib_anterior, fib_nuevo, aux;
        System.out.print("Ingrese los elementos fibonaccy a mostrar: ");
        n = sc.nextByte();
        fib_anterior = 0;
        fib_nuevo = 1;
        c = 2;
        for ( c = 2 ; c <= n ; c = (byte) (c+ 1) ){
            System.out.println(fib_nuevo);
            aux = fib_nuevo;
            fib_nuevo = fib_nuevo + fib_anterior;
            fib_anterior = aux;
        }
    }
}
