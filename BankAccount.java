import java.util.Scanner;

public class BankAccount {
	
	private String firstName;
	private String lastName;
	private int accountNumber;
	private double accountBalance;
	private String SSN; 
	private double MIN_BALANCE = 1000;
	Scanner input = new Scanner(System.in);

	public BankAccount() {
		
	} // End BankAccount() default constructor

	public BankAccount(String firstName, String lastName, int accountNumber, String SSN) {
		
		setFirstName(firstName); // Set the instance variable firstName.
		setLastName(lastName); // Set the instance variable lastName.
		setAccountNumber(accountNumber); // Set the instance variable accountNumber.
		setSSN(SSN); // Set the instance variable SSN.
	} // End BankAccount() parameterized constructor

	public BankAccount(String firstName, String lastName, int accountNumber, String SSN, double accountBalance) {

		setFirstName(firstName); // Set the instance variable firstName.
		setLastName(lastName); // Set the instance variable lastName.
		setAccountNumber(accountNumber); // Set the instance variable accountNumber.
		setAccountBalance(accountBalance); // Set the instance variable accountBalance.
		setSSN(SSN); // Set the instance variable SSN.

	} // End BankAccount() parameterized constructor

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	} // End setFirstName() method

	public String getFirstName() {
		return this.firstName;
	} // End getFirstName() method

	public void setLastName(String lastName) {
		this.lastName = lastName;
	} // End setLastName() method

	public String getLastName() {
		return this.lastName;
	} // End getLastName() method
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	} // End setAccountNumber() method
	
	public int getAccountNumber() {
		return this.accountNumber;
	} // End getAccountNumber() method

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	} // End setAccountBalance() method

	public double getAccountBalance() {
		return this.accountBalance;
	} // End getAccountBalance() method

	public void setSSN(String SSN) {
		this.SSN = SSN;
	} // End setSSN() method

	public String getSSN() {
		return this.SSN;
	} // End getSSN() method

	public void depositeBalance(double depositeAmount) {
		if (depositeAmount <= 0) {
			System.out.println("The deposit amount has to be more than $0.0"); // Check to make sure deposit is more than 0.
		} // End if

		if (depositeAmount > 0) {
			this.accountBalance = this.accountBalance + depositeAmount; // Deposit when amount is more than $0.
		} // End if
	} // End depositBalance() method

	public void withdrawBalance(double withdrawAmount) {
		if ((withdrawAmount <= 0) || (withdrawAmount > this.accountBalance)) {
			System.out.println("Cannot withdraw less than $0 or withdraw more than your account balance.");
		} else {
			 this.accountBalance = this.accountBalance - withdrawAmount;
		}
	} // End withdrawBalance() method

} // End BankAccount class