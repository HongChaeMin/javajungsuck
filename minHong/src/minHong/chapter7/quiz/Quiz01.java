package minHong.chapter7.quiz;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for (int i = 1; i <= CARD_NUM; i++) {
			if (i == 1 || i == 3 || i == 8) cards[i - 1] = new SutdaCard(i, true);
			else cards[i - 1] = i > 10 ? new SutdaCard(i - 10, false) : new SutdaCard(i, false);
		}
		/*
		 * 풀이 답
		 * for (int i = 0; i < cards.length; i++) { 
		 * 		int num = i % 10 + 1; boolean
		 * 		isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
		 * 
		 * 		cards[i] = new SutdaCard(num, isKwang);
		 *  }
		 */
	}

	// 7-2
	SutdaCard pick(int i) {
		return i < 0 || i >= cards.length ? null : this.cards[i];
	}

	SutdaCard pick() {
		return this.cards[(int) (Math.random() * this.cards.length)];
	}

	void shuffle() {
		for (int i = 0; i < this.cards.length; i++) {
			int rd = (int) (Math.random() * cards.length);
			
			SutdaCard tmp = cards[rd];
			cards[rd] = cards[i];
			cards[i] = tmp;
		}
	}

}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return this.num + (this.isKwang ? "K" : "");
	}

}

public class Quiz01 {

	public static void main(String[] args) {
		
		// 7-1
		SutdaDeck deck = new SutdaDeck();

		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ", ");
		}
		System.out.println();
		
		// 7-2
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ", ");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
	}

}
