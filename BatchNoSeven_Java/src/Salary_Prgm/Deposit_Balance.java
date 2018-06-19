package Salary_Prgm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Deposit_Balance {
	
	public static void deposit() throws IOException {
		
		BufferedReader BR2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Deposit Amount ");
		String DepAmt = BR2.readLine();
		double DepStore = Double.parseDouble(DepAmt);
		
		Salary_prgrm1.balance = Salary_prgrm1.balance + DepStore;
		System.out.println("Your Amount is " + Salary_prgrm1.balance );
		
		
		System.out.println("HELLO Mr. " + Salary_prgrm1.Name + " , " + "Unique Employee Id is " + Salary_prgrm1.Emp_Id + " , " + "Working as Designation of :" + Salary_prgrm1.Designation
				+ " , "+ " In Company : " + " " + Salary_prgrm1.Company_name + " , " +  " Drawing monthly salary: " + Salary_prgrm1.Salary
				+ " , "+ "Containing Savings Account Number: " + " -- " + Salary_prgrm1.Acc_No + " -- " +" His current " + " balance is Rs.:" + Salary_prgrm1.balance);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
