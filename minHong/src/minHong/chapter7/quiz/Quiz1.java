package minHong.chapter7.quiz;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for (SutdaCard s : cards) {
			
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
