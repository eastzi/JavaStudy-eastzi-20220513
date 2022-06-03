package j20_컬렉션.ArrayList;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> nameList2 = new ArrayList<String>();
		
		//리스트에 값 추가 -> add()
		
		nameList.add("홍길동");
		nameList.add("가나다");
		nameList.add("라마바");
		nameList.add("사아자");
		nameList.add("차카카");
		nameList.add("라라라");
		nameList.add("아아아");
		
		//1. 리스트 중간에 값 추가 -> add()
		//add(string) -> 맨 마지막에 
		//add(index, string) -> 중간에 값 삽입
		nameList.add(0, "이동영");
		
		//2. 리스트 내의 해당 인덱스 값 수정 
		nameList.set(1, "정유진");
		
		//3. 리스트 내에서 인덱스로 값 삭제
		nameList.remove(3);
		
		// 얇은복사 -> 주소값만 옮김 , 깊은복사 -> 내용 전체 옮김(주소가 다름, 다른값)
		//4. 리스트에서 리스트로 값 옮기기(깊은복사)
		nameList2.addAll(nameList);
		//nameList2.addAll(0, nameList2);
		//nameList2.removeAll(nameList2);
		
		//5. 리스트 내에서 값을 바로 삭제
		nameList.remove("차카카");
		
		//컬렉션은 tostring 이 자동지원
		//6. 리스트내에서 모든 값 확인 -> toString() -> 생락되어잇음(모든클래스에서 지원하는 함수)
		System.out.println(nameList);                 //컬렉션만 지원하는 것이 아님.
		
		//7. 리스트에서 값 가져오기 -> get(인덱스번호(매개변수))
		System.out.println(nameList.get(3));
		
		//8. 리스트 내에서 원하는 값이 있는지 확인
		System.out.println(nameList.contains("홍길동"));
		System.out.println(nameList.contains("이동영"));
		
		//9. 리스트 내에 값이 하나라도 있으면 비우기
		if(!nameList.isEmpty()) {
			nameList.clear();
		}
		
		System.out.println(nameList);
		System.out.println(nameList2);
		
		//10. 리스트를 배열로 변환
		Object[] objs = nameList2.toArray();
		for(Object obj : objs) {
			System.out.println((String) obj);
		}
		
		

		
	
	}

}
