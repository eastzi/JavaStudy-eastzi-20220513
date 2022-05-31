package j17_스태틱;

public class Main {

	public static void main(String[] args) {
		Test t = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		t.conut = 10;
		t2.conut = 20;
		t3.conut = 30;
		
		t.method();
		t2.method();
		t3.method();
		
	
//		일반 메소드와 스태틱 메소드 차이점
//		1. 결과값이 다르게 나온 이유 
//		-> 일반메소드는 3개로 복제되어 각각 존재함.
//		-> 스태틱메소드는 복제되지 않고 클래스안에 정의됨. 공유하는 것 설정한 값으로 공유됨.
//		   (클래스 속에 변수와 메소드가 같이 존재함, 따라서 생성이 무의미해짐. 생성없이 사용가능)
		
//		스태틱 특징
//		1. 생성하지 않고 공유된다.(sys out을 생각해보면 됨. sys 생성없이 out을 함.)
//		-> 자주쓰고 공통으로쓰고 어디서든 접근됨
		
		
//		
//		StaticTest st = new StaticTest();
//		StaticTest st2 = new StaticTest();
//		StaticTest st3 = new StaticTest();
//		
//		st.count = 10;
//		st2.count = 20;
//		st3.count = 30; //스태틱은 맨마지막에
//		st.staticmethod();
//		st2.staticmethod();
//		st3.staticmethod();
		
		StaticTest.count = 100; //생성없이 출력.
		
		StaticTest.staticmethod();
	}

}
