package Ejercicio2;

import java.util.LinkedList;

public class Cliente {
	
	private String nombre;
	private String apellido;
	
	
	public Cliente(String nombre, String apellido) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		
	}
	
	public void mostrarDatos() {
		
		System.out.println("Apellido: "+apellido);
		
	}
	
	public static void buscarCliente(String nombre, LinkedList<Cliente> c) {
		
		
		for(Cliente lista : c) {
			
			if(lista.nombre.equals(nombre)) {
				
				lista.mostrarDatos();
			}
		}
		
	}

}
