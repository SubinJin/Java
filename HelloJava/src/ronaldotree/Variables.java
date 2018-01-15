package ronaldotree;

import java.util.Scanner;

public class Variables {
	public static void main(String[] args) {
		//
		// // 변수 : 자료형 변수이름;
		// int a; // 정수(byte, short, long)
		// double b; // 실수(float)
		// char c; // 문자(1자)
		// String d; // 문자열
		//
		// // 상수 자료형 변수이름; 변경 불가 자료를 저장할 목적으로 사용 변수 이름은 대문자
		//
		// final int E;
		// final double F;
		// final char G;
		// final String H;
		//
		// // 자바 에약어를 변수 이름으로 사용 불가
		// int if; // 불가능
		// double import; // 불가능
		// char System; // 가능하지만 비추
		// String String; // 가능하지만 비추
		//
		// // 회원정보 (아이디, 비밀번호, 이름, 나이)
		String id;
		String pw;
		String name;
		int age;
		//
		// // 리터럴 : 컴파일러가 이해할 수 있는 형식으로 작성된 데이터, 값
		// int jumin = 9207051111111; // 범위를 초과함
		// long jumin = 9207051111111; // long 타입의 리터럴 누락
		// long jumin = 9207051111111l; // 문제 x
		//
		id = "abcdefghz";
		pw = "123456";
		name = "Subin";
		age = 25;
		//
		// b = 123.456;
		//
		// float pi = 3.141592; // 정수 = int, 실수 = double로 기본 인식하기 때문에 타입이 맞지 않는 것 //
		// float pi = 3.141592F; // float형 리터럴을 이용해 형변환
		//
		// //char = 'a', String = "a", int = 1
		// c = '수';
		// G = 's';
		//
		// // 변수 vs 상수
		// c = '우';
		// G = 'x'; //원래 안되야 되는데 되버림 ***이유는 모르겠지만 앞에 선언한 변수에 오류가 있으면 뒤의 오류를 표시하지 않는 듯
		//
		// // 선언과 초기화 동시에
		// int i = 123;
		// double j = 987.123;
		// boolean k = true;
		//
		// //논리형 true or false
		//
		// // 변수/상수 이름
		// // 변수는 일반적으로 소문자
		// // 만일 이름을 두 단어로 구성하는 경우
		// // camel 표기법을 사용(두번째단어에서 대문자 시작)
		// int juminCode;
		// String sayHello;
		//
		// // 상수는 모두 대문자로 작성
		// // 두 단어 이상인 경우 _로 구분
		// final double PI = 3.14;
		// final String MY_NAME = "NAME";
		//
		// //문자와 숫자 간 변환
		// char ch = 'A';
		// System.out.println(ch);
		// System.out.println((int) ch);
		//
		// ch = '가';
		// System.out.println(ch);
		// System.out.println((int) ch);
		//
		// String st = "ABCD";
		// System.out.println(st);
		// System.out.println((String) st);
		//
		// // 특수문자 표현 - escape sequence
		// System.out.println("가 나");
		// System.out.println("가\t나"); // tab
		// System.out.println("가\n나"); // 줄바꿈
		// System.out.println("가\"나"); // 끈 따옴표
		// System.out.println("가\'나"); // 작은 따옴표
		//
		// System.out.println("이름 : " + name);
		// System.out.println("ID : " + id);
		// System.out.println("PW : " + pw);
		// System.out.println("나이 : " + age);
		// System.out.println("이름 : " + name + " ID : " + id + " PW : " + pw + " 나이 : "
		// + age);
		//
		// 서식화된 출력 - printf
		// System.out.printf("아이디 : %s, 비밀번호 : %s, 이름 : %s, 나이 : %d\n", id, pw, name,
		// age);
		String fmt = "아이디 : %s, 비밀번호 : %s, 이름 : %s, 나이 : %d";
		// System.out.printf(fmt, id, pw, name, age);

		// double vs float : 오차범위 주의
		float avg1 = 296 / 3.0f;
		double avg2 = 296 / 3.0;

		System.out.println(avg1);
		System.out.println(avg2);

		// 키보드로 데이터 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요");
		id = sc.nextLine();
		System.out.print("비밀번호를 입력하세요");
		pw = sc.nextLine();
		System.out.print("이름을 입력하세요");
		name = sc.nextLine();
		System.out.print("나이를 입력하세요");
		age = Integer.parseInt(sc.nextLine());
		System.out.printf(fmt, id, pw, name, age);
	}

}