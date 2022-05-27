package j11_배열;

public class Array01 {

	public static void main(String[] args) {
//		int number1 = 1; //각 값을 담는 메모리공간들이 흩어져있음. 
//		int number2 = 2; //개별적인 각각의 주소들로 존재.
//		int number3 = 3;
//		int number4 = 4;
//		int number5 = 5;
//		int number6 = 6;
//		
//		System.out.println();//1~6을 더할때 반복문을 사용하는데 여기선 변수명의 숫자도 증가. 때문에 반복문을 사용하지 못하니
							//배열을 이용해야함.
		
						//int(4바이트) 10개를 한공간으로 묶어라. = 개별주소를 묶어 1개의 전체 주소가 생김
		//배열은 class와 함께 참조자료형의 한가지 종류.
		
		//<배열을 선언할 수 있는 방법>
		//1. 배열의 공간(크기)을 정해서 생성하는 방법(공간만 있음, 값은 없음), 각 공간의 크기는 자료형에 따라 달라짐
		int[] numbers = new int[10]; //10은 값이 아니고 공간의 갯수
		
		//2. 배열에 들어갈 값을 미리 정해서 생성(공간과 값은 있음)
		int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //숫자 카운팅은 0부터 시작 , 순서를 index라함.
		char[] characters = {'a', 'b', 'c', 'd', 'e'};
		boolean[] booleans = {true, true, true, false, false};
		
		String[] strArray = new String[5]; //string은 class임. 참조자료형 
		String str = "test"; //class 변수에는 주소값이 옴.
		
		System.out.println("numbers의 길이: " + numbers.length);
		System.out.println("strArray의 길이: " + strArray.length);
												  
		for(int i = 0; i < numbers.length; i++) { //length => 해당 배열의 크기를 가져옴. 수백가지의 크기일때 하나씩 카운팅 못하니 자동으로 크기를 가져오는 효과
			System.out.println("i: "+ i);
			System.out.println("numbers: " + numbers[i]);
			System.out.println("numbers2: " + numbers2[i]);
			//System.out.println(strArray[i]); index가 5개인데 10개안에 들어감. 오류(예외).
		}
		
		//System.out.println(numbers); => 10개 묶음 배열의 주소값 출력됨

		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]); //모든 class의 기본값은 null. class 변수에는 주소값이 옴. 
											//null=주소값.(주소의 0번째 주소)
											//배열의 주소 = 배열내 첫번째 요소(변수대신 요소라함)의 주소
		}
		
	}

}
