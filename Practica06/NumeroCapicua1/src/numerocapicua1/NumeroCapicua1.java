
package numerocapicua1;

import java.util.Scanner;


public class NumeroCapicua1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N, aux, c = 0;
        System.out.print("Ingrese numero de digitos que tiene el numero: ");
        N = sc.nextInt();
        int[] num = new int[N];
        int[] inver = new int[N];
        for(int i = 0; i < N; i++){
            System.out.print("Ingrese digito " + (i+1) + ": ");
            num[i] = sc.nextInt();
            inver[i] = num[i];
        }
        for(int i = 0; i < N/2; i++){
            aux = inver[i];
            inver[i] = inver[(N-1) - i];
            inver[(N-1)- i] = aux;
        }
        for(int i = 0; i < N; i++){
            if(num[i] == inver[i]){
                c++;
            }
        }
        if(c == N){
            System.out.print("El número ");
            for(int i = 0; i < N; i++){
                System.out.print(num[i]);
            }
            System.out.print(" es capicúa");
        }else{
            System.out.print("El número ");
            for(int i = 0; i < N; i++){
                System.out.print(num[i]);
            }
            System.out.print(" no es capicúa");
        }
    }  
}
