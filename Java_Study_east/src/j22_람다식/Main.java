package j22_람다식;

public class Main {

	public static void main(String[] args) {
		
		Math<Integer, Integer> plusLambda = (v1, v2) -> v1 + v2;
		System.out.println(plusLambda.calc(10, 20));

		Math<Integer, Double> plusLambda2 = (v1, v2) -> {
			System.out.println("v1: " + v1);
			System.out.println("v2: " + v2);
			return v1 + v2;
		};
		
//		Math<Integer, Integer> plusLambda2 = (v1, v2) -> {
//			System.out.println("v1: " + v1);
//			System.out.println("v2: " + v2);
//			return v1 + v2;
//		};
		
		System.out.println(plusLambda2.calc(30, 40.5));

	}

}
