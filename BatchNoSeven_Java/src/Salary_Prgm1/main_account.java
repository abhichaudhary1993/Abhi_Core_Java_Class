package Salary_Prgm1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main_account {
	
	static String Name ;
	static String Designation ;
	public static final String Company_name = "Aptron";
	static double Salary ;
	static int Emp_id ;
	public static final int Acc_no = 3068789;
	static double balance ;
	static double Current_balance;
	
	public static void Currentbalance() {
		Current_balance = balance + Salary;
		System.out.println("Mr. " + Name + " employee Id is " + Emp_id + " working as  " + Designation + " in company "
				+ "" + Company_name + " drawing monthly salary Rs. " + Salary + " containing savings account number: "
				+ Acc_no + " His current " + " balance is Rs.  " + Current_balance);
				
		
	}
	
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br =new  BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Enter Your Name : ---> ");
		String name = br.readLine();
		main_account.Name = name;
		
		System.out.println("Enter Designation : SSTE/SDET/STE/ASTE/Trainee ");
		String designation = br.readLine();
		main_account.Designation = designation;
		
		
		System.out.println("Enter Your Emp_Id : ---> ");
		String emp_id = br.readLine();
		Emp_id = Integer.parseInt(emp_id);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
