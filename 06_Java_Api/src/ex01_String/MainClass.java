package ex01_String;

public class MainClass {
	
	public static void literal() {
		
		String str1 = "hello";
		String str2 = "hello";
				
		System.out.println(str1 == str2);
		
	}
	
	public static void StringObject() {
		
		//문자열 객체 
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1 == str2);
		
	}
	public static void equals() {
		
		String str1 = "HELLO";
		String str2 = new String("HELLO");
	
		if(str1.equals(str2)) {
			
			System.out.println("str1과 str2는 같은 문자열이다.");
		} else { 
			System.out.println("str1과 str2는 다른 문자열이다");
		
		}
		
		//대소문자 무시함
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("str1과 str2는 같은 문자열이다.");
		} else { 
			System.out.println("str1과 str2는 다른 문자열이다");
		
		}
	
	
	}
	
	public static void length() {
		String str = "Hello\nWorld";
		int length = str.length();
		System.out.println("글자수 : " + length);
	}
	
	public static void charAt() {
		String name = "신의정";
		
		for(int i = 0;i <name.length(); i ++ ) {
			System.out.println(name.charAt(i));
		}
		
		//for(int i = 0;i<arr.length(); i++) {
			//System.out.println(arr.charAt(i));
			
		}
		
	//}
	
	public static void substring() {
		String name = "신의정";
		String famillyName = name.substring(0,1);
		String givenName = name.substring(1);
		
		System.out.println(famillyName);
		System.out.println(givenName);
		
	}
	public static void indexOf() {
		
		String slogan = "걱정한다고 걱정이 없어지면 걱정이 없겠네 ";
		int idx1 = slogan.indexOf("걱정");
		int idx2 = slogan.indexOf("걱정", idx1 + 1);
		int idx3 = slogan.indexOf("걱정",idx2 +1);
		
		int idx4 = slogan.indexOf("신의정");
		
		System.out.println(idx1);
		System.out.println(idx2);
		System.out.println(idx3);
		System.out.println(idx4);
		
	}
	public static void lastIndexOf() {
		String slogan = "걱정한다고 걱정이 없어지면 걱정이 없겠네 ";
		int idx1 = slogan.lastIndexOf("걱정");
		int idx2 = slogan.lastIndexOf("신의정");
		System.out.println(idx1);
		System.out.println(idx2);
		 
		
	}
	
	
	public static void startsWith() {
		String name = "신의정";
		if(name.startsWith("신")) {
			System.out.println("신씨다.");
		}else {
			System.out.println("신씨가 아니다.");
		}
		}
		
	
	public static void contains() {
		//matches와 비교하는것 
		String email = "dear9144@naver.com";
		if(email.contains("@")) {
			System.out.println("이메일이 맞다."); 
			}else {
				System.out.println("이메일이 아니다.");
					
				}
			}

	public static void toCase() {
		
		//toUpperCase
		//대문자로 바꾸기 
		
		//toLowerCase
		//소문자로 바꾸기 
		
		String str = "I am a boy";
		System.out.println(str.toUpperCase);
		System.out.println(str.toLowerCase);
		
		
		
	}
	
	public static void trim() {
		String str = "   hahaha   hohoho    ";
		System.out.println("("+ str +")");
		System.out.println("("+ str.trim() +")");
		
		
	}
	
	public static void replace () {
		String str = "best of the best";
		String result = str.replace("best","worst");
		System.out.println(result);
		
		String ip = "61.78.123.456";
		String replacedIp = ip.replaceAll(".","_"); //61_78_123_456 마침표가 아니라 언더바였으면 좋겠다 
		System.out.println(replacedIp);
		
		
	}
	
	public static void isEmpty() {
		
		String str = "";
		if(str.trim().isEmpty()) {
			System.out.println("빈 문자열이다.");
		}else {
				System.out.println("빈 문자열이 아니다.");
		
		//isBlank
		}
	}
	public static void format() {
		//문자열을 지정한 형식으로 반환 
		//숫자 형식 지정하기 
		int number = 10000;
		
		System.out.println(String.format("%o", number));//%o 8진수로 표현하시오
		System.out.println(String.format("%d", number));//%d 10진수로 표현하시오
		System.out.println(String.format("%x", number));//%x 16진수로 표현하시오
		//0~9,a,b,c,d,e,f)
		System.out.println(String.format("%X", number));//%x 16진수로 표현하시오
		//0!9,A,B,C,D,E,F)
		
		//문자열 형식 지정하기
		String str = "hi";
		System.out.println(String.format("%s", str));//%s 문자열로 표시하시오
		
		
		//출력 폭 지정하기 
		System.out.println(String.format("%10d", number));
		System.out.println(String.format("%-10d", number));
		System.out.println(String.format("%5s", str));
		System.out.println(String.format("%-5s", str));
		
	}
	

	
	public static void ex01() {
		
		String url = "https://comic.naver.com/webtoon/list?titleId=739115";
		//String requestURI = name.substring(0,1);
		
		//1.indexOf를 이용해 물음표 찾기 
		String requestURI = url.substring(0,url.indexOf("?"));
		
		System.out.println(requestURI);
				
	
	//String params = url.substring(url.ind)
	}
	
	
	public static void ex02() {
		String fullName = "a.p.p.l.e.tar.gz";
		String fileName = "";
		String extName = "";
		
		
		if(fullName.endsWith("tar.gz")) {
			fileName = fullName.substring(0,fullName.lastIndexOf("tar.gz"));
			extName = "tar.gz"; 
		}else {
			fileName = fullName.substring(0,fullName.lastIndexOf("."));
			extName = fullName.substring(fullName.lastIndexOf("."));
		}
		
		System.out.println(fileName);
		System.out.println(extName);
		
	}
	public static void main(String[] args) {
		format();
		
	}

}
