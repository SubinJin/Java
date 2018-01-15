package ronaldotree.lab;

public class SungJukService {
	private int tot = 0;
	private double avg = 0.0;
	private String grd = "가";

	// getTotal
	public int getTotal(int kor, int eng, int mat) {
		tot = kor + eng + mat;
		return tot;
	}

	// 객체지향 특성 중 다형성
	public int getTotal(SungJukVO sj) { // 이름이 같아도 서명(내용)이 다르면 다른 걸로 인식함
		tot = sj.getKor() + sj.getEng() + sj.getMath();
		return tot;
	}

	// 또 다른 유형의 getTotal
	// public void getTotal(SungJukVO sj) { //이름도 같고 내용도 다르면 안됩니다
	public void getTotal() {

	}

	// getAverage
	// public double getAverage(int kor, int eng, int mat) {
	// return (kor + eng + mat)/3;
	// }
	public double getAverage() {
		avg = tot / 3;
		return avg;
	}

	// getGrade
	public String getGrade() {
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
		case 5:
			grd = "가";
			break;
		}
		return grd;
	}
	// public static void main(String args[]) {
	// Student s = new Student();
	// 홍길동 s.name = " ";
	// s.ban = 1;
	// s.no = 1;
	// s.kor = 100;
	// s.eng = 60;
	// s.math = 76;
	// 이름 System.out.println(" :"+s.name);
	// 총점 System.out.println(" :"+s.getTotal());
	// 평균 System.out.println(" :"+s.getAverage());
	// }
	// }
	//
	// class Student {
	// /*
	// * 알맞은 코드를 넣어 완성하시오 (1) .
	// */
	// }

}
