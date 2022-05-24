package j08_클래스;

public class FishBunMain { //class 대문자로 시작

	public static void main(String[] args) {
							   //생성자 - class명과 동일 , 반환자료형이 생략
		FishBun fishBun = new FishBun(); // FishBun을 호출할때 객체를 생성.
										//객체는 클레스에 정의된 내용대로 메모리에 생성된 것 
									   //생성자는 메모리 주소를 반환하기 때문에 반환자료형이 필요가 없는것. 	
		//동일한 것만 담을 수 있다.
		fishBun.showInfo();
		fishBun.material = "팥";
		fishBun.dough = "부드러운 반죽";
		fishBun.showInfo();
		
		System.out.println("===========================");
								
		FishBun fishBun2 = new FishBun();
	
		fishBun2.showInfo();
		fishBun2.material = "슈크림";
		fishBun2.dough = "퍽퍽한 반죽";
		fishBun2.showInfo();                      
		fishBun.showInfo();
		
		System.out.println(fishBun);
		System.out.println(fishBun2);
		
	}

}
