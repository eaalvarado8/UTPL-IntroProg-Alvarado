package sumadigitos2;

import java.util.Scanner;

public class SumaDigitos2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, suma = 0;
        System.out.print("Ingrese un número entero positivo: ");
        num = sc.nextInt();

        
        
        while(num > 10){
            num = sumarDigitos(num);
        }
        
        System.out.println("\nLa suma de los dígitos es: "
                + num);
    }

    public static int sumarDigitos(int x) {
        int suma = 0;
        if (x < 10) {
            suma = x;
        } else {
            suma = x % 10 + sumarDigitos(x / 10);
        }
        return suma;
    }

}
