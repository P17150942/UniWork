package lib;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void testDefaultConstructor() {
		BankAccount account = new BankAccount();
		assertEquals("The accountNo should be an Empty String","", account.getAccountNo());
		assertEquals("The balance should be 0",0, account.getBalance());
		
	}
	
	@Test
	public void testCustomConstructor() {
		BankAccount account = new BankAccount("NATIONWIDE 9328", 100);
		assertEquals("The accountNo should be NATIONWIDE 9328", "NATIONWIDE 9328", account.getAccountNo());	
		assertEquals("The balance should be 100", 100 , account.getBalance());	
	}
	@Test
	
	public void testDepositWithdrawLowBalance() {
		BankAccount account = new BankAccount();
		account.deposit(10);
		account.withdraw(100);
		assertEquals("The balance should stay at 10", 10 , account.getBalance());
	}
	
	
}
