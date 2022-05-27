package j13_다형성;

public class FactoryMain2 {

	public static void main(String[] args) {
		
		//자료형이 동일하니 배열로 묶음.(업캐스팅 덕분)
		Factory[] factorys = new Factory[100]; //1f = 부모 + 자식 => 총 2class
		
//		factorys[0] = new SmartPhoneLGFactory();
//		factorys[1] = new ComputerFactory();
		
		for(int i = 0; i < factorys.length; i++) {
			//삼항연산자, 조건연산자
			factorys[i] = i % 2 == 0 ? new SmartPhoneLGFactory() : new ComputerFactory();
		}
		
		for(Factory factory : factorys) {
			factory.start();
		}
		
		//다운캐스팅
//		int i = 10;
//		double d = i;
//		int ii = (int) d; //명시적 형변환
		
		System.out.println();
		
		//spf -> f -> spf 다운캐스팅
		//spf -> f -> cf 로는 다운캐스팅 불가. 부모가 다르니까. 각기 다른 틀.
		//처음부터 f인 클래스는 spf , cf 둘다 다운캐스팅 불가. 이것도 같은 이유. 애초에 spf, cf가 자식이 아님.
		for(Factory factory : factorys) {
			if(factory instanceof SmartPhoneLGFactory) {
				SmartPhoneLGFactory spf = (SmartPhoneLGFactory) factory;			
				spf.showSmartPhone();
				
			}else if(factory instanceof ComputerFactory) {
				ComputerFactory cf = (ComputerFactory) factory;
				cf.showComputer();
				
			}else {
				System.out.println("다운캐스팅 할 수 없습니다.");
			}
		}
		
		//instanceof => 다운캐스팅할때 업캐스팅 전 (원래, 기존의)클래스명을 찾는것
		//업캐스팅 = 항상 상속이 있어야 함.
		//다운캐스팅 = 업캐스팅 된 것을 다운캐스팅 할 수 있음
		
		//정리
		//1. 업캐스팅 정의
		//2. 다운캐스팅 정의
		//3. 업캐스팅과 다운캐스팅 차이
		//4. 업캐스팅 가능한 조건
		//5. 다운캐스팅 가능한 조건
		//6. 클래스 형변환과 오버라이딩 관계

	}

}
