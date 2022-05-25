package j10_클래스기본정리.controller;

import j10_클래스기본정리.repository.User;
import j10_클래스기본정리.service.UserService;

public class UserManagementController {
	private UserService userService; // 지역에서 공통으로 쓸거기 때문에 전역으로 빼서 영향을 끼치게 함.
	//여기에 생성자를 적으면 생성도 안되는데 메모리를 차지하게 됨.
	//클래스를 정의할 때 미리 주입하면 메모리 낭비.
	public UserManagementController() {//(생성자안에서 밑에)클래스를 사용할때(생성될 때),
		userService = new UserService(); //인스턴스 생성(할당)
	}
	
	public void createUser() {
		User user = userService.insertUser(); // 매소드 호출(=함수 실행) 뒤 반환 값(user주소) 저장.
		
		System.out.println("[새로 추가된 사용자]");
		System.out.println(user.toString());//저장한 user의 toString 메소드를 호출한 뒤 "메소드의 반환값"을 출력
	}
	
	public void updateUser() {
		
	}
	

	
	
	
	
}
