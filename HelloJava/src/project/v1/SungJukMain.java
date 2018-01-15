package project.v1;

public class SungJukMain {
	public static void main(String[] args) {
		// 성적 프로그램 관련 객체 생성
		SungJukService sjsrv = new SungJukServiceImpl();
		// 성적 객체 생성
		SungJukVO sj = new SungJukVO("혜교", 98, 97, 98);
		// 성적 추가
		sjsrv.addSungJuk(sj);
		System.out.println(sj);
		// 성적 수정
		sj = new SungJukVO("지현", 55, 76, 88);
		sjsrv.modifySungJuk(sj);
		// 성적 삭제
		sjsrv.removeSungJuk("혜교");
	}
}
