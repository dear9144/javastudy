package service;

import java.util.List;
import java.util.Scanner;

import dao.ContactDAO;
import dto.ContactDTO;


public class ContactServiceImpl2 implements ContactService {
	
	
	/**************1. field *****************/
	private Scanner sc;
	private ContactDAO dao;
	
	/************2. constructor ***************/
	public ContactServiceImpl2() {
		sc = new Scanner(System.in);// TODO Auto-generated constructor stub
			dao = ContactDAO.getInstance();
	
	
	}
	
	
	
	
	
	@Override
	public void addContact() {
		System.out.println("==== 연락처 추가하기 ====");
		
		System.out.print("신규 연락처 이름 >>>");
		String name = sc.next();
		System.out.print("신규 연락처 번호 >>>");
		String tel = sc.next();
		System.out.print("신규 연락처 이메일 >>>");
		String email = sc.next();
		System.out.print("신규 연락처 주소 >>>");
		String address = sc.next(); //주소도 공백 입력 불가 

		//이 네 정보를 하나로 만들어서 contact 다오에 넣기로 했으니 하나로 모을 것임
		ContactDTO contact = new ContactDTO();
		contact.setName(name);
		contact.setTel(tel);
		contact.setEmail(email);
		contact.setAddress(address);
		
		int addResult = dao.insertContact(contact);
		System.out.println(addResult + "개의 연락처가 등록되었습니다.");
		
		
		
		
	}
	
	
	@Override
	public void removeContact() {
		
		System.out.println("===== 연락처 삭제하기 =====");
		
		System.out.print("삭제할 연락처 No >>> ");
		String name = sc.next();
		
		List<ContactDTO> contactList = dao.slectContactsByName(name);
		System.out.println("<<< 조회된 연락처 목록>>>");
		for(ContactDTO contact : contactList) {
			System.out.println(contact);
			
		}
		
		System.out.println("삭제할 연락처 No >>>");
		int contact_no = sc.nextInt();
		int removeResult = dao.deleteContact(contact_no);
		
		System.out.println(removeResult + "개의 연락처가 삭제되었습니다.");
		
	}
	
	
	
	@Override
	public void modifyContact() {
		// TODO Auto-generated method stub
		System.out.println("==== 연락처 수정하기 ==== ");
		
		System.out.println("수정할 연락처 이름 >>>");
		String name = sc.next();
		
		List<ContactDTO> contactList = dao.slectContactsByName(name);
		System.out.println("<<< 조회된 연락처 목록>>>");
		for(ContactDTO contact : contactList) {
			System.out.println(contact);
		
		}
		
		System.out.println("수정할 연락처 No >>>");
		int contact_no = sc.nextInt();
		ContactDTO contact = dao.selectContactByNo(contact_no); //수정하기 전의 내용을 저장한 contact 객체 
		//contact 5개 필드값이 모두 차 있다
		
		System.out.println("수정할 항목 선택 (1.이름 2.전화 3.이름 4.주소) >>>");
		String choice = sc.next();
		switch (choice) {
		
		case "1":
			System.out.println("수정할 이름 입력 >>>");
			contact.setName(sc.next());
			break;
		case "2":
			System.out.println("수정할 전화 입력 >>>");
			contact.setTel(sc.next());
			break;
		case "3":
			System.out.println("수정할 이메일 입력 >>>");
			contact.setEmail(sc.next());
			break;
		case "4":
			System.out.println("수정할 주소 입력 >>>");
			contact.setAddress(sc.next());
			break;
		default:
			System.out.println("잘못된 입력입니다. 수정을 취소합니다.");
			return; //modifyContact 메소드 자동 종료 
			//수정전 내용을 다 가지고 있었지만 선택한 항목만 바꿔주겠다는 의미이다 
		}
		int modiftResult = dao.updateContact(contact); 
		
		System.out.println(modiftResult + "개의 연락처가 수정되었습니다.");
		
		
		
		
	}

}//add 서비스 끝 , 다오까지는 완성이 된 것 
