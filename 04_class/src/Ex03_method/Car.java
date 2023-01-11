package Ex03_method;

public class Car {

	
		//필드
		int oilPot;
		int carSpeed; //pushAccel 마다 속도는 10씩 증가 , 최대속도 100, pushBreake 마다 속도 10감소 
		
		
	
		
		void addOil(int oil) {
			if(oilPot + oil > 50) {
				oilPot = 50;
				return; // 메소드를 종료하시오.리턴(반환)값이 없으면 종료하시오. 
						// 반환타입이 void 타입일때만 사용 가능함 
			}
			oilPot += oil;
		}



		//달리기 메소드
			
		void pushAccel() {
			if(oilPot == 0) {
				return; //기름값이 0이면 멈춰라 
			}
			oilPot--; //엑셀 밞을때마다 1씩 줄어든다 기름이 
			
			if(carSpeed + 10 > 100) {
				carSpeed = 100;
				return;
			}
			
			carSpeed += 10;
			
			
		} 
		
		//멈추기 메소드
		
		void pushBreak() { //멈출때 기름이 들지 않는다 생각하기 
			if(carSpeed == 0) {
				return;
			}
			carSpeed -= 10; // 만약 자동차 속도가 0보다 작다면 속도를 0으로 한다
			if(carSpeed <0) {
				carSpeed = 0;
			}
			}
		}
