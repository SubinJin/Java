package ronaldotree;

public class Method {
	public static void main(String[] args) {

		; // 빈 문장도 적법
		{ // 블럭 시작
			// 지역 변수 : 블럭 안에서 선언하여 블럭 안에서만 유효한 변수
			// 변수의 유효범위 scope
			String name = "혜교";
			int kor = 89;
			{
				// String name = "혜교"; // 위의 name이 위에서 선언되어서 안에서 또 쓸 수 있기 때문에 안됨(선언이 위에서 되었는지
				// 아래에서 되었는지도 중요함)
			}
		} // 블럭 끝
		String name = "혜교";
		// name = "지현"; // 블럭 밖으로 나왔기 때문에 오류(새로 선언은 가능함)
		// 메서드 : 어떤 기능을 하는 문장들을 블럭으로 정의하고 그것에 이름을 붙인 것
		// 가독성과 코드 재사용성을 높이기 위해 사용
		// 접근 수정자 변환값 메서드 이름
		int a = 3, b = 4;
		int c = add(a, b);

		a = 10;
		b = 15;
		c = add(a, b);

		// 클래스 / 인스턴스 변수
		System.out.println(Cars.count);

		Cars 스포츠카 = new Cars(); // 인스턴스 변수는 반드시 new 연산자를 통해 객체를 만들어야 한다
		스포츠카.name = "페라리";
		스포츠카.type = "스포츠";
		// ++스포츠카.count;
		System.out.println(++스포츠카.count);
		System.out.println(++Cars.count);
		스포츠카.printCarinfo();

		Cars 트럭 = new Cars();
		++트럭.count;
		System.out.println(Cars.count);
		트럭.printCarinfo();

	} // main

	public static int add(int a, int b) {
		int result = a + b;

		return a + b;
	}
}

class Cars {
	String name; // 인스턴스 변수
	String type; // 인스턴스 변수
	static int count; // 클래스 변수

	public void printCarinfo() { // 주로 동사형으로 씀
		System.out.println(name + "/" + count);
	}

	public static void showName() {
		// 멤버변수 name을 출력하기 위해 showName 메서드 작성 but showName 메서드는 static 이므로 멤버변수는 사용불가
		System.out.println(count); // static으로 선언되어 잇음
		// System.out.println(name); // 인스턴스 임 - 사용불가
	}
}