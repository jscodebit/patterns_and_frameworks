package my.accounts;

public class BankAccountThreadTester
{
  public static void main(String[] args) throws InterruptedException
  {
	 BankAccount account = new BankAccount();
	 final double AMOUNT = 100;
	 final int REPETITIONS = 1000;
	 
	 DepositRunnable dRunnable = new DepositRunnable(
		account, AMOUNT, REPETITIONS);
	 WithdrawRunnable wRunnable = new WithdrawRunnable(
		account, AMOUNT, REPETITIONS);
	 
	 Thread dThread = new Thread(dRunnable);
	 Thread wThread = new Thread(wRunnable);
	 dThread.start();
	 wThread.start();
	 
  }
  
}
