package ronaldotree;

import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Exceptions {
	public static void main(String[] args) throws SQLException {
		// 예외처리
		int[] intArray = { 9, 8, 7, 6, 5 };
		System.out.println(intArray[2]);
		// 오류가 발생 할 만한 코드에 try catch 코드를 넣어 주자
		try {
			System.out.println(intArray[5]); // 여기가 오류나면서 그 밑으로도 모두 중단됨 - 이러한 문제를 해결하기 위해 예외처리를 사용함
		} catch (Exception ex) {
			System.out.println("오류 발생!");
			System.out.println(ex.getMessage()); // 출력하는 것이 각각 다름
			// ex.printStackTrace(); // 오류가 몇번째 줄에서 났는지 & 어떤 예외처리를 해야 하는지 보여줌
		}
		// unchecked 예외 - 개발자가 직접 인지하고 예외 처리
		try {
			int x = 1000 / 0;
		} catch (Exception ex) {
			System.out.println("0으로 나눌 수 없습니다");
			System.out.println(ex.getMessage());
		}
		// checked 예외 - 컴파일러가 미리 예외처리에 대한 정보 알림(반드시 예외처리를 해야 함)
		String fpath = "c:\\Java\\abc.dat";
		try {
			FileReader fr = new FileReader(fpath);
		} catch (Exception ex) {
			System.out.println("틀려버림");
		}
		// 예외처리 좋은 예
		Scanner sc = new Scanner(System.in);
		int key = 0;
		while (true) {
			System.out.println("숫자만 입력하세요");
			try {
				key = sc.nextInt();
			} catch (Exception ex) {
				System.out.println("문자는 안됩니다");
				sc = new Scanner(System.in);
				// 무한루프에 빠지는 것을 방지하는 Scanner 초기화

			}
			if (key == 0)
				break;
		}
		sc.close();
		// 데이터 베이스 서버 접속 코드 - checked 예외
		// throws 구문으로 이 메서드를 호출한 상위 메서드로 예외처리를 던짐(처리를 대신 해달라고 떠넘김)
		DriverManager.getConnection(".,.");

		System.out.println("이 글이 보이나요?");
	}
}