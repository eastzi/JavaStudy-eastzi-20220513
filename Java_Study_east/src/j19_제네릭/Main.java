package j19_제네릭;

import j10_클래스기본정리.repository.User;

public class Main {

	public static void main(String[] args) {

		Controller controller = new Controller();
		System.out.println(controller.createUser());
		System.out.println(controller.updateUser());
		//System.out.println(((CMRespDto<User>) controller.getUser()).getData()); 
		//getUser -> object로 업캐스팅 됨. cmr~메소드를 사용하기 위해 다운캐스팅
		
		System.out.println(controller.getUser().getData());
		//controller에서 자료형을 cmr로 바꾸어서 다운캐스팅 필요없어짐. 
		
		controller.getAnimal().getData().move();
		
	}

}
