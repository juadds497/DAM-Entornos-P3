package main.java.liceosorolla;

public class Arrays {
	
	public static void minimo (int[]array) {
		int min = 999;
		 
		for(int i = 0; i < array.length; i++)
		{
			if(min>array[i])
			{
				min=array[i];
			}
		}
 
		System.out.println("El valor minimo es: "+min);
	}

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		
		minimo(array);
	}
}
