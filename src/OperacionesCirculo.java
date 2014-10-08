import java.util.Scanner;

import com.zubiri.geometria.Circulo;
/* Programa para calcular el area de un circulo con el radio que se introduce. */

public class OperacionesCirculo {

	public static void main (String args[]) {

		double radiointroducido, area, circunferencia;

		Circulo circulo1 = new Circulo();
	
		Scanner sc = new Scanner(System.in);

		System.out.print("\nIntroduce el radio del circulo: ");

		radiointroducido = sc.nextDouble();

		circulo1.setRadio(radiointroducido);

		area = circulo1.area();
		circunferencia = circulo1.circunferencia();



		System.out.println("\nEl area del circulo es: " + area + "m2");
		System.out.println("\nLa circunferencia del circulo es: " + circunferencia + "m");

	}
}
