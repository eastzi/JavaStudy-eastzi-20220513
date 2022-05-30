package j14_추상;

public class FactoryMain {

	public static void main(String[] args) {
		
		//업캐스팅 - 배열을 만들어 묶을 수 있음
		Factory lg = new LGFactory();
		Factory samsung = new SamsungFactory();
		
		//Factory클래스를 상속받은 모든 클래스(인스턴스)를 담을 수 있는 공간 2개의 배열 생성 
		//자식요소를 생성할때 부모요소를 먼저 생성해야함.
		Factory[] factorys = new Factory[2]; //생성시 null인 공간을(밑에)
		
		factorys[0] = new SamsungFactory(); //삼성펙토리 생성해서 그 주소를 채움.
		factorys[1] = new LGFactory();
		
		//다운캐스팅은 자손클래스에서만 사용하는 변수나 메소드가 있을때.
		
		//foreach반복 - 처음부터 끝까지 반복(factorys 공간의 인덱스 속 각 내용을 0부터 끝까지 반복)
		for(Factory factory : factorys) {
			factory.start();
		}
		
		for(Factory factory : factorys) {
			factory.stop();
		}

	}

}
