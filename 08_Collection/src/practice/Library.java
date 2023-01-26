package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.management.RuntimeErrorException;



public class Library {
	
	private List<Book> books;
	//인덱스가 필요 없어짐 
	private Scanner sc;
	
	public Library() {
		books = new ArrayList<Book>();
		sc = new Scanner(System.in);
		
	}
	//책 추가하기
	private void addBook() {
		System.out.println(" === 책 추가하기 === ");
		System.out.print("isbn >>> ");//입력 받는 부분
		String isbn = sc.next();
		
		System.out.print("title >>> ");//입력 받는 부분
		String title = sc.next();
		
		System.out.print("athour >>> ");//입력 받는 부분
		String athour = sc.next();
		
		Book book = new Book(isbn, title, athour);//책 한권 완성
		books.add(book); //도서관에 책 꽂기
		System.out.println(title + "책이 추가되었습니다.");
		//배열과 달리 arraylist는 꽉찬다는 개념이 없고 부족한다면 스스로 늘어나는
		//그래서 가득 찰 때의 어떠한 예외상황이 없음 (error적인)
	}
	private void deleteBook() {  // RuntimeException은 UnChecked-Exception이므로 throws RuntimeException을 생략할 수 있다.
		System.out.println("=== 책 삭제하기 ===");
		if(books.isEmpty()) {
			throw new RuntimeException("등록된 책이 없습니다.");
		}
		System.out.print("삭제할 isbn >>> ");
		String isbn = sc.next();
		if(isbn.isEmpty() == false) {
			/* 1. 객체 기반 삭제(Book 객체 간 동등 비교가 필요하기 때문에 equals 메소드를 오버라이드 해야 한다.) */ 
			for(Book book : books) {
				if(isbn.equals(book.getIsbn())) {
					books.remove(book);  // equals 메소드가 내부에서 사용된다.
					System.out.println(book + " 책이 삭제되었습니다.");
					return;
				}
			}
			/* 2. 인덱스 기반 삭제
			for(int i = 0; i < books.size(); i++) {
				Book book = books.get(i);
				if(isbn.equals(book.getIsbn())) {
					Book deletedBook = books.remove(i);  // remove(i)는 삭제된 요소(Book)를 반환한다.
					System.out.println(deletedBook + " 책이 삭제되었습니다.");
					return;
				}
			} */
		}
		throw new RuntimeException(isbn + " isbn을 가진 책이 없습니다.");
	}
	
			 
			/*  2.인덱스 기반의 삭제 
			for(int i = 0; i < books.size(); i++) { //책 한권한권을 불러들이기 위한
				Book book = books.get(i); //저장된 책 한권한권
				if(isbn.equals(book.getIsbn())) {
					Book deletedBook = books.remove(i); 
					//책을 제거할 것 ,remove(i)는 삭제된 요소를 반환한다. 이때 삭제 요소는 book 
					//그래서 book > Book deletedBook으로 변경할 것임 
					//뒤에도 remove(i) > books.remove(i);
					
					System.out.println(deletedBook + "책이 삭제되었습니다.");
					return;
				
				}
			}
		//비어있다면 
		throw new RuntimeException(isbn + "을 가진 책이 없습니다.");
		}catch(Exception e) { //그냥 익셉션, 런타입 익셉션으로 받아도 됨 
		System.out.println(e.getMessage());
			}	
		*/
			
	
	private void findBook() {
		System.out.println("=== 책 조회하기 === ");
		try {
			if(books.isEmpty()) {
				throw new RuntimeException("등록된 책이 없습니다.");
			}
			System.out.println("조회할 isbn >>>");
			String isbn = sc.next();
			if(!isbn.isEmpty()) { //느낌표 사용 자제하라고 문서에 적히면 쓰지 않는다 
				for(Book book : books) {//앞에는 배열 뒤에는 변수
				if(isbn.equals(book.getIsbn())) {
					System.out.println("조회 결과 :" + book);
					return;
				}
			}
		}
			throw new RuntimeException(isbn + "isbn을 가진 책이 없습니다.");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	private void printAllBooks() {
		System.out.println("=== 전체 조회하기 ===");
		try {
			if(books.isEmpty()) {
				throw new RuntimeException("등록된 책이 없습니다.");
			}
			for(Book book : books) {
				System.out.println(book);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void manage() {
		try {
			deleteBook();
			findBook();
			printAllBooks();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		while(true) {
			System.out.println("1.추가 2.삭제 3.조회 4.전체 0.종료 >>>");
			String choice = sc.next();
			
			switch(choice) {
			case "1" :
				addBook();
				break;
			case "2" :
				deleteBook();
				break;
			case "3" :
				findBook();
				break;
			case "4":
				printAllBooks();
				break;
			case "0" :
				System.out.println("도서관리 프로그램을 종료합니다.");
				return;
				default:
					System.out.println("잘못된 접근입니다. 다시 시도하세요.");
			}
		}
	}
}
