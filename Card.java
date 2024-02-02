
package Week6Project;
//Create class Card
public class Card {
	// i.     Fields
		//1.     value (contains a value from 2-14 representing cards 2-Ace)
		//2.	name (e.g. Ace of Diamonds, or Two of Hearts)
		int value;
		String name;
	
	public Card(int value, String suit) {
		this.value = value;
		switch(value) {
		case 2:
			name = "Two";
			break;
		case 3:
			name = "Three";
			break;
		case 4:
			name = "Four";
			break;
		case 5:
			name = "Five";
			break;
		case 6:
			name = "Six";
			break;
		case 7:
			name = "Seven";
			break;
		case 8:
			name = "Eight";
			break;
		case 9:
			name = "Nine";
			break;
		case 10:
			name = "Ten";
			break;
		case 11:
			name = "Jack";
			break;
		case 12:
			name = "Queen";
			break;
		case 13:
			name = "King";
			break;
		case 14:
			name = "Ace";
			break;
		}
		
		name += " of " + suit;
	}
	// ii.    Methods
		//1.  Getters and Setters
		//2.  describe (prints out information about a card)
	
	@Override
	public String toString() {
		return name;
	}

	public void describe() {
		System.out.println(name);
	}

	public int getValue() {
		return value;
	}


}