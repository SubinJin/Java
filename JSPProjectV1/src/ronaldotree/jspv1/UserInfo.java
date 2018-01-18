package ronaldotree.jspv1;

public class UserInfo {
	// 회원정보를 저장하는 자바빈즈 클래스
	// 자바빈즈 규칙
	// 1. private으로 선언된 멤버변수
	// 2. 생성자
	// 3. setter / getter
	// 아이디(uid), 비밀번호(pwd), 이름(name), 등록일(regdate)
	
	// 멤버변수
	private String uid;
	private String pwd;
	private String name;
	private String regdate;
	
	// 기본 생성자
	public UserInfo() {
		
	}
	
	// 매개변수 생성자
	public UserInfo(String uid, String pwd, String name, String regdate) {
		super();
		this.uid = uid;
		this.pwd = pwd;
		this.name = name;
		this.regdate = regdate;
	}


	// getter / setter
	public String getUid() {
		return uid;
	}


	public void setUid(String uid) {
		this.uid = uid;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRegdate() {
		return regdate;
	}


	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	// toString
	@Override
	public String toString() {
		return "UserInfo [uid=" + uid + ", pwd=" + pwd + ", name=" + name + ", regdate=" + regdate + "]";
	}
	
	
	
	
}
