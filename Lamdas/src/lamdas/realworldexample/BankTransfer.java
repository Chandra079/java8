package lamdas.realworldexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BankTransfer {

	public static void main(String[] args) {
		AccountFactory accountFactory = BankAccount::new;

		BankAccount studentAccount = accountFactory.getBankAccount(001, 50000, "Student A");
		BankAccount univreAccount = accountFactory.getBankAccount(002, 100000, "University");

		BiPredicate<Double, Double> p1 = (balance, amount) -> balance > amount;

		BiConsumer<String, Double> printer = (x, y) -> System.out.println(x + "  " + y);
		BiConsumer<BankAccount, BankAccount> printer2 = (stu, uni) -> {
			System.out.println(
					"Student Endng Balance : " + stu.getBalance() + "  Univesrity Balance : " + uni.getBalance());
		};

		ExecutorService es = Executors.newFixedThreadPool(10);

		Thread t = new Thread(() -> {
			System.out.println(Thread.currentThread().getName() + " says Executing transfer");
			double amount = 1000;
			if (p1.negate().test(studentAccount.getBalance(), amount)) {
				printer.accept(Thread.currentThread().getName() + " says Insufficent Balance ", amount);
			} else {

				printer.accept(Thread.currentThread().getName() + " ", amount);

				printer2.accept(studentAccount, univreAccount);

				try {
					while (!studentAccount.transfer(univreAccount, amount)) {
						TimeUnit.MILLISECONDS.sleep(100);
						continue;
					}
					printer2.accept(studentAccount, univreAccount);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		for (int i = 0; i < 20; i++) {
			es.submit(t);
		}
		
		BiConsumer<BankAccount, BankAccount> lastPrinterStamentthroughConsumer = (stu,uni)->{
			System.out.println(stu);
			System.out.println(uni);
		};
		lastPrinterStamentthroughConsumer.accept(studentAccount, univreAccount);
		es.shutdown();
		
		
	
	}
}
