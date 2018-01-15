package ronaldotree.lab;

public class SungJukVO {

	// VO 클래스 - value object
	// 값만 저장하는 특수한 클래스

	// 멤버변수(private으로 선언!)
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot = kor + eng + math;
	private double avgr = tot / 3.0;
	private String grd;

	// 기본 생성자
	public SungJukVO() {
		// TODO Auto-generated constructor stub
	}

	// 매개변수 생성자
	public SungJukVO(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// stter/getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvgr() {
		return avgr;
	}

	public void setAvgr(double avgr) {
		this.avgr = avgr;
	}

	public String getGrd() {
		return grd;
	}

	public void setGrd(String grd) {
		this.grd = grd;
	}

	// toString
	@Override
	public String toString() {
		return "SungJukVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot
				+ ", avgr=" + avgr + ", grd=" + grd + "]";
	}

}
