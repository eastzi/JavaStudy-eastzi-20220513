package j14_추상;

public class FactoryMain2 {

	public static void main(String[] args) {
		LGFactory lgFactory = new LGFactory();
		lgFactory.start();
		lgFactory.stop();
		
		//Factory factory = new Factory(); => 추상 클래스 이기 때문에 생성할 수 없음.
		
		SamsungFactory samsungFactory = new SamsungFactory(); 
		//추상 클래스 대신 오버라이드를 해줌으로서 메소드 바디를 채워줌. 생성가능해짐.
		//팩토리 메소드에 메소드 이름만 있었음. 내용이 없었음.
		samsungFactory.start();
		samsungFactory.stop();
	}

}
