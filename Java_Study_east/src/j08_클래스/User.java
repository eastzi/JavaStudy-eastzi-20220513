package j08_클래스;

public class User {
	String name;
	String age;
	String phone;
	String address;
	
	//기본생성자
	User() { //메소드와 다르게 자료형이 필요없음. 메소드는 void , 자료형 필요
		System.out.println("생성");
	}
	
	//사용자정의 생성자
	User(String name) {//생성자 오버로딩 - 변수명이 같아도 자료형이 다르면 가능 
		//System.out.println(name);
		this.name = name;
	}
	
	User(String name, String age, String phone, String address) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}//생성시점에 값을 넣겠다?
	
	
	void setName(String name) {
		System.out.println("setName 메소드 안에서 호출: " + this);
		this.name = name; //변수명과 매개변수를 동일하게 사용할때 자기자신을 가르킨다.
	}   
	
}
