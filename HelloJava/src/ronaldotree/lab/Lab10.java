package ronaldotree.lab;

// 교재연습문제 5-1, 5-4, 5-5, 5-10
public class Lab10 {
	public static void main(String[] args) {
		// 5-1
		// int[] arr[]; //a
		// int[] arr = {1,2,3,}; //b
		// int[] arr = new int[5]; //c
		// int[] arr = new int[5]{1,2,3,4,5}; //d
		// int arr[5]; //e 이렇게 크기를 넣어야 함 arr = new int[5];
		// int[] arr[] = new int[3][]; //f ??

		// // 5-4
		// int[][] arr = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20,
		// 20 }, { 30, 30, 30, 30, 30 } };
		// int total = 0;
		// float average = 0;
		// for (int i = 0; i < 4; i++) {
		// for (int j = 0; j < 5; j++) {
		// total += arr[i][j];
		// average = (float) (total / 20.0);
		//
		// }
		// }
		// System.out.println("total=" + total);
		// System.out.println("average=" + average);

		// // 5-5 중복되지 않은 세자리 숫자
		// int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// int[] ball3 = new int[3];
		// // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		// for (int i = 0; i < ballArr.length; i++) {
		// int j = (int) (Math.random() * ballArr.length);
		// int tmp = 0;
		// /*
		// * (1) 알맞은 코드를 넣어 완성하시오.
		// */ }
		// // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		// /* (2) */
		// for (int i = 0; i < ball3.length; i++) {
		// System.out.print(ball3[i]);
		// }

		// 5-10
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' }; // alphabet
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };// 0 1 2 3 4 5 6 7 8 9

		String src = "abc123";
		String result = "";
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);

			if ((int) src.charAt(i) >= 97 || (int) src.charAt(i) <= 122) {
				ch = abcCode[(int) (ch) - 97];
			} else if ((int) src.charAt(i) >= 48 || (int) src.charAt(i) <= 57) {
				ch = numCode[(int) (ch) - 48];
			}
			result += ch;
		}

		System.out.println("src:" + src);
		System.out.println("result:" + result);
	}
}