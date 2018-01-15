package project.v3;

import java.util.Scanner;

public class SungJukMain {
	private static SungJukServiceImpl sjsrv = null; // main안에서 계속 쓸 수있게
	private final static String EXITERROR = "\n 종료작업시 희박하게 오류발생\n";
	private final static String SAYGOODBYE = "\n 즐거운 하루 되세요 ~ ^^\n";

	public static void main(String[] args) {
		sjsrv = new SungJukServiceImpl(); // 요렇게
		while (true) {
			displayMenu();
			selectMenu();
		}
	}

	// void면 return이 필요 없다
	private static void selectMenu() {
		// 메뉴를 선택 & 작업 분기
		Scanner sc = new Scanner(System.in);
		int select = sc.next().charAt(0); // 입력된 첫 번째 글자를 ASCII Code로 변환하여 저장
		switch (select - 48) {
		case 1:
			addSungJuk();
			break;
		case 2:
			showSungJuk();
			break;
		case 3:
			showSungJuk2();
			break;
		case 4:
			updateSungJuk();
			break;
		case 5:
			deleteSungJuk();
			break;
		case 0:
			exitSungJuk();
			break;
		}

	}

	private static void displayMenu() {
		// 메뉴 출력
		StringBuffer menu = new StringBuffer();
		menu.append(" -= 성적 처리 프로그램 v2 =- \n").append("---------------------\n").append("1 : 새로운 성적 데이터 추가 \n")
				.append("2 : 전체 성적 데이터 조회 \n").append("3 : 성적 데이터 상세 조회\n").append("4 : 성적 데이터 수정\n")
				.append("5 : 성적 데이터 삭제\n").append("0 : 성적 처리 프로그램 종료\n").append("---------------------\n")
				.append("실행할 작업을 선택하세요 >>");
		System.out.print(menu.toString());
	}

	private static void addSungJuk() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n 추가할 성적 데이터를 입력하세요").append("\n 데이터 입력순서는 이름/ 국어/ 영어/ 수학 입니다").append("\n 예) 수지 78 98 98")
				.append("\n >> ");
		System.out.print(sb.toString());

		Scanner sc = new Scanner(System.in);
		SungJukVO sj = new SungJukVO(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());

		sjsrv.addSungJuk(sj);

		sb.setLength(0);
		sb.append("\n성적 데이터 성곡적으로 저장 !\n\n");

		System.out.println(sb.toString());
	}

	private static void showSungJuk() {
		StringBuffer sb = new StringBuffer();
		sb.append(" -= 전체 데이터 출력 =- \n").append(sjsrv.getSungJuk()).append("\n\n");

		System.out.print(sb.toString());
	}

	private static void showSungJuk2() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n 검색할 성적번호를 입력하세요").append("\n >> ");
		System.out.print(sb.toString());

		Scanner sc = new Scanner(System.in);
		int pos = sc.nextInt();

		sb.setLength(0);
		sb.append("\n\n -= 상세 성적 데이터 =- ").append(sjsrv.getSungJuk(pos)).append("\n\n\n");

		System.out.println(sb.toString());
		// sjsrv.getSungJuk(no);
	}

	private static void updateSungJuk() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n\n수정할 성적번호를 입력하세요!\n >>");
		System.out.print(sb.toString());

		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		sb.setLength(0);
		sb.append("\n수정할 성적 데이터를 입력하세요").append("\n 데이터 입력순서는 이름 / 국어 / 영어 / 수학 입니다").append("\n 예) 수빈 98 77 87")
				.append("\n >>");

		System.out.print(sb.toString());

		SungJukVO sj = new SungJukVO(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());

		sjsrv.modifySungJuk(sj, no);
	}

	private static void deleteSungJuk() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n\n삭제할 성적번호를 입력하세요\n >>");
		System.out.print(sb.toString());

		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		sjsrv.removeSungJuk(no);
	}

	private static void exitSungJuk() {
		try {
			sjsrv.finalize();
			System.out.println(SAYGOODBYE);
		} catch (Throwable e) {
			System.out.println(EXITERROR);
		}
		System.exit(0);
	}
}