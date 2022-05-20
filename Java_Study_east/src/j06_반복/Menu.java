package j06_반복;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//변수 제일 위로 올리고
		boolean loopFlag = true; // 반복 속 반복에서 프로그램 종료.
		
		System.out.println("프로그램 시작");
		//구분
		while(loopFlag) {
			char select = 0;
			
			System.out.println("[메뉴 선택]");
			System.out.println("1. java");
			System.out.println("2. python");
			System.out.println("3. javascript");
			System.out.println("q. 프로그램 종료");
			
			System.out.print("명령을 입력하세요: ");
			select = scanner.next().charAt(0); //=>문자열에서 문자 1개 
			scanner.nextLine(); //nextline을 제외한 나머지는 필요함.
			
//			String str = scanner.nextLine(); //a b c 입력시. 버퍼적용
//			System.out.println(str);
			
			if(select == 'q') {
				break; //q가 입력될때까지 위에 실행문 계속반복..
			}else if(select == '1') {
				System.out.println("java를 선택하셨습니다.");
				
				while(true) {
					System.out.println("[ java 메뉴 ]");
					System.out.println("1. java란?");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					
					System.out.print("명령을 입력하세요: ");
					select = scanner.next().charAt(0);  
					scanner.nextLine(); 
					
					if(select == 'b') {
						break;
					}else if(select == 'q') {
						loopFlag = false; //조건1 반복에서 종료되고 큰반복에 나가서 false값 적용.
						break;
					}else if(select == '1') {
						System.out.println("자바란...입니다.");
						System.out.print("계속하시려면 엔터를 눌러주세요..");
						scanner.nextLine();
					}else {
						System.out.println("해당 명령은 보기에 없습니다.");
						System.out.println("다시 입력하세요.");
					}
					
					System.out.println();
				}
				
//				System.out.print("계속하시려면 엔터를 눌러주세요.");
//				scanner.nextLine();//다음입력 받을때까지 반복이 멈춤.
				
			}else if(select == '2') {
				System.out.println("python를 선택하셨습니다.");
				
				while(true) {
					System.out.println("[ python 메뉴 ]");
					System.out.println("1. python란?");
					System.out.println("b. 뒤로가기");
					
					System.out.print("명령어를 입력하세요.");
					select = scanner.next().charAt(0);
					scanner.nextLine();
					
					if(select == 'b') {
						break;
					}else if(select == '1') {
						System.out.println("파이썬이란...입니다.");
						System.out.print("계속하시려면 엔터를 눌러주세요.");
						scanner.nextLine();
					}else {
						System.out.println("해당 명령은 보기에 없습니다.");
						System.out.println("다시 입력하세요.");
					}
					
					System.out.println();
				}

				
			}else if(select == '3') {
				System.out.println("javascript를 선택하셨습니다.");
				
				while(true) {
					System.out.println("[ javascript 메뉴 ]");
					System.out.println("1. javascript란?");
					System.out.println("b. 뒤로가기");
					
					System.out.print("명령어를 입력하세요.");
					select = scanner.next().charAt(0);
					scanner.nextLine();
					
					if(select == 'b') {
						break;
					}else if(select == '1') {
						System.out.println("자바스크립트란...입니다.");
						System.out.print("계속하시려면 엔터를 눌러주세요.");
						scanner.nextLine();
					}else {
						System.out.println("해당 명령은 보기에 없습니다.");
						System.out.println("다시 입력하세요.");
					}
					
					System.out.println();
				}
				
			}else {
				System.out.println("해당 명령은 보기에 없습니다.");
				System.out.println("다시 입력하세요.");
			}
			//if 끝나고 구분. 
			System.out.println();
			
		}
		
		System.out.println("프로그램 종료");
		//while조건이 앞에오면 무한정 반복이 되어 종료가 안되기 때문에 오류
		//while 안에 break 필요

	}

}
