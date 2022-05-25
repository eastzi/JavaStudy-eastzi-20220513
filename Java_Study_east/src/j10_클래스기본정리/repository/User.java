package j10_클래스기본정리.repository;

/*
 * Entity Class (독립적인 존재 / 동일한 정보를 찍어내는 틀)
 * (데이터만 저장하는 클래스)
 * 정보를 담는 객체 ==> Entity 객체.
 * 보통 변수로만 구성됨.  
 */

public class User {
	private String usercode;  //Entity class 의 핵심 = 변수
	private String email;
	private String name;
	private String username;
	private String password;
	
	//<만드는 순서>
	//기본생성자
	//전체생성자
	//getter
	//setter
	//toString
	
	//기본생성자 => 생략이 되어 있는 상태에서 전체생성자가 오버로딩되면 무시되고 후에 값을 넣을수 잇음
	public User() {}

	//전체생성자 => 생성할때 값을 넣어야 함. (기본생성자, 전체생성자 set로 생각하고 만들기)
	public User(String usercode, String email, String name, String username, String password) {
		this.usercode = usercode;
		this.email = email;
		this.name = name;
		this.username = username;
		this.password = password;
	}

	//getter & setter
	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//toString
	@Override //상속의 개념.
	public String toString() {
		return "User [usercode=" + usercode + ", email=" + email + ", name=" + name + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	
	
}
