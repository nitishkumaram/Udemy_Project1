package bankaccountapp;

public class BankAccountApp {
	
	public static void main(String args[]){
		
		Checking chkacc1 = new Checking("Nitish kumar","321456879",1500);
		
		Savings savacc1 = new Savings("Manish Kumar","456657897",2500);
		
		savacc1.showInfo();
		chkacc1.showInfo();
		
	}

}
