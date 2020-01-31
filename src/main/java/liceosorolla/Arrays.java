package main.java.liceosorolla;



public class Arrays {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5};

		 
		 System.out.println("El máximo es " + maximo(array));
		
		
	}//MAIN



	public static int maximo(int[] num){
		
		int max;
		max=num[0];
		for(int i = 0; i < num.length; i++){
			if(max<num[i]){
				max=num[i];
			}
		}
	
		return max;
	}
}//CLASS
