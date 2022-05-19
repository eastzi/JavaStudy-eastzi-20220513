package j06_반복;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		/*
		 * num = 0;
		 * 반복 횟수를 입력하세요: 5
		 * 
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int num = 0; //반복횟수 (변수 하나당 하나의 역할)
		System.out.print("반복 횟수를 입력하세요: ");
		
		num = scanner.nextInt();
		
		int i = 0; //조건 확인 대상 
		while(i < num) {
			System.out.println(i+1);
			i++;
		}
		
		i = 0;
		
		while(i < num) {
			System.out.println(num-i);
			i++;  //반복할 땐 i-- 아님. i가 계속 증가해야 num을 받을수 잇음.
		}
	}

}
