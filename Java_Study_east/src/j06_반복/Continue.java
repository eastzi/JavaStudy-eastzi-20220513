package j06_반복;

public class Continue {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				continue;	//continue 이하 반복문은 실행 x . 다음반복을 하라.
				//System.out.println(); ==> continue이하는 실행이 안되므로 오류.
			}
			System.out.println(i);
		}

	}

}
