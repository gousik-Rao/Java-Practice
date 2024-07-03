package pack.Practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	private BankAccount b;
	private Customer c;
	
	@BeforeEach
	public void setUp() {
		 b = new BankAccount("C1022",4567);
		 c = new Customer("Alice","NOT&7");
	}
	
	@Test
	public void bankTest() { // Test Customer name and customer ID
		assertEquals("Alice",c.name);
		assertEquals("NOT&7",c.customerId);
	}
	
	@Test
	public void depositTest() { // test deposit 
		b.deposit(346);
        assertEquals(4913, b.balance, "Balance should be 4913 after depositing 346");
        
		b.deposit(340);
        assertEquals(5253, b.balance, "Balance should be 5253 after depositing 340");
	}
	
	@Test
	public void withdrawalTest() {
		b.withdraw(100);
        assertEquals(4467, b.balance, "Balance should be 4467 after withdrawing 100");
        
		b.withdraw(800);
        assertEquals(3667, b.balance, "Balance should be 3667 after withdrawing 800");
        
        b.withdraw(-29);
       
	}
	
	@Test
	public void printDetailsTest() {
		b.printAccountDetails();
	}
	
	@Test
	public void getCustomerIdTest() {
        assertEquals("NOT&7", c.getCustomerId());
    }
	
	@Test
	public void getCustomerNameTest() {
        assertEquals("Alice", c.getCustomerName());
	}
	
	@Test
	public void getAccountsTest() {
        assertTrue(c.getAccounts().isEmpty(), "Customer should have no accounts initially");
	}
	
	@Test
	public void addAccountsTest() {
		c.addAccount(b);
		assertEquals(1, c.getAccounts().size(), "Customer should have one account after adding");
        assertEquals(b, c.getAccounts().get(0), "The added account should be the same as the one retrieved");
    
	}
	
	@Test
	public void removeAccountsTest() {
		 c.addAccount(b);
	     assertEquals(1, c.getAccounts().size(), "Customer should have one account after adding");
	  
		c.removeAccount(b);
        assertTrue(c.getAccounts().isEmpty(), "Customer should have no accounts after removing");
	}
}
