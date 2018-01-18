package ronaldotree.model;

public class SungJukVO {
	// 멤버 변수
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot = kor + eng + mat;
	private double avgr = tot / 3.0;
	private String grd;

	// 기본 생성자
	public SungJukVO() {
		// TODO Auto-generated constructor stub
	}

	// 매개변수 생성자
	public SungJukVO(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// setter / getter
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

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
//		tot = this.kor + this.eng + this.mat;
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvgr() {
//		avgr = (double)tot / 3;
		return avgr;
	}

	public void setAvgr(double avgr) {
		this.avgr = avgr;
	}

	public String getGrd() {
//		String grd = "F";
//		switch((int)avgr/10){
//			case 10 : case 9 : grd = "A";
//			break;
//			case 8 : grd = "B";
//			break;
//			case 7 : grd = "C";
//			break;
//			case 6 : grd = "D";
//			break;
//		}
		return grd;
	}

	public void setGrd(String grd) {
		this.grd = grd;
	}

	// toString
	@Override
	public String toString() {
		String fmt = "SungJukVO [name=%s, kor=%d, eng=%d, mat=%d, tot=%d, avgr=%.1f, grd=%s]";
		return String.format(fmt, name, kor, eng, mat, tot, avgr, grd);
	};
}