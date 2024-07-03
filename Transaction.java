package pack.Practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class Transaction {
	private String transactionId;
	private double amount;
	private LocalDateTime date;
	private String type;
	
	// Parameterized constructor
	public Transaction(String type, double amount) {
		this.transactionId = UUID.randomUUID().toString();
		this.date = LocalDateTime.now();
		this.amount = amount;
		this.type = type;
	}
	
	
	// Getters
	public String getTransactionId() {
		return transactionId;
	}
	
	public LocalDateTime getTransactionDate() {
		return date;
	}
	
	public String getTransactionType() {
		return type;
	}
	
	public double getTransactionAmount() {
		return amount;
	}
	
	@Override
	public String toString() {
		return "Transaction ID: "+transactionId+
				"\nTransaction date: "+date
				+"\nType of transaction: "+
				type+"\nTransferred amount: "+
				amount+"\n";
	}
	
}
