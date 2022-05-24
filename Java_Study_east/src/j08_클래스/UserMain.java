package j08_클래스;

public class UserMain {

	public static void main(String[] args) {
	//자료형이 User인 이유 - 틀의 형태와 크기와 동일하기때문.
//		User user1 = new User(); //class틀을 메모리에 할당.(생성), 주소가 할당됨.
//		user1.name = "홍길동";
//		User user2 = new User();
//		user2.age = "00";
		
//		System.out.println(user1.name);
//		System.out.println(user1.age);
//		System.out.println(user2.name);
//		System.out.println(user2.age);
		
		User user1 = new User();
		System.out.println("첫번째: " + user1.name);
		System.out.println("메인메소드에서 호출: " + user1);
		//user1.name = "홍길동";
		user1.setName("aaaa");
		System.out.println("두번째: " + user1.name);
		
		//생성시점에 값을 넣는것.
		User user2 = new User("홍길동", "00", "01000000000", "부산");
		System.out.println(user2.name);
		System.out.println(user2.age);
		System.out.println(user2.phone);
		System.out.println(user2.address);
		
		
		
		
	}

}
