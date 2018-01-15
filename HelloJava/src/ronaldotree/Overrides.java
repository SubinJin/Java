package ronaldotree;

public class Overrides { // 이름을 override로 하면 안된다고 한다
	public static void main(String[] args) {

	}
}

class SungJuk2 {
	protected String name;
	protected int kor;
	protected int eng;
	protected int mat;

	public int getTotal() {
		int tot = kor + eng + mat;
		return tot;
	}

	public double getAverage() {
		// return getTotal()/3.0;
		double avg = (kor + eng + mat) / 3.0;
		return avg;
	}

	public String getGrade() {
		String grd = "가";
		// switch((int) (getAverage()/10)) {
		double avg = (kor + eng + mat) / 3.0;
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grd = "수";
			break;
		case 8:
			grd = "우";
			break;
		case 7:
			grd = "미";
			break;
		case 6:
			grd = "양";
			break;
		}
		return grd;
	}

}

class MidSungJuk2 extends SungJuk2 {
	protected int sci;
	protected int art;

	@Override // 매서드 재정의
	public int getTotal() {
		// int tot = kor + eng + mat + sci + art;
		int tot = super.getTotal() + sci + art; // 부모 클래스 매서드 + a 항상 이용할 수 있는 것은 아니다
		return tot;
	}

	@Override
	public double getAverage() {
		double avg = getTotal() / 5.0; // 예를 들면 이런 것은 부모 클래스의 매서드를 가져와도 별 의미 없음
		return avg;
	}

	@Override
	public String getGrade() { // 마찬가지로 딱히 가져올 것이 없음
		String grd = "가";
		double avg = getAverage();
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grd = "수";
			break;
		case 8:
			grd = "우";
			break;
		case 7:
			grd = "미";
			break;
		case 6:
			grd = "양";
			break;
		}
		return grd;
	}
}