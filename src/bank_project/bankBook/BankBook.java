package bank_project.bankBook;

abstract public class BankBook {
	private String accountNum; // ���¹�ȣ
	private String openingDate; // ���°�����
	private String owner; // ���¼�����
	private int balance; // �����ܾ�
	private double interest; // ������
	private int pw; // �����н�����
	private TransactionHistory[] transactionHistoryArray = new TransactionHistory[100];
	private static int historyIdx = 0;

	public void deposit(int money) {
		// �Ա� : ���� �ܾ� + money
		this.setBalance(this.getBalance() + money);
		// �ŷ� ������ �־��ֱ�
		transactionHistoryArray[historyIdx++] = createHistory("�Ա�", money);
	}

	public void withdraw(int money) {
		// ��� : ���� �ܾ� - money
		this.setBalance(this.getBalance() - money);
		// �ŷ� ������ �־��ֱ�
		transactionHistoryArray[historyIdx++] = createHistory("���", money);
	}
	
	public TransactionHistory createHistory(String typeOfTransaction, int money) {
		// �ŷ����� ����
		return new TransactionHistory(historyIdx, getOwner(), typeOfTransaction, money);
	}

	public void balanceSelect() {
		// �ܾ���ȸ
		System.out.println("���� " + getAccountNum() + "������ �ܾ��� " + getBalance() + "�� �Դϴ�.");

	}

	public void pwReset(int newPw) {
		// ��й�ȣ�缳��
		setPw(newPw);
	}

	public void transactionHistorySelect() {
		// �ŷ�������ȸ

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
