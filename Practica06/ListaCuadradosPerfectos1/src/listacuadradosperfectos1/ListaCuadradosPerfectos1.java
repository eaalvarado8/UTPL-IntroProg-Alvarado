package listacuadradosperfectos1;

import java.util.Scanner;

public class ListaCuadradosPerfectos1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a, b, N, j = 0, d;
        System.out.print("Ingrese inicio del intervalo: ");
        a = sc.nextInt();
        System.out.print("Ingrese final del intervalo: ");
        b = sc.nextInt();
        if(b > a){
            N = (b - a)+1;
            System.out.println("Los cudrados perfectos que se encuentran entre " + a + " y " + b + " son: ");
            int[] vector = new int[N];
            for(int i = 0; i < N ;i++){
                vector[i] = a;
                a++;
            }
            for(int i = 0; i < N; i++){
                while(Math.pow(j,2) <= vector[i]){
                    if(Math.pow(j,2) == vector[i]){
                        d = vector[i];
                        System.out.print(d + " ");
                    }
                    j++;
                }
            }
            System.out.println();
        } else {
            System.out.println("El rango inicial no puede ser mayor al rango final!");
        }
    }
    
}
