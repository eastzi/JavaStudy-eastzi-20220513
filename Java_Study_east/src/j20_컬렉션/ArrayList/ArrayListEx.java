package j20_컬렉션.ArrayList;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		//<일반배열>
		//배열과 유사한 list
		String[] strArray = new String[5];
		strArray[0] = "a";
		strArray[1] = "a";
		strArray[2] = "a";
		strArray[3] = "a";
		strArray[4] = "a";
		
		strArray[2] = null; //값 지우기
		
		//foreach
		for(String str : strArray) {
			System.out.println(str);
		}
		
		//for문 배열
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}

		//<arraylist>
		//배열처럼 공간의 크기가 지정되지 않고, 원하는 만큼 유동적으로 지정됨. - arraylist
		//순서도 자동으로 적용.
		//값을 추가할땐 => add / 값을 가져올땐 => get
		ArrayList<String> strArrayList = new ArrayList<String>();
		strArrayList.add("b1");
		strArrayList.add("b2");
		strArrayList.add("b3");
		strArrayList.add("b4");
		strArrayList.add("b5");
		strArrayList.add("b6");
		
		System.out.println(strArrayList.size());
		
		strArrayList.remove("b1"); //값지우기 - 값이 사라짐.
		strArrayList.remove(0); //위에서 b1이 지워지면서 재정렬되어 b2가 0번째자리로 옴. 
		
		//foreach
		for(String str : strArrayList) {
			System.out.println(str);
		}
		
		//arraylist
		for(int i = 0; i < strArrayList.size(); i++) {
			System.out.println(strArrayList.get(i));
		}
		
		//람다 foreach
		strArrayList.forEach(r -> {System.out.println(r);});
		
		
		
		
	}

}
