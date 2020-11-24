package bank_project.bankBook;

public class SavingsBankBook extends BankBook {
	private String expriationDate; // 만기일
	private String expriationNum; // 만기회차
	private String paymentNum; // 납입회차


	@Override
	public void transactionHistorySelect() {
		// 거래내역조회

	}

	public void expirationClose() {
		// 만기해지
	}

	public void middleTermination() {
		// 중도해지
	}

}
