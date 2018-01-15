package ronaldotree;

public class Arrays {
	public static void main(String[] args) {
		// 배열 - 동일한 자료형 데이터들의 묶음
		String name1, name2, name3; // 불편
		// 배열 선언
		// 자료형[] 변수명;
		String[] names;
		int[] kor;
		// 배열 초기화
		// 변수명 = new 자료형[크기];
		names = new String[3];
		kor = new int[3];
		// 배열 다루기
		// 변수명[위치값];
		names[0] = "혜교";
		names[1] = "지현";
		names[2] = "수지";

		kor[0] = 99;
		kor[1] = 90;
		kor[2] = 68;

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " " + kor[i]);
		}

		// 배열은 참조형이다
		System.out.println(names);
		System.out.println(kor);

		// 배열요소의 값은 자동으로 초기화된다
		String[] a = new String[1]; // 객체
		int[] b = new int[1];
		char[] c = new char[1];
		double[] d = new double[1];
		boolean[] e = new boolean[1];
		Arrays2[] z = new Arrays2[1]; // 객체

		System.out.println(a[0]); // null(참조형)
		System.out.println(b[0]); // 0
		System.out.println(c[0]); //
		System.out.println(d[0]); // 0.0
		System.out.println(e[0]); // false
		System.out.println(z[0]); // null(참조형)

		// 배열의 길이 : 배열변수.length, 상수이므로 변경할 수 없다(조회만 가능)
		// names.length = 10;

		// 배열 선언과 동시에 초기화하기
		int[] f = { 99, 77, 65 };
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}

		f = new int[] { 99, 98, 78 };

		// 2차원 배열 : [행][열]
		int[][] lotto = new int[3][6];
		lotto[0][0] = 15; // 처음
		lotto[2][5] = 33; // 끝

		// 1-45 정수 6개를 출력하는 난수 코드 작성
		int[][] arr;
		arr = new int[3][6];
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 6; i++) {
				int rand = (int) (Math.random() * 45) + 1;
				arr[j][i] = rand;
			} // for i
		} // for j

		// 2차원 배열 내 저장된 값 출력
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 6; i++) {
				System.out.printf("%d \t", arr[j][i]);
			}
			System.out.printf("\n");
		}

		// 향상된 for문으로 배열 다루기
		// for(배열 요소 타입 변수명 : 배열) 그냥 배열에 있는 것 다 가져오기
		int[] abc = { 12, 23, 56, 78, 90 };
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
		}
		for (int val : abc) {
			System.out.println(val);
		}

		// 2차원 배열에 대한 향상된 for문 사용
		for (int[] row : arr) {
			for (int col : row) {
				System.out.printf("%d \t", col);
			}
			System.out.println("");
		}
	}
}

class Arrays2 {

}
