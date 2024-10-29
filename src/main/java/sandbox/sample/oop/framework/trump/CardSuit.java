package sandbox.sample.oop.framework.trump;

/**
 * スートを表すenumクラス
 */
public enum CardSuit {
    JOKER("☠", 0), SPADE("♠", 1), DIAMOND("♦", 2), CLUB("♣", 3), HEART("♥", 4);

    private String value;
    private int number;

    private CardSuit(String value, int number) {
        this.value = value;
        this.number = number;
    }

    public String value() {
        return this.value;
    }

    public int number() {
        return this.number;
    }
}
