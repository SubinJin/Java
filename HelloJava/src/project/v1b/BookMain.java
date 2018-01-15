package project.v1b;

public class BookMain {
	public static void main(String[] args) {
		// 책 관련 객체 생성
		BookService bsrv = new BookServiceImpl();
		// 책 객체 생성
		BookVO book = new BookVO(1, "축구의 역사", "굿스포츠", 7000);
		// 도서 추가
		bsrv.addBook(book);
		System.out.println(book);
		// 도서 수정
		book = new BookVO(2, "축구 아는 여자", "나무수", 13000);
		bsrv.modifyBook(book);
		// 도서 삭제
		bsrv.removeBook("축구의 역사");
	}
}
