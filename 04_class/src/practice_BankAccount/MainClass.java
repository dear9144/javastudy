package practice_BankAccount;

public class MainClass {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount myAcc = new BankAccount("010-1111-1111",50_000);
		BankAccount yourAcc = new BankAccount("010-9999-9999", 100_000);
		
		myAcc.transfer(yourAcc, 100_000);
		
		myAcc.inquiry();
		yourAcc.inquiry();
	}
}
