package b;

import javax.swing.JOptionPane;

public class SeatGroup {
	
	private String seatType; //S -> R -> A
	private Seat[] seats; //시트들 ,배열의 선언만 한 상황 (몇개 좌석이 들어오는지 아직 모름)
	
	//new SeatGroup("S",30) : "S"석이 10개 있다고 해석하려고 생성자를 만들어 줄 것 
	public SeatGroup(String seatType,int length) { //시트 타입과 시트의 개수를 받기 위해 length를 씀
		this.seatType = seatType; //좌석 타입 설정
		seats = new Seat[length]; //length에 예시와 같이 10이 들어가게 하기 위해 배열의 생성을 함 
		for(int i = 0; i<length; i++) {
			seats[i] = new Seat(); //점유되지 않은 빈 좌석을 배열의 길이만큼 만들기
			//여기까지 하면 다 false가 나옴 점유되지 않으니까 
			//더이상 new seat를 할 이유는 없는 것 
		}
		
	}
	
	//예매상황
	public void info() {
		System.out.println("[" + seatType + "] 타입");
		for(int i = 0; i<seats.length; i++) {
			if(seats[i].isOccupied() == false) {
				System.out.print(((i< 9) ? "0" : "") +(i+1)); //비어있는 자리다 
				
			}else {
				System.out.print(seats[i].getName());
			}
			System.out.print(("      "));
			//인덱스 일의자리가 9이면 줄을 바꾸고 아니면 공백을 준다
			if(i % 10 == 9) {
				
				System.out.println();//줄바꿈
			}else {
				System.out.print(" ");//띄어쓰기
			}
			
		}
	}
	
	//예약하기 
	public boolean reserve() {
		info(); //현재 s석이 어떻다 보여주는 것 ,예매 상황 보여주기 
		String strNo = JOptionPane.showInputDialog("예약할 시트 번호를 입력하세요 "); //스캐너 대신 쓰는 것 
		int seatNo = Integer.parseInt(strNo);//다이아로그를 이용한 입력은 무조건 스트링 사용해야 함 
		//그래서 인테져로 변환 하는 것 
		if(seatNo < 0 || seatNo > seats.length) {
			JOptionPane.showMessageDialog(null,seatNo + "번 좌석은 없는 좌석입니다.");
			return false; //예약하기 실패
	}if(seats[seatNo - 1].isOccupied()== true) { //점유된 자리라면
		System.out.println(seatNo + "번 좌석은 이미 예약된 좌석입니다.");
		return false; //예약하기 실패 
	}
	
	String name = JOptionPane.showInputDialog("예약자 성함을 입력하세요.");
	seats[seatNo - 1].reserve(name);
	System.out.println(seatNo + "번 좌석 예약이 성공했습니다.");
	return true; //예약하기 성공 
	
	}
	//예약하기 취소 
	public boolean cancel() {
		info();
		String name = JOptionPane.showInputDialog("취소자 성함을 입력하세요");
		for(int i = 0; i<seats.length; i++) {
			if(seats[i].isOccupied() && seats[i].isMatched(name)) { //점유되어있습니까? 를 먼저 확인 같은 이름은 없다는 가정하에 푼다 
			seats[i].setName(null);
			JOptionPane.showMessageDialog(null, "예약자" + name  + "의 예약이 취소되었습니다");
			return true;
			}
		}
		JOptionPane.showMessageDialog(null, "입력된 이름" + name + "은 존재하지 않습니다.");
		return false;
	}
	
	}


