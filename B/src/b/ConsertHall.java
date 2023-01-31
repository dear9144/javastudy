package b;

import javax.swing.JOptionPane;

public class ConsertHall {
	
	private SeatGroup[] seatGroups;//배열의 선언
	private String[] seatTypes = {"S","R","A"};
	private int[] seatCount = {30, 40, 50};
	
	//ConcertHall()
	public ConsertHall() { //디폴트 생성자
		seatGroups = new SeatGroup[seatCount.length]; //배열의 생성 
		for(int i = 0; i<seatGroups.length; i++) {
			seatGroups[i] = new SeatGroup(seatTypes[i],seatCount[i]);
		}
		
	}
	
//예약 확인하기 콘스터 홀 차원에서 예약하기
	public void info() {
		for(int i = 0; i<seatGroups.length; i++) {
		seatGroups[i].info();
		System.out.println("-------------------------");
		}
	}

	
	//예약하기 - 어떤 타입을 예약할래? s r a 셋중에 하나 구현하고 나머지는 예약하기 메소드 소환 
	public void reserve() {
		String seatType = JOptionPane.showInputDialog("좌석 타입을 입력하세요");
		for(int i = 0; i<seatTypes.length; i++) {
			if(seatType.equals(seatTypes[i])){
			seatGroups[i].reserve();
			return;//예약 종료하기
			}
		}
		JOptionPane.showMessageDialog(null, "입력한"+seatType + "타입은 존재하지 않습니다");
	}
	


	public static void main(String[] args) {
		ConsertHall hall = new ConsertHall();
		hall.reserve();
		hall.info();
	}
	}
	
