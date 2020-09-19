package my.accounts;

public class BankAccount
{
  private double balance;
  
  /**
	* Constructor
	* Sets balance to 0.
	*/
  public BankAccount()
  {
	 setBalance(0);
  }
  public double getBalance()
  {
	 return balance;
  }
  public void setBalance(double balance)
  {
	 this.balance = balance;
  }
  public synchronized void deposit(double amount)
  {
	 System.out.println("Depositing: " + amount);
	 double newBalance = getBalance() + amount;
	 System.out.println("New balance is " + newBalance);
	 balance = newBalance;
	 notifyAll();
  }
  public synchronized void withdraw(double amount)
  throws InterruptedException
  {
	 while(balance < amount)
	 {
		wait();
	 }
	 System.out.println("Withdrawing: " + amount);
	 double newBalance = getBalance() - amount;
	 System.out.println("New balance is " + newBalance);
	 balance = newBalance;
  }
}
