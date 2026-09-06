import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Simple program that launches and plays Blackjack.
 *
 * @author Britni Rausch
 */
public class Blackjack {

    /**
     * Deck used for Blackjack.
     * These are the values on the cards.
     */
    private static final String[] DECK = {"2", "2", "2", "2", "3", "3", "3", "3", "4", "4", "4", "4", "5", "5", "5", "5",
                                          "6", "6", "6", "6", "7", "7", "7", "7", "8", "8", "8", "8", "9", "9", "9", "9",
                                          "10", "10", "10", "10", "J", "J", "J", "J", "Q", "Q", "Q", "Q", "K", "K", "K", "K",
                                          "A", "A", "A", "A"};

    /**
     * Deck used for Blackjack.
     * These are integer values.
     * 
     * DELETE(?)
     * MAY NOT BE NECESSARY.
     */
    // private static final int[] CARD_VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    /** Random variable for randomizing card selection. */
    private static Random rand = new Random();

    /** Array list to manage and edit the deck. */
    private static ArrayList<String> deck = new ArrayList<>(DECK.length);

    boolean aceValue = getAceValue(0);

    String currCard = getCard();
    int currCardValue = getCardValue(currCard, aceValue);

    /**
     * Running blackjack.
     */
    public static void main(String[] args) {
        resetDeck();

        int i = 1;
        String test = "";

        while (i < deck.size()) {
            test = getCard();
            System.out.println(test);
        }        
    }

    /**
     * Resetting the deck with a new game, or if a "re-shuffle" is needed.
     */
    public static void resetDeck() {
        for (int i = 0; i < DECK.length; ++i) {
            deck.add(DECK[i]);
        }
    }

    /**
     * Get a random card from the deck.
     * Remove card from deck so it can't be selected again.
     * @return Card selected from the deck at the index.
     */
    public static String getCard() {
        String card = deck.get(rand.nextInt(deck.size() - 1));
        deck.remove(card);

        return card;
    }

    public static int getCardValue(String card, boolean aceValue) {
        // TODO
        if (card.equals("10") || card.equals("J") || card.equals("Q") || card.equals("K")) {
            return 10;
        } else if (card.equals("A")) {
            if (aceValue == true) {
                return 1;
            } else {
                return 11;
            }
        } else {
            switch(card) {
                case "2":
                    return 2;
                case "3":
                    return 3;
                case "4":
                    return 4;
                case "5":
                    return 5;
                case "6":
                    return 6;
                case "7":
                    return 7;
                case "8":
                    return 8;
                case "9":
                    return 9;
                default:
                    return -1;
            }
        }
    }

    public static boolean getAceValue(int aceChoice) {

        if (aceChoice == 0) {
            return false;
        } else {
            return true;
        }
    }
}