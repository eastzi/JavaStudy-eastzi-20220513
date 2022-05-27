package j12_상속.동물;
/*
 * 오버로드 : 동일 클래스 내에서 발생
 * 오버라이드 : 각 클래스의 경계를 넘어서 발생
 */
public class Tiger extends Animal{
	
	@Override
	public void move() {
		//super.move(); //상위 클래스의 move()를 호출 
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	//this.move()
	//super.move() => 둘다 같이 존재 못함.
	//super의 내용은 없어짐.
	//=> 일단 this는 자기자신, super는 부모 라는 개념만 인지하고 있기.
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
