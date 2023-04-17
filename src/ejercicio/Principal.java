package ejercicio;

import java.util.Scanner;

public class Principal {

	public static void main (String [] args) {
		double n1, n2;
		int menu;
		Scanner sc = new Scanner (System.in);
		
		do {
			System.out.println("1. Sumar\n"
					+ "2. Restar\n"
					+ "3. Multiplicar\n"
					+ "4. Dividir\n"
					+ "5. Resto\n"
					+ "0. Salir");
			menu=Integer.parseInt(sc.nextLine());
			
		}while(menu!=0);
	}
}
