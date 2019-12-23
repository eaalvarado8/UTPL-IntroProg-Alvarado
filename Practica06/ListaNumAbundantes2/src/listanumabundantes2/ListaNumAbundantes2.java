
package listanumabundantes2;

import java.util.Scanner;


public class ListaNumAbundantes2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, c, sum;
        System.out.println("Listar números abundantes comprendidos entre 0 y N: ");
        System.out.print("Ingrese N: ");
        N = sc.nextInt();
        System.out.print("Los números abundantes entre 0 y " + N + " son: ");
        int [] num = new int[N];
        for(int i = 0; i < N;i++){
            num[i] = i;
        }
        for(int i = 0; i < N; i++){
            if(Abundante(num[i])){
                System.out.print(num[i] + ", ");
            }
        }
    }
    public static boolean Abundante(int x) {
        boolean esAbundante = false;
        int c, sum;
        c = 1;
        sum = 0;
            while(c < x){
                if(x%c==0){
                    sum += c;
                }
                c++;
            }
            if(sum > x){
                esAbundante = true;
            }
       return esAbundante;
    }
}
