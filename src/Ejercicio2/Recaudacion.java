package Ejercicio2;

import java.util.LinkedList;

public class Recaudacion {
	
	private int nroDia;
	private long totalDia;
	
	public Recaudacion(int nroDia, long totalDia) {
		
		this.nroDia = nroDia;
		this.totalDia = totalDia;
		
	}
	
	
	public static void mostrarRecaudacionDia(int nroDia, LinkedList<Recaudacion> r) {
		
		for(Recaudacion lista : r) {
			
			if(lista.nroDia == nroDia) {
				
				System.out.println("La recaudacion del dia es: "+lista.totalDia);
				
			}
			
		}
		
		
	}
	
	

}
