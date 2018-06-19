package Salary_Prgm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Salary_prgrm1 {
	
	static String Name ;
	static String Designation;
	public static final String Company_name = "Aptron";
	static double Salary ;
	static int Emp_Id ;
	public static final int Acc_No = 6030;
    static double balance ;
	
	
	public static void Currentbalance() {
		balance = balance + Salary ;
		
		System.out.println("HELLO Mr. " + Name + " , " + "Unique Employee Id is " + Emp_Id + " , " + "Working as Designation of :" + Designation
				+ " , "+ " In Company : " + " " + Company_name + " , " +  " Drawing monthly salary: " + Salary
				+ " , "+ "Containing Savings Account Number: " + " -- " + Acc_No + " -- " +" His current " + " balance is Rs.:" + balance);
		
	}
	
	

	public static void main(String[] args) throws IOException {
		
	 BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter your Good Name --> ");
	 String S = BR.readLine();
	 Salary_prgrm1.Name = S ;
	 
	 
	 
	 
	 
	//This will Give text In between Quotes 
	 // Then Buffer... Read this id And give to me as a STring
	 //and we store the value in a Local Variable ID 
	 //then Integer.parseInt converts strings value into Integer value and we 
	 //Store that integer value in Emp_id static variable.
	 System.out.println("Enter Your Unique Employee_ID -----> ");
	 String ID = BR.readLine();
	 Emp_Id = Integer.parseInt(ID);
	 
	 
	 System.out.println("Enter the Designation following : SSTE / SDET / STE / ASTE / Trainee ------> ");
	 String D = BR.readLine();
	 Salary_prgrm1.Designation = D;
	 
	 
	 //We use now condition statements using Switch case method
	 
	 switch (Designation) {
	 
	 case "SSTE" :  Salary_prgrm1.Salary = 60000;Salary_prgrm1.Currentbalance();break;
	 case "SDET" :  Salary_prgrm1.Salary = 50000;Salary_prgrm1.Currentbalance();break;
	 case "STE" :  Salary_prgrm1.Salary = 35000;Salary_prgrm1.Currentbalance();break;
	 case "ASTE" :  Salary_prgrm1.Salary = 25000;Salary_prgrm1.Currentbalance();break;
	 case "Trainee" :  Salary_prgrm1.Salary = 18000;Salary_prgrm1.Currentbalance();break;
	 
	 default : System.out.println("YOU HAVE'NT SELECT RIGHT DESIGNATION WHICH IS MENTION IN THE LIST");break;
	 }
	 
	 
	 Withdrawl_Balance.withdrawl();

	 Deposit_Balance.deposit();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}

}
