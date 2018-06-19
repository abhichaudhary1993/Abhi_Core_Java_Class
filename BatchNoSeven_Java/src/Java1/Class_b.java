package Java1;

public class Class_b {
	
	int a , b ;
	
	
	public void addition() {
		System.out.println("Addition of the two number is  "+ " "+ (a+b));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class_b Add = new Class_b();
		Add.a = 15 ;
		Add.b = 10;
		Add.addition();
		
		Class_a Sub = new Class_a();
		Sub.x = 15 ;
		Sub.y = 20;
		Sub.Subtract();
		
		
		
	}

}
