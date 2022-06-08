package j22_람다식;

public class Main {

	public static void main(String[] args) {
		//인터페이스라서 생성불가 => 구현을 해야함.
		Math2 m2_1 = new Math2Impl();
		
		//클레스를 따로 생성해서 implements하지 않고 바로 구현 => 익명클래스
		//클래스의 무분별한 생성을 방지
		Math2 m2_2 = new Math2() {
			
			@Override
			public double calc(double value1, double value2) {
				value1 += 2;
				value2 -= 1;
				return value1 + value2;
			}
		};
		
		//람다식 => 익명클래스와 동일, 매소드 내부를 구현한것과 동일, 매소드가 오직 1개.
		//결과가 return 밖에 없을때 중괄호({})를 생략
		Math2 m2_3 = (v1, v2) -> v1 / v2; 
		
		//return외 존재시
		Math2 m2_4 = (v1, v2) -> {
			v1 += 2;
			v2 -= 1;
			return v1 % v2;
		};
		
		double t = m2_3.calc(10, 3);
		System.out.println(t);
		
	}

}
