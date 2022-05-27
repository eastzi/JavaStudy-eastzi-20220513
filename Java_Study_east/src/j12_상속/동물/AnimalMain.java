package j12_상속.동물;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Human human = new Human();
		Tiger tiger = new Tiger();
		
		animal.move();
		human.move();
		tiger.move();
		//move를 다르게 다 정의하지만 move로 쓰는 이유 => 다형성
		
		human.readBooks();
		tiger.hunting();
	}

}
