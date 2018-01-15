package ronaldotree.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import project.v1.SungJukVO;

// selectOneSQL
public class SungJukJDBC2 {
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
		String insertSQL = "insert into sungjuk (sjno, name, kor, eng, math, tot, avrg, grd) \n"
				+ "values (sjno.nextval, ?, ?, ?, ?, ?, ?, ?); ";
		String updateSQL = null;
		String deleteSQL = null;

		Scanner sc = new Scanner(System.in); // selectOneSQL의 ?를 받아 보자
		System.out.println("조회할 학생번호를 입력하세요");
		int no = sc.nextInt();

		// try - catch
		try {
			// 1.
			Class.forName(DRV);
			// 2.
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3.
			pstmt = conn.prepareStatement(selectOneSQL);
			pstmt.setInt(1, no); // selectOneSQL의 ? 자리에 실제로 적용될 값 지정
			// 4.
			rs = pstmt.executeQuery(); // select
			// 5.
			SungJukVO sj = new SungJukVO();
			if (rs.next()) { // 조건에 일치하는 데이터가 결과집합에 존재한다면
				sj.setName(rs.getString("name"));
				sj.setKor(rs.getInt("kor"));
				sj.setEng(rs.getInt("eng"));
				sj.setMath(rs.getInt("math"));
				sj.setTot(rs.getInt("tot"));
				sj.setAvgr(rs.getDouble("avrg"));
				sj.setGrd(rs.getString("grd"));
			}
			System.out.println(sj);

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