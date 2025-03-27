package ztu.cards;

public enum Suite {
    CLUBS("clubs"), DIAMONDS("diamonds"), HEARTS("heats"), SPADES("spades");

    Suite(String val) {
        this.val = val;
    }
    private String val;

    private String getVal() {
        return this.val;
    }
}
