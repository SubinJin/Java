package ronaldotree;

import ronaldotree.lab.SungJukVO;

public class Classes {
	public static void main(String[] args) {
		Animal tiger = new Animal();
		tiger.name = "호돌이";
		tiger.weight = 100;
		tiger.type = "호랑이";
		tiger.gender = "수";

		tiger.move();
		tiger.eat();

		System.out.println(tiger.name);
		System.out.println(tiger.type);
		System.out.println(tiger.gender);
		System.out.println(tiger.weight);

		// shark
		Animal shark = new Animal();
		shark.name = "김상어";
		shark.weight = 90;
		shark.type = "상어";
		shark.gender = "암";
		shark.move();
		shark.eat();

		System.out.println(shark.name);
		System.out.println(shark.type);
		System.out.println(shark.gender);
		System.out.println(shark.weight);

		// eagle
		Animal eagle = new Animal();
		eagle.name = "김수리" + "";
		eagle.weight = 60;
		eagle.type = "독수리" + "";
		eagle.gender = "수";

		eagle.move();
		eagle.eat();

		Animal tiger2 = new Animal(); // tiger2를 선언하지 않아도 class에서 지정한 값으로 자동 초기화
		System.out.println(tiger2.name);
		System.out.println(tiger2.type);
		System.out.println(tiger2.gender);
		System.out.println(tiger2.weight);

		// cat
		Animal cat = new Animal();
		System.out.println(cat.name);
		System.out.println(cat.type);

		cat = new Animal("고순이", 5, "암", "고양이"); // 매개변수 있는 생성자로 만드는게 편하다
		System.out.println(cat.name);
		System.out.println(cat.type);

		System.out.println(eagle.name);
		System.out.println(eagle.type);
		System.out.println(eagle.gender);
		System.out.println(eagle.weight);

		// 회원가입
		Member m = new Member("zzyzzy", "987654", "혜교", "jeensb0705@naver.com", "2017-12-15");

		// SungJukVO 클래스 이용학
		SungJukVO sj = new SungJukVO("혜교", 98, 89, 90);
		System.out.printf("%s %d %d %d \n", sj.getName(), sj.getKor(), sj.getEng(), sj.getMath()); // private으로 감춰져 있기
																									// 때문에
																									// getXX를 사용한다
		System.out.println(sj);
	}
}

// 클래스 - 객체를 만들기 위한 틀, 설계도
class Animal { // 동물 클래스
	// 필드(멤버 변수)
	String name;
	int weight;
	String gender;
	String type;

	// Animal() { // (매개변수 parameter 없는) 생성자 - 괄호 안이 비어있음
	// name = "호순이";
	// type = "호랑이";
	// gender = "암";
	// weight = 120;
	// }

	// Animal(String name, int weight, String gender, String type) { // 매개변수 있는 생성자
	// this.name = name; // 이름이 같아서 shadowing 되는 것을 막기 위해 this.을 붙인다
	// this.weight = weight;
	// this.gender = gender;
	// this.type = type;
	// }

	// 기본 생성자
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	// 매개변수 있는 생성자
	public Animal(String name, int weight, String gender, String type) { // source - generate constructor using fields
		// super();
		this.name = name;
		this.weight = weight;
		this.gender = gender;
		this.type = type;
	}

	// 메서드
	void move() {
		System.out.println(name + "가 움직였다");
	}

	void eat() {
		System.out.println(name + "가 먹이를 먹었다");
	}

	// setter/getter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}

class Car {
	String name; // 참조 자료형
	int size; // 기본 자료형
	// 클래스를 클래스의 멤버변수로 사용 가능
	Engine engine;
	Door door;
	Wheel wheel;
}

class Engine {
}

class Door {
}

class Wheel {
}

class Member {
	String userid;
	String passwd;
	String name;
	String email;
	String regdate;

	// 기본 생성자
	public Member() {
	}

	// 매개변수 있는 생성자
	public Member(String userid, String passwd, String name, String email, String regdate) {
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
		this.regdate = regdate;
	}

}