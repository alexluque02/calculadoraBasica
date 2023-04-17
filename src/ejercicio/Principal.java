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
			
			switch(menu) {
			case 1:
				System.out.println("Diga un número");
				n1=Double.parseDouble(sc.nextLine());
				System.out.println("Diga otro número");
				n2=Double.parseDouble(sc.nextLine());
				System.out.println("La suma es: "+(n1+n2));
				break;
			case 2:
				System.out.println("Diga un número");
				n1=Double.parseDouble(sc.nextLine());
				System.out.println("Diga otro número");
				n2=Double.parseDouble(sc.nextLine());
				System.out.println("La resta es: "+(n1-n2));
				break;
			}
		}while(menu!=0);
	}
}
