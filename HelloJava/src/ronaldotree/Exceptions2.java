package ronaldotree;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions2 {
	public static void main(String[] args) {
		// 예외처리 2 - multi catch 블럭
		// 각각의 코드에 try-catch를 사용하는 것 보다 하나의 try-catch 블럭을 사용하고 여러개의 catch문으로 예외를 처리하는 것이
		// 효율적
		try {
			int[] intArray = { 9, 8, 7, 6, 5 };
			System.out.println(intArray[5]);
			int x = 1000 / 0;
			FileReader fr = new FileReader("");
			DriverManager.getConnection("");
			// } catch(Exception ex) {
			// System.out.println("예상치 못한 예외 발생!"); // Exception을 맨 위에 쓰면 아래는 무의미한 코드가 되면서
			// 에러(오류날 정도인가 싶음) - 맨 아래에 쓸 것
		} catch (ArrayIndexOutOfBoundsException aiob) {
			System.out.println("잘못 된 배열 사용!");
		} catch (ArithmeticException ae) {
			System.out.println("잘못 된 수식 사용!");
		} catch (FileNotFoundException ffe) {
			System.out.println("잘못 된 파일 경로 사용!");
		} catch (SQLException se) {
			System.out.println("잘못 된 DB 서버 구조 사용!");
		} catch (Exception ex) {
			System.out.println("예상치 못한 오류 발생!");
		}
		// 예외 던지기 - throws
		MakeException me = new MakeException();
		try {
			me.exception1();
			me.exception2();
			me.exception3();
		} catch (ArrayIndexOutOfBoundsException aioe) {
			System.out.println("잘못된 배열 사용");
		} catch (ArithmeticException ae) {
			System.out.println("잘못된 수식 사용");
		} catch (InputMismatchException ime) {
			System.out.println("숫자만 입력 가능");
		}

		// finally 블럭
		// 오류가 발생해서 예외처리시 나머지 코드를 실행하지 않고 넘어감
		// 이런 코드들 중 반드시 실행히야 할 경우 finally 블럭에 작성하면 됨
		try {
			// 데이터베이스 서버 연결
			// SQL 처리 및 기타작업
		} catch (Exception ex) {
			System.out.println("예외처리함");
		} finally {
			// 데이터 베이스 서버 연결 끊음
		}
	}
}

class MakeException {
	public void exception1() throws ArrayIndexOutOfBoundsException {
		int[] intArray = { 9, 8, 7, 6, 5 };
		System.out.println(intArray[5]);
	}

	public void exception2() throws ArithmeticException {
		int x = 1000 / 0;
	}

	public void exception3() throws InputMismatchException {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
	}
}