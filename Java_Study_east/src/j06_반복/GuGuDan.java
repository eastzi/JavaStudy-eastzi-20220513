package j06_반복;

public class GuGuDan {

	public static void main(String[] args) {
//		for(int i = 0; i < 10; i++) {
		//sysout("i : " + i)
//			for(int j = 0; j < 10; j++) {
		//sysout("j : " + j)
//				System.out.println(i + "X" + j + " = " + i * j);
//			}
//		}
		
//		for(int dan = 8; dan > 0; dan--) {
//			
//			System.out.println((dan + 1) + "단");
//			
//			for(int i = 0; i < 9; i++) {
//				
//				int result = (dan + 1) * (i + 1);
//				
//				System.out.println((dan + 1) + "X" + (i + 1) + " = " + result);
//				
//			}
//			
//			System.out.println();
//			
//		}
		
		for(int dan = 0; dan < 8; dan++) {
			
			System.out.println((dan + 2) + "단");
			
			for(int i = 0; i < 9; i++) {
				
				int result = (dan + 2) * (i + 1);
				
				System.out.println((dan + 2) + " x " + (i + 1) + " = " + result);
				
			}
			
			System.out.println();
		}
		
	}

}
