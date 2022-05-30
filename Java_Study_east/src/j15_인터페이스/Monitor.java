package j15_인터페이스;

/*
 * implements ==> 상속에서 extends와 동일
 */

public class Monitor implements Hdmi, VGA {

	@Override
	public void connect() {
		System.out.println("모니터에 연결");
	}
	
	@Override
	public void disconnect() {
		System.out.println("모니터 연결 해제");
	}
	
	//다중 인터페이스 예시
	@Override
	public void vgaConnect() {
		System.out.println("vga로 모니터 연결");
	}

}
