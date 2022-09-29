package org.merveozer.oopjhomework.chapter1.pdf11_sarmalama_ve_erisim_yontemi.question2;

public class AccountClient{

	private String clientName;
	private Account account;

	public AccountClient(String clientName, Account account) {
		this.clientName = clientName;
		this.account = account;
	}

	public String getClientName() {
		return clientName;
	}

	public Account getAccount() {
		return account;
	}
	
	public void withDraw(double money) {	
		this.account.setBalance(this.account.getBalance()- money);
		System.out.println(this.clientName +" After withdraw: " + this.account.getBalance());
		
	}
	
	public void deposit(double money) {
		
		this.account.setBalance(this.account.getBalance() + money);
		System.out.println(this.clientName + " After deposit: "  + this.account.getBalance());
	}
	
	
	public void transfer(AccountClient client, double money) {
		double transferCost = transferCost();
		
		this.withDraw(money+transferCost);
		client.deposit(money);
	}
	
	private double transferCost() {
		 double cost = 5.0;
		 return cost;
	}

}
