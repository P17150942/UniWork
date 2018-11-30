package lib;

public class BankAccount {
	//Fields
	private String accountNo;
	private int balance;
	
	//Constructor
	/**
	 * The Default constructor to create a bank account
	 * The Default account number as an empty String 
	 * The Default balance as 0
	 */
	public BankAccount() {
		this.accountNo = "";
		this.balance = 0;
	}
	
	/** Creates an account with an initial accountNo
	 * and an initial balance.
	 * @param accountNo = The account number
	 * @param balance = The initial balance of the account
	 */
	public BankAccount(String accountNo, int balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	//Methods
	/** This ads the value amount to the current balance
	 * 
	 * @param amount = The pence to be added to the current balance
	 */
	public void deposit(int amount) {
		this.balance += amount;
	}
	/**
	 * If there is enough money inside this account it will
	 * subtrack the money from the account
	 * 
	 * @param amount is the amount to be removed from the account balance
	 */
	public void withdraw(int amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
		}
	}
	/** Returns the account number
	 * 
	 * @return The account Number of this account.
	 */
	public String getAccountNo() {
		return this.accountNo;
	}
	
	/** Returns the current balance
	 * 
	 * @return The balance of this account.
	 */
	public int getBalance() {
		return balance;
	}
	
	 
	public String toString() {
		return "[accountNo = " + accountNo +
				" balance = " + balance +
				"]";
	}
	

	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() == this.getClass()) {
			return false;
		}
		
		BankAccount object = (BankAccount) obj;
		
		return this.accountNo == object.accountNo && this.balance == object.balance;
		
	}
	

}
