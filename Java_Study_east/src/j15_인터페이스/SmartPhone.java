package j15_인터페이스;

public class SmartPhone {
	
	//인터페이스
	//final - 줄을 선언을 했으면 밑에 생성할때 값이 입력되어야 함.
	private final Hdmi hdmi;
	
	//생성할때 모니터나 빔을 연결할지 선택.
	public SmartPhone(Hdmi hdmi) {
		this.hdmi = hdmi;
	}
	
	public void powerOn() {
		System.out.println("스마트폰의 전원을 켭니다.");
		hdmi.connect();
	}
	
	public void powerOff() {
		System.out.println("스마트폰의 전원을 끕니다.");
		hdmi.disconnect();
	}
	
	
	

}
