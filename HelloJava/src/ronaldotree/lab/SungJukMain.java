package ronaldotree.lab;

public class SungJukMain {
	public static void main(String[] args) {
		// 학생 데이터 생성
		SungJukVO 혜교 = new SungJukVO("혜교", 98, 97, 98);
		// 성적 처리
		SungJukService sjsrv = new SungJukService();

		// Data 수만큼 인수로 전달하는 것은 비효율적
		// int tot = sjsrv.getTotal(혜교.getKor(), 혜교.getEng(), 혜교.getMath());
		// 매서드 다중정의를 통해 새로운 유형의 getTotal 매서드 작성
		int tot = sjsrv.getTotal(혜교);

		double avg = sjsrv.getAverage();
		String grd = sjsrv.getGrade();

		혜교.setTot(tot);
		혜교.setAvgr(avg);
		혜교.setGrd(grd);
		// 결과 출력
		System.out.println(혜교);
	}
}
