package banktest;

public class Account {
	
	public int id;
	public String password;
	public String ownerName;
	public int balance;


	public Account(int id, String password, String ownerName) {
		super();
		this.id = id;
		this.password = password;
		this.ownerName = ownerName;
	}

	public void deposit(int balance) {
		this.balance+=balance;
	}
	public int checkBalance(String password) {
		if(password.equals(this.password)) {
			return balance;
		}else {
			return 0;
		}
	}
	public int withdraw(int x,String password) {
		if(password.equals(this.password)) {
			this.balance=this.balance-x;
		}
		return balance;
	}


	public static void main(String[] args) {
		// 계좌 생성
        Account account = new Account(1, "password!@#", "Park");
        // 10만원 입금
        account.deposit(100000);
        // 잔액 확인
        System.out.println(account.checkBalance("password!@#"));
        // 2만원 출금
        account.withdraw(20000, "password!@#");
        // 잔액 확인
        System.out.println(account.checkBalance("password!@#"));

	}

}
