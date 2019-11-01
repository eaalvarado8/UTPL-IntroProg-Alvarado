import java.util.Scanner;
public class Circulo1 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		double radio, diametro, circunf, area;
		System.out.print("Ingrese el valor del radio: ");
		radio = sc.nextFloat();
		diametro = (radio * 2);
		circunf = (diametro * 3.14) ;
		area =  (Math.pow(radio,2) * 3.14);
		System.out.println("\nLa circunferencia del círculo con radio " + radio + "cm es " + circunf + "cm");
		System.out.println("El area del círculo con radio " + radio + "cm es " + area + "cm2");
	}
}
