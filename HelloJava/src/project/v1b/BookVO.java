package project.v1b;

public class BookVO {
	// 멤버 변수
	private int bookNo;
	private String name;
	private String pub;
	private int price;

	// 기본 생성자
	public BookVO() {
		// TODO Auto-generated constructor stub
	}

	// 매개변수 생성자
	public BookVO(int bookNo, String name, String pub, int price) {
		super();
		this.bookNo = bookNo;
		this.name = name;
		this.pub = pub;
		this.price = price;
	}

	// getter / setter
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// to String
	@Override
	public String toString() {
		return "BookVO [bookNo=" + bookNo + ", name=" + name + ", pub=" + pub + ", price=" + price + "]";
	}
}
