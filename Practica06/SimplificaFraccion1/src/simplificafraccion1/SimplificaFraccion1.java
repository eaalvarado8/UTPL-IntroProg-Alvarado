
package simplificafraccion1;

import java.util.Scanner;

public class SimplificaFraccion1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n, d, i =  1, menor;
        System.out.print("Ingrese numerador: ");
        n = sc.nextInt();
        System.out.print("Ingrese denominador: ");
        d = sc.nextInt();
        if( n < d){
            menor = n;
        } else if(d < n){
            menor = d;
        } else{
            menor = n;
        }
        while(i <= menor){
            if(n % i == 0 && d % i == 0){
                n = n/i;
                d = d/i;
            }
            i++;
        }
        System.out.println("Fracción simplificada: " + n + "/" + d);
    }
    
}
