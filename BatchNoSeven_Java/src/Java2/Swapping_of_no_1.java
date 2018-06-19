package Java2;

public class Swapping_of_no_1 {
	
	int a ;
	int b ;
	int c ;
	
	public void swap() {
        System.out.println("Numbers Before Swapping " + " " + a + " "   + b );
		
		c = b ;
		b = a;
		a = c ;
		
		System.out.println(" Numbers after Swapping " + " " + a + " " + b);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Swapping_of_no_1 no1 = new Swapping_of_no_1();
		no1.a = 500;
		no1.b = 600;
		no1.swap();
		
		
		
		
		

	}

}
