package ex01_String;

public class Ex03_StringBuilder {
	
	public static void main(String[] args) {
	
	StringBuilder sb = new StringBuilder();
	
	//문자열 연결
	sb.append("app");
	sb.append("le");
	
	//StringBuilder를 String 으로 변환 
	String str = sb.toString();
	System.out.println(str);

}
}
