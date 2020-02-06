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
	
	public static int mediana(int []array) {
	    for (int x = 0; x < array.length; x++) {
	        for (int i = 0; i < array.length-x-1; i++) {
	            if(array[i] < array[i+1]){
	                int d = array[i+1];
	                array[i+1] = array[i];
	                array[i] = d;
	            }
	        }
	    }
		int mediana =array[0];
		int medio;
		medio = array.length/2;
		if (array.length % 2 == 0) {
			mediana = (array[medio]+array[medio - 1])/2;
		}else {
			mediana = array[medio];
		}
		return mediana;
	}

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		
		minimo(array);
		System.out.println(mediana(array));
	}
}
