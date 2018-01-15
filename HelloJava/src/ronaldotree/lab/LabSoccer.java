package ronaldotree.lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class LabSoccer {

	private static String DRV = "oracle.jdbc.driver.OracleDriver";
	private static String URL = "jdbc:oracle:thin:@192.168.31.128:1521:xe";
	private static String USR = "ronaldotree";
	private static String PWD = "123456";

	public static void main(String[] args) {
		// JDBC를 이용한 CRUD 예제
		Connection conn = null; // DB 연결
		PreparedStatement pstmt = null; // DB SQL문 MemberJDBC와 달라진 점!!!!
		ResultSet rs = null; // select 결과 처리

		// 데이터 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("이름/ 팀명/ 연고지/ 포지션/ 백넘버/ 생년월일/ 키/ 몸무게 순으로 입력하세요");
		String scname = sc.nextLine();
		String tmname = sc.nextLine();
		String tmregion = sc.nextLine();
		String tmpos = sc.nextLine();
		int bkno = sc.nextInt();
		String birth = sc.nextLine();
		int height = sc.nextInt();
		int weight = sc.nextInt();

		try {
			// 1. 데이터 베이스 드라이버를 메모리에 올림
			Class.forName(DRV);
			// 2. 지정한 URL로 데이터베이스 서버에 접속
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3. 실행할 SQL문을 생성
			String sql = "insert into Customer values" + "(cno.nextVal, ?, ?, ?, ?, ?, ?, ?, ?)"; // ? : placeHolder
			pstmt = conn.prepareStatement(sql);
			// placeholder에 실제 값 지정
			pstmt.setString(1, scname);
			pstmt.setString(2, tmname);
			pstmt.setString(3, tmregion);
			pstmt.setString(4, tmpos);
			pstmt.setInt(5, bkno);
			pstmt.setString(6, birth);
			pstmt.setInt(7, height);
			pstmt.setInt(8, weight);

			// 4. 작성된 SQL문을 실행
			int cnt = pstmt.executeUpdate(); // cnt로 몇개 실행했는지 세어 보기 위해서 선언
			System.out.println(cnt + "건의 데이터가 추가됨!");

			// 3b. 실행할 SQL문을 생성
			sql = "select * from soccer order by scno desc";
			pstmt = conn.prepareStatement(sql);
			// 4b. 작성된 SQL문을 실행하고 결과 집합 저장
			rs = pstmt.executeQuery(sql);
			// 5b. 결과 집합 처리
			StringBuffer sb = new StringBuffer();
			while (rs.next()) {
				// System.out.print(rs.getString(1) + " ");
				// System.out.print(rs.getString("cname") + " ");
				// System.out.print(rs.getString(3) + " ");
				// System.out.print(rs.getString("addr") + " ");
				// System.out.println(rs.getString(5) + " ");

				sb.append(rs.getString(1)).append(" ").append(rs.getString(2)).append(" ").append(rs.getString(3))
						.append(" ").append(rs.getString(4)).append(" ").append(rs.getString(5)).append("\n");
			}
			System.out.println(sb.toString());

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			// 5. 사용한 객체들을 모두 정리
			try {
				pstmt.close();
			} catch (Exception ex) {

			}
			try {
				rs.close();
			} catch (Exception ex) {

			}
			try {
				conn.close();
			} catch (Exception ex) {

			}
		}
	}
}