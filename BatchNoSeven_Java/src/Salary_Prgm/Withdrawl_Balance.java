package Salary_Prgm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Withdrawl_Balance {
	
	
	public static void withdrawl() throws IOException {
		BufferedReader BR1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Withdrawing Amount ");
		String Amt = BR1.readLine();
		double Store = Double.parseDouble(Amt);
		 
		
		if (Store<Salary_prgrm1.balance && Store>=0) {
			Salary_prgrm1.balance = Salary_prgrm1.balance - Store ;
			System.out.println("Your Amount is " + Salary_prgrm1.balance );
			
			System.out.println("HELLO Mr. " + Salary_prgrm1.Name + " , " + "Unique Employee Id is " + Salary_prgrm1.Emp_Id + " , " + "Working as Designation of :" + Salary_prgrm1.Designation
					+ " , "+ " In Company : " + " " + Salary_prgrm1.Company_name + " , " +  " Drawing monthly salary: " + Salary_prgrm1.Salary
					+ " , "+ "Containing Savings Account Number: " + " -- " + Salary_prgrm1.Acc_No + " -- " +" His current " + " balance is Rs.:" + Salary_prgrm1.balance);
			
			
			
		}
		else {
			
			System.out.println("Your Withdrawing Amount is Exceed  Your Current Balance , Not Possible to Withdraw" + 
					" Current Balance is  " + Salary_prgrm1.balance);
		}
		
		
		
		
		
		
		
	}

}
