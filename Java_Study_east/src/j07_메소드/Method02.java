package j07_메소드;

//클래스 안에 정의된 함수를 메소드라 한다.
//자바는 클래스 외에 함수를 작성 x , 따라서 모든 함수는 = 메소드.
//자바에선 함수는 존재할수 없음. 메소드라 통일


public class Method02 {
	
	//매개변수가 없으면서 반환도 없는 메소드
	public static void test1() { //test1이 매개변수
		System.out.println("test1 메소드 실행");
	}
	
	//매개변수는 있고 반환이 없는 메소드(= void가 존재한다, 리턴할게없다.)
	public static void test2(int age, int year) {
		System.out.println("나이: " + age);
		System.out.println("출생년도: " + year);
	}
	
	//매개변수가 없고 반환이 있는 메소드
	public static String test3() { //리턴할게 있으니, void가 없고 맞는 자료형이 옴
		return "홍길동"; //반환.
	}
	
	public static int test4() {
		return 10000;
	}
	
	//매개변수도 있고 반환도 있는 메소드
	public static String test5(String name, int num) { //매개변수는 갯수제한 없음.
		return name + num; // 갯수는 1개 값으로 제한.
	}
	
	//리턴자료형이 void일때, 메소드를 강제로 탈출하는 방법
	public static void test6() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 6) {
				System.out.println("메소드 탈출");
				return; //void라 반환이 없지만, i가 6일때 메소드탈출이라는 강제반환이 일어남. 
			}
		}
		System.out.println("test6가 정상 종료");
		//return 과 break의 차이. 
		//return은 메소드가 끝나고. 
		//break는 for문 반복만 종료가 되어 마지막 'test6가 정상종료' 는 출력됨.
	}
	
	
	public static void main(String[] args) { //class보다 실행은 우선.
		System.out.println("메인함수 시작");
		test1(); //호출
		test2(55, 1955); //호출
//		System.out.println(test3()); //test3 자체가 값임. 출력이가능함.
		String name = test3();
		System.out.println(name);
		System.out.println(test5("홍길동", 1));
		test6();
		System.out.println("메인함수 끝");
		
		
		
		
	}

}
