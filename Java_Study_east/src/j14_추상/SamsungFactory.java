package j14_추상;

public class SamsungFactory extends Factory	{//Factory가 추상클래스 이므로 1.삼성펙토리도 추상클래스로 만들던지
											// 2. 추상메소드 스타트를 오버라이드 해주기


	@Override
	public void start() {
		System.out.println("삼성 팩토리 가동");
	} 
	
	@Override
	public void stop() {
		System.out.println("삼성 공장을 멈춥니다.");
	}
	
}
