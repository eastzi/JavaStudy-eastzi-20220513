package j08_클래스;

/*
 * 1. Car라는 클래스를 만든다.
 * 2. Car 클래스의 속성(변수)는 제조사(company), 모델(model), 색상(color)
 * 3. Car 클래스의 기능(메소드) 
 * showCompanyInfo() -> 000회사에서 제조된 차량입니다. => 로 출력하기
 * showInfoAll() ->  
 * 제조사: KIA
 * 모델: K5
 * 색상: 화이트
 * getCar() -> return "KIA_K5_화이트" => 로 main에서 출력
 * setColor -> 매개변수에 색상을 받아서 color변수의 값을 변경할 수 있도록 
 * 
 *  KIA, K7, 블랙->블루(색 변경setColor)
 *  현대자동차, 소나타, 화이트->그레이
 *  Tesla, Model3, 레드->그린
 * 
 */

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car(); //생성자 - 주소값을 반환
		Car car2 = new Car();
		Car car3 = new Car();
		
		car.company = "KIA";
		car2.company = "현대자동차";
		car3.company = "Tesla";
		
		car.model = "K7";
		car2.model = "소나타";
		car3.model = "Model3";
		
		car.color = "black";
		car2.color = "white";
		car3.color = "red";
		
		car.showCompanyInfo();
		car2.showCompanyInfo();
		car3.showCompanyInfo();
		
		System.out.println();
		
		car.showInfoAll();
		car2.showInfoAll();
		car3.showInfoAll();
		
		System.out.println(car.getCar());
		System.out.println(car2.getCar());
		System.out.println(car3.getCar());
		
		System.out.println();
		
		car.setColor("blue");
		car2.setColor("grey");
		car3.setColor("green");
		
		car.showInfoAll();
		car2.showInfoAll();
		car3.showInfoAll();
		
		
	}

}
