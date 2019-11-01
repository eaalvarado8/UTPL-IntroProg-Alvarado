import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class CalculoIMC2 {
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
	public CalculoIMC2(){
		super("Mi tabla");
		DefaultTableModel modelo=new DefaultTableModel();
		modelo.addColumn("Valor del IMC");
		modelo.addColumn("Estado");
		String[]p1={"Menos de 18.49","Infra Peso"};
		String[]p2={"18.50 a 24.99","Peso Normal"};
		String[]p3={"25 a 29.99","Sobre Peso"};
		String[]p4={"30 a 34.99","Obesidad Leve"};
		String[]p5={"35 a 39.99","Obesidad Media"};
		String[]p6={"40 o mas","Obesidad Morbida"};
		modelo.addRow(p1);
		modelo.addRow(p2);
		modelo.addRow(p3);
		modelo.addRow(p4);
		modelo.addRow(p5);
		modelo.addRow(p6);
		JTable tabla=new JTable(modelo);
		tabla.setBounds(20,22,500,500);
		setSize(750,700);
		add(tabla);
	}
	public static void main(String[] args) {
		CalculoIMC2 tl=new CalculoIMC2();
	}
}