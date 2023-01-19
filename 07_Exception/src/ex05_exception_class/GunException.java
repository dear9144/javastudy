package ex05_exception_class;

public class GunException extends Exception {//1. extends 입력

	//필드 값
	
	private String exceptionCode;
	
	
	public GunException(String message, String exceptionCode) {
		super(message); //Exception을 부모로 받고 상속 받을거야 
		this.exceptionCode = exceptionCode;
	}

	//2. getter setter 만들기 
	public String getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}
}
