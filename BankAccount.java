package pack.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankAccount {
	String accountNumber;
	double balance;
	List<Transaction> trans;

	public BankAccount(String accountNumber,double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.trans = new ArrayList<>(); // Initialize trans list

	}

	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			trans.add(new Transaction("Deposit",amount));
			System.out.println("Amount deposited successfully");
		}else {
			throw new IllegalArgumentException("Enter valid amount");
		}
	}

	
	public void withdraw(double amount) {
		if(amount <= 0) {
			throw new IllegalArgumentException("Enter valid amount");
		}
		else if(balance < amount) {
			System.out.println("Insufficient Balance");
		}else {
			trans.add(new Transaction("Withdrawal",amount));
			balance -= amount;

		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void printAccountDetails() {
		System.out.println("Account Number: "+accountNumber+"\nAccount Balance:"+balance);
		printTransactionDetails();
	}
	
	
	public void printTransactionDetails() {
		System.out.println("\nTransaction History");
		System.out.println("-------------------");

		for(Transaction transs : trans) {
			System.out.println(transs);
		}
	}
	
	public List<Transaction> getTransactions(){
		return trans;
	}
	
	
	public static void main(String[] arg) {
		BankAccount b1=new BankAccount("CLAP1234",200);
//		BankAccount b2=new BankAccount("SBN345GP",500);
//
//		Customer b3 = new Customer("gousik","CR07");
		b1.deposit(300);
		b1.withdraw(201);
		b1.printAccountDetails();
//		b1.getBalance();
//		b3.addAccount(b2);
//		b3.addAccount(b1);
//		b3.removeAccount(b1);

//		List<BankAccount> accounts = b3.getAccounts();
//		
//		for(BankAccount account : accounts) {
//			System.out.println(account);
//		}
		
//		System.out.println(b3);
		
		
		
	}
	
	@Override
	public String toString() {
		return " Account no: "+accountNumber+", Minimum Balance: "+balance;
	}
	
	
}
