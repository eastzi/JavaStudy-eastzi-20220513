package j19_제네릭;

import j10_클래스기본정리.repository.User;
import j12_상속.동물.Animal;
import j12_상속.동물.Human;
import j12_상속.동물.Tiger;

public class Controller {

	public Object createUser() {										//제네릭
		return new CMRespDto<String>(1, "회원추가 성공", "aaaa, 1234"); //data = string
	}
	
	//데이터를 전달해줄 수 있는 하나의 묶음 - CMRespDto
	public Object updateUser() {
		return new CMRespDto<Integer>(1, "회원정보(나이)수정 성공", 29); //data = int
	}
	
//	public Object getUser() { //다운캐스팅을 하기 싫으면 밑에 처럼
	//제네릭의 와일드카드 => " ? "
	public CMRespDto<?> getUser() { //리턴 자료형이랑 동일해야 리턴이 가능함.
		User user = new User();
		user.setUsercode("2");
		user.setUsername("junil");
		user.setPassword("1234");
		user.setName("김준일");
		user.setEmail("askdf");
		if(user.getUsercode().equals("1")) {
			return new CMRespDto<User>(1, "회원정보 가져오기 성공", user );			
		}else {
			return new CMRespDto<String>(-1, "회원정보 가져오기 실패", "usercod = 2");
		}// 자료형이 user가 아니가 string이라 에러 -> 와일드카드 사용.(?)
		
	}
					//와일드카드 제한 - 상속된 것만 리턴
	public CMRespDto<? extends Animal> getAnimal() {
		//Animal animal = new Human();
		Animal animal = new Animal();
		
		if(animal instanceof Human) {
			return new CMRespDto<Human>(1, "사람입니다.", (Human) animal);
		}else if(animal instanceof Tiger) {
			return new CMRespDto<Tiger>(1, "호랑이입니다.", (Tiger) animal);
		}else {
			//return new CMRespDto<>(-1, "찾을 수 없는 동물", null);
			
			return new CMRespDto<>(-1, "찾을 수 없는 동물", animal);
			//<> 비워두면 animal의 자료형을 그대로 가져옴
			
			//return new CMRespDto<String>(-1, "찾을 수 없는 동물", null);
			//상속된것이 아니기 때문에 리턴 불가
		}
 	}
}
