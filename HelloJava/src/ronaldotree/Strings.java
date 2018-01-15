package ronaldotree;

public class Strings {
	public static void main(String[] args) {
		// String 클래스 주요 메서드 - 유용한 것이 많아
		String s = "Hello";
		String n = "1234567890";
		char c1 = s.charAt(1);
		char c2 = n.charAt(1);

		System.out.println(c1);
		System.out.println(c2);

		boolean b = s.contains("bc");
		System.out.println(b);

		boolean e = s.equals("hello");
		System.out.println(e);
		e = s.equalsIgnoreCase("hello");
		System.out.println(e);

		int length = s.length();
		System.out.println(length);

		String animals = "dog, cat, bear";
		String[] arr = animals.split(",");
		System.out.println(arr[0] + arr[1] + arr[2]);

		System.out.println(s.trim());

		int a = 100;
		System.out.println(String.valueOf(a));
	}
}
