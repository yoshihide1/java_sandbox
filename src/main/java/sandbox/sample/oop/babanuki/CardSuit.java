package sandbox.sample.oop.babanuki;

/**
 * カードのスートを表すEnum
 */
enum CardSuit {
    JOKER("JOKER"), SPADE("♠"), DIAMOND("♦"), CLUB("♣"), HEART("♥");

    private String value;

    CardSuit(String value) {
        this.value = value;

    }

    String getValue() {
        return this.value;
    }

}
