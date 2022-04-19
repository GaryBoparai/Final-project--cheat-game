/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Advanced;

/**
 *
 * @author Human
 */

public interface AdvancedPlayerInterface extends Player {
    
    /**
     * Method to get the players current hand
     * @return Current Hand
     */
    Hand getHand();
    
    /**
    * Method to reset the players discarded cards 
    */
    void resetDiscards();
    
    
}
