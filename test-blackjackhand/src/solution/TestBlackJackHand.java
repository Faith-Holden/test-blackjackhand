package solution;

import resource_classes.BlackjackHand;
import resource_classes.Deck;
import resource_classes.TextIO;

public class TestBlackJackHand {
    public static void main (String[]args){
        boolean continuePlaying = true;
        int numCardsToDraw;
        while (continuePlaying){
            BlackjackHand playerHand = new BlackjackHand();
            Deck playerDeck = new Deck();
            playerDeck.shuffle();
            numCardsToDraw = (int)(Math.random()*4)+2;

            for(int i=0; i<numCardsToDraw; i++){
                playerHand.addCard(playerDeck.dealCard());
            }

            System.out.println("The cards in your hand were:");
            for(int i = 0; i<numCardsToDraw; i++){
                System.out.println(playerHand.getCard(i).toString());
            }
            System.out.println("The value of your hand was:");
            System.out.println(playerHand.getBlackjackValue());
            System.out.println("Would you like to play again? (Y/N)");
            if(TextIO.getln().equals("N")){
                continuePlaying = false;
            }
        }
    }

}
