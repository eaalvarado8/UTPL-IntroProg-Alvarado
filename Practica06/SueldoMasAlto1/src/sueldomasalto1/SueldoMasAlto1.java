package sueldomasalto1;

import java.util.Scanner;

public class SueldoMasAlto1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N;
        float mayor;
        System.out.print("Ingrese número de empleados: ");
        N = sc.nextInt();
        float[] sueldo =  new float[N];
        String[] Nombre = new String[N];
        for(int i = 0; i < N; i++){
            System.out.print("Ingrese nombre: ");
            Nombre[i] = sc.next();
            System.out.print("Ingrese sueldo: ");
            sueldo[i] = sc.nextFloat();
        }
        mayor = sueldo[0];
        for(int i = 0; i < N; i++){
            if (mayor < sueldo[i]){
                mayor = sueldo[i];
            }
        }
        System.out.println("Empleado(s) con mayor sueldo: ");
        for(int i= 0; i < N; i++){
            if(mayor == sueldo[i]){
                System.out.println(Nombre[i] + " " + "sueldo: $" + sueldo[i]);
            }
        }
    }
    
}
