package main.java.liceosorolla;

public class Cadena {
	
	
	public static void main(String[] args) {
		
		String texto = "cadena";
		
		cadena(texto);
		cambiador(texto);
		
	}//MAIN
	
	
	public static void cadena(String texto) {
		
		
		System.out.println("Longitud de la cadena es: " + texto.length()); 
		
	}
	
	public static void cambiador(String texto) {
		
		
		System.out.println(texto.toUpperCase()); 
		System.out.println(texto.toLowerCase()); 
		
	}
}
