package j11_배열;

public class Foreach {

	public static void main(String[] args) {
		/*
		 * 문제1
		 * 1, 2, 3, 4, 5, 6, 7, 8 출력하시오.
		 */
		
		int[] numbers = {1,2,3,4,5,6,7,8};
		
		//i = index 
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + (numbers.length-1 != i ? ", " : ""));
		}
		System.out.println();
		
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//			if(numbers.length-1 != i) {
//				System.out.println(", ");
//			}
//		}
//		System.out.println();
		
		//foreach
		int i = 0;//for와 다르게 index를 선언해줘야함. 
		for(int num : numbers) {//배열에서 첨부터 끝까지 반복, index 없이 num을 대신., num와 numbers의 자료형이 동일해야함.
			System.out.print(num + (numbers.length-1 != i ? ", " : ""));
			i++;
		}
		System.out.println();
		
	}

}
