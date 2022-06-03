package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

import j20_컬렉션.entity.Student;

public class HashSetEx2 {

	public static void main(String[] args) {
	
		/*
		 * 1. HashSet<Student> 생성
		 * 
		 * 2. 학생정보 추가
		 * 20220001, 김준일, "부산대학교"
		 * 20220002, 김준이, "부경대학교"
		 * 
		 * 3. 20220002의 코드를 가진 학생을 조회
		 * 
		 * 4. 20220001의 코드를 가진 학생 삭제
		 * 
		 */
		
		HashSet<Student> studentList = new HashSet<Student>();
		
//		Student a = new Student(20220001, "김준일", "부산대학교");
//		Student b = new Student(20220002, "김준이", "부경대학교");
//		
//		studentList.add(a);
//		studentList.add(b);
		
		studentList.add(new Student(20220001, "김준일", "부산대학교"));
		studentList.add(new Student(20220002, "김준이", "부경대학교"));
		
		Iterator<Student> iterator = studentList.iterator();
		
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getStudentCode() == 20220002) {
				System.out.println(student);
			}
		}
		
		iterator = studentList.iterator(); 
		//새로 다시 줄세우기. 위에서 다 빠져나감
		
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getStudentCode() == 20220001) {
				studentList.remove(student);
			}
		}
		System.out.println(studentList);
		
	
		
	}

}
