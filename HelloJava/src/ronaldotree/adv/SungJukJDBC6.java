package ronaldotree.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import project.v1.SungJukVO;

// selectSQL
public class SungJukJDBC6 {
	public static void main(String[] args) {
		// 성적처리 JDBC
		// ResourceBundle을 이용해서 JDBC 관련정보를 특정파일에서 키=값 형태로 읽어서 처리
		String rbPath = "ronaldotree.adv.oracle"; // 리소스 파일경로 지정 : 패키지.파일명(.properties 제외)

		// 오라클 접속 정보 설정
		String DRV = null;
		String URL = null;
		String USR = null;
		String PWD = null;

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
			// 0. 접속정보를 리소스번들로부터 읽어오기
			ResourceBundle rb = ResourceBundle.getBundle(rbPath);
			DRV = rb.getString("DRV");
			URL = rb.getString("URL");
			USR = rb.getString("USR");
			PWD = rb.getString("PWD");
			// 1.
			Class.forName(DRV);
			// 2.
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3.
			pstmt = conn.prepareStatement(selectSQL);
			// 4.
			rs = pstmt.executeQuery();
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