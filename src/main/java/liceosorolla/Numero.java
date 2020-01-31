package main.java.liceosorolla;

public class Numero {
	
	public static void factorial(int numero){
		int resultado = 1;
		
		for(int i = 1; i<= numero;i++) {
			 resultado = resultado * i;
		 }
		System.out.println("El factorial es: "+resultado);
		
	}
	
	public static void main(String[] args) {
		int numero = 4;
		
		factorial(numero);
	}
	
	
}
