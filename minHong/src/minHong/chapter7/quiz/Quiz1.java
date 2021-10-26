package minHong.chapter7.quiz;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for (int i = 1; i <= CARD_NUM; i++) {
			if (i == 1 || i == 3 || i == 8) cards[i - 1] = new SutdaCard(i, true);
			else cards[i - 1] = i > 10 ? new SutdaCard(i - 10, false) : new SutdaCard(i, false);
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

public class Quiz1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();

		for (int i = 0; i < deck.cards.length; i++) {
			System.out.println(deck.cards[i] + ", ");
		}
	}

}
