package j07_메소드;

//메소드 오버로딩(동일한 메소드 명을 사용/리턴과는 크게 관련이 없고/ 매개변수 호출형, 순서)

public class Method03 {
	
	
	public static void test1() {
		System.out.println("매개변수가 없는 test1 호출");
	}
	
	public static void test1(int num) { //메소드 명이 동일해도 매개변수 유무에 따라 동일한 명을 사용가능.
		System.out.println("int자료형 매개변수가 하나인 test1 호출");
	}
	
	public static void test1(int num, int num2) { //
		System.out.println("int자료형 매개변수가 둘인 test1 호출");
	}
	
	public static void test1(double a) {//변수명이 차이의 유무를 만드는게 아니라 자료형이 만듬. 
		System.out.println("double자료형 매개변수가 하나인 test1 호출");
	}
	
	public static void test1(int num, double dNum) { //순서가 중요. 설정한 순서로 호출. 
		System.out.println("int자료형 다음에 double자료형 매개변수가 둘인 test1 호출");
	}

	public static void test1(double dNum, int num) { //순서가 중요. 
		System.out.println("double자료형 다음에 int자료형 매개변수가 둘인 test1 호출");
	}

	public static void main(String[] args) {
		test1();	//매개변수 x
		test1(10);	//매개변수 o
		test1(10, 20);	
		test1(3.14);	
		test1(10, 3.14);
		test1(3.14, 10);
		
		
	}

}
