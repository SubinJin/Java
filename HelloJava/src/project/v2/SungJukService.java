package project.v2;

public interface SungJukService {
	// 성적 데이터 CRUD 처리 - 저장, 조회, 수정, 삭제 (매우중요!)
	void addSungJuk(SungJukVO sj); // 저장 - 매개변수 값을 일일이 지정하지 않고 클래스 통째로 넣기 (String name, int kor ....) 원래 이거

	String getSungJuk(); // 조회

	String getSungJuk(int no); // 번호로 조회

	void modifySungJuk(SungJukVO sj, int no); // 번호로 찾아서 수정

	void removeSungJuk(int no); // 번호로 찾아서 삭제
}
