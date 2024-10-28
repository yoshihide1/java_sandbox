package sandbox.sample.oop.babanuki;

/**
 * トランプのカードを表すクラス
 */
public class Card {
    public static final int JOKER = 0;

    public static final int SUIT_SPADE = 1;
    public static final int SUIT_DIAMOND = 2;
    public static final int SUIT_CLUB = 3;
    public static final int SUIT_HEART = 4;

    private int suit;
    private int number;

    Card(int suit, int number) {
        this.suit = suit;
        this.number = number;
    }

    /**
     * 数字を見る
     * 
     * @return
     */
    public int getNumber() {
        return this.number;
    }

    /**
     * カードの文字列を見る
     */
    public String toString() {

    }

}
