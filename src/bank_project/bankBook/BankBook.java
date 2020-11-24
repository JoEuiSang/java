package bank_project.bankBook;

abstract public class BankBook {
	private String accountNum; // 계좌번호
	private String openingDate; // 계좌개설일
	private String owner; // 계좌소유주
	private int balance; // 계좌잔액
	private double interest; // 이자율
	private int pw; // 통장패스워드
	private TransactionHistory[] transactionHistoryArray = new TransactionHistory[100];
	private static int historyIdx = 0;

	public void deposit(int money) {
		// 입금 : 현재 잔액 + money
		this.setBalance(this.getBalance() + money);
		// 거래 내역에 넣어주기
		transactionHistoryArray[historyIdx++] = createHistory("입금", money);
	}

	public void withdraw(int money) {
		// 출금 : 현재 잔액 - money
		this.setBalance(this.getBalance() - money);
		// 거래 내역에 넣어주기
		transactionHistoryArray[historyIdx++] = createHistory("출금", money);
	}
	
	public TransactionHistory createHistory(String typeOfTransaction, int money) {
		// 거래내역 생성
		return new TransactionHistory(historyIdx, getOwner(), typeOfTransaction, money);
	}

	public void balanceSelect() {
		// 잔액조회
		System.out.println("현재 " + getAccountNum() + "통장의 잔액은 " + getBalance() + "원 입니다.");

	}

	public void pwReset(int newPw) {
		// 비밀번호재설정
		setPw(newPw);
	}

	public void transactionHistorySelect() {
		// 거래내역조회

		for (TransactionHistory obj : transactionHistoryArray) {
			obj.printInfo();
		}
	}

	// start getter, setter
	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(String openingDate) {
		this.openingDate = openingDate;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public int getPw() {
		return pw;
	}

	public void setPw(int pw) {
		this.pw = pw;
	}
	// end getter, setter
}
