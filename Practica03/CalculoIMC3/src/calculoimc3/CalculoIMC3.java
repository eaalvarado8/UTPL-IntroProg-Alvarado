/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoimc3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CalculoIMC3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
	int  pesoKg;
	float estaturaM;
	double  IMC;
	System.out.println("            CALCULO DEL IMC");
	System.out.println("            ===============");
	System.out.print("Ingrese su nombre: ");
	nombre = sc.nextLine();
	System.out.print("Ingrese su peso en Kg: ");
	pesoKg = sc.nextInt();
	System.out.print("Ingrese su estatura en metros: ");
	estaturaM = sc.nextFloat();
	IMC = pesoKg / Math.pow(estaturaM, 2);
        if ( IMC < 18.49){
            System.out.println("El/La Sr.(a) " + nombre + " posee un Infra Peso");
        }
        if ( IMC >= 18.99 && IMC <= 24.99){
            System.out.println("El/La Sr.(a) " + nombre + " posee un Peso Normal");
        }
        if (IMC >= 25 && IMC <= 29.99){
            System.out.println("El/La Sr.(a) " + nombre + " posee Sobre Peso");
        }
        if (IMC >= 30 && IMC <= 34.99){
            System.out.println("El/La Sr.(a) " + nombre + " posee Obesidad Leve");
        }
        if (IMC >= 35 && IMC <= 39.99){
            System.out.println("El/La Sr.(a) " + nombre + " posee Obesidad Media");
        }
        if (IMC >= 40 ){
            System.out.println("El/La Sr.(a) " + nombre + " posee Obesidad Morbida");
        }
    }    
}
