package PriEva;
import java.util.Scanner;
public class SMI {
	public static void main(String[] args) {
		//Comentario comentado
		double longitud;
		Scanner sc = new Scanner(System.in);
		System.out.println("Radio: ");
		double radio=sc.nextDouble();
		longitud = 2 * 3.1416 + radio;
		System.out.println("Longitud: "+longitud);
		sc.close();
		//Comentario hecho por JoseMa
	}
}
