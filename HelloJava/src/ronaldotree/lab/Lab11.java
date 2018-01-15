package ronaldotree.lab;

import java.util.Scanner;

//프린트 31, 32, 35
public class Lab11 {
	public static void main(String[] args) {
		// // #31 string을 다른 변수로 바꾸려 할 필요가 없다
		// System.out.printf("숫자 6자리를 입력하세요 : ");
		// Scanner sc = new Scanner(System.in);
		// String card = sc.nextLine();
		//
		// // 카드 정보 판별
		// char ctype = card.charAt(0);
		// char ctype2 = card.charAt(1);
		// String ctmsg = "카드 정보 없음";
		//
		// if (ctype == '3' && ctype2 == '5')
		// ctmsg = "JCB 카드";
		// else if (ctype == '4')
		// ctmsg = "Visa 카드";
		// else if (ctype == '5')
		// ctmsg = "Master 카드";
		//
		// System.out.println(ctmsg);
		//
		// // 은행 정보 판별
		// String bank = "은행 정보 없음";
		// switch (card) {
		// case "356317":
		// bank = "NH 농협카드";
		// break;
		// case "356901":
		// bank = "신한카드";
		// break;
		// case "356912":
		// bank = "KB 국민카드";
		// break;
		// case "404825":
		// bank = "비씨카드";
		// break;
		// case "438676":
		// bank = "신한카드";
		// break;
		// case "457973":
		// bank = "국민은행";
		// break;
		// case "515594":
		// bank = "신한카드";
		// break;
		// case "524353":
		// bank = "외환카드";
		// break;
		// case "540926":
		// bank = "국민은행";
		// break;
		// }
		//
		// System.out.println(bank);

		// // #32 주민등록번호 유효성 검사
		// Scanner sc = new Scanner(System.in);
		// System.out.printf("주민등록번호를 입력하세요 : ");
		// String jumin = sc.nextLine();
		// sc.close();
		//
		// int[] gajoong = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
		// int sum = 0;
		//
		// // a. 가중치 적용 b. 합산
		// for (int i = 0; i < 12; i++) {
		// sum += (jumin.charAt(i) - 48) * gajoong[i];
		// }
		//
		// int c = sum % 11; // c
		// int d = 11 - c; // d
		//
		// String msg = "주민번호가 유효하지 않습니다.";
		// if (d % 10 == jumin.charAt(12) - 48) // d == g ?
		// msg = "주민번호가 유효합니다.";
		// System.out.println(msg);

		// #35 잔돈 계산 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.printf("받을 잔돈을 입력하세요 : ");
		int jandon = sc.nextInt();
		sc.close();

		int danwi[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		for (int i = 0; i < danwi.length; i++) {
			int mok = jandon / danwi[i];
			if (mok >= 1) {
				System.out.printf("%d원권 %d개 \n", danwi[i], mok);
				jandon %= danwi[i];
			}
		}
	}
}
