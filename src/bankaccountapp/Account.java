package bankaccountapp;

public abstract class Account implements IBaseRate {

	//List common properties for saving and checking accounts
	
	String name;
	String sSN;
	double balance;
	
	static int index = 10000;
	String accountNumber;
	double rate;
	
	//Constructor to set base properties and initialize the account
	
	public Account(String name, String sSN, double initDeposit){
		
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		
		//set Account number
		index++;
		this.accountNumber = setAccountNumber();
	}
	
	
	private String setAccountNumber(){
		String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID +randomNumber;
		
	}
	
	//List common methods
	
	public void showInfo(){
		
		System.out.println("NAME: " + name
				+ "\nBALANCE: " + balance
				+ "\nACCOUNT NUMBER: " + accountNumber);
	}
	
}
