package ronaldotree;

public class Inheritance {
	public static void main(String[] args) {
		// 클래스 상속관계가 형성되면 각 클래스는 is-a 관계(상속 관계)가 만들어진다
		// 자식 클래스의 객체를 부모클래스 타입으로 처리 가능
		Tiger t = new Tiger(); // tiger클래스
		Animals t2 = new Tiger(); // Animals 클래스
		Eagle e = new Eagle();
		Animals e2 = new Eagle();
		Goldfish g = new Goldfish();
		Animals g2 = new Goldfish();
	}

}

class Animals extends Object {
	protected String eye; // 원래 private
	protected String mouth; // 원래 private
	private String hp;

	public void eat() {
	}

	public void sleep() {
	}
}

class Tiger extends Animals {
	protected String leg;

	public void run() {

	}
}

class Eagle extends Animals {
	protected String wing;

	public void fly() {

	}
}

class Goldfish extends Animals {
	protected String fin; // 속성

	public void swim() { // 메서드

	}
}