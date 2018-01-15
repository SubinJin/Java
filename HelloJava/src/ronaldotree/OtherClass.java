package ronaldotree;

import ronaldotree.lab.SungJukMain;
import ronaldotree.lab.SungJukService;

// import ronaldotree.lab.*;	// 패키지에 있는 모든 클래스를 import, but 진짜로 모두 쓸 것이 아니라면 낭비가 심하고 코드를 알아보기도 힘들기 때문에 비추천

public class OtherClass {
	public static void main(String[] agrs) {
		// 다른 클래스 사용하기
		// 같은 패키지 내 다른 클래스는 별 다른 과정없이 바로 사용 가능
		Overloads l = new Overloads();
		Overrides r = new Overrides();

		// 다른 패키지 클래스 가져오기
		// 해당 클래스가 존재하는 패키지경로를 모두 기술해야만 사용가능
		ronaldotree.lab.SungJukV1 sj = new ronaldotree.lab.SungJukV1();

		// 다른 패키지 클래스 가져오기(스캐너 가져오는 것과 동일)
		// import문을 사용하면 편리하게 다른 패키지 상의 클래스를 가져올 수 있음(개별은 ctrl + space / 동시에 할 때는 ctrl +
		// shift + o 로 import)
		SungJukService sjsrv = new SungJukService();
		SungJukMain sjm = new SungJukMain();

		//
	}
}
