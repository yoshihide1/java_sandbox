package sandbox.sample.oop.framework.trump;

/**
 * カードの数値を表す
 */
record CardNumber(int value) {

    static final CardNumber JOKER = new CardNumber(0);

    CardNumber {
        if (value > 13) {
            throw new IllegalArgumentException("カードナンバーは1から13の数値である必要があります.");
        }
    }

    String getStringValue() {
        return switch (this.value) {
            case 1 -> "A";
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            default -> String.valueOf(this.value);
        };
    }
}
