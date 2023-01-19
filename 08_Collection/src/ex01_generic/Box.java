package ex01_generic;

public class Box<T> {
	
	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	private T item;
	

}
