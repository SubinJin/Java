package ronaldotree.adv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import project.v1.SungJukVO;

public class ArrayLists {
	public static void main(String[] args) {
		// 배열
		int[] intArray = new int[5];
		intArray[0] = 1;
		intArray[1] = 2;

		// 컬렉션 프레임 워크
		// 동일한 자료형의 여러 객체의 묶음을 손쉽게 다루게 해줌
		// List : 순차 구조, 순서 있는 객체르 다룸 / 중복 허용
		List list = new ArrayList();
		list.add("혜교");
		list.add(94);
		list.add(123.456);
		list.add(true);
		list.add(new SungJukVO());

		for (int i = 0; i < 5; ++i)
			System.out.println(list.get(i));

		// ArrayList에 저장된 내용들은 Object형이기 때문에 그것얼 get해서 각 변수에 저장하려 할 때 불필요한 형변환이 발생
		// 이 문제를 해결하기 위해 jdk 5.0에서 Generics을 도입
		String name = (String) list.get(0);
		int score = (int) list.get(1);
		double d = (double) list.get(2);
		boolean b = (boolean) list.get(3);
		SungJukVO sj = (SungJukVO) list.get(4);

		// Generics
		// 컬렉션을 선언할 때 어떤 종류의 객체를 저장할지 미리 결정해야 하는데 그것을 <> 기호로 정의
		List cage1 = new ArrayList();
		cage1.add(new Tiger());
		cage1.add(new Zebra());
		cage1.add(new Lion());

		Tiger t = (Tiger) cage1.get(0);
		Zebra z = (Zebra) cage1.get(1);
		Lion l = (Lion) cage1.get(2);

		List<Tiger> cage2 = new ArrayList<Tiger>();
		List<Zebra> cage3 = new ArrayList<>(); // 뒤는 생략 가능
		List<Lion> cage4 = new ArrayList<>();

		cage2.add(new Tiger());
		t = cage2.get(0); // 형변환 안해도 됩니다
		// cage2.add(New Zebra()); 하지만 다른 동물은 못들어감

		// ArrayList의 CRUD
		List<String> names = new ArrayList<>();
		// 추가 : add
		names.add("혜교");
		names.add("지현");
		names.add("수지");
		// 조회 : get
		// 1. for문
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		// 2. 향상된 for문(names 다 뽑을 때까지 돌아감
		for (String val : names) {
			System.out.println(val);
		}

		// 3. Iterator
		// 순환자를 이용하여 컬렉션의 모든 요소를 출력
		// 컬렉션 클래스로 선언된 요소들을 하나씩 읽어오기 위한 표준화된 방식을 제공 - 속도 느림
		// hasNext : 컬렉션에 요소가 존재하는지 여부 검사
		// next : 요소를 읽어올 수 있는지 여부 검사
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String val = it.next();
			System.out.println(val);
		}

		// 검색 : indexOf(값)
		int pos = names.indexOf("수지"); // 수지의 위치
		System.out.println(pos);

		// 갯수 : size
		System.out.println(names.size());

		// 삭제 : remove
		names.remove(2); // 3번째(0, 1, 2니까) 데이터 삭제
		System.out.println(names.size());

		// 수정 : set
		names.set(0, "중기");
		System.out.println(names.get(0));

		// 모두 제거 : clear
		names.clear();
		System.out.println(names.size());
	}
}

class Tiger {
}

class Zebra {
}

class Lion {
}
