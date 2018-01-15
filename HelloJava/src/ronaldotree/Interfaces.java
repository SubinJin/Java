package ronaldotree;

public class Interfaces {
	public static void main(String[] args) {
		// 인터페이스 - 객체화 불가 클래스
		// 인터페이스를 구현한 클래스를 통해 객체화 가능
		// ISungJukService isjsrv = new SungJukService();
		SungJukServiceImpl sjsrv = new SungJukServiceImpl();
		sjsrv.getTotal();
		sjsrv.getAverage();
		sjsrv.getGrade();
		// 추상클래스 객체 생성
		// 클래스에 추상메서드를 포함한 클래스를 의미 - 객체화 불가!
		// AbstractClass ac = new AbstractClass();
		// 추상 클래스의 객체화는 상속을 통해 가능!
		CompleteClass cc = new CompleteClass();

		// 인터페이스 타입 변환(업 / 다운 캐스팅) - 인터페이스의 참조변수로 구현한 클래스의 객체를 할당할 수 있음
		ISungJukService isjsrv = new SungJukServiceImpl();
		sjsrv.getTotal();
		sjsrv.getAverage();
		sjsrv.getGrade();

	}
}

interface ISungJukService { // 앞에 I는 interface를 만들때 관례적으로 붙임
	int TOT = 0;
	double AVG = 0.0; // 인터페이스에서 상수 변수를 선언할 때는 반드시 초기화가 되어야 함

	void getTotal(); // 추상 메서드 - 인터페이스에서는 메서드의 몸체를 쓰지 않고 리턴타입의 여부만 쓴다

	void getAverage();

	void getGrade();
}

class SungJukServiceImpl implements ISungJukService { // Impl은 implement의 약자, implements는 인터페이스에서 상속할 때 extends 대신 사용
	@Override
	public void getTotal() {
		// TODO Auto-generated method stub
	}

	@Override
	public void getAverage() {
		// TODO Auto-generated method stub
	}

	@Override
	public void getGrade() {
		// TODO Auto-generated method stub
	}
}

abstract class AbstractClass { // 추상 클래스

}

class CompleteClass extends AbstractClass { // class는 implements를 쓰면 안됩니다

}

class Unit {
}

interface Fightable {
	void move(int x, int y);

	void attack(Unit u);
} // 미완된 메서드 포함

class Firebat implements Fightable { // 메서드 내용 채워 넣어야 함
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
	}

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
	} // 완전한 메서드 포함
}

// 인터페이스를 구현 하는 중 인터페이스의 모든 추상메서드를 구현할 필요가 없으면 추상클래스로 만들면 됩니다
abstract class Medic implements Fightable { // 미완성인 상태로 둬도 오류가 생기지 않음

} // 일부 완전한 메서드 포함