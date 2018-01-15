package ronaldotree.adv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriters {
	public static void main(String[] args) throws IOException {
		// 파일 입출력 -문자 기반 스트림
		// 파일 쓰기 테스트
		// 키보드로 입력한 문자를 파일에 저장

		String fpath = "c:/Java/data01.txt";
		// 입력받은 문자를 저장할 파일 위치 지정

		// FileWriter fw = new FileWriter(fpath); 누적 x
		FileWriter fw = new FileWriter(fpath, true); // 누적 o
		// 스트림 생성 - 지정된 경로에 파일을 만들고 입력한 문자를 파일로 저장할 수 있도록 데이터 통로 생성

		BufferedWriter bw = new BufferedWriter(fw);
		// 빠른 입출력 처리를 위해 buffer 기능이 있는 Writer 클래스 사용

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("파일에 저장할 내용을 입력하세요(종료는 q:)");
			String msg = sc.nextLine();

			if (msg.equals("q:")) { // 입력한 문자가 "q:"라면 while문 중지
				break;
			} else {
				fw.write(msg + "\r\n");
				bw.write(msg + "\r\n");
			}
		}

		bw.close(); // 순서 주의(first in, last out)
		fw.close();
		// 파일에 입력한 내용을 완전히 저장하려면 반드시 필요

		sc.close();

	}
}
