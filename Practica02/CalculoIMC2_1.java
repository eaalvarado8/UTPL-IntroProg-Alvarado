import java.util.Scanner;
public class CalculoIMC2_1 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		int  pesoKg;
		float estaturaM;
		double  IMC;
		System.out.println("            CALCULO DEL IMC");
		System.out.println("            ===============");
		System.out.print("Ingrese su nombre: ");
		nombre = System.console().readLine();
		System.out.print("Ingrese su peso en Kg: ");
		pesoKg = sc.nextInt();
		System.out.print("Ingrese su estatura en metros: ");
		estaturaM = sc.nextFloat();
		IMC = pesoKg / Math.pow(estaturaM, 2);
		System.out.println("El IMC de " + nombre + " es igual a: " + IMC);
		System.out.println("Tabla IMC*");
		System.out.println("\nValor del IMC   " + "     Estado\n");
		System.out.println("Menos de 18,49  " + "     Peso Normal");
		System.out.println("18.50 a 24.99   " + "     Sobre Peso");
		System.out.println("25 a 29.99      " + "     Obesidad Leve");
		System.out.println("30 a 34.99      " + "     Obesidad Media");
		System.out.println("35 a 39.99      " + "     Obesidad Morbida");
		System.out.println("*Clasificacion de la OMC de acuerdo con el IMC");
	}
}

