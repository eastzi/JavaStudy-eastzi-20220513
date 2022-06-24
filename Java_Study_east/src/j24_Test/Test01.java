package j24_Test;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[5];
		int count = 0; 
		boolean bl;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt() % 42;
		}
		for(int j = 0; j < num.length; j++) {
			bl = false;
			for(int k = j+1; k < num.length; k++) {
				if(num[j] == num[k]) {
					bl = true;
					break;
				}
			}
			if(bl == false) {
				count ++;
			}
		}
		System.out.println(count);
		System.out.println(Arrays.toString(num));
	}

}
