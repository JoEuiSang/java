package bank_project.bankBook;

public class TransactionHistory {
	private int transactionNumber;			// �ŷ���ȣ
	private String targetCustomer;			// �ŷ���
	private String typeOfTransaction;		// �ŷ�����
	private int price;						// �ݾ�

	// ������ ����
	public TransactionHistory(int transactionNumber,String targetCustomer, String typeOfTransaction, int price) {
		this.transactionNumber = transactionNumber;
		this.targetCustomer = targetCustomer;
		this.typeOfTransaction = typeOfTransaction;
		this.price = price;
	}

	public void printInfo() {
		System.out.println(getTransactionNumber() + "�� �ŷ�," + getTargetCustomer() + getTypeOfTransaction() + getPrice());
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
