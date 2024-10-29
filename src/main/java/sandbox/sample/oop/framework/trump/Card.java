package sandbox.sample.oop.framework.trump;

import java.util.StringJoiner;

/**
 * トランプのカードを表すクラス
 */
public class Card {

    /** スートの数(JOKERは含まない) */
    public static final int SUIT_NUM = 4;

    /** スート一つに対するカードの数 */
    public static final int CARD_NUM = 13;

    protected CardSuit suit;
    protected int number;

    /**
     * コンストラクタ
     */
    public Card(CardSuit suit, int number) {
        this.suit = suit;
        this.number = number;
    }

    /**
     * 数を見る
     */
    public int getNumber() {
        return this.number;
    }

    /**
     * スートを見る
     */
    public CardSuit getSuit() {
        return this.suit;
    }

    public String toString() {
        var joiner = new StringJoiner(":");
        joiner.add(this.suit.value());
        joiner.add(getNumberOfString());
        return joiner.toString();
    }

    /**
     * 数字の文字列を返す
     * 
     * @return
     */
    private String getNumberOfString() {
        return switch (this.number) {
            case 1 -> "A";
            case 10 -> "T";
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            default -> String.valueOf(this.number);
        };
    }
}
