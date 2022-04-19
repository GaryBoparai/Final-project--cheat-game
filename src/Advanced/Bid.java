/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Advanced;

public class Bid {
		Hand h;
		Card.Rank r;
		public Bid(){
                    h=new Hand();
                    r=Card.Rank.TWO; 
		}
		public Bid(Hand hand,Card.Rank bidRank){
			h=hand;
			r=bidRank;
		}
		public void setHand(Hand hand){ h=hand;}
		public void setRank(Card.Rank rank){ r=rank;}
		
		public Hand getHand(){ return h;}
		public int getCount(){ return h.size();}
		public Card.Rank getRank(){ return r;}
		public String toString(){
			return h.size()+" x "+r;
		}
		
}
