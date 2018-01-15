package ronaldotree.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// delete(목록을 다 보여준 후 수정할 수 있도록)
public class SungJukJDBC5 {
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
		String selectOneSQL = "select * from sungjuk where sjno = ?";
		String insertSQL = "insert into sungjuk (sjno, name, kor, eng, math, tot, avrg, grd) \n"
				+ "values (sjno.nextval, ?, ?, ?, ?, ?, ?, ?); ";
		String updateSQL = "update sungjuk set name = ?, kor = ?, eng = ?, math = ? where sjno = ?";
		String deleteSQL = "delete from sungjuk where sjno = ?";

		// try - catch
		try {
			// 1.
			Class.forName(DRV);
			// 2.
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3.
			pstmt = conn.prepareStatement(selectSQL);
			// 4.
			rs = pstmt.executeQuery();
			// 5. ArrayList 사용
			List<SungJukVO2> sjlist = new ArrayList<>();
			while (rs.next()) {
				SungJukVO2 sj = new SungJukVO2();
				sj.setSjno(rs.getString("sjno"));
				sj.setName(rs.getString("name"));
				sj.setKor(rs.getInt("kor"));
				sj.setEng(rs.getInt("eng"));
				sj.setMath(rs.getInt("math"));
				sj.setRegdate(rs.getString("regdate").substring(0, 10)); // 날짜 시, 분, 초 빼기 위해 substring 사용
				sjlist.add(sj);
			}

			for (SungJukVO2 sj : sjlist) {
				System.out.println(sj);
			}

			Scanner sc = new Scanner(System.in);
			System.out.println("삭제할 학생 번호를 입력하세요");
			int no = sc.nextInt();

			pstmt = conn.prepareStatement(deleteSQL);
			pstmt.setInt(1, no);

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "건의 데이터 삭제 완료!");

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