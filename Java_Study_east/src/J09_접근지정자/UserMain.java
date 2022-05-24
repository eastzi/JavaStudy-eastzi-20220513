package J09_접근지정자;

import J09_접근지정자.a.Student;
import J09_접근지정자.b.Teacher;

public class UserMain {

	public static void main(String[] args) {
		Student student = new Student();
		Teacher teacher = new Teacher();
		
		student.setName("홍길동"); //set, get(매개체)에 요청하는 것., 값을 넣고 
		System.out.println(student.getName()); // 값을 가져오고(리턴만해서 매개변수는 필요없음)
		
		teacher.setName("김준일");
		teacher.setAddress("부산");
		teacher.setPhone("010-0000-0000");
		teacher.showInfo();
		
		//이제는 변수에 직접 값을 대입하면 안됨.==> 캡슐화로 불러오게 set, get 
//		student.name = "홍길동";
//		student.schoolName = "코리아아이티";
//		
//		teacher.name = "김준일";
//		teacher.address = "부산";
		
	}

}
