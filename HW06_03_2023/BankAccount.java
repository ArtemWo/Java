package HW_Java.HW06_03_2023;
/*todo   Переписать класс BankAccount (см. код в репозитории) и его методы
		 public synchronized void deposit(int amount)
		  public synchronized void withdraw(int amount)
		  с применением AtomicInteger и принципа compare and swap
		  так, чтобы несколько потоков могли одновременно безопасно начислять и
		  снимать деньги со счета, не используя при этом синхронизацию.
public class BankAccount {
	private int sum;
	public synchronized void deposit(int amount) {
		sum = sum + amount;	}
	public synchronized void withdraw(int amount) {
		sum = sum - amount;	}
	public synchronized int getSum(int amount) {
		return sum;	}
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.deposit(100);
		bankAccount.withdraw(100);
		synchronized (bankAccount) {
	    operations with bankAccount
		}*/

import java.util.concurrent.atomic.AtomicInteger;

public class BankAccount{

	private AtomicInteger sum = new AtomicInteger();

	public void deposit(int amount) {
		int currentSum;
		int newSum;
		do {
			currentSum = sum.get();
			newSum = currentSum + amount;
		} while(!sum.compareAndSet(currentSum, newSum));  // сравниваем счет
	}

	public void withdraw(int amount) {     //Метод withdraw работает аналогично методу deposit,
		int currentSum;                  // только, что он вычитает amount из текущего значения счета.
		int newSum;
		do {
			currentSum = sum.get();
			newSum = currentSum - amount;
		} while(!sum.compareAndSet(currentSum, newSum));
	}

	public int getSum() {
		return sum.get();               //получаем сумму, чтобы в последствии ее спавнивать илиотнимать
	}

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.deposit(9_000_000);
		bankAccount.withdraw(5000);

		System.out.println("Current sum: " + bankAccount.getSum()+" €");
	}
}

