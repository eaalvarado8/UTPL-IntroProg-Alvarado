
package muestraprimos1;

import java.util.Scanner;

public class MuestraPrimos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, c = 0, j=0;
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
        int[] primos = new int[c];
        for(int i = 0; i < N; i++){
            if(primo(num[i])){
                primos[j] = num[i];
                j++;
            }
        }
        primos = OrdenarVector(primos);
        System.out.print("Los números primos encontrados en el vector son: ");
        System.out.print(primos[0] + " ");
        for(int i = 1; i < c; i++){
            if(primos[i] != primos[i-1]){
                System.out.print(primos[i] + " ");
            }
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
    public static int[] OrdenarVector(int[] x) {
        int aux;
        for (int i = 1; i <  x.length - 1 ; i++) {
            for (int j = 0; j < x.length - i  ; j++) {
                if (x[j] > x[j + 1]) {
                    aux = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = aux;
                }
            }
        }
        return x;
    }
    
}
