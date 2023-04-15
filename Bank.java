// This program will call the BankAccount subclass to display a customer's bank information before and after a transaction
// For customer1 all the information (name, SSN, account number, and account balance) will be passed to the subclass constructor
// For customer2 some of the information (name, SSN, and account number) will be passed to the subclass constructor
// For customer3 no information will be passed to the subclass constructor

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		String firstName[] = {"Teddy", "Ellis", "Bill"};
		String lastName[] = {"Duong", "Mckinney", "Overbeck"};
		int accountNumber[] = {47115466, 42318178, 46043337};
		double accountBalance[] = {7098.00, 4596.00, 6100.00,};
		String SSN[] = {"263-88-XXXX", "401-20-XXXX", "460-71-XXXX"};
		String userInput;
		int userCommand;
		double transactionAmount = 0.00;
		Scanner input = new Scanner(System.in);
		
		// Create customer1 account object. Customer data such as first name, last name, SSN, account number, and account balance are 
		// passed to BankAccount subclass.  

		BankAccount customer1Account = new BankAccount(firstName[0], lastName[0], accountNumber[0], SSN[0], accountBalance[0]);
		System.out.println("Customer Name: " + customer1Account.getFirstName() + " " + customer1Account.getLastName() + ", SSN: " 
			+ customer1Account.getSSN() + ", Account Number: " + customer1Account.getAccountNumber() + ", Current Balance: " 
			+ customer1Account.getAccountBalance());
		
		// Prompt user to enter deposite or withdraw amount from the account.
		System.out.println("Enter 0 to withdraw or 1 to deposit money.");
		userInput = input.nextLine();
		userCommand = Integer.parseInt(userInput);
		if (userCommand == 0) { // Withdraw money
		  System.out.println("Enter the amount of money to withdraw");
		  userInput = input.nextLine();
		  transactionAmount = Double.parseDouble(userInput);
		  customer1Account.withdrawBalance(transactionAmount);
		  System.out.println("New Account Balance: " + customer1Account.getAccountBalance());
		  System.out.println("");
		} // End if

		else if(userCommand == 1) {
		  System.out.println("Enter the amount of money to deposit");
		  userInput = input.nextLine();
		  transactionAmount = Double.parseDouble(userInput);
		  customer1Account.depositeBalance(transactionAmount);
		  System.out.println("New Account Balance: " + customer1Account.getAccountBalance());
		  System.out.println("");
		} // End else if

		// Create customer2 account object. Customer data such as first name, last name, SSN, and account number are 
		// passed to BankAccount subclass.

		BankAccount customer2Account = new BankAccount(firstName[1], lastName[1], accountNumber[1], SSN[1]);
		customer2Account.setAccountBalance(accountBalance[1]);
		System.out.println("Customer Name: " + customer2Account.getFirstName() + " " + customer2Account.getLastName() 
			+ ", Account Number: " + customer2Account.getAccountNumber() + ", SSN: " + customer2Account.getSSN()
			+ ", Account Balance: " + customer2Account.getAccountBalance());		

		// Prompt user to enter deposite or withdraw amount from the account.
		System.out.println("Enter 0 to withdraw or 1 to deposit money.");
		userInput = input.nextLine();
		userCommand = Integer.parseInt(userInput);
		if (userCommand == 0) { // Withdraw money
		  System.out.println("Enter the amount of money to withdraw");
		  userInput = input.nextLine();
		  transactionAmount = Double.parseDouble(userInput);
		  customer2Account.withdrawBalance(transactionAmount);
		  System.out.println("New Account Balance: " + customer2Account.getAccountBalance());
		  System.out.println("");
		} // End if

		else if(userCommand == 1) {
		  System.out.println("Enter the amount of money to deposit");
		  userInput = input.nextLine();
		  transactionAmount = Double.parseDouble(userInput);
		  customer2Account.depositeBalance(transactionAmount);
		  System.out.println("New Account Balance: " + customer2Account.getAccountBalance());
		  System.out.println("");
		} // End else if

		// Create customer3 account object.

		BankAccount customer3Account = new BankAccount();
		customer3Account.setFirstName(firstName[2]);
		customer3Account.setLastName(lastName[2]);
		customer3Account.setAccountNumber(accountNumber[2]);
		customer3Account.setAccountBalance(accountBalance[2]);
		customer3Account.setSSN(SSN[2]);	

		System.out.println("Customer Name: " + customer3Account.getFirstName() + " " + customer3Account.getLastName() 
			+ ", Account Number: " + customer3Account.getAccountNumber() + ", SSN: " + customer3Account.getSSN()
			+ ", Account Balance: " + customer3Account.getAccountBalance());	

		// Prompt user to enter deposite or withdraw amount from the account.
		System.out.println("Enter 0 to withdraw or 1 to deposit money.");
		userInput = input.nextLine();
		userCommand = Integer.parseInt(userInput);
		if (userCommand == 0) { // Withdraw money
		  System.out.println("Enter the amount of money to withdraw");
		  userInput = input.nextLine();
		  transactionAmount = Double.parseDouble(userInput);
		  customer3Account.withdrawBalance(transactionAmount);
		  System.out.println("New Account Balance: " + customer3Account.getAccountBalance());
		  System.out.println("");
		} // End if

		else if(userCommand == 1) {
		  System.out.println("Enter the amount of money to deposit");
		  userInput = input.nextLine();
		  transactionAmount = Double.parseDouble(userInput);
		  customer3Account.depositeBalance(transactionAmount);
		  System.out.println("New Account Balance: " + customer3Account.getAccountBalance());
		  System.out.println("");
		} // End else if
	
	} // End Main
} // End Bank class