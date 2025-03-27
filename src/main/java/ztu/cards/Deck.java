package ztu.cards;

import java.io.IOException;
import java.util.*;

/**
 * This is a template for modelling a deck of cards.
 *
 * This is intended to be a standard deck of 52 cards as: https://en.wikipedia.org/wiki/Standard_52-card_deck
 *
 * The intention of this exercise is to implement the method stubs below
 */
public class Deck
{
    private Map<String, Card> cards;

    public Card[] shuffledCards;

    public Card[] getShuffledCards() {
        return this.shuffledCards;
    }
    public Deck() {
        this.cards = new HashMap<>();
        // initialize the cards
        for(Suite suite: Suite.values()) {
           for(Rank rank: Rank.values()) {
               Card card = new Card(suite, rank);
               String key = suite.toString() + rank.toString();
               cards.put(key, card);

               System.out.println(card.toString());
           }
        }
        System.out.println("THE DECK CONTAINS  " + cards.size() + " CARDS");

        Card duplicateCard = new Card(Suite.SPADES, Rank.ACE);

        System.out.println("LETS PUT DUPLICATED CARD");
        cards.put(duplicateCard.getSuite().toString()+duplicateCard.getRank().toString(), duplicateCard);
        System.out.println("THE DECK CONTAINS  " + cards.size() + " CARDS");
        this.shuffledCards = cards.values().toArray(new Card[0]);

    }

    /**
     * This will change the order of the cards in to a random order.
     * Math.random() is allowed, but no shuffle methods of collections.
     */
/*
    public void shuffle(){

        for()
    }
*/


    // Implementing Fisher–Yates shuffle
    void shuffle()
    {
        Random rnd = new Random();
        for (int i = shuffledCards.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            Card a = shuffledCards[index];
            shuffledCards[index] = shuffledCards[i];
            shuffledCards[i] = a;
        }
    }



    public static void main( String[] args ) throws IOException {

        Deck deck = new Deck();
        long start = System.currentTimeMillis();
        int shuffles = 1000000;
        for(int i = 0; i < shuffles; i++){
            deck.shuffle();
            System.out.println("FIRST SHUFFLED CARD IS : " + deck.getShuffledCards()[0]);
        }

        long end = System.currentTimeMillis();

        long duration = end - start;

        System.out.println("Time for " + shuffles + " was " + duration);
    }
}
