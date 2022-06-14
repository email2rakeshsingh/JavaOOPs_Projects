package AccoutBank;

public class TestAccount {

	public static void main(String[] args) {

		Account rakesh= new Account("1234", 100, "email2@gmail.com", "903144","Rakesh singh",100);
		System.out.println(rakesh.getAccountNumber());
		System.out.println(rakesh.getBalance());
		System.out.println(rakesh.deposit(500));
		System.out.println(rakesh.getEmailId());
		System.out.println(rakesh.getName());
		System.out.println(rakesh.addInterest());
		
	}

}
