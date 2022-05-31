package j17_스태틱.student;

public class Student {
	/*
	 * 변수를 선언
	 * 1. student_code(정수)
	 * 2. student_name(이름)
	 * 3. student_year(학년)
	 * 
	 * 문제
	 * 학생을 1명 생성할때마다 자동으로 student_code 값이 1씩 증가하여
	 * 부여될 수 있게 작성.
	 * ex)
	 * 20220001
	 * 20220002
	 * .
	 * .
	 * .
	 */
	
	private static int auto_increment = 20220000;
	private int student_code;
	private String student_name;
	private int student_year;
	
	//auto_increment 를 씀으로써 매개변수로 student_code를 지정할 필요가 없어짐.
	public Student(String student_name, int student_year) {
		this.student_code = ++auto_increment; //student가 생성될때 1씩 증가하여 학번생성.
		this.student_name = student_name;
		this.student_year = student_year;
	}

	public void method() {
		System.out.println("학번: " + student_code);
		System.out.println("이름: " + student_name);
		System.out.println("학년: " + student_year);
		System.out.println();
	}
	
	
}
