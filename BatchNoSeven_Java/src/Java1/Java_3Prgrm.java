package Java1;
// This program We take One Method And Create objects and then we print all the informations 
public class Java_3Prgrm {
	
	
	// We take and store Information in variables 
	
	
	String  Inst , StName ; 
	int RollNum ;
	double Fee ;
	//We take a Method
	
	public void display() 
	{
		System.out.println("Student name is  " + StName + " ** "+ "Institute name is  " + Inst + "**" +
				" Fee Submitted By  " +StName + " " +"is Rs." + Fee + " ** " + "RollNumber is "+ RollNum);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// We create Objects in Java_3Prgrm (Class)
		
		Java_3Prgrm Obj = new Java_3Prgrm();
		Obj.StName = "Abhishek";
		Obj.Inst = "Aptron Sol.Pvt.Ltd.";
		Obj.Fee = 25000.25;
		Obj.RollNum = 2580;
		
		
		// Now we call the Method which we created above
		
		Obj.display();
		
		
		
	}

}
