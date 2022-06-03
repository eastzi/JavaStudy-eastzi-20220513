package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		//set => 순서가 없고 값의 중복을 허용하지 않음.
		
		HashSet<String> name = new HashSet<String>();
		
		name.add("김준일");
		name.add("김준이");
		name.add("김준삼");
		name.add("김준사");
		name.add("김준일");
		name.add("김준일");
	
		System.out.println(name);
		
		//list 에서는 인데스가 있어 get 이 사용가능하지만,
		//set은 순서가 없기때문에 iterator()를 사용 => 순서가 없는 set을 일렬로 줄세워줌.
		Iterator<String> iterator = name.iterator(); //생성하는것이 아님.
		
		while(iterator.hasNext()) { //=>next가 있나?(true, false리턴)
			//System.out.println(iterator.next());
			String name2 = iterator.next(); //=> "값의 재사용"을 위해 항상 변수에 담아놓는 것이 좋음. 휘발성이기 때문
			if(name2.equals("김준이")) {
				System.out.println(name2); //변수생성없이 출력만하면 다음값이 출력됨.
			}
		}
		
		//set 제거
		name.remove("김준사");
		System.out.println(name);
		
		//set 수정 => 불가, 삭제하고 추가해야함.(remove, add)
		//name.
		
		
		
		
		
		
		

	}

}
