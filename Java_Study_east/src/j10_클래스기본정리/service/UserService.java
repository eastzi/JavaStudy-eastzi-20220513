package j10_클래스기본정리.service;

import java.util.Scanner;

import j10_클래스기본정리.repository.User;

public class UserService {
	//지역과 전역은 상대적인 개념. 내부에서 외부로 접근이 가능하지만 외부에서 내부로는 접근불가
	//<지역> => 지역1,2에 영향을 끼침. 
	//여기에 스캐너 생성자 입력하면, 분석할때 입력됨 => 메모리 차지함.
	private Scanner scanner; //일단 선언만 하고, UserService가 생성자가 호출될때 할당
	
	//<지역내 지역1>
	public UserService() {//스캐너 생성자가 생성될때 입력하라. 메모리를 계속 차지 x 
		scanner = new Scanner(System.in);
	}
	
	//<지역내 지역2> => 지역1과 개별적
	public User insertUser() {
		showInsertView(); //호출
		String usercode = null;
		String email = null;
		String name = null;
		String username = null;
		String password = null;

		System.out.print("사용자번호입력: ");
		usercode = scanner.nextLine();
		System.out.println("이메일");
		email = scanner.nextLine();
		System.out.println("이름");
		name = scanner.nextLine();
		System.out.println("사용자이름");
		username = scanner.nextLine();
		System.out.println("비밀번호");
		password = scanner.nextLine();
		
		//변수호출? => 생성자를 이용하는 방법, get & set 이용하는 방법 2가지
		User user = new User(usercode, email, name, username, password);//==> User클래스의 전체생성자 순서로입력
		return user; //주소를 (위치)를 리턴. 
	}
	
	/*
	 * private 정보은닉개념 : 접근 제어자를 사용해 객체에 대한 외부접근을 허용 또는 차단.
	 * 1. public : 어디서든 접근 허용
	 * 2. private : 동일 클래스 내부에 속한 객체들만 접근 허용 나머지 차단
	 * 3. default : 동일 패키지
	 * 4. protect : 동일패키지 + 상속관계 클래스에서만 허용
	 */
	private void showInsertView() {
		System.out.println("[사용자 추가]");
		System.out.println("아래의 양식에 맞게 정보를 입력하세요.");
	}
	
	
	
}
