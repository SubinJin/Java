package project.v2;

import java.util.ArrayList;
import java.util.List;

public class SungJukServiceImpl implements SungJukService {
	// 성적 데이터를 저장하기 위해 ArrayList 객체 사용
	private List<SungJukVO> sjdb = null;

	public SungJukServiceImpl() {
		sjdb = new ArrayList<>();
	}

	@Override
	public void addSungJuk(SungJukVO sj) {
		processSungJuk(sj); // 성적 처리 -총점, 평균, 학점 (요런식으로..)
		sjdb.add(sj);
		System.out.println("새로운 성적데이터가 추가되었습니다");
	}

	@Override
	public String getSungJuk() {
		StringBuffer sb = new StringBuffer();
		String fmt = "%s %d %d %d \n"; // 일부만 출력하려고 하는 것이기 때문에 toString 안쓰고 다시 짠다
		for (SungJukVO sj : sjdb) {
			sb.append(String.format(fmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMath()));
		}
		return sb.toString();
	}

	@Override
	public String getSungJuk(int no) {
		if (checkSungJukNo(no, sjdb.size()))
			return "\n 잘못된 값 입력!";
		SungJukVO sj = sjdb.get(no - 1);

		StringBuilder sb = new StringBuilder();
		sb.append(String.format("\n\n%d : %s %d %d %d %d %.1f %s", no, sj.getName(), sj.getKor(), sj.getEng(),
				sj.getMath(), sj.getTot(), sj.getAvgr(), sj.getGrd()));
		return sb.toString();
	}

	private boolean checkSungJukNo(int no, int size) {
		boolean isFail = false;
		if (no <= 0 || (no > size)) {
			isFail = true;
		}
		return isFail;
	}

	@Override
	public void modifySungJuk(SungJukVO sj, int no) {
		if (checkSungJukNo(no, sjdb.size())) {
			System.out.println("\n 잘못 입력하셨습니다! \n");
			return;
		}
		processSungJuk(sj);
		sjdb.set(no - 1, sj);
		System.out.println("성적데이터가 수정되었습니다");
	}

	@Override
	public void removeSungJuk(int no) {
		if (checkSungJukNo(no, sjdb.size())) {
			System.out.println("\n 잘못 입력하셨습니다! \n");
			return;
		}
		sjdb.remove(no - 1);
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