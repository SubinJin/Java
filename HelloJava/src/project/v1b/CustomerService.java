package project.v1b;

public interface CustomerService {
	// 고객 데이터 CRUD 처리 - 저장, 조회, 수정, 삭제
	void addCust(CustomerVO cust);

	String getCust();

	String getCust(String name);

	void modifyCust(CustomerVO cust);

	void removeCust(String name);
}
