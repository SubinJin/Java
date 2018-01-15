package ronaldotree.lab;

// VO 클래스 - 정보만 저장
// 37. 아래 조건에 따라 Person, Customer 클래스를 설계하라.
//     Person : 이름, 주소, 전화번호
//     Customer : Person 클래스 상속, 고객번호, 마일리지
// 38. 아래 조건에 따라 Book, Magazine 클래스를 설계하라.
//     Book : 제목, 페이지수, 저자
//     Magazine : 클래스 상속, 발매일
// 39. 아래 조건에 따라 Phone, SmartPhone 클래스를 설계하라.
//     Phone : 제조사, 가격, 통신타입
//     SmartPhone : Phone 클래스 상속, 운영체제 버전, 내부 메모리 크기, 카메라 장착 여부, 블루투스 지원 여부
// print 01
public class Lab13 {
	public static void main(String[] args) {
		Person 지성 = new Person();
		System.out.println(지성); // 지성의 정보 출력됨(기본 생성자를 지정 했기 때문에)

		// String name = "지성";
		// String addr = "서울";
		// String phoneNo = "123-4567";
		// System.out.printf("%s, %s, %s", name, addr, phoneNo); // 지성의 정보 따로 따로 출력

		Person 지현 = new Person("지현", "인천", "231-5234");
		System.out.println(지현);

		Cust c = new Cust();
		Books b = new Books();
		Magazine m = new Magazine();
		Phone ph = new Phone();
		SmartPhone sp = new SmartPhone();
	}
}

// 37
class Person {
	// 멤버 변수
	private String name;
	private String addr;
	private String phoneNo;

	// 기본 생성자
	public Person() {
		this("지성", "서울", "213-4243");
		// TODO Auto-generated constructor stub
	}

	// 매개변수 생성자
	public Person(String name, String addr, String phoneNo) {
		this.name = name;
		this.addr = addr;
		this.phoneNo = phoneNo;
	}

	// getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	// to String
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", phoneNo=" + phoneNo + "]";
	}

}

class Cust {
	private String custNo;
	private int mile;
	private String name;
	private String addr;
	private String phoneNo;

	// 기본 생성자
	public Cust() {
		// TODO Auto-generated constructor stub
		this("1", 1000, "지성", "서울", "213-4243");
	}

	// 매개변수 생성자
	public Cust(String custNo, int mile, String name, String addr, String phoneNo) {
		super();
		this.custNo = custNo;
		this.mile = mile;
		this.name = name;
		this.addr = addr;
		this.phoneNo = phoneNo;
	}

	// setter / getter
	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public int getMile() {
		return mile;
	}

	public void setMile(int mile) {
		this.mile = mile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	// to String
	@Override
	public String toString() {
		return "Cust [custNo=" + custNo + ", mile=" + mile + ", name=" + name + ", addr=" + addr + ", phoneNo="
				+ phoneNo + "]";
	}

}

// 38
class Books {
	private String title;
	private int page;
	private String author;

	// 기본 생성자
	public Books() {
		// TODO Auto-generated constructor stub
		this("자바정석", 500, "남궁 성");
	}

	// 매개변수 생성자
	public Books(String title, int page, String author) {
		this.title = title;
		this.page = page;
		this.author = author;
	}

	// getter / setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	// to String
	@Override
	public String toString() {
		return "Books [title=" + title + ", page=" + page + ", author=" + author + "]";
	}

}

class Magazine {
	// 멤버 변수
	private String pubDate;
	private String title;
	private int page;
	private String Author;

	// 기본 생성자
	public Magazine() {
		// TODO Auto-generated constructor stub
	}

	// 매개변수 생성자
	public Magazine(String pubDate, String title, int page, String author) {
		super();
		this.pubDate = pubDate;
		this.title = title;
		this.page = page;
		Author = author;
	}

	// getter / setter
	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	// to String
	@Override
	public String toString() {
		return "Magazine [pubDate=" + pubDate + ", title=" + title + ", page=" + page + ", Author=" + Author + "]";
	}
}

// 39
class Phone {
	private String manufacture;
	private int price;
	private String commType;

	public Phone() {
		// TODO Auto-generated constructor stub
		this("Apple", 1300000, "LTE");
	}

	public Phone(String manufacture, int price, String commType) {
		this.manufacture = manufacture;
		this.price = price;
		this.commType = commType;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCommType() {
		return commType;
	}

	public void setCommType(String commType) {
		this.commType = commType;
	}

	@Override
	public String toString() {
		return "Phone [manufacture=" + manufacture + ", price=" + price + ", commType=" + commType + "]";
	}
}

class SmartPhone {
	private String manufacture;
	private int price;
	private String commType;
	private String osVer;
	private String memory;
	private boolean camera;
	private boolean bluetooth;

	// 기본 생성자
	public SmartPhone() {
		// TODO Auto-generated constructor stub
		this("대우", 1300000, "LTE", "iOS 4.2.1", "64G", true, true);
	}

	// 매개변수 생성자
	public SmartPhone(String manufacture, int price, String commType, String osVer, String memory, boolean camera,
			boolean bluetooth) {
		super();
		this.manufacture = manufacture;
		this.price = price;
		this.commType = commType;
		this.osVer = osVer;
		this.memory = memory;
		this.camera = camera;
		this.bluetooth = bluetooth;
	}

	// getter / setter
	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCommType() {
		return commType;
	}

	public void setCommType(String commType) {
		this.commType = commType;
	}

	public String getOsVer() {
		return osVer;
	}

	public void setOsVer(String osVer) {
		this.osVer = osVer;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public boolean isCamera() {
		return camera;
	}

	public void setCamera(boolean camera) {
		this.camera = camera;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	// to String
	@Override
	public String toString() {
		return "SmartPhone [manufacture=" + manufacture + ", price=" + price + ", commType=" + commType + ", osVer="
				+ osVer + ", memory=" + memory + ", camera=" + camera + ", bluetooth=" + bluetooth + "]";
	}
}