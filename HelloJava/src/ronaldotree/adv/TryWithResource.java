package ronaldotree.adv;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResource {
	public static void main(String[] args) {
		// try-with-resources 구문
		// 파일 입출력 관련 코드 작성시 예외처리코드를 다루기 불편한 상황 발생(특히 finally 블럭)
		// 이런 경우 try-with-resources 구문을 사용하면 예외처리를 간편하게 할 수 있고 finally 블럭 문제도 해결
		// close 메서드가 AutoClosable 인터페이스를 구현했기 때문에 가능

		String fpath = "c:/Java/data01.txt";
		try (FileReader fr = new FileReader(fpath); // 지정한 경로상의 파일을 읽기 위해 읽기스트림 생성
				BufferedReader br = new BufferedReader(fr); // 버퍼 기능이 있는 reader 클래스 선언
		) {

			// while (fr.ready()) { // 스트림에서 읽을 문자가 있는지 검사
			while (br.ready()) { // 스트림에서 읽을 문자가 있는지 검사
				// System.out.print((char) fr.read());
				// 파일에서 한 문자씩 읽어서 화면에 출력(char 형변환)
				System.out.println(br.readLine());
				// 파일에서 한 행씩 읽어서 화면에 출력
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} // 상당히 귀찮았던 try - catch 생략가능
	}
}
