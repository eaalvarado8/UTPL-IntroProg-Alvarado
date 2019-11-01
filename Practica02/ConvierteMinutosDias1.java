import java.util.Scanner;
public class ConvierteMinutosDias1 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int min_1, dia, hora, minuto;
		System.out.print("Ingrese los minutos a calcular: ");
		min_1 = sc.nextInt();
		dia = min_1 / 1440;
		hora = (min_1 - dia * 1440) / 60;
		minuto = (min_1 - dia * 1440) - (hora * 60);
		System.out.print(dia + " dias, "); System.out.print(hora + " horas, "); System.out.print(minuto + " minutos");
	}
}
