package ronaldotree.lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ZipcodeJDBC {
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

		// SQL 관련변수 선언
		String selectSQL = "select 우편번호, 시도, 시군구, 읍면, 도로명, 건물번호본번 from zipcode_seoul order by 우편번호 desc";

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
			List<ZipcodeVO> zclist = new ArrayList<>();
			while (rs.next()) {
				ZipcodeVO zc = new ZipcodeVO();
				zc.setPostcode(rs.getInt("우편번호"));
				zc.setSd(rs.getString("시도"));
				zc.setSgg(rs.getString("시군구"));
				zc.setEm(rs.getString("읍면"));
				zc.setRoadname(rs.getString("도로명"));
				zc.setMainbdnum(rs.getInt("건물번호본번"));
				zclist.add(zc);
			}

			for (ZipcodeVO zc : zclist) {
				System.out.println(zc);
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