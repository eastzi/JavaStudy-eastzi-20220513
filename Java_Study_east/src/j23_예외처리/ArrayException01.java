package j23_예외처리;

/*
 * 프로그램 오류 종류
 * 1. 예외 => 프로그램 실행 중일때 일어나는 예외(RuntimeException)
 * 2. 컴파일 에러(컴파일 과정 중 에러) => 다른파일을 가져오거나, 프로그램을 실행, 데이터베이스 오류 등(IOException) 
 * 3. 버그 => 외부로부터 자극을 받아 오작동하는 경우(게임의 핵)
 * 
 */

public class ArrayException01 {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		
		//+1을 함으로써 존재하지 않는 메모리를 불러온다 => exception 발생 => 처리할 대상!
		//for문 조건식을 손대지 않고 예외처리(예외를 처리하고 다음단계로 넘어가도록) => try{} catch() {}
		try {//오류가 날만한 구간을 try로 묶음(이 예제는 array 오류)
			for(int i = 0; i < numbers.length + 1; i++) {
				System.out.println("index" + i + ": " + numbers[i]);
			}
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("StringIndexOutOfBoundsException예외가 발생하였음.");
		}catch (Exception e) {//예외가 일어날지 안일어날지 모르니 구간하나 더 설정. 자리는 맨 마지막 고정 
			System.out.println(e);
		}
		
//		catch(IndexOutOfBoundsException e) {//상위클래스 하나로 2가지 예외 처리
//			System.out.println(e);
//			System.out.println("ArrayIndexOutOfBoundsException 예외가 발생하였음.");
//		}
//		catch (StringIndexOutOfBoundsException e) {//catch에서 오류를 받음.(예제는 string, array 예외 2가지인 경우)
//			System.out.println(e);
//			System.out.println("StringIndexOutOfBoundsException 예외가 발생하였음.");
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//			System.out.println("ArrayIndexOutOfBoundsException 예외가 발생하였음.");
//		}
		
		System.out.println("지금까지 진행한 작업을 저장합니다.");
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
		
		
	}

}
