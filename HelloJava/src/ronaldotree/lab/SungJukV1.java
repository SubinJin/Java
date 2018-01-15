/*
 * 성적 처리 프로그램 V1
 * 간단한 성적 처리를 수행하는 프로그램
 * 입력 : 이름, 국어, 영어, 수학
 * 처리 : 총점, 평균, 학점
 * 출력 : 이름, 국어, 영어, 수학, 총점, 평균, 학점
 * 스캔써서 값 받아도 되고 아님 말고
 * 성적은 소숫점 첫번째 자리까지 출력
 */
package ronaldotree.lab;

import java.util.Scanner;

public class SungJukV1 {
	public static void main(String[] args) {
		String name;
		double kor;
		double eng;
		double math;

		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine(); // 이름 입력
		System.out.print("국어 점수를 입력하세요 : ");
		kor = Double.parseDouble(sc.nextLine()); // 국어 점수 입력
		System.out.print("영어 점수를 입력하세요 : ");
		eng = Double.parseDouble(sc.nextLine()); // 영어 점수 입력
		System.out.print("수학 점수를 입력하세요 : ");
		math = Double.parseDouble(sc.nextLine()); // 수학 점수 입력
		sc.close();

		double total = kor + eng + math; // 총점 처리
		double avg = total / 3.0; // 평균 처리
		char grd = (avg >= 90) ? 'A' : (avg >= 80) ? 'B' : (avg >= 70) ? 'C' : (avg >= 60) ? 'D' : 'F'; // 학점 처리

		System.out.printf(" 이름 : %s \n 국어 : %f \n 영어 : %f \n 수학 : %f \n 총점 : %f \n 평균 : %.1f \n 학점 : %c \n", name, kor,
				eng, math, total, avg, grd); // 출력 처리
	}
}
