package Week6Project;

public class App {

	public static void main(String[] args) {
	//Instantiate a Deck and two Players, call the shuffle method on the deck.
		Deck deck = new Deck();
			System.out.println("New Deck has been created!");
			System.out.println("------------------");
			deck.describe();
			
		Player player1 = new Player("Eva");
		Player player2 = new Player("Sarah");			
			System.out.println("\nShuffled Deck!");
			System.out.println("---------------");
			deck.shuffle();
			deck.describe();
					
	//b.    Using a traditional for loop, iterate 52 times calling the Draw method 
	// 		on the other player each iteration using the Deck you instantiated.		
			for (int i = 0; i < 52; i++){
			if (i % 2 == 0) {
				player1.draw(deck);
				} else {
				player2.draw(deck);
				}
			}
	//c.    Using a traditional for loop, iterate 26 times and call the flip 
	//		method for each player.	
		int round = 1;
		player1.describe(player1.getName());
		player2.describe(player2.getName());
		for (int i = 0; i < 26; i++) {
			System.out.println("\n --- Round " + round + " of 26 ----");
			round++;
			Card cardOne = player1.flipCard();
			Card cardTwo = player2.flipCard();
			System.out.print(player1.name + " has ");
			cardOne.describe();
			System.out.print(player2.name + " has ");
			cardTwo.describe();
		//   Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.  Print a message to say which player received a point.
		//   Note:  If the values are equal (it is a tie), print a message saying that no point was awarded.
		//
		
		//
		//e.      Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
		//	
		
			if (cardOne.getValue() > cardTwo.getValue()) {
				player1.incrementScore();
				System.out.println(player1.getName() + " Wins this round");
			} else if (cardOne.getValue() < cardTwo.getValue()) {
				player2.incrementScore();
				System.out.println(player2.getName() + " Wins this round");
			} else {
				System.out.println("It's a draw!");
			}
			System.out.println("Current Score: " + player1.getName() + " : " + player1.getScore()  + " and " + player2.getName() + " : " +player2.getScore() );
			
		    }
		//d.      After the loop, compare the final score from each player.
			int playerOneScore = player1.score;
			int playerTwoScore = player2.score;
			
			System.out.println(("--------------------------------------------------------------------"));
			System.out.println("Final Score of " + player1.getName()+ " : "+ player1.score);
			System.out.println("Final Score of " + player2.getName() + " : " + player2.score);
			
			System.out.println("---------------------------------------------------------------------");
			System.out.println("     **Game Results**       ");
		//e.      Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
			
			
			if (playerOneScore > playerTwoScore) {
				System.out.println(player1.getName()+" wins!");
			} else if
				(playerTwoScore > playerOneScore) {
				System.out.println(player2.getName() + " wins!");
			} else if
				(playerOneScore == playerTwoScore) {
				System.out.println("Its a draw!");
			}
	   }
	}

