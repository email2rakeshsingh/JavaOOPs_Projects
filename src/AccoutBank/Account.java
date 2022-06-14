package AccoutBank;

public class Account {

	private String accountNumber;
	private double balance;
	private String emailId;
	private String phoneNumber;
	private String name;
	private double interest;

	

	public Account(String accountNumber, double balance, String emailId, String phoneNumber, String name,
			double interest) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.interest = interest;
	}

	public double deposit(double amount) {
		System.out.println("Deposit amount :" + amount);
		balance = balance + amount;
		return balance;
	}

	public double withdraw(double amount) {
		System.out.println("withdraw amount :" + amount);
		balance = balance - amount;
		return balance;
	}

	public double addInterest() {
		System.out.println("addInterst :" + addInterest());
		balance = balance + balance * interest;
		return balance;

	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getName() {
		return name;
	}

	public double getInterest() {
		return interest;
	}
}