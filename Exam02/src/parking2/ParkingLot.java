package parking2;

import java.util.Scanner;

public class ParkingLot {

	private String name;
	private Car[] cars;
	private int idx;
	private Scanner sc;
	
	public ParkingLot(String name) {
		this.name = name;
		cars = new Car[10];
		sc = new Scanner(System.in);
	}
	
	public void addCar() {
	
		System.out.println("현재 등록된 차량 : " + idx + "대");
		if(idx == cars.length) {
			System.out.println("더 이상 차량 등록이 불가능합니다.");
			return;
		}
		System.out.print("차량번호 >>> ");
		String carNo = sc.next();
		System.out.print("모델 >>> ");
		String model = sc.next();
		Car car = new Car(carNo, model);
		cars[idx++] = car;  // cars[0] = car;  cars[1] = car;  cars[2] = car; ,,,
		System.out.println("차량번호 " + carNo + " 차량이 등록되었습니다.");
	}
	
	public void deleteCar() {
		if(idx ==0) {
			System.out.println("등록된 차량이 없습니다.");
			return;
			System.out.print("제거할 차량번호 >>> ");
			String carNo = sc.next();
			for(int i = 0; i <idx ; i++) {
				Car car = cars[i]; //Car car = 주차장에 있는 cars[i]차량 한대씩 꺼낸다 
				if(carNo.equals(car.getCarNo())) //차량번호가 일치하는지 여부를 알 수 있음 
					//1. 마지막 차량을 이동하는 바업ㅂ,2. 하나씩 밀어서 옮기는 방법
					//현재 지워야 하는 차량의 위치 : i (인덱스) 
					//마지막 차량의 위치 : idx -1 .사진 참고
					cars[i] = cars[idx - 1];
					
			}
		}
		
	
	public void printAllCars() {
		
		//인덱스가 배열의 인덱스 실제 저장된 차량의 개수이기도 함 
		//if를 쓸것임
		if(idx ==0) {
		System.out.println("등록된 차량이 없습니다.");
		return;
		
		}
		System.out.println(name + "차량 목록"); //의미 없는 null들을 다 훑어야 하기 때문에 줄여서 할것임
		for(int i = 0; i < idx; i++) {
			Car car = cars[i]; //주차장 차량을 다 출력한것
			//Tostring으로 해서 syso 안에 넣을 수 있음 
			System.out.println(car);
		}
		/*for(int i = 0; i< cars.length; i++) {
			Car car = cars[i];
			if(car !=null) { //초기화값이 자동으로 null로 돼 있기 때문에 적용이 가능하다 
			System.out.println(car);
			}
		}
		for(Car car : cars) { //향상 포문도 가능하다 
			if(car != null) {
				System.out.println(car);
			}
		}
	*/}
	
		//조회하는 구문은 여기서 마무리 
	
	public void noCars() {
		
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
			
			//case "4":
				//noCars();
			case "0":
				return;  // manage 메소드 종료
			default:
				System.out.println("존재하지 않는 메뉴입니다.");
			}
			
		}
		
	}
	
}