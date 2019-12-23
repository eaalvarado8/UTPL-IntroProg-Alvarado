

package paresenvector1;

import java.util.Scanner;


public class ParesEnVector1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N;
        System.out.print("Ingrese numero de datos que desea ingresar: ");
        N = sc.nextInt(); 
        int[] num = new int[N];
        for(int i = 0; i < N; i++){
            System.out.print("Ingrese numero " + (i+1) + ": ");
            num[i] = sc.nextInt();
        }
        System.out.println(par(num) + " elementos del vector son números primos");
    }
    public static int par(int[] x) {
        int c = 0;
        for(int i = 0; i < x.length; i++){
            if( x[i] % 2 == 0){
                c++;
            }
        }
        return c;
    }
    
}
