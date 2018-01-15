// 연습문제 4-6, 4-7, 4-8번
package ronaldotree.lab;

public class Lab05 {
	public static void main(String[] args) {
		// [4-6] 두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
		// int x, y;
		// [4-7] 을 이용해서 부터 사이의 임의의 정수를 변수 에 저장하는 Math.random() 1 6 value 코드를 완성하라 에 알맞은
		// 코드를 넣으시오.
		int number = (int) (Math.random() * 6) + 1;
		System.out.println("value:" + number);
		// [4-8] 방정식 2x+4y=10의 모든 해를 구하시오. 단 x와 y는 정수이고 각각의 범위는 0 <= x, y <= 10이다.
	}
}
