package Ejercicio2;

import java.util.Scanner;

public class Menu {
	
	public static int menu() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("--------------");
		System.out.println("Menu Principal");
		System.out.println("--------------");
		System.out.println("1 - Alta cliente");
		System.out.println("2 - Cliente");
		System.out.println("0 - Salir");
		System.out.println("Ingrese una opcion: ");
		
		int op = input.nextInt();
		
		return op;
	}

}
