package j23_예외처리;

public class Throws01Main {
	
	public void test() throws Exception { //2번 예외처리를 미룸
		Throws01 throws01 = new Throws01();
		
		throws01.printArray(new int[] {1,2,3,4,5,6,7,8,9});
		
	}

	public static void main(String[] args) { 
		Throws01Main main = new Throws01Main();
		
		try {//마지막 예외처리(main전에는 예외처리 해야함) => 출력시 제일위에 나온 예외먼저 처리
			main.test();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
	}

}
