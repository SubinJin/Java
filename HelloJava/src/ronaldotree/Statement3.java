package ronaldotree;

import java.util.Scanner;

//while
public class Statement3 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 5) { // 조건식
			System.out.println("추워요");
			i++; // 증감식
		}
		// 무한루프
		// while (true) {
		// System.out.println("나갈 수 없어");
		// }

		// 조건이 안맞으면 한번도 실행 안됨
		i = 9;
		while (i > 10) {
			System.out.println("while : 이 글이 보이나요?");
		}

		// 조건이 안맞아도 한번은 실행
		i = 9;
		do {
			System.out.println("do-while : 이 글이 보이나요?");
		} while (i > 10);

		// while로 직각삼각형 별
		int j = 1, k = 1;
		while (k <= 5) {
			while (j <= k) {
				// while (j ++ <=k{ 이런식으로 조건문 안에서 증가, 감소 조건 넣을 수 있지만 추천하지 않음
				// while (j <= 6 - k) {
				System.out.printf("*");
				j++;
			}
			System.out.println("");
			k++;
			j = 1;
		}

		// while문의 다른 용도 - atm처럼 무한루프로 사용할 때
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("작업할 코드를 입력하세요");
			System.out.println("c)reate 회원 등록");
			System.out.println("r)ead 회원 조회");
			System.out.println("u)pdate 회원 수정");
			System.out.println("d)elete 회원 삭제");
			System.out.println("e)xit 종료");
			System.out.println(">>>>");

			String job = sc.nextLine();
			sc.close();
			// if (job == "e") 문자열 비교할 때는 a.equals()를 사용하자
			// if (job.equals("e"))
			// break;

			switch (job) {
			case "c":
				System.out.println("회원 등록 메뉴 선택");
				break;
			case "r":
				System.out.println("회원 조회 메뉴 선택");
				break;
			case "u":
				System.out.println("회원 수정 메뉴 선택");
				break;
			case "d":
				System.out.println("회원 삭제 메뉴 선택");
				break;
			case "e":
				System.exit(0);
				break; // 여기서 break는 switch문을 나가기 위한 문장이므로 System.exit(0)을 이용해서 완전히 종료
			}

			// 반복의 중단 - break
			i = 1;
			int sum = 0;
			String fmt = "i : %d, sum : %d \n";
			while (true) {
				if (sum > 100) {
					System.out.printf(fmt, i, sum);
					break;
				}
				sum += i;
				++i;
			}

			// 반복의 재시작 - continue 쓰기 어렵
			// i = 1;
			// while (i++ <= 100) {
			// if (i % 2 != 0)
			// continue;
			// System.out.println(i);
			// }

		}
	}
}
