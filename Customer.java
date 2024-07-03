package pack.Practice;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	String customerId;
	String name;
	public List<BankAccount> accounts;
	
	
	public Customer(String name,String customerId) {
		this.customerId = customerId;
		this.name = name;
		this.accounts = new ArrayList<>();
	}
	
	public String getCustomerId() {
		return customerId;
	}
	
	public String getCustomerName() {
		return name;
	}
	
	public List<BankAccount> getAccounts(){
		return accounts;
	}
	
	public void addAccount(BankAccount account) {
		
		accounts.add(account);
	}
	
	public void removeAccount(BankAccount account) {
		accounts.remove(account);
	}
	
	 @Override
	    public String toString() {
	        return "Customer{" +
	                "name: '" + name + '\'' +
	                ", customerId: '" + customerId + '\'' +
	                ", accounts: " + accounts +
	                '}';
	    }
	
}
