package ztu.cards;

public enum Rank {
    TWO("2"),
    THREE("3"),
    FOUR("4"), FIVE("5"),
    SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"),
    TEN("2"), JACK("JACK"), QUEEN("QUEEN"), KING("KING"),
    ACE("ACE");

    Rank(String val) {
        this.val = val;
    }
    private String val;

    private String getVal() {
        return this.val;
    }
}
