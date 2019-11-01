import java.util.Scanner;
public class  CalculoIMC1 {
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
	}
}