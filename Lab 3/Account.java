/* *********************
*    Alex Helfrich     *
*    Comp 1302-04      *
*    Account Class     *
*    Lab 3             *
********************* */

public class Account {
	private int acctNo;
	private String owner;
	private double balance;
	
	public Account() 
	{
		setAcctNo(0);
		setOwner("");
		setBalance(0.0);
	}
	
	public Account(int acctNoIn, String ownerIn, double balanceIn) 
	{
		setAcctNo(acctNoIn);
		setOwner(ownerIn);
		setBalance(balanceIn);
	}
	
	public int getAcctNo() {
		return acctNo;
	}
	
	public void setAcctNo(int acctNoIn) {
		acctNo = acctNoIn;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String ownerIn) {
		owner = ownerIn;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balanceIn) {
		balance = balanceIn;
	}
	
	public void deposit(double depositIn) {
		balance = balance + depositIn;
	}
	
	public void withdraw(double withdrawAmount)
	{
		try {
			if (withdrawAmount > getBalance()) {
				throw new InsufficientFundsException("ERROR: CANNOT WITHDRAW" +	
													 " MORE THAN BALANCE");
			} else {
				setBalance(getBalance() - withdrawAmount);
			}
		}
		catch (InsufficientFundsException e) {
			e.printStackTrace();
		}
	}
	
	public void display() 
	{
		String output = "" + getAcctNo() + "\n" + getOwner() + "\n" +
					    getBalance() + "\n";
		System.out.printf(output);
	}
	
	public static void main(String args[]) 
	{
		Account a1;
		a1 = new Account(2222, "Frank", 500.00);
		a1.deposit(100.00);
		a1.display();
		a1.withdraw(900.00);
		
	} //end main
} //end class