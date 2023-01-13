package practice_BankAccount;

public class BankAccount {

	//필드
	private long balance; //balance : 계좌 잔액
	private String accNo; //번호 
	
	//생성자
	public BankAccount(String accNo,long balance) { // 계좌번호를 전화번호로 만든다는 전제 하에 만들 것 
		this.accNo = accNo;
		this.balance = balance;
		
	}
	//메소드(입금,출금,이체,조회)
	
	
	//입금(마이너스 입금 불가 처리)
	public void deposit(long money) {
		 if(money <= 0) {
			 return; //메소드 종료. 오직 반환이 void인 경우에만 사용 가능.
		 }
		balance += money;
		
	}
	
	//출금(반환타입이 있음, 마이너스 출금 + 잔액보다 큰 출금 불가 처리)
	public long withdrawal(long money) {
		if(money <0 || money > balance) {
			return 0; //반환 타입이 있을 시 반환 타입 값을 입력해야함 
		}
			balance -= money;
			return money;
	}
	
	
	//이체 (누구에게- 타인의 계좌 얼마를 보낼 것인가) 
	public void transfer(BankAccount other, long money) {
		// 내 통장에서 money 출금 : this.withdrawal(money) - 굳이 적자면 this 임 
		// 상대 통장에 실제로 내 통장에서 출금된 금액 입금 : other.deposit(money)
				other.deposit(withdrawal(money));
		//안되고 말고는 위에서 이미 함 
		
	}
	
	//조회
	public void inquiry() {
		System.out.println("계좌번호 : " + accNo);
		System.out.println("잔액 : " + balance + "원");
	}
	
}


