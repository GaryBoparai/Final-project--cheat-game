/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Advanced;

public interface Strategy {
 
/**
 * Decides on whether to cheat or not	
 * @param b   the bid this player has to follow (i.e the 
 * bid prior to this players turn. 
 * @param h	  The players current hand	
 * @return true if the player will cheat, false if not
 */
	public boolean cheat(Bid b, Hand h);
/**
 * 	
 * @param b   the bid the player has to follow. 
 * @param h	  The players current hand	
 * @param cheat true if the Strategy has decided to cheat (by call to cheat()) 
 * 
 * @return a Bid with the cards to pass to the game and the Rank. This will be 
 * different to the rank of thecards if the player is cheating!
 * 
 */
	public Bid chooseBid(Bid b, Hand h, boolean cheat);
	
/**
 * 
 * @param b the current bid
 * @return true if this player is going to call cheat  on the last play b
 */
	
	public boolean callCheat(Hand h,Bid b);

}
