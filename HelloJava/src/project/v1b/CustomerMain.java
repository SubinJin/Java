package project.v1b;

public class CustomerMain {
	public static void main(String[] args) {
		// 고객 관련 객체 생성
		CustomerService csrv = new CustomerServiceImpl();
		// 고객 객체 생성
		CustomerVO cust = new CustomerVO(1, 1, 7000, "2014-07-01");
		// 고객 추가
		csrv.addCust(cust);
		System.out.println(cust);
		// 고객 수정
		cust = new CustomerVO(2, 2, 13000, "2014-07-12");
		csrv.modifyCust(cust);
		// 고객 삭제
		csrv.removeCust("박지성");
	}
}
