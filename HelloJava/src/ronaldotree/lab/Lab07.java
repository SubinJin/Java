package ronaldotree.lab;

// #22 ~ #30 순서 이상함
import java.io.IOException;

public class Lab07 {
	public static void main(String[] args) throws IOException {
		// // #22 윤년 여부 확인
		// 현재 년도가 4로 나누어 떨어지지만 100으로는 나누어 떨어지지 않음
		// 현재 년도가 400으로 나누어 떨어짐
		// String welcome = "연도를 입력하세요 : ";
		// String fmt1 = "%d년은 윤년입니다.\n";
		// String fmt2 = "%d년은 윤년이 아닙니다.\n";
		// int year;
		// Scanner sc = new Scanner(System.in);
		// System.out.print(welcome);
		// year = sc.nextInt();
		// sc.close();
		// GregorianCalendar gc = new GregorianCalendar();
		//
		// if (gc.isLeapYear(year) == true)
		// System.out.printf("%d년은 윤년입니다.\n", year);
		// else
		// System.out.printf("%d년은 윤년이 아닙니다.\n", year);

		// System.out.println(gc.isLeapYear(2000));
		// System.out.println(gc.isLeapYear(1992));
		// System.out.println(gc.isLeapYear(2017));
		// if (year % 4 == 0 && year % 100 != 0)
		// System.out.printf(fmt1, year);
		// else if (year % 400 == 0)
		// System.out.printf(fmt1, year); // if 조건에 ||를 추가해서 실행해도 됨
		// else
		// System.out.printf(fmt2, year);

		// // #24
		// System.out.printf("단 수를 입력하세요 : ");
		// Scanner sc = new Scanner(System.in);
		// int j = sc.nextInt();
		// sc.close();
		// String fmt = "%d * %d = %d \n";
		// if (j <= 9 && j >= 1) {
		// for (int i = 1; i <= 9; i++) {
		// System.out.printf(fmt, j, i, j * i);
		// }
		// } else
		// System.out.println("잘못 입력하셨습니다.");

		// // #25
		// System.out.printf("소문자를 입력하세요 :");
		// int alphabet = System.in.read(); // char to int
		// if (alphabet >= 97 && alphabet <= 122) {
		// alphabet = alphabet - 32; // 아스키 코드 대문자 변환
		// System.out.printf("대문자 : %s", ((char) alphabet));// int to char
		// } else
		// System.out.println("잘못 입력하셨습니다!!");

		// // #27
		// int sum = 0, number = 0;
		// while (number < 20) {
		// number++;
		// sum += number;
		// if (sum >= 100)
		// break;
		// }
		// System.out.printf("number : %d, sum : %d \n", number, sum);

		// // #28
		// int sum = 0, number = 0;
		// while (number < 20) {
		// number++;
		// if (number == 10 || number == 11)
		// continue;
		// sum += number;
		// }
		// System.out.printf("number : %d, sum : %d \n", number, sum);

		// // #30
		// System.out.println(" Multiplication Tale");
		// for (int i = 1; i <= 9; i++) {
		// System.out.printf("\t %d ", i);
		// }
		// System.out.println("\n---------------------------------------------------------------------------");
		// for (int i = 1, j = 1; i <= 9; i++) {
		// System.out.printf("%d |", i);
		// if (i <= 9 && j >= 1) {
		// for (j = 1; j <= 9; j++) {
		// System.out.printf("\t %d", i * j);
		// }
		// System.out.println("");
		// } else
		// break;
		//
		// }

		// // #23 복권 발행 프로그램
		// // 특정범위를 포함하는 난수 생성
		// // 정수난수값 % ((마지막값 - 시작값) + 1) + 시작값
		// // 100 - 999
		// // lotto : 657, lucky : 452 = 1개 일치, 천원
		// // 비교 character at\
		//
		// // 나머지로 난수 생성하는 방법
		// // int rand = (int) (Math.random() * 1000000); 뒤 숫자가 큰게 좋다
		// // int lotto = rand % ((999 - 100) + 1) + 100;
		// // System.out.println(lotto);
		//
		// int rand = (int) (Math.random() * 900) + 100;
		//
		// Scanner sc = new Scanner(System.in);
		// System.out.printf("서로 다른 3자리 정수를 입력하세요 : ");
		// String num = sc.nextLine();
		//
		// char numFir = num.charAt(0);
		// char numSec = num.charAt(1);
		// char numThd = num.charAt(2);
		//
		// // System.out.println(num.charAt(0));
		// // System.out.println(num.charAt(1));
		// // System.out.println(num.charAt(2));
		//
		// char randFir = ("" + rand).charAt(0);
		// char randSec = ("" + rand).charAt(1);
		// char randThd = ("" + rand).charAt(2);
		//
		// int match = 0; // if 한개당 match는 하나씩 밖에 올라가지 않음
		// // if (numFir == randFir || numFir == randSec || numFir == randThd)
		// // match++;
		// // if (numSec == randFir || numSec == randSec || numSec == randThd)
		// // match++;
		// // if (numThd == randFir || numThd == randSec || numThd == randThd)
		// // match++;
		//
		// for (int i = 0; i <= 2; i++) {
		// for (int j = 0; j <= 2; j++) {
		// if (num.charAt(i) == ("" + rand).charAt(j))
		// match++;
		// }
		// }
		//
		// // if (match == 0)
		// // System.out.println("꽝");
		// // else if(match == 1)
		// // System.out.println("상금 1천원");
		// // else if(match == 2)
		// // System.out.println("상금 1만원");
		// // else if(match == 3)
		// // System.out.println("상금 100만원");
		//
		// switch (match) {
		// case 0:
		// System.out.println("꽝");
		// break;
		// case 1:
		// System.out.println("상금 1천원");
		// break;
		// case 2:
		// System.out.println("상금 1만원");
		// break;
		// case 3:
		// System.out.println("상금 100만원");
		// break;
		// }

		// System.out.println(num);
		//
		// // #26
		// Scanner sc = new Scanner(System.in);
		// System.out.printf("1-100 사이의 정수를 입력하세요 : ");
		//
		// int num2 = ((int) (Math.random() * 100)) + 1;
		// for (;;) { //while(true)로 무한루프 돌려도 무방
		// int num1 = sc.nextInt();
		// if (num1 > num2) {
		// System.out.println("추측한 숫자가 큽니다");
		// } else if (num1 < num2) {
		// System.out.println("추측한 숫자가 작습니다");
		// } else if (num1 == num2) {
		// System.out.println("빙고! 숫자를 맞췄습니다.");
		// break;
		// }
		// }
		// // #29
		// Scanner sc = new Scanner(System.in);
		// System.out.printf("1-100 사이의 정수를 입력하세요 : ");
		//
		// int num2 = ((int) (Math.random() * 100)) + 1;
		// for (;;) {
		// int num1 = sc.nextInt();
		// if (num1 > num2) {
		// System.out.println("추측한 숫자가 큽니다");
		// }
		// continue;
		// if (num1 < num2) {
		// System.out.println("추측한 숫자가 작습니다");
		// }
		// continue;
		// if (num1 == num2) {
		// System.out.println("빙고! 숫자를 맞췄습니다.");
		// }
		// break;
		// }
		// }

	}
}
