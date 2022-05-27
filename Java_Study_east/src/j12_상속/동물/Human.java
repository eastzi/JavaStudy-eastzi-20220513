package j12_상속.동물;

/*
 * @Override(재정의)
 * 부모가 가진 메소드를 자식에서 자식클래스에 맞게 내용을 재정의한다. 
 * (상속 또는 구현 관계에 있는 클래스들 중 자식클래스가 부모클래스 내부의 메소드를 재정의하는 것)
 * 상위 클래스 또는 인터페이스가 가지고 있는 메소드를 재정의 하겠다는 의미.
 */
public class Human extends Animal {
	
	//상속에서는 오버라이드를 사용가능.
	public void move() { //부모클래스에 이미 move 메소드가 설정되어 있지만 각 클래스마다 동일 메소드명으로 다른 출력을 원할때
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}

}
