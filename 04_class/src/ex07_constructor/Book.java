package ex07_constructor;

public class Book {
	
		// 필드
		
		String title;
		String author; //저자
		int price ;
		
		//생성자  이것만 만들어 볼것 
		/*    		
		 
		  			Book() {
					title = "좋은 세상";
					author = "미상";
		 			
				}
				
				Book(String.title2,String.author2) {
					title = title2;
					author = author2
						
		~ 내가 만들려던건 생성자가 없는것이고 예시 문제는 생성자가 다 있기 때문에
		생성자가 없는 것으로 만들면 x ~
		*/
		
		Book(String bookTitle) {
			title = bookTitle;
					author = "미상";
		}
		
		Book(String bookTitle, String bookAuthor) {
			title = bookTitle;
			author = bookAuthor;
		
		}

		Book(String bookTitle, String bookAuthor, int bookPrice) {
			title = bookTitle;
			author = bookAuthor;
			price = bookPrice;
		}
		//메소드
		void info() {
			System.out.println("제목 : " + title);
			System.out.println("저자 : " + author);
			System.out.println("가격 : " + price);
			
			
			
		}
}
