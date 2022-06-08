package j21_익명클래스;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PrincipalDetailse {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		strList.add("f");
		
		//인터페이스는 생성할 수 없는데 생성이 됨. => 
		//따로 class를 만들지 않고 사용 = 익명클래스(바로 구현)
		//쓸때마다 클래스를 생성해서 내용을 바꿔줘야함.
		//일회성, 구현 내용이 달라져야할때
		GrantedAuthority grantedAuthority = new GrantedAuthority() {
			
			@Override
			public Collection<String> getRoles(List<String> roles) {
				System.out.println(roles);
				return roles;
			}
		};
		
		GrantedAuthority grantedAuthority3 = new GrantedAuthority() {
			
			@Override
			public Collection<String> getRoles(List<String> roles) {
				return roles;
			}
		};
		
		GrantedAuthority grantedAuthority2 = new GrantedAuthorityImpl();
		
		grantedAuthority.getRoles(strList).forEach(r -> {System.out.println(r);});
		grantedAuthority2.getRoles(strList).forEach(r -> {System.out.println(r);});
		grantedAuthority3.getRoles(strList).forEach(r -> {System.out.println(r);});
	}

}
