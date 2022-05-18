package j05_조건;

public class SwitchCase {

	public static void main(String[] args) {
		int num = 29;
		char c = 'b';
		String str = "가나다";
		
		switch(num / 10) {
			case 1:
				System.out.println("case 1");
				break;
			case 2:
				System.out.println("case 2");
				break;
			case 3:
				System.out.println("case 3");
				break;
			default:
				System.out.println("찾을 수 없음");
		}

		switch(c) {
			case 'a':
				System.out.println("case a");
				break;
			case 'b':
				System.out.println("case b");
				break;
			case 'c':
				System.out.println("case c");
				break;
			default:
				System.out.println("찾을 수 없음");
		}
		
		switch(str) {
			case "김준일":
				System.out.println("case 김준일");
				break;
			case "가나다":
				System.out.println("case 가나다");
				break;
			case "라마바":
				System.out.println("case 라마바");
				break;
			default:
				System.out.println("찾을 수 없음");
		}

	}

}
