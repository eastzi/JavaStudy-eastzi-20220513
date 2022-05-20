package j06_반복;

public class Star {

	public static void main(String[] args) {
//		 for(int i = 0; i < 5; i++) {
//			 System.out.print("*");
//			 System.out.println();
//		 }
//		 
		 /*
		  * *
		  * **
		  * ***
		  * ****
		  * *****
		  *
		  * 과제
		  * (1)
		  *     *
		  *    **
		  *   ***
		  *  ****
		  * *****
		  * 
		  * (2)
		  * *****
		  *  ****
		  *   ***
		  *    **
		  *     *
		  * 
		  * (3)
		  *     *
		  *    ***
		  *   *****
		  *  *******
		  * *********
		  * 
		  */
		
		 
		 for(int i = 0; i < 5 ; i++) {
			 for(int j = 0; j < i+1; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
		 for(int i = 0; i < 5 ; i++) {
			 for(int j = 0; j < 5-i; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
		 for(int i = 0; i < 5; i++) {
			 for(int j = 0; j < 4-i; j++) {
				 System.out.print(" ");
			 }
			 for(int k = 0; k < i+1; k++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
		 for(int i = 5; i > 0; i--) { 
			 for(int j = 0; j < 5-i; j++) {
				 System.out.print(" ");
			 }
			 for(int k = 0; k < i; k++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		
		 for(int i = 0; i < 6; i++) {
			 for(int j = 0; j < 5-i; j++) {
				 System.out.print(" ");
			 }
			 for(int k = 0; k < i*2-1; k++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
		 for(int i = 5; i > 0; i--) {
			 for(int j = 0; j < 5-i; j++) {
				 System.out.print(" ");
			 }
			 for(int k = 0; k < i*2-1; k++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 
	}

}
