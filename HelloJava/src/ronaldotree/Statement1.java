package ronaldotree;

public class Statement1 {
	public static void main(String[] args) {
		// 문장 - 무엇인가를 하라는 지시를 의미
		// 문장이 모여 프로그램을 구성
		; // 빈 문장도 적법

		// 조건문 if
		// if (조건식) {참일 때 실행할 문장} 1
		// if (조건식) {참일 때} else {거짓일 때} 2
		// if (조건식1) {참일 때} 3
		// else if (조건식2) {참일 때}
		// else if (조건식3) {참일 때}
		// else {거짓일 때}

		// if (3 < 5) {
		// System.out.println("3은 5보다 크다??");
		// }
		//
		// int tot = 99 + 98 + 99;
		// if (tot >= 270)
		// System.out.println("수"); // 조건이 하나면 중괄호가 없어도 되지만 권장하지 않음
		//
		// // 어떤 수가 2의 배수인지 알아보자
		// int n = 2;
		// if (n % 2 == 0) {
		// System.out.println("2의 배수입니다");
		// } else {
		// System.out.println("2의 배수가 아닙니다");
		// }
		//
		// // 로그인 스캔
		// Scanner sc = new Scanner(System.in);
		// String userid; //
		// String passwd;
		// System.out.printf("ID : ");
		// userid = sc.nextLine(); // id 입력
		// System.out.printf("PW : ");
		// passwd = sc.nextLine(); // pw 입력
		// sc.close();
		// // if문
		// if (userid.equals("zzyzzy") && passwd.equals("987654")) {
		// // if (userid == "zzyzzy" && passwd == "987654") { 문자열 비교할 때는 == 을 쓰면 안된다
		// // .equals 사용
		// System.out.println("로그인 성공");
		// } else {
		// System.out.println("로그인 실패");
		// }
		// // if문 중첩
		// if (userid.equals("zzyzzy")) {
		// if (passwd.equals("987654")) {
		// System.out.println("로그인 성공");
		// } else {
		// System.out.println("비밀번호가 틀렸습니다.");
		// }
		// } else {
		// System.out.println("존재하지 않는 ID입니다.");
		// }
		//
		// // 문자 입력 확인
		// char ch = 'q';
		// if (ch == 'q' || ch == 'Q') {
		// System.out.println("프로그램 종료");
		// }
		// // 입력된 문자가 알파벳 소문자 여부 확인
		// // if(ch == 'a' || ch == 'b' || ch =='z') {} //모든 문자에 대해 or조건
		// if (!(ch >= 'a' && ch <= 'z')) { // ascii코드 이용한 범위 조건
		// System.out.println("알파벳만 입력 가능");
		// }
		//
		// // else if
		// double avg = (double) tot / 3;
		// char grd;
		//
		// if (avg <= 100 && avg >= 90)
		// grd = '수';
		// else if (avg < 90 && avg >= 80)
		// grd = '우';
		// else if (avg < 80 && avg >= 70)
		// grd = '미';
		// else if (avg < 70 && avg >= 60)
		// grd = '양';
		// else
		// grd = '가';
		//
		// System.out.println(grd);
		//
		// // 애매모호한 if문 - 괄호를 잘 쓰도록 합시다
		// String grds = "";
		// if (avg >= 90)
		// if (avg >= 96)
		// grds = "A+";
		// else
		// grds = "A0 또는 A-";
		// System.out.println(grds);
		//
		// // switch : 연산식의 결과값에 따라 분기
		// // 연산식 결과값 유형은 정수, 문자열, 열거형 중 하나여야 함
		// // switch(연산식){
		// // case 값1: 실행코드; break;
		// // case 값2: 실행코드; break;
		// // case 값3: 실행코드; break;
		// // default: 실행코드; break;
		// // }
		//
		// int userLevel = 1;
		// switch (userLevel) {
		// case 1:
		// System.out.println("관리자");
		// break;
		// case 2:
		// System.out.println("사용자");
		// break;
		// case 3:
		// System.out.println("매니저");
		// break;
		// default:
		// System.out.println("비회원");
		// break;
		// }
		//
		// String key = "c";
		// switch (key) {
		// case "C": // case 2개 연속으로도 사용 가능
		// case "c": // case 2개 연속으로도 사용 가능
		// System.out.println("데이터 생성");
		// break;
		// case "R":
		// case "r":
		// System.out.println("데이터 조회");
		// break;
		// case "U":
		// case "u":
		// System.out.println("데이터 수정");
		// break;
		// case "D":
		// case "d":
		// System.out.println("데이터 삭제");
		// break;
		// }
		//
		// // 학점 계산
		// switch ((int) avg / 10) { // 스위치는 double을 받을 수 없음
		// case 10:
		// case 9:
		// grd = '수';
		// break;
		// case 8:
		// grd = '우';
		// break;
		// case 7:
		// grd = '미';
		// break;
		// case 6:
		// grd = '양';
		// break;
		// default:
		// grd = '가';
		// break;
		// }

		// 난수 생성
		double lucky = Math.random();
		System.out.println((int) (lucky * 45 + 1));
	}
}
