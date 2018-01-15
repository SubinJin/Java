package project.v1b;

public class CustomerServiceImpl implements CustomerService {
	@Override
	public void addCust(CustomerVO cust) {
		System.out.println("새로운 고객 데이터가 추가되었습니다");
	}

	@Override
	public String getCust() {
		String out = "고객 데이터를 출력합니다";
		return out;
	}

	@Override
	public String getCust(String name) {
		return name;
	}

	@Override
	public void modifyCust(CustomerVO cust) {
		System.out.println("고객 데이터가 수정되었습니다");
	}

	@Override
	public void removeCust(String name) {
		System.out.println("고객 데이터가 제거되었습니다");
	}
}