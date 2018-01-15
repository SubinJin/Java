package project.v1b;

public interface BookService {
	// 도서 데이터 CRUD 처리 - 저장, 조회, 수정, 삭제
	void addBook(BookVO book); // 저장

	String getBook();

	String getBook(String name); // 조회

	void modifyBook(BookVO book); // 수정

	void removeBook(String name); // 삭제
}
