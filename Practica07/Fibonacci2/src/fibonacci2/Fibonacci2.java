/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Fibonacci2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.print("Ingrese numero fibonaccy a mostrar: ");
        num = sc.nextByte();
        System.out.println("Numero " + num + " fibonacci" + Fibonacci(num)) ;
    }
    public static int Fibonacci(int x){
        int fib, fib_anterior, fib_nuevo, aux, c;
        fib_anterior = 0;
        fib_nuevo = 1;
        int [] fn = new int [x+1];
        for ( c = 2 ; c <= x ; c = c+ 1){
            fn[c-2] = fib_nuevo;
            aux = fib_nuevo;
            fib_nuevo = fib_nuevo + fib_anterior;
            fib_anterior = aux;
        }
        fib = fn[x-2] + fn[x-1];
        return fib;
    } 
}
