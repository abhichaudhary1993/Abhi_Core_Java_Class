package Java2;

import java.util.Scanner;

public class Temp_conv {
	
	
	

	public static void main(String[] args) {
		
		Scanner input_temp = new Scanner(System.in);
	    
		
		
		System.out.println("Enter the temprature in F ");
		
		
		float temp_fah = input_temp.nextFloat();
		
		input_temp.close();
		
		float temp_celcius = (temp_fah - 32 ) * 5 / 9 ;
		
		System.out.println("Temprature in celcius " + " " + temp_celcius);
		
		
		
		


	}

}
