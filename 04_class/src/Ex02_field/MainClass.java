package Ex02_field;

public class MainClass {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		Student student = new Student();
		
		student.stuNo = "10101";
		student.name = "정숙";
		
		student.score = new Score();
		
		student.score.kor = 100;
		student.score.eng = 90;
		student.score.math = 80;
		
		School school = new School();
		
		school.name = "철산초";
		school.students = new Student[3]; //학생을 3명 저장할 수 있어요 의미 
		
		for(int i = 0; i <school.students.length; i++) {
			school.students[i] = new Student();
			school.students[i].name = "정숙"; //총 세명의 각각 한명씩의 학생을 의미 , 학생이 3명이기 때문에 3번의 new Student 생성이 필요함
			school.students[i].stuNo = "10101";
			//Score 객체 생성
			school.students[i].score = new Score();
			school.students[i].score.kor = 100;
			school.students[i].score.eng = 90;
			school.students[i].score.math = 80;
			
			
	
			System.out.println("학번" + " " + school.students[i].stuNo);
			System.out.println("이름" + " " + school.students[i].name);
			System.out.println("국어" + " " +school.students[i].score.kor);
			System.out.println("영어" + " " +school.students[i].score.eng);
			System.out.println("수학" + " " +school.students[i].score.math);
			
		}
		
		
		
		
		
	
		
	}

}
