
package Week6Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//create Deck class
public class Deck {

	// i.     Fields
//1.     cards (List of Card)
	List<Card> cards = new ArrayList<Card>();
	String[] suits = { "Spades", "Hearts", "Clubs", "Diamonds" };

	Deck() {
		int[] numbers = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

		for (String suit : suits) {
			int count = 2;
			for (Integer numberName : numbers) {
				cards.add(new Card(numberName, suit));
				count++;
			}
		}
	}



//ii.    Methods

public void describe() {
	for (Card card : this.cards) {
		card.describe();
	}
}
//1.     shuffle (randomizes the order of the cards)
public void shuffle() {
	Collections.shuffle(cards);
}

// 2.     draw (removes and returns the top card of the Cards field)
public Card draw() {
	Card card = cards.remove(0);
	return card;
}
}
