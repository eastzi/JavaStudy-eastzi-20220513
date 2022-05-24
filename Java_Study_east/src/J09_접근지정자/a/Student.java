package J09_접근지정자.a;

public class Student {
	//모든 변수는 이제 private - 정보은닉
	private String name;
	private String schoolName;
	
	//setter(set)
	public void setName(String name) {
		this.name = name;
	}
	
	//getter(get)
	public String getName() {
		return name;
	}
	
}
