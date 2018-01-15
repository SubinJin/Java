package ronaldotree.lab;

public class ZipcodeVO {
	// 멤버변수
	private int postcode;
	private String sd;
	private String sgg;
	private String em;
	private String roadname;
	private int mainbdnum;
	private int subbdnum;
	private String sggbdname;
	private String bjdname;
	private String lee;
	private int mainjnum;

	// 기본 생성자
	public ZipcodeVO() {
		// TODO Auto-generated constructor stub
	}

	// 매개변수 생성자
	public ZipcodeVO(int postcode, String sd, String sgg, String em, String roadname, int mainbdnum, int subbdnum,
			String sggbdname, String bjdname, String lee, int mainjnum) {
		super();
		this.postcode = postcode;
		this.sd = sd;
		this.sgg = sgg;
		this.em = em;
		this.roadname = roadname;
		this.mainbdnum = mainbdnum;
		this.subbdnum = subbdnum;
		this.sggbdname = sggbdname;
		this.bjdname = bjdname;
		this.lee = lee;
		this.mainjnum = mainjnum;
	}

	// getter / setter
	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public String getSd() {
		return sd;
	}

	public void setSd(String sd) {
		this.sd = sd;
	}

	public String getSgg() {
		return sgg;
	}

	public void setSgg(String sgg) {
		this.sgg = sgg;
	}

	public String getEm() {
		return em;
	}

	public void setEm(String em) {
		this.em = em;
	}

	public String getRoadname() {
		return roadname;
	}

	public void setRoadname(String roadname) {
		this.roadname = roadname;
	}

	public int getMainbdnum() {
		return mainbdnum;
	}

	public void setMainbdnum(int mainbdnum) {
		this.mainbdnum = mainbdnum;
	}

	public int getSubbdnum() {
		return subbdnum;
	}

	public void setSubbdnum(int subbdnum) {
		this.subbdnum = subbdnum;
	}

	public String getSggbdname() {
		return sggbdname;
	}

	public void setSggbdname(String sggbdname) {
		this.sggbdname = sggbdname;
	}

	public String getBjdname() {
		return bjdname;
	}

	public void setbjdname(String bjdname) {
		this.bjdname = bjdname;
	}

	public String getLee() {
		return lee;
	}

	public void setLee(String lee) {
		this.lee = lee;
	}

	public int getMainjnum() {
		return mainjnum;
	}

	public void setMainjnum(int mainjnum) {
		this.mainjnum = mainjnum;
	}

	// toString
	@Override
	public String toString() {
		return "ZipcodeVO [우편번호 =" + postcode + ", 시도 =" + sd + ", 시군구 =" + sgg + ", 읍면 =" + em + ", 도로명 =" + roadname
				+ ", 건물번호본번 =" + mainbdnum + ", 건물번호부번 =" + subbdnum + ", 시군구용건물명 =" + sggbdname + ", 법정동명 =" + bjdname
				+ ", 리명 =" + lee + ", 지번본번=" + mainjnum + "]";
	}
}
