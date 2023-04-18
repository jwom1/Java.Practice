package exception.custom;

public class Account {
	
	private long balance;
	
	public long getBalance() {
		return this.balance;
	}	
	
	public void deposit(int money) {
		if(money < 0) {
			throw new DepositMinusMonetException("음수로 입금할 수 없습니다.");
		}
		this.balance += money; 
		//getter의 값을 바꿔주므로 setter의 역할이라고 볼 수 있다.
	}
	
	public void Withdraw(int money) throws BalanceInsufficientException{
		if(this.balance < money) {
			throw new BalanceInsufficientException("잔고부족");
		}
		this.balance -= money;
	}

}
