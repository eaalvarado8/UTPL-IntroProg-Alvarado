
package cuentaprimos1;

import java.util.Scanner;

public class CuentaPrimos1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, c = 0;
        System.out.print("Cuantos numeros desea ingresar: ");
        N = sc.nextInt();
        int[] num = new int[N];
        for(int i = 0; i < N; i++){
            System.out.print("Ingrese numero positivo " + (i+1) + ": ");
            num[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            if(primo(num[i])){
                c++;
            }
        }
        System.out.println("De los elementos ingresados " + c + "  son primos");
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
