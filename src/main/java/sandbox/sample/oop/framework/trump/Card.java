package sandbox.sample.oop.framework.trump;

import java.util.StringJoiner;

/**
 * トランプのカードを表すクラス
 */
public class Card {

    public static final int SUIT_SPADE = 1;
    public static final int SUIT_DIAMOND = 2;
    public static final int SUIT_CLUB = 3;
    public static final int SUIT_HEART = 4;

    /** スートの数 */
    public static final int SUIT_NUM = 4;

    /** スート一つに対するカードの数 */
    public static final int CARD_NUM = 13;

    protected int suit;
    protected int number;

    /**
     * コンストラクタ
     */
    public Card(int suit, int number) {
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
    public int getSuit() {
        return this.suit;
    }

    public String toString() {
        var joiner = new StringJoiner(":");
        joiner.add(getSuitOfString());
        joiner.add(getNumberOfString());
        return joiner.toString();
    }

    /**
     * スートの文字列を返す
     * 
     * @return
     * @throws IllegalAccessException
     */
    private String getSuitOfString() {
        return switch (this.suit) {
            case SUIT_SPADE -> "♠";
            case SUIT_DIAMOND -> "♦";
            case SUIT_CLUB -> "♣";
            case SUIT_HEART -> "♥";
            default -> "☠";
        };
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
