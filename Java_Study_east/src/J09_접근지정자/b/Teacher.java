package J09_접근지정자.b;

public class Teacher {
	//모든 변수는 이제 private
	private String name;
	private String address;
	private String phone;
	
	//알 + 쉬 + S => set,get
	public String getName() { //private 변수에대한 값을 우회경로로 지정목적
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void showInfo() {
		String _address = createMassege(name, address);
		String _phone = createMassege(name, phone);
		
		System.out.println(_address);
		System.out.println(_phone);
	}
	
	private String createMassege(String name, String value) {
		return name + "님: " + value;		
	}
	
	
}
