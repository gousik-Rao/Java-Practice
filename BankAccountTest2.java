package pack.Practice;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest2 {
	BankAccount ba;
	
	@BeforeEach
	public void setUp() {
		ba = new BankAccount("CLAP1234",3540);
	}
	
	
	@Test
	public void getBalanceTest() {
		ba.getBalance();
	}
	
	
	@Test
	public void testDeposit() {
		ba.deposit(1000);
		assertEquals(4540,ba.getBalance(), "Balance should be equal to 4540");
		ba.deposit(100);
		assertEquals(4640,ba.getBalance(), "Balance should be equal to 1");

		ba.withdraw(4641);
		assertEquals(4640,ba.getBalance(), "Balance should remain the same after attempting "
				+ "to withdraw 4541 with insufficient balance");
		
	}
	
	@Test
	public void testWithdraw() {
		ba.deposit(1000);
		ba.withdraw(4539);
		assertEquals(1,ba.getBalance(), "Balance should be equal to 1");

		ba.withdraw(1);
		assertEquals(0,ba.getBalance(), "Balance should remain the same after attempting "
				+ "to withdraw 4541 with insufficient balance");
		
	}
	
	@Test
	public void testTransactionHistory() {
		ba.deposit(460);
		ba.withdraw(3500);
		ba.deposit(500);
		
		List<Transaction> trans = ba.getTransactions();
		assertEquals(3,trans.size());
		
		assertEquals("Deposit",trans.get(0).getTransactionType());
		assertEquals(460,trans.get(0).getTransactionAmount(),0.01);
		
		assertEquals("Withdrawal",trans.get(1).getTransactionType());
		assertEquals(3500,trans.get(1).getTransactionAmount(),0.01);
		
		assertEquals("Deposit",trans.get(2).getTransactionType());
		assertEquals(500,trans.get(2).getTransactionAmount(),0.01);
	}
	
	// This Method checks whether the methods are running properly and not checks the console output
	public void  testPrintAccountDetails() {
		ba.deposit(300);
		ba.withdraw(200);
	}
	

}
