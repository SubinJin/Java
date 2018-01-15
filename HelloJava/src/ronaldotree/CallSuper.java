package ronaldotree;

public class CallSuper {
	public static void main(String[] args) {
		// 부모 클래스 생성자 호출하기 - super()
		// 부모 클래스의 매서드 호출하기 - super.매서드이름
		// 자식 클래스의 생성자를 호출하면 먼저 부모 클래스의 생성자를 호출하고 그 다음 자식 클래스의 생성자를 호출
		Child c = new Child();
		Child2 c2 = new Child2();

		// 상속관계에서 형변환 - 다형성
		Child c3 = new Child();
		Parent p3 = new Parent();

		p3 = c3;
		p3 = new Child();

		c3 = (Child) p3; // downcasting, 명시적 형변환 필요

		// 상속 관계에서 부모 / 자식 클래스 여부 확인
		Son son = new Son();
		System.out.println(c instanceof Parent);
	}
}

class Parent {
	protected String name;

	public Parent() {
		System.out.println("parent의 생성자");
	}

	public String sayName() {
		return name;
	}

	public void sayLove(Daughter d) { // 딸만
		System.out.println("사랑한다, 딸아!");
	}

	public void sayLove(Son s) { // 아들만
		System.out.println("사랑한다, 아들아!");
	}

	public void sayLove(Parent p) { // 둘다(다형성이 좋은 이유)
		System.out.println("사랑한다, 아이들아!");
	}

}

class Child extends Parent {
	protected String name;

	public Child() {
		// super(); // 컴파일러가 자동으로 추가해 줌
		super.name = "1"; // Parent의 name
		this.name = "2"; // Child의 ame
		super.sayName();
		System.out.println("child의 생성자");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}

class Parent2 {
	protected String name;

	public Parent2(String name) {
		System.out.println("parent()/ " + name);
	}
}

class Child2 extends Parent2 {
	public Child2() {
		// super();
		super("혜교");
	}
}

final class Daughter extends Parent { // 상속되지 않는 클래스 선언(by final)
}

final class Son extends Parent { // 상속되지 않는 클래스 선언(by final)
}

// class GrandSon extends Son {
// } // final로 인해 상속 불가