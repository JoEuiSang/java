package bank_project.bankBook;

public class TransactionHistory {
	private int transactionNumber;			// 거래번호
	private String targetCustomer;			// 거래자
	private String typeOfTransaction;		// 거래종류
	private int price;						// 금액

	// 생성자 선언
	public TransactionHistory(int transactionNumber,String targetCustomer, String typeOfTransaction, int price) {
		this.transactionNumber = transactionNumber;
		this.targetCustomer = targetCustomer;
		this.typeOfTransaction = typeOfTransaction;
		this.price = price;
	}

	public void printInfo() {
		System.out.println(getTransactionNumber() + "번 거래," + getTargetCustomer() + getTypeOfTransaction() + getPrice());
	}

	public int getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(int transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public String getTargetCustomer() {
		return targetCustomer;
	}

	public void setTargetCustomer(String targetCustomer) {
		this.targetCustomer = targetCustomer;
	}

	public String getTypeOfTransaction() {
		return typeOfTransaction;
	}

	public void setTypeOfTransaction(String typeOfTransaction) {
		this.typeOfTransaction = typeOfTransaction;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
