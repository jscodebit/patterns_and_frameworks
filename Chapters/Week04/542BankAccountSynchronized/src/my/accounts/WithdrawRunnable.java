package my.accounts;

public class WithdrawRunnable implements Runnable
{
  private static final int DELAY = 10;
  private BankAccount account;
  private double amount;
  private int count;
  
  /** Creates a new instance of WithdrawRunnable */
  public WithdrawRunnable(BankAccount account, double amount, int count)
  {
	 this.account = account;
	 this.amount = amount;
	 this.count = count;
  }
  public void run()
  {
	 for(int i = 0; i < count; i++)
	 {
		try
		{
		  account.withdraw(amount);
		  Thread.sleep(DELAY);
		}
		catch (InterruptedException ex)
		{
		  System.out.println("Interrupt occurred\n" + ex);
		}
	 }
  }
}
