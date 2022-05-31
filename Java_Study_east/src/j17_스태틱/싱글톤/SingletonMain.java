package j17_스태틱.싱글톤;

public class SingletonMain {

	public static void main(String[] args) {
		/*
		 * 싱글톤 특징
		 * 1. 유일한 객체(인스턴스)를 생성해야한다.(=인스턴스 1개만 생성)
		 * 2. 외부에서 호출할 수 없도록 만들어야함. 
		 * -> 생성자를 private으로. 그리고 생성을 동일 클래스 내부에서 생성하고 
		 * 	  static 변수에 들어가 있어야 함.
		 * 
		 */
		
		//Singleton.getInstance(); //생성된 인스턴스

//		인스턴스를 외부에서 생성할 수 없음. private 이므로
//		Singleton singleton = new Singleton();
//		singleton.setCount(10);
//		singleton.printInfo();
		
		//이렇게는 가능
		Singleton singleton = Singleton.getInstance();
		singleton.setCount(10);
		singleton.printInfo();
		
		Singleton singleton2 = Singleton.getInstance();
		singleton.setCount(20);
		singleton.printInfo();


	}

}
