package sucesionparesprimos1;

import java.util.Scanner;

public class SucesionParesPrimos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, a = 3, i = 0;
        System.out.print("Ingrese el numero de elementos: ");
        num = sc.nextInt();

        while (i < num) {
            int b = 2;
            int aux;

            while (b < a && i < num) {
                if (esPrimo(b)) {
                    System.out.print(factorial(a - b) + ",");
                    i++;
                }
                b++;
            }
            aux = a + 1;
            while (!esPrimo(aux)) {
                aux++;
            }
            a = aux;
        }
    }

    public static boolean esPrimo(int n) {
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador < n)) {
            if (n % contador == 0) {
                primo = false;
            }
            contador++;
        }
        return primo;
    }

    public static int factorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }
}