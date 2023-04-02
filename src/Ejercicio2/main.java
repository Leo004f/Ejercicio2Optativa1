package Ejercicio2;

import java.util.LinkedList;
import java.util.Scanner;

import SistemaDeReserva.Cliente;

public class main {

	public static void main(String[] args) {
		
		int op;
		LinkedList<Cliente>  clientes 	= new LinkedList<>();
		LinkedList<Recaudacion>  recaDia= new LinkedList<>();
		recaDia.add(new Recaudacion(1, 100));
		clientes.add(new Cliente("Leo", "de la fuente"));
		clientes.add(new Cliente("Pepe", "Pai"));
		
		do {
			
			
			op = Menu.menu();
					
			switch(op) {
			
			case 1:
				System.out.println("Ingrese nombre a buscar");
				Scanner input = new Scanner(System.in);
				String nombre =input.next();
				Cliente.buscarCliente(nombre, clientes);
				break;
			case 2:
				System.out.println("Ingrese numero de dia a buscar");
				Scanner input1 = new Scanner(System.in);
				int nroDia = input1.nextInt();
				Recaudacion.mostrarRecaudacionDia(nroDia, recaDia);
					
			
			}
			
		}while(op != 0);

	}

}
