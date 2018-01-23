package bankaccountapp;

public class Savings extends Account{

	//List properties specific to the saving account
	int safetyDepositBoxID;
	int safetyDepositKey;
	
	//Constructor to initallize setting  for the Savings properties
	
	public Savings(String name, String sSN, double initDeposit){
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		
		setSafetyDepositBox();
	}
	
	private void setSafetyDepositBox(){

		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		System.out.println("===================");
		safetyDepositKey = (int) (Math.random() * Math.pow(10, 4));
		
	}
	
	//List any methods specific to savings account
	
	public void showInfo(){
		System.out.println("ACCOUNT TYPE: Saving");
		super.showInfo();
		System.out.println("Your Saving Account Feature: ");
		System.out.println("Safety Deposit Box ID: " + safetyDepositBoxID);
		System.out.println("Safety Deposit Box KEY: " + safetyDepositKey);
		System.out.println("===================");
		
	}
}
