package project.v1b;

public class BookServiceImpl implements BookService {

	@Override
	public void addBook(BookVO book) {
		System.out.println("새로운 도서 데이터가 추가되었습니다");
	}

	@Override
	public String getBook() {
		String out = "도서 데이터를 출력합니다";
		return out;
	}

	@Override
	public String getBook(String name) {
		return name;
	}

	@Override
	public void modifyBook(BookVO book) {
		System.out.println("도서 데이터가 수정되었습니다");
	}

	@Override
	public void removeBook(String name) {
		System.out.println("도서 데이터가 제거되었습니다");
	}
}