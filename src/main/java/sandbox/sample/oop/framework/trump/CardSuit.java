package sandbox.sample.oop.framework.trump;

/**
 * カードのスートを表すEnum
 */
enum CardSuit {
    EMPTY(""), SPADE("♠"), DIAMOND("♦"), CLUB("♣"), HEART("♥");

    private String value;

    CardSuit(String value) {
        this.value = value;

    }

    String getValue() {
        return this.value;
    }

}
