package ex01_String;

public class Ex02_StringBuffer {
	
	
	public static void main(String[] args) {
		
		//StringBuffer
		
		
		//StringBuffer 객체 생성
		StringBuffer stringBuffer = new StringBuffer();
		
		//문자열 추가(String의 + 연산자를 대신)
		stringBuffer.append("na");
		stringBuffer.append("na");
		stringBuffer.append("na");
		//StringBuffer에 저장된 문자열을 String 으로 변환 
		String str = stringBuffer.toString();
		System.out.println(str);
		
		

	}

}
