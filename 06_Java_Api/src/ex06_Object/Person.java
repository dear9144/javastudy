package ex06_Object;

public class Person {
	private String name;
	
	
	//생성자 안 만들면 ex01 new Person에 오류 생김
	public Person() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(String name) {
		this.name = name;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public void eat() {
		System.out.println("먹는다.");
	}

	public void	sleep() {
		System.out.println("잔다.");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}
