package ex04_OutPutStream;

import java.io.Serializable;

public class Person implements Serializable {
	
	
/**
	 * 
	 */
	private static final long serialVersionUID = 4479216247332307844L;
/*
 ObjectOutPutStream/ObjectInputStream 을 통해서
 객체 입출력을 수행하려면 " 반드시 " 직렬화 처리를 해야 한다
 노션 참고 
 */
	
	private String name;
	private int age;
	private double height;
	private boolean isAlive;
	
	
	//bean 가서 setter, constructor 둘 중 하나 사용 
	//디폴트생성자 + setter  
	public Person() {
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public boolean isAlive() {
		return isAlive;
	}


	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}


	

	public Person(String name, int age, double height, boolean isAlive) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.isAlive = isAlive;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", isAlive=" + isAlive + "]";
	}

//객체 생성하게끔 준비 과정
}
