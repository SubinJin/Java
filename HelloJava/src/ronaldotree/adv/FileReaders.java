package ronaldotree.adv;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaders {
	public static void main(String[] args) {
		// 파일 입출력 - 문자 기반 스트림
		// 파일 읽기 테스트 - 파일에 저장된 내용을 읽어서 화면에 출력

		FileReader fr = null;
		BufferedReader br = null;
		String fpath = "c:/Java/data01.txt";
		try {
			fr = new FileReader(fpath);
			// 지정한 경로상의 파일을 읽기 위해 읽기스트림 생성

			br = new BufferedReader(fr);
			// 버퍼 기능이 있는 reader 클래스 선언

			// while (fr.ready()) { // 스트림에서 읽을 문자가 있는지 검사
			while (br.ready()) { // 스트림에서 읽을 문자가 있는지 검사
				// System.out.print((char) fr.read());
				// 파일에서 한 문자씩 읽어서 화면에 출력(char 형변환)
				System.out.print(br.readLine());
				// 파일에서 한 행씩 읽어서 화면에 출력
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e) {
			} // 상당히 귀찮
		}
	}
}