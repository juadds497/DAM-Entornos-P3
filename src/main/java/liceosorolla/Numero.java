package main.java.liceosorolla;

public class Numero {
	

	public static void factorial(int numero){
		int resultado = 1;
		
		for(int i = 1; i<= numero;i++) {
			 resultado = resultado * i;
		 }
		System.out.println("El factorial es: "+resultado);
		
	}
	

	public static void primo(int numero){
		int contador = 0;
		
		for(int i = 1; i <= numero; i++)
        {
            if((numero % i) == 0)
            {
                contador++;
            }
        }
 
        if(contador <= 2)
        {
            System.out.println("El numero "+numero+ " es primo");
        }else{
            System.out.println("El numero "+numero+ " no es primo");
        }
	}

	public static void main(String[] args) {
		int numero = 4;
		primo(numero);

	}

	
}
