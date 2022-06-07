package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
		
		//값 추가
		//map 키(k)값 중복불가 => 키값이 중복된다면 맨마지막 값(v)를 출력
		//map의 앞부분은 set의 형태를 가짐(키값 중복x, 순서x)
//		studentMap.put(20220001, "김준일");
//		studentMap.put(20220001, "김준이");
//		studentMap.put(20220001, "김준삼");
//		studentMap.put(20220001, "김준사");
//		studentMap.put(20220001, "김준오");
		
		studentMap.put(10, "김준일");
		studentMap.put(11, "김준이");
		studentMap.put(12, "김준삼");
		studentMap.put(23, "김준사");
		studentMap.put(24, "김준오");
		
		System.out.println(studentMap);
		
		//get을 이용해 k값을 가져옴. index가 아님. 
		//key로 value 가져오기
		System.out.println(studentMap.get(0));
		
		//값 수정, 대체는 왠만하면 put대신 replace 
		//put과 replace 차이 => put은 k값이 없을때 추가 / replace는 수정할 값이 없으면 사용불가
		//studentMap.put(10, "김준육");
		studentMap.replace(10, "김준육");
		
		studentMap.remove(10);
		
		
		Iterator<Integer> iterator = studentMap.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			String value = studentMap.get(key);
//			if(value.equals("김준오")) {
//				System.out.println(studentMap.get(key));
//			}
			System.out.println(value);
		}
		
		//람다식(함수형 프로그램밍)
		studentMap.forEach(
			(k, v) -> {
				System.out.println("key: " + k);
				System.out.println("key: " + k);
				System.out.println("value: " + v);
			}
		);
		
		//위의 forEach와 동일
//		void test(Integer k, String v) {
//			System.out.println("key: " + k);
//			System.out.println("value: " + v);
//		}

		//contains => 포함여부(true, false 리턴)
		System.out.println(studentMap.containsKey(23));
		System.out.println(studentMap.containsValue("김준구"));
		
		
		
		
		
		
	}

}
