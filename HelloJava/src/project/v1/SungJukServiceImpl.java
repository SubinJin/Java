package project.v1;

public class SungJukServiceImpl implements SungJukService {

	@Override
	public void addSungJuk(SungJukVO sj) {
		processSungJuk(sj); // 성적 처리 -총점, 평균, 학점 (요런식으로..)
		System.out.println("새로운 성적데이터가 추가되었습니다");
	}

	@Override
	public String getSungJuk() {
		String out = "성적 데이터를 출력합니다";
		return out;
	}

	@Override
	public String getSungJuk(String name) {
		return name;
	}

	@Override
	public void modifySungJuk(SungJukVO sj) {
		System.out.println("성적데이터가 수정되었습니다");
	}

	@Override
	public void removeSungJuk(String name) {
		System.out.println("성적데이터가 제거되었습니다");
	}

	private void processSungJuk(SungJukVO sj) { // 내부적으로 처리하는 코드이므로 private으로 선언
		int tot = sj.getKor() + sj.getEng() + sj.getMath();
		double avg = (double) tot / 3;
		String grd = "가";
		switch ((int) avg / 10) {
		}

		sj.setTot(tot);
		sj.setAvgr(avg);
		sj.setGrd(grd);
	}
}