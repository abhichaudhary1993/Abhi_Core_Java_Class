package Java1;

public class Class_a {
	
	
	
	int x , y ;
	
	public void Subtract() {
		System.out.println("Subtraction of two number is " + (x-y));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class_a Sub = new Class_a();
		Sub.x = 15;
		Sub.y = 20;
		Sub.Subtract();
		
		
		
	}

}
