package j12_상속;
//자식
public class Test1 extends Test{//Test => 상속을 받고자하는 클래스
	
	public Test1() {
		super(); //부모클래스를 생성해주는 것 <-> 자기자신 this , super 위치 중요. 항상 제일 위 고정.(기본적으로 생략)
		System.out.println("T1 생성자 호출");
		System.out.println("T1에서 확인: " + super.toString());//toString => 부모의 주소값 출력
	}
}
