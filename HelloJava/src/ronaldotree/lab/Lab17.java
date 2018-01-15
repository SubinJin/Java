package ronaldotree.lab;
// 다형성 예제 7-21

class Product {
	int price;
	int bonusPoint;

	Product(int price) { // 기본 생성자
		this.price = price; // 가격 저장
		bonusPoint = (int) (price / 10.0); // 보너스 포인트 저장
	}
}

class Television extends Product {
	Television() {
		super(100); // 부모 클래스 가져옴 - 가격 = 100
	}

	public String toString() {
		return "Tv"; // tv의 return은 tv임..
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}

public class Lab17 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Television());
		b.buy(new Computer());

		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
	}
}