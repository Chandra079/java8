package lamdas.realworldexample;

@FunctionalInterface
public interface AccountFactory {
	public BankAccount getBankAccount(int id, double balance, String accountName);

}
