package practice04_Shape;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape circle = new Circle(1.5);
		
		System.out.println("원 면적" + circle.getArea());
		
		Shape rectangle = new Rectangle(1.5,2.5); 
		System.out.println("사각형 면적 :" + rectangle.getArea());
		
		Shape square = new Square(1.5);
		System.out.println("정사각형 면적 : " + square.getArea());
	}

}
