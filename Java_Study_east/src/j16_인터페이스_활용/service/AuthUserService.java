package j16_인터페이스_활용.service;

public class AuthUserService implements UserService {
	// 통합계정로그인 (sns로 로그인이 가능하면서 시작)
	//1. 자체사이트 로그인
	//2. 카카오 또는 네이버로 로그인
	
	//자회사 로그인 틀과 카카오 로그인 틀을 연결
	@Override
	public void create() {
		System.out.println("자회사 회원가입");
	}

	@Override
	public void read() {
		System.out.println("자회사 회원가입을 통해 사용자 데이터 가져오기");
	}

	@Override
	public void update() {
		System.out.println("자회사 회원 정보 수정");
	}

	@Override
	public void delete() {
		System.out.println("자회사 회원 탈퇴");
	}

}
