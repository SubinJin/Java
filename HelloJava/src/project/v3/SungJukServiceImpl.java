package project.v3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SungJukServiceImpl implements SungJukService {

	private String fpath1 = "c:/Java/sungjuk.txt"; // 파일 입출력
	private String fpath2 = "c:/Java/sungjuk.dat"; // 직렬화

	// 오류 메세지
	private final String FILENOTFOUND = "\n파일이 존재하지 않습니다!\n";
	private final String FILEIOERROR = "\n기타 파일 입출력 오류입니다!\n";
	private final String ANYWAYERROR = "\n그냥 오류입니다!\n";
	private final String WRONGINPUT = "\n잘못 입력하셨습니다!\n\n\n";

	// 성적 데이터를 저장하기 위해 ArrayList 객체 사용
	private List<SungJukVO> sjdb = null;

	public SungJukServiceImpl() {
		// sjdb = initSungJukFromFile();
		sjdb = initSungJukFromSerialized();
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

	@Override
	public void modifySungJuk(SungJukVO sj, int no) {
		if (checkSungJukNo(no, sjdb.size())) {
			System.out.println(WRONGINPUT);
			return;
		}
		processSungJuk(sj);
		sjdb.set(no - 1, sj);
		System.out.println("성적데이터가 수정되었습니다");
	}

	@Override
	public void removeSungJuk(int no) {
		if (checkSungJukNo(no, sjdb.size())) {
			System.out.println(WRONGINPUT);
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

	private boolean checkSungJukNo(int no, int size) {
		boolean isFail = false;
		if (no <= 0 || (no > size)) {
			isFail = true;
		}
		return isFail;
	}

	// 프로그램 시작시 파일에서 직렬화된 성적데이터를 읽어 ArrayList에 저장
	@SuppressWarnings("unchecked")
	private List<SungJukVO> initSungJukFromSerialized() {
		List<SungJukVO> sjdb = new ArrayList<SungJukVO>();
		try (FileInputStream fis = new FileInputStream(fpath2); ObjectInputStream ois = new ObjectInputStream(fis);) {
			sjdb = (List<SungJukVO>) ois.readObject();

		} catch (FileNotFoundException fnfe) {
			System.out.println(FILENOTFOUND);
		} catch (IOException ioe) {
			System.out.println(FILEIOERROR);
		} catch (Exception ex) {
			System.out.println(ANYWAYERROR);
		}
		return sjdb;
	}

	// 프로그램 시작시 파일에서 성적데이터를 읽어 ArrayList에 저장
	private List<SungJukVO> initSungJukFromFile() {
		List<SungJukVO> sjdb = new ArrayList<>();
		try (FileReader fr = new FileReader(fpath1); BufferedReader br = new BufferedReader(fr);
		// 파일에서 데이터를 읽기 위해 파일 / 버퍼 reader 객체 생성
		) {
			while (br.ready()) {
				// 파일에서 버퍼를 읽어올 데이터가 존재하는지 검사
				String[] sjrow = br.readLine().split("/");
				// 버퍼로 한 행을 읽어와서 그것을 "/"로 나눈 후 배열에 저장
				SungJukVO sj = new SungJukVO(sjrow[0], Integer.parseInt(sjrow[1]), Integer.parseInt(sjrow[2]),
						Integer.parseInt(sjrow[3]));
				sj.setTot(Integer.parseInt(sjrow[4]));
				sj.setAvgr(Double.parseDouble(sjrow[4]));
				sj.setGrd(sjrow[4]);

				sjdb.add(sj);
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println(FILENOTFOUND);
		} catch (IOException ioe) {
			System.out.println(FILEIOERROR);
		} catch (Exception ex) {
			System.out.println(ANYWAYERROR);
		}
		return sjdb;
	}

	// 프로그램 종료시 처리해야할 작업 정의
	public void finalize() throws Throwable {
		writeSungJukToSerialized();
		super.finalize();
	}

	// 프로그램 종료시 ArrayList에 저장된 성적 데이터를 파일에 저장
	private void writeSungJukToFile() {
		try (FileWriter fw = new FileWriter(fpath1); BufferedWriter bw = new BufferedWriter(fw);) {
			StringBuffer out = new StringBuffer();

			for (SungJukVO sj : sjdb) {
				out.append(sj.getName()).append("/").append(sj.getKor()).append("/").append(sj.getEng()).append("/")
						.append(sj.getMath()).append("/").append(sj.getTot()).append("/").append(sj.getAvgr())
						.append("/").append(sj.getGrd()).append("/");
				// 성적 데이터 각 항목을 / 로 구분지어 한 행을 만들고 지정한 파일에 그것을 쓴다
				bw.write(out.toString());
				out.setLength(0);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println(FILENOTFOUND);
		} catch (IOException ioe) {
			System.out.println(FILEIOERROR);
		} catch (Exception ex) {
			System.out.println(ANYWAYERROR);
		}
	}
	// writeSungJukToFile

	// 프로그램 종료시 ArrayList에 저장된 성적 데이터를 직렬화 방식으로 파일에 저장
	private void writeSungJukToSerialized() {
		try (FileOutputStream fos = new FileOutputStream(fpath2); ObjectOutputStream oos = new ObjectOutputStream(fos);
		// 직렬화를 이용하기 위해 output 스트림 객체 생성
		) {
			oos.writeObject(sjdb);
		} catch (FileNotFoundException fnfe) {
			System.out.println(FILENOTFOUND);
		} catch (IOException ioe) {
			System.out.println(FILEIOERROR);
		} catch (Exception ex) {
			System.out.println(ANYWAYERROR);
		}
	}
}