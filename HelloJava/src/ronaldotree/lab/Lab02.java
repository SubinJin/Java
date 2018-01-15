package ronaldotree.lab;

public class Lab02 {
	public static void main(String[] args) {
		// #03 ~ #15

		// #03
		// double x = 1, y = 2, z = 3;
		// double a, b, c, d;
		// a = 3 * x;
		// b = 3 * x + y;
		// c = (x + y) / z;
		// d = (3 * x + y) / (z + 2);
		// System.out.printf("#03 %f, %f, %f, %f \n", a, b, c, d);

		// #04
		System.out.printf("#04 %d, %f \n", (1 / 3) * 3, ((double) 1 / 3) * 3);

		// #05
		int quotient, remainder;
		quotient = 7 / 3;
		remainder = 7 % 3;
		System.out.printf("#05 %d, %d \n", quotient, remainder);

		// #06
		int result = 11;
		result /= 2; // r = r/2
		System.out.printf("#06 %d \n", result);

		// #07
		double x = 2.5;
		double y = -1.5;
		int m = 18;
		int n = 4;
		System.out.println("#07");
		System.out.printf("a. x + n * y - (x + n) * y = %f \n", x + n * y - (x + n) * y);
		// System.out.printf("b. m / n + m % n = %f \n", m / n + m % n);
		System.out.printf("c. 5 * x - n / 5 = %f \n", 5 * x - n / 5);
		System.out.printf("d. 1 -(1 -(1 -(1 -(1 - n)))) = %d \n", 1 - (1 - (1 - (1 - (1 - n)))));

		// #08
		System.out.println("#08 ");
		System.out.println(3 + 4.5 * 2 + 27 / 8);
		System.out.println(true || false && 3 < 4 || !(5 == 7));
		System.out.println(true || (3 < 5 && 6 >= 2));
		// System.out.println(!true > 'A');
		System.out.println(7 % 4 + 3 - 2 / 6 * 'Z');
		System.out.println('D' + 1 + 'M' % 2 / 3);
		System.out.println(5.0 / 3 + 3 / 3);
		System.out.println(53 % 21 < 45 / 18);
		System.out.println((4 < 6) || true && false || false && (2 > 3));
		System.out.println(7 - (3 + 8 * 6 + 3) - (2 + 5 * 2));
		// 특정일의 요일을 알아내는 수식 (y + (y / 4) - (y / 100) + (y / 400) + (13 * m + 8) / 5 + d)
		// % 7

		// #09
		System.out.println("#09"); // 앞이 문자열이면 뒤도 문자열
		System.out.println("//hello there " + '9' + 7); // 앞이 문자열이면 뒤도 문자열
		System.out.print('H' + 'I' + "is" + 1 + "more example \n");

		// #10
		System.out.printf("#10 true && false && true || true = ");
		System.out.println(true && false && true || true);

		// #12
		System.out.println("#12");
		int p = (int) 3.9;
		System.out.println(p);
	}
}
