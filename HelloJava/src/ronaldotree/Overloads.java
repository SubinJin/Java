package ronaldotree;

public class Overloads {
	public static void main(String[] args) {
		// 매서드 오버로드 - 다중정의
		String a = "abc";
		String b = "def";
		// String c = add(a, b);
		// System.out.println(c);
	}

}

class Calculator {
	public int add(int a, int b) {
		return a + b;
	} // 정수 더하기

	public double add(double a, double b) { // 같은 이름 다른 서명 = 다른 매서드(다중정의)
		return a + b;
	} // 실수 더하기

	public String add(String a, String b) {
		return a + b;
	} // 문자열 더하기(연결)
}