package pack.Practice;

public class SavingsAccount extends BankAccount{
	private double intrestRate;
	public SavingsAccount(double intrestRate,String accountNumber, double balance) {
		super(accountNumber, balance);
		this.intrestRate = intrestRate;
	}
	
	public void intrestCalculation() {
		double intrest = getBalance() * intrestRate / 100;
		deposit(intrest);
	}

}
