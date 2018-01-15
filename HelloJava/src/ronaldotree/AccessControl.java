package ronaldotree;

public class AccessControl {
	public static void main(String[] args) {
		// default class 접근 제한자 테스트
		// Animal 클래스는 default 접근제어중, 같은 패키지에 존재하는 AccessControl 클래스에서 접근 가능
		// 클래스에는 default, public 접근 제어만 부여가능!
		Animal lion;
		lion = new Animal();
		lion.name = "심바";

		// 멤버변수 접근제어 테스트
		DefaultClass dc = new DefaultClass();
		dc.name = "123";
		dc.age = 123;
		dc.email = "jeensb0705@naver.com";
		// dc.regdate = "2017-12-18"; // private으로 감춰져 있기 때문에 보이지 않음

		dc.setRegdate("12017-12-15"); // setter
		// System.out.println(dc.regdate);
		System.out.println(dc.getRegdate());

		// 객체의 생성값 확인
		DefaultClass dc1 = new DefaultClass();
		System.out.println(dc1);

		dc1 = new DefaultClass();
		System.out.println(dc1);

		dc1 = new DefaultClass();
		System.out.println(dc1);
	}
}

class DefaultClass {
	String name; // defualt
	protected int age; // protected
	public String email; // public
	private String regdate; // private 얘는 DefaultClass 밖으로 나가면 보이지 않음

	// private으로 선언된 멤버변수를 외부 클래스에서 접근하게 하려면 setter/getter 매서드를 사용
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getRegdate() {
		return regdate;
	}

}