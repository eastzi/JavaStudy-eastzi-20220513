package j23_예외처리;

public class Throws01 {	//예외를 미룬다.
	
	public void printArray(int[] arrays) throws Exception {//예외처리를 try대신 throws사용 => 1번 예외처리를 미룸.
		
		for(int i = 0; i < arrays.length + 1; i++) {
			System.out.println("index" + i + ": " + arrays[i]);
		}
	}
}
