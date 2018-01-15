package ronaldotree;

import project.v1.SungJukVO;

public class JavaLang {
	public static void main(String[] args) throws ClassNotFoundException {
		// 정적 방식으로 객체 생성
		// 생성할 객체의 클래스를 직접 기술
		SungJukVO sj = new SungJukVO();
		Parent p = new Parent();
		Son s = new Son();

		// 동적 방식으로 객체 생성
		Class obj1 = new SungJukVO().getClass();
		Class obj2 = SungJukVO.class;
		Class obj3 = Class.forName("project.v1.SungJukVO");

		String[] cls = { "project.v1.SungJukVO", "ronaldotree.Parent", "ronaldotree.Son" };
		Class[] clsBase = new Class[3];
		for (int i = 0; i < 3; ++i) {
			clsBase[i] = Class.forName(cls[i]);
		}

		// 동적으로 생성한 클래스 이름 확인
		System.out.println(clsBase[0].getName());
		System.out.println(clsBase[1].getName());
		System.out.println(clsBase[2].getName());

		// 클래스의 정보를 확인 - reflection

		// 문자열 클래스 -String
		String a = "abc";
		// char[a] ={'a', 'b', 'c'}; 이것과 같다..(String = char을 arr로 이어 붙인 것)
		System.out.println(a);
		a = "xyz";
		System.out.println(a);

		// + 연산자로 문자열 연결시 큰 리소스 낭비 발생
		a = "1" + "2" + "3" + "4" + "5"; // ((((1 + 2) + 3) + 4) + 5)
		// 따라서, StringBuffer를 사용할 것을 추천

	}
}
