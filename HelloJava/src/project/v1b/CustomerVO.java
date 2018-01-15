package project.v1b;

public class CustomerVO {
	// 멤버 변수
	private int custNo;
	private int bookNo;
	private int pirce;
	private String odDate;

	// 기본 생성자
	public CustomerVO() {
	}

	// 매개변수 생성자
	public CustomerVO(int custNo, int bookNo, int pirce, String odDate) {
		super();
		this.custNo = custNo;
		this.bookNo = bookNo;
		this.pirce = pirce;
		this.odDate = odDate;
	}

	// getter / setter
	public int getCustNo() {
		return custNo;
	}

	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public int getPirce() {
		return pirce;
	}

	public void setPirce(int pirce) {
		this.pirce = pirce;
	}

	public String getOdDate() {
		return odDate;
	}

	public void setOdDate(String odDate) {
		this.odDate = odDate;
	}

	// to String
	@Override
	public String toString() {
		return "CustomerVO [custNo=" + custNo + ", bookNo=" + bookNo + ", pirce=" + pirce + ", odDate=" + odDate + "]";
	}

}
