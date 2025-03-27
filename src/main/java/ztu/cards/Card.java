package ztu.cards;

/**
 * A card in a 52 card deck as: https://en.wikipedia.org/wiki/Playing_card
 */
public class Card {
    private Suite suite;
    private Rank rank;

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Card(Suite suits, Rank rank) {
        this.rank = rank;
        this.suite = suits;
    }

    public Suite getSuite() {
        return this.suite;
    }

    public Rank getRank() {
        return this.rank;
    }
    @Override
    public String toString() {
        return this.suite.toString() + " " + this.rank.toString();
    }

}
