package parking;

import java.util.Scanner;

public class ParkingLot {
	
	//필드는 원래 값이 0이니까 초기화 굳이 안함 
	private String name; //주차장 이름
	private Car[] cars;
	private int idx; //인덱스
	private Scanner sc; //스캐너
	
	
	//생성자
	
	public ParkingLot(String name) {
		this.name = name;
		cars = new Car[10];
		sc = new Scanner(System.in);
	}
	
	//3.추가 메소드 - 주차장에 차가 들어왔다
	
	public void addCar() { //10. 외부에서 안받아오기 때문에 직접 객체를 채우는 방식 
	System.out.println("현재 등록된 차량 : " + idx + "대");// 4.현재 등록된 차량이 몇대인지 보고자 한다
	//5.예외 처리 
	if(idx == cars.length) {   //6.자동차 배열의 길이가 10이고 등록된 차량이 10이면 더이상 자동차가 들어오지 못함
	System.out.println("더 이상 차량 등록이 불가능합니다.");
	return; //7. 막아야 하니까
	}
	
	System.out.println("차량번호 >>> "); //8.입력 안내문 만들어 줄것 
	String carNo = sc.next(); // 공백 없이 차량 번호를 받을 수 있는 상태 
	System.out.println("모델 >>> "); 
	String model = sc.next();
	Car car = new Car(carNo, model); //자동차 한대 만들고 
	cars[idx++] = car; //배열에 저장하겠다 cars[0] = car; cars[1] = car; ... 이렇게 이어짐 
	System.out.println("차량 번호 " + carNo + "차량이 등록 되었습니다.");
	}
	
	Car car = new Car(sc.next(),sc.next());//첫번째 입력은 앞에다 넣고 두번째 입력은 뒤에다 넣고 
	
	
	//사용자가 입력한 정보가(추가 메소드 같이 위에 있는것들이) 
	//객체의 정보가 된다 즉 public car쪽으로 정보가 전달된다
	
	
	public void deleteCar() {
		
	}
	
	public void printAllCars() {
		
	}
	
	public void manage() {
		
	
		while(true) {
			
			System.out.print("1. 추가 2. 삭제 3. 전체 0. 종료 >>> ");
			
			//int choice = sc.next(); //스캐너 호출 다시 볼 것
			//1이 들어감
			String choice = sc.next(); //숫자로 하면 오류가 나기 
			//"1"이 들어감 
			//추가할시  호출할 메서드 addcar
			//위를 완성 안해도 불러도 오류 안남 왜냐면 둘다 반환타입이 없기 때문 
			//public void printAllCars(이부분 말하는 것임 
			switch (choice) {
				case "1" : 
					addCar(); //addCar호출 
					break;
				case "2" : 
					deleteCar(); //deleteCar 호출
				case "3" : 
					printAllCars(); //printAllCars 호출
				case "0" : 
					//break여기서 안되는 이유 - switch를 끝내는 것 
					//그래서 return 을 해야함 
					return; //메소드를 완전히 끝내자 manage 메소드 종료
				
				default : 
					System.out.println("존재하지 않는 메뉴 입니다.");
					
			}
			
		}
		
	}
	
	
	

}
