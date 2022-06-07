package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

import j20_컬렉션.entity.Student;

public class HashMapEx3 {

	public static void main(String[] args) {
		 HashMap<Integer, Student> students = new HashMap<Integer, Student>();
		 
		 students.put(20220001, new Student(20220001, "김준일", "부산대학교"));
		 students.put(20220002, new Student(20220002, "권오광", "부경대학교"));
		 students.put(20220003, new Student(20220003, "남민아", "동아대학교"));
		 students.put(20220004, new Student(20220004, "김재현", "경상대학교"));
		 students.put(20220005, new Student(20220005, "송새미", "경북대학교"));

		 System.out.println(students);
		 
		 /*
		  * 1. 이름이 김재현인 학생의 대학을 서울대학교로 변경하라. 
		  * 2. 20220003 학번 학생을 20220003, "박호훈", "고려대학교"로 변경
		  * 3. 20220005 학번 학생을 삭제
		  * 4. 20220002 학번 학생정보 출력
		  */
		 
		 //1. key값을 모른다는 하에 변경
		 //1-1
		 Iterator<Integer> iterator = students.keySet().iterator();
		 while(iterator.hasNext()) {
			 Integer key = iterator.next();
			 Student student = students.get(key);
			 if(student.getName().equals("김재현")) {
				 student.setSchoolName("서울대학교");
				 break;
			 }
		 }
		 
		 //1-2
		 for(Student student : students.values()) {
			 if(student.getName().equals("김재현")) {
				 student.setSchoolName("서울대학교");
				 break;
			 }
		 }
		 
		 //1-3
		 //break사용불가. 재사용이 불가하고 한번만 사용가능(스트림)
		 students.forEach((k, v) -> {
			 if(v.getName().equals("김재현")) {
				 v.setSchoolName("서울대학교");
			 }
		 });
		 
		 //2.
		 students.replace(20220003, new Student(20220003, "박호훈", "고려대학교"));
		 
		 //3.
		 students.remove(20220005);
		 
		 System.out.println(students);
		 
		 //4.
		 System.out.println(students.get(20220002));
		 
		 
			
		 
	}

}
