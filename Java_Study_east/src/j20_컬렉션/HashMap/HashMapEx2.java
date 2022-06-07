package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String value = null;
		
		System.out.println("찾으실 값을 입력하세요: ");
		value = scanner.nextLine();
		
		/*
		 * 자동차입력 -> car 출력
		 * 자전거 -> bicycle
		 * 기차 -> train
		 * 비행기 -> airplane
		 * 
		 * 없다면 -> 지원하지 않는 단어입니다. 
		 */
		//방법1 -> 추가불가
		if(value.equals("자동차")) {
			System.out.println("car");
		}else if(value.equals("자전거")) {
			System.out.println("bicycle");
		}else if(value.equals( "기차")) {
			System.out.println("train");
		}else if(value.equals("비행기")) {
			System.out.println("airplane");
		}else {
			System.out.println("지원하지 않는 단어입니다.");
		}
		
		//방법2 -> 추가가능
		HashMap<String, String> words = new HashMap<String, String>();
		words.put("자동차", "car");
		words.put("자전거", "bicycle");
		words.put("기차", "train");
		words.put("비행기", "airplane");
		words.put("오토바이", "motorcycle");
		
		if(words.containsKey(value)) {
			System.out.println(words.get(value));
		}else {
			System.out.println("지원하지 않는 단어입니다.");
		}

	}

}
