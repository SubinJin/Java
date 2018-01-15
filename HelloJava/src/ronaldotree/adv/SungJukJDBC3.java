package ronaldotree.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

// insert
public class SungJukJDBC3 {
	public static void main(String[] args) {
		// 오라클 접속 정보 설정
		String DRV = "oracle.jdbc.driver.OracleDriver";
		String URL = "jdbc:oracle:thin:@192.168.31.128:1521:xe";
		String USR = "ronaldotree";
		String PWD = "123456";

		// JDBC 관련 객체 선언
		Connection conn = null; // DB 연결
		PreparedStatement pstmt = null; // DB SQL문 MemberJDBC와 달라진 점!!!!
		ResultSet rs = null; // select 결과 처리

		// SQL 관련 변수 선언
		String selectSQL = "select sjno, name, kor, eng, math, regdate from sungjuk order by sjno desc";
		String selectOneSQL = "select * from sungjuk where sjno = ? ";
		String insertSQL = "insert into sungjuk (sjno, name, kor, eng, math, tot, avrg, grd)"
				+ "values (sjno.nextval, ?, ?, ?, ?, ?, ?, ?)";
		String updateSQL = null;
		String deleteSQL = null;

		Scanner sc = new Scanner(System.in); // selectOneSQL의 ?를 받아 보자
		System.out.println("추가할 학생 이름, 국어, 영어, 수학 점수를 순서대로 입력하세요");

		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();

		// 총점, 평균, 학점 처리 코드
		int tot = kor + eng + math;
		double avg = tot / 3.0;
		String grd = "F";
		switch ((int) (avg / 10)) {
		case 10:
		case 9:
			grd = "A";
			break;
		case 8:
			grd = "B";
			break;
		case 7:
			grd = "C";
			break;
		case 6:
			grd = "D";
			break;
		}

		// try - catch
		try {
			// 1.
			Class.forName(DRV);
			// 2.
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3.
			pstmt = conn.prepareStatement(insertSQL);
			pstmt.setString(1, name);
			pstmt.setInt(2, kor);
			pstmt.setInt(3, eng);
			pstmt.setInt(4, math);
			pstmt.setInt(5, tot);
			pstmt.setDouble(6, avg);
			pstmt.setString(7, grd);
			// 4.
			int cnt = pstmt.executeUpdate(); // insert, update, delete
			System.out.println(cnt + "건의 데이터가 추가되었습니다!");

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (Exception ex) {

			}
			try {
				pstmt.close();
			} catch (Exception ex) {

			}
			try {
				conn.close();
			} catch (Exception ex) {

			}
		}
	}
}