package practice02_Person_Array;

public class MainClass {
	public static void ex01() {

		String[] nameList = {"정숙","상철","미희"};
		int[] ageList = {20,30,40};
	
		Person[] arr = new Person[3]; 
		//배열의 생성 , person의 생성이 아님 
		//사람이 만들어진 것이 아님 
		// 집은 만들어져 있지만 사람은 없음.
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Person(); //각각의 집에 사람을 넣음
			arr[i].setName(nameList[i]);
			arr[i].setAge(ageList[i]);
			System.out.println("이름 : " + arr[i].getName() + ", 나이 : " + arr[i].getAge()); 
			//이름 확인
 		}

	}
		
	
	public static void ex02() {
		
		String[] nameList = {"정숙","상철","미희"};
		int[] ageList = {20,30,40};
		
		Person[] arr = new Person[3];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = new Person(nameList[i],ageList[i]);
			System.out.println("이름: "+ nameList[i] + ",나이 : " + ageList[i]) ;
		}
		
		
	}
	
	public static void ex03() {
		Home home = new Home(3); //세명이 사는 집이다 
		String[] nameList = {"정숙","상철","미희"};
		int[] ageList = {20,30,40};
		
		for(int i = 0; i< home.getArr().length;i++) { 
			//home.arr.length - arr은 private (접근불가)라 사용x
			home.getArr()[i] = new Person(nameList[i], ageList[i]);
			System.out.println("이름 : " + home.getArr()[i].getName() + ", 나이" + home.getArr()[i].getAge());
		}
		
		
		
		
	}
	public static void main(String[] args) {
		ex03();

}
}
