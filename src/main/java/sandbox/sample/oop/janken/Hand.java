package sandbox.sample.oop.janken;

import lombok.Getter;

public enum Hand {
    STONE(0, "グー"), SCISSORS(1, "チョキ"), PAPER(2, "パー");

    @Getter
    private int value;
    @Getter
    private String name;

    private Hand(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Hand fromValue(int value) throws IllegalArgumentException {
        for (var hand : Hand.values()) {
            if (hand.getValue() == value) {
                return hand;
            }
        }
        throw new IllegalArgumentException("存在しない手です");
    }

    /**
     * 相手の手に勝てるか判定する
     * 
     * @param other
     * @return 勝てる場合はtrue
     */
    public boolean beats(Hand other) {
        return (this == STONE && other == SCISSORS)
                || (this == SCISSORS && other == PAPER)
                || (this == PAPER && other == STONE);
    }

}
