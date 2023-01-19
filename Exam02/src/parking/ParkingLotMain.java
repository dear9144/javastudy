package parking;

import java.util.Scanner;

public class ParkingLotMain {

	public static void main(String[] args) {
		
		//주차장을 만들어야 주차장  manage 메소드를 불러야 하는데 그러므로 주차장을 만들것
		
		/*
		public ParkingLot(String name) {
			this.name = name;
			cars = new Car[10];
			sc = new Scanner(System.in);
		}
		
		new ParkingLot("xxxxxxxx");
		*
		*/
		ParkingLot parkinglot = new ParkingLot("대박주차장");
		//이제 manage 부를거야 
		//왜냐면 메뉴입력문이 다 manage에 있기 때문 
		/*
		 우리가 하는 경우에 스타일이 
		 1.메인에서 매니지만 부를거다 
		 - private 처리 하면됨 (나머지 거)
		 컨트롤 스페이스 해서 보면 매니지 밖에 없음  
		 */
		parkinglot.manage();
		//숫자로 입력 받았을때의 위험함 
		
		
	}

}
