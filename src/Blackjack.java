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
     */
    private static final int[] CARD_VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    /** Random variable for randomizing card selection. */
    private static Random rand = new Random();

    /** Array list to manage and edit the deck. */
    private static ArrayList<String> deck = new ArrayList<>(DECK.length);

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

    public static int getCardValue() {
        // TODO

        // FIX ME
        return 0;
    }
}