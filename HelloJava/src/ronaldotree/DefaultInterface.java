package ronaldotree;

public class DefaultInterface {
	public static void main(String[] args) {
		// 인터페이스의 업캐스팅
		SportCar sc = new SportCar();
		sc.move();
		sc.openRoof();

		// Movable isc = new Movable();
		Movable isc = new SportCar();
		isc.move();
		// isc.openRoof(); // SportCar에만 존재

		// 다운캐스팅
		SportCar spc = (SportCar) isc; // 형변환 (int) 같은것
		spc.openRoof();
	}
}

interface A {
	void sayHello();

	// void sayHello(String msg);
	default void sayHello(String msg) {
	}
	// default 매서드 - JDK8부터 지원
}

class X implements A { // 매개변수 매서드는 구현하고 싶지 않으면? default 매서드
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
	}
}

class Y implements A {
	@Override
	public void sayHello() {
	}

	@Override
	public void sayHello(String msg) {
		// TODO Auto-generated method stub
	}
}

// 업캐스팅 예제
interface Movable {
	void move();
}

class SportCar implements Movable {
	public void move() {
	}

	public void openRoof() {
	}
}