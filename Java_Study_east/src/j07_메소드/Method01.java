package j07_메소드;

import java.util.Scanner;

public class Method01 {
						//메소드  //입력
	public static int clacFormula1(int a, int b, int c, int d, int e) {
		int result = a + (b * c) - (d * e); //클레스에서 공통으로 지정될 식?/중복 명령문 집합
		return result; //출력 / 클레스 속 formula1으로 리턴(반환).
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c, d, e; //안좋은 변수.
		int r1, r2, r3, r4;

		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		e = scanner.nextInt();
		
		r1 = clacFormula1(a, b, c, d, e); //입력으로 호출.
		//소스코드가 만줄있음.
		r2 = clacFormula1(10, 20, 5, 30, 2); 
		//천줄
		r3 = clacFormula1(a, b, c, d, e);
		//이천줄
		r4 = clacFormula1(a, b, c, d, e);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
	}

}
