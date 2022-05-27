package j13_다형성;

public class FactoryMain {

	public static void main(String[] args) {
		//업캐스팅하면서 자료형이 동일하니 배열로 묶음.
		Factory[] factorys = new Factory[5];
		
		//업캐스팅 => 부모에 start 메소드가 있기 때문에 가능함. 없으면 오버라이드 해야함.
		//부모내 존재하는 변수, 메소드만 살아남음
		Factory smartPhoneLGFactory	= new SmartPhoneLGFactory();
		Factory computerFactory = new ComputerFactory();
		
		smartPhoneLGFactory.start();
		computerFactory.start();
		

	}

}
