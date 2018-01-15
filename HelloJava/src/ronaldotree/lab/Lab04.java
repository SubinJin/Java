package ronaldotree.lab;

import java.util.Scanner;

//#16 ~ #20
public class Lab04 {
	public static void main(String[] args) {
		// // #16
		// // a
		// int n = 1;
		// int k = 2;
		// int r = n;
		// if (k < n)
		// r = k;
		// System.out.printf("a. %d, %d, %d", n, k, r);
		// // b
		// int n = 1;
		// int k = 2;
		// int r;
		// if (n < k)
		// r = k;
		// else
		// r = k + n;
		// System.out.printf("b. %d, %d, %d", n, k, r);
		// // c
		// int n = 1;
		// int k = 2;
		// int r = k;
		// if (r < k)
		// n = r;
		// else
		// k = n;
		// System.out.printf("c. %d, %d, %d", n, k, r);
		// // d
		// int n = 1;
		// int k = 2;
		// int r = 3;
		// if (r < n + k)
		// r = 2 * n;
		// else
		// k = 2 * r;
		// System.out.printf("d. %d, %d, %d", n, k, r);

		// #17
		// //a
		// int x = 0, y =0;
		// if(x == 0 && y == 0 ) {
		// x=1;
		// y=1; //==으로 쓰는 것과 =으로 쓰는 것의 차이점?
		// }
		// //b
		// int x = 3;
		// if (x <= 10 && 1 <= x)
		// System.out.println(x);
		//
		// #18
		// //a
		// int number;
		// Scanner sc = new Scanner(System.in);
		// number = Integer.parseInt(sc.nextLine());
		// if (number % 2 == 0)
		// System.out.println(number + "is even.");
		// System.out.println(number + "is odd.");
		// //b
		// int number;
		// Scanner sc = new Scanner(System.in);
		// number = Integer.parseInt(sc.nextLine());
		// if (number % 2 == 0)
		// System.out.println(number + "is even");
		// else
		// System.out.println(number + "is odd");

		// #19
		// int x, y, z;
		// Scanner sc = new Scanner(System.in);
		// System.out.printf("x : ");
		// x = Integer.parseInt(sc.nextLine());
		// System.out.printf("y : ");
		// y = Integer.parseInt(sc.nextLine());
		// sc.close();
		//
		// if (x > 2) {
		// if (y > 2) {
		// z = x + y;
		// System.out.println("z is " + z);
		// }
		// } else
		// System.out.println("x is" + x);

		// #20
		// //a
		// int a = 3;
		// if (a++ == 3)
		// System.out.println("Three");
		// else
		// System.out.println("Four");
		// //b
		// int a = 3;
		// if (++a == 3)
		// System.out.println("Three");
		// else
		// System.out.println("Four");
		// //c
		// int a = 3;
		// a = a++; //수식에 사용되면 후행 +
		// if (a == 3)
		// System.out.println("Three");
		// else
		// System.out.println("Four");

		// #21
		// 결혼여부 isMarried = "Y", "N"
		// 결혼여부 isMarried = true, false
		// 결혼여부 isMarried = 0, 1

		Scanner sc = new Scanner(System.in);
		System.out.printf("결혼여부를 입력하세요(미혼 : 0, 기혼 : 1) : ");
		int isMarried = sc.nextInt();
		System.out.printf("연봉을 입력하세요 : ");
		int salary = sc.nextInt();
		int tax = 0;
		if (isMarried == 0) {
			if (salary < 3000) {
				tax = (int) (salary * 0.1);
			} else {
				tax = (int) (salary * 0.25);
			}
		} else if (isMarried == 1) {
			if (salary < 6000) {
				tax = (int) (salary * 0.1);
			} else {
				tax = (int) (salary * 0.25);
			}
		}
		System.out.printf("세금은 %d 입니다.", tax);
	}
}
