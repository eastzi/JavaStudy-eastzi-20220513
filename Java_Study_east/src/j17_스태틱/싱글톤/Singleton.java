package j17_스태틱.싱글톤;

public class Singleton {

	//Singleton 특징
	//생성이 한번만. class를 static 할 수 있음.(원래 안됨)
	//변수명은 instance로 고정
	// 1. 생성자는 private으로 지정하여 외부에서 생성할 수 없게 만들어야 함.
	// 2. 싱글톤으로 설계된 클래스의 유일한 인스턴스를 리턴해줄 수 있는 
	//	  getInstance() static 메소드가 존재해야함.
	// 3. 싱글톤 인스턴스를 저장할 변수명이 instance인 static 변수가 존재해야한다.
	
	
	
	//필수요소1
	private static Singleton instance = new Singleton(); //내부에서 인스턴스 생성
	private int count; //생성이 필요한 일반변수
	//private static int count; //생성이 필요없는 static변수
	
	//필수요소2 - private 생성자
	private Singleton() {} //생성자 private
	
	//필수요소3 - get, instance가 null인지 확인
	public static Singleton getInstance() { //instance는 내부에서만 호출하지만, get은 외부에서 호출가능
		if(instance == null) {
			instance = new Singleton();
		}
		//System.out.println(count); //생성이 필요한 일반변수는 쓸수없음. static변수만 사용가능
		return instance; //get을 통해 instance를 외부로 리턴할 수 잇음.
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void printInfo() {
		System.out.println("싱글톤 테스트 -> " + count);
	}
	
	
}
