package bankaccountapp;

public class Checking extends Account{

	//List properties specific to a Checking account
	long debitCardNumber;
	int debitCardPin;
	
	//Constructor to initialize checking account properties
	
	public Checking(String name, String sSN, double initDeposit){
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		
		setDebitCard();
		
	}
	
	//List any methods specific to the checking account
	
	private void setDebitCard(){
		
		long cardNumber;
		do{
		cardNumber = (long) (Math.random() * Math.pow(10, 12));
		if(Long.toString(cardNumber).length() == 12){
		break; }
		}while(1 != 0);
		debitCardNumber = cardNumber;
			
			debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo(){
		System.out.println("ACCOUNT TYPE: Checking");
		super.showInfo();
		System.out.println("DEBIT CARD Number: " + debitCardNumber);
		System.out.println("DEBIT CARD PIN: " + debitCardPin);
		System.out.println("===================");
		
	}
}
