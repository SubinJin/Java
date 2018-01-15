package ronaldotree.lab;

import ronaldotree.lab.Deck.Card;

//교재 예제 7-1, 7-3, 연습문제 6-22, 6-23
public class Lab15 {
	public static void main(String[] args) {
		// 7-1
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello World");
		ctv.caption = true;
		ctv.displayCaption("Hello World");

		// 7-3
		Deck d = new Deck();
		Card c = d.pick(0);
		System.out.println(c);

		d.shuffle();
		c = d.pick(0);
		System.out.println(c);

	}
}

// 7-1
class Tv {
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}

class CaptionTv extends Tv {
	boolean caption;

	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

// 7-3
class Deck {
	final int CARD_NUM = 52; // final로 변경 못하게 고정
	Card cardArr[] = new Card[CARD_NUM];

	Deck() { // card 52개 생성
		int i = 0;
		for (int k = Card.KIND_MAX; k > 0; k--)
			for (int n = 0; n < Card.NUM_MAX; n++)
				cardArr[i++] = new Card(k, n + 1);
	}

	Card pick(int index) {
		return cardArr[index];
	}

	Card pick() {
		int index = (int) (Math.random() * CARD_NUM); // 0 ~ 51 사이 정수
		return pick(index); // 카드 하나 선택
	}

	void shuffle() {
		for (int i = 0; i < cardArr.length; i++) {
			int r = (int) (Math.random() * CARD_NUM);

			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp; // i를 다른 random number로 바꾼다
		}
	}

	class Card {
		static final int KIND_MAX = 4;
		static final int NUM_MAX = 13;

		static final int SPADE = 4;
		static final int DIAMOND = 3;
		static final int HEART = 2;
		static final int CLOVER = 1;
		int kind;
		int number;

		public Card() { // 기본 생성자
			// TODO Auto-generated constructor stub
			this(SPADE, 1); // 초기값 지정(매개변수 생성자가 없으면 오류)
		}

		public Card(int kind, int number) { // 매개변수 생성자
			super();
			this.kind = kind;
			this.number = number;
		}

		@Override
		public String toString() {
			String[] kinds = { "", "CLOVER", "HEART", "DIAMOND", "SPADE" };
			String numbers = "01234566789XJQK";
			return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
		}
	}

}