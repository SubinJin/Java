package ronaldotree;

public class Statement2 {
	public static void main(String[] args) {
		// for (int i = 1; i <= 5; i = i + 1) {
		// for (int i = 1; i <= 5; i += 1) {
		for (int i = 1; i <= 5; ++i) {
			System.out.println("춥다");
		}
		for (int j = 1; j <= 100; j++) {
			System.out.printf("%d ", j);
		}
		System.out.printf("\n");
		for (int j = 1; j <= 100; j = j + 2) {
			System.out.printf("%d ", j);
		}
		System.out.printf("\n");
		for (int j = 2; j <= 100; j = j + 2) {
			System.out.printf("%d ", j);
		}

		String fmt = "%d * %d = %d \n";
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf(fmt, i, j, i * j);
			}
		}
		// 예제 4-15
		String format = "%d \t %d \t %d \t %d \t %d \t %d \t %d \t \n";
		System.out.println("i \t 2*i \t 2*1-1 \t i*i \t 11-i \t i%3 \t i/3");
		System.out.println("-----------------------------------------------------");
		for (int i = 1; i <= 10; i++) {
			System.out.printf(format, i, 2 * i, 2 * i - 1, i * i, 11 - i, i % 3, i / 3);
		}

		// 별찍기 - 행에 대한 for, 열에 대한 for
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}

		// 직각 삼각형 그리기
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (6 - i); j++) {
				// for (int j = 1; j <= i; j++) {
				// for (int j = 5; j >= i; j--) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}

	}
}
