package ronaldotree.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import project.v1.SungJukVO;

// selectSQL
public class SungJukJDBC {
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
		String updateSQL = null;
		String deleteSQL = null;

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
			// 5. append 사용
			StringBuffer out = new StringBuffer();
			while (rs.next()) {
				out.append(rs.getString("sjno")).append("\t").append(rs.getString("name")).append("\t")
						.append(rs.getString("kor")).append("\t").append(rs.getString("eng")).append("\t")
						.append(rs.getString("math")).append("\t").append(rs.getString("regdate")).append("\n");
			}
			System.out.println(out.toString());
			// 5. ArrayList 사용
			List<SungJukVO> sjlist = new ArrayList<>();
			while (rs.next()) {
				SungJukVO sj = new SungJukVO();
				sj.setName(rs.getString("name"));
				sj.setKor(rs.getInt("kor"));
				sj.setEng(rs.getInt("eng"));
				sj.setMath(rs.getInt("math"));
				sjlist.add(sj);
			}

			for (SungJukVO sj : sjlist) {
				System.out.println(sj);
			}

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