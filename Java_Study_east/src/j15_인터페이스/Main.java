package j15_인터페이스;

public class Main {

	public static void main(String[] args) {
		
		//업캐스팅을 위한 생성
		Monitor monitor = new Monitor();
		BeamProjector beamProjector = new BeamProjector();
		
		SmartPhone smartPhone = new SmartPhone(monitor); //() 속에는 모니터 또는 빔프로젝터 
		// ()속에는 hdmi를 구현하는 클래스를 넣는데, 먼저 생성을 해줘야함.=>업캐스팅
		//Hdmi hdmi = new Hdmi(); => 추상 메소드라 생성할 수 없음.
		
		smartPhone.powerOn();
		smartPhone.powerOff();

	}

}
