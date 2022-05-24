package j08_클래스;

public class FishBun { //class = 변수 + 매소드
	 //변수
	 String material; //재료
	 String dough; //반죽
	 
	 FishBun(){ //생성자(메소드와 차이 - 반환이없고, 대문자로 시작)
		 System.out.println("생성자 호출");
	 }
	 
	 //매소드
	 void showInfo() {
		 System.out.println("재료: " + material);
		 System.out.println("반죽: " + dough);
	 }
	 
}
