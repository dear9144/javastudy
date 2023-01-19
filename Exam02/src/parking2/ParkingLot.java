package parking2;

import java.util.Scanner;

public class ParkingLot {
	//필드는 원래 값이 0이니까 초기화 굳이 안함
	private String name;
	private Car[] cars;
	private int idx;
	private Scanner sc;
	
	//생성자
	
	public ParkingLot(String name) {
		this.name = name;
		cars = new Car[10];
		sc = new Scanner(System.in);
	}
	
	//3.추가 메소드 - 주차장에 차가 들어왔다
	
	public void addCar() {//10. 외부에서 안받아오기 때문에 직접 객체를 채우는 방식
		System.out.println("현재 등록된 차량 : " + idx + "대");// 4.현재 등록된 차량이 몇대인지 보고자 한다
		//5.예외 처리 
		if(idx == cars.length) { //6.자동차 배열의 길이가 10이고 등록된 차량이 10이면 더이상 자동차가 들어오지 못함
			System.out.println("더 이상 차량 등록이 불가능합니다.");
			return;
		}
		System.out.print("차량번호 >>> ");//8.입력 안내문 만들어 줄것 
		String carNo = sc.next();// 공백 없이 차량 번호를 받을 수 있는 상태
		System.out.print("모델 >>> ");
		String model = sc.next();
		Car car = new Car(carNo, model); //자동차 한대 만들고
		cars[idx++] = car;  // cars[0] = car;  cars[1] = car;  cars[2] = car; ,,,
		System.out.println("차량번호 " + carNo + " 차량이 등록되었습니다.");
	}
	
	public void deleteCar() {
		
	}
	
	public void printAllCars() {
		
	}
	
	public void manage() {
		
		while(true) {
			
			System.out.print("1.추가  2.삭제  3.전체  0.종료 >>> ");
			String choice = sc.next();
			
			switch(choice) {
			case "1":
				addCar();  // addCar 호출
				break;
			case "2":
				deleteCar();  // deleteCar 호출
				break;
			case "3":
				printAllCars();  // printAllCars 호출
				break;
			case "0":
				return;  // manage 메소드 종료
			default:
				System.out.println("존재하지 않는 메뉴입니다.");
			}
			
		}
		
	}
	
}