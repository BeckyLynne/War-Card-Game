package Week6Project;

import java.util.ArrayList;
import java.util.List;
//create Player class
public class Player {
	//i.     Fields
//1.     hand (List of Card)
//2.     score (set to 0 in the constructor)
//3.     name
	String name;
	int score;
	List<Card> hand = new ArrayList<Card>();

	public Player(String name) {
		this.name = name;
	}
	
	public Player(String name, List<Card> hand, int score) {
		this.name = name;
		this.hand = hand;
		this.score = 0;

	}
	
	//Methods:

	//draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
	public void draw(Deck deck)
	{
		hand.add(deck.draw());
	}
	//flip (removes and returns the top card of the Hand)
	public Card flipCard(){
		
		return hand.remove(0);
		
	}
	//incrementScore (adds 1 to the Player’s score field)
	public void incrementScore(){
		this.score++;
	}
	
	//describe (prints out information about the player and calls the describe 
	//method for each card in the Hand List)
	public void describe(String name) {
		System.out.println("\n" + name.toUpperCase() + "'S HAND CONTAINS: ");
		for (Card card: hand) {
		card.describe();
		}
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getScore(){
		return score;
	}
	
	public List<Card> getHand(){
		return hand;
	}
}
