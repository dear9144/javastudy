package practice02_Person_Array;

public class Home {
	
	//필드
	private Person[] arr; //new person 안하는 이유는 집집마다 사람이 사는 수는 다르기 때문
	private int count; //사람이 몇명 있다
	
	// 생성자 
	// new Home(3), new Home(5) < 이것을 만들어 봐라 
	
	public Home(int count) {
		arr = new Person[count];
		this.count = count;
	}

	public Person[] getArr() {
		return arr;
	}

	public void setArr(Person[] arr) {
		this.arr = arr;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
