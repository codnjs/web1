package emirim.hs.kr;

public class Account {
	String accountNo; //°èÁÂ¹øÈ£
	String ownerName; //¿¹±ÝÁÖ
	int balance; //ÀÜ¾×
	public Account() {
		
	}
	public Account(String accountNo) {
		this.accountNo = accountNo;
	}
	public Account(String accountNo, String ownerName) {
		this(accountNo);
		this.ownerName = ownerName;
	}
	public Account(String accountNo, String ownerName, int balance) {
		this(accountNo, ownerName);
		this.balance = balance;
	}
	public void deposit(int amount)
	{
		this.balance += amount; 
	}
	public int withdraw(int amount) {
		if(amount > balance) return 0;
		balance -= amount;
		return amount;
	}
}
