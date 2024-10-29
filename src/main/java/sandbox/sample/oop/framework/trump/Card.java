package sandbox.sample.oop.framework.trump;

import java.util.StringJoiner;

/**
 * トランプのカードを表すクラス
 */
public class Card {

    protected CardSuit suit;
    protected CardNumber number;

    /**
     * コンストラクタ
     */
    public Card(CardSuit suit, CardNumber number) {
        this.suit = suit;
        this.number = number;
    }

    /**
     * 数を見る
     * TODO 値オブジェクトで返すべき？
     */
    public int getNumber() {
        return this.number.value();
    }

    /**
     * スートを見る
     */
    public CardSuit getSuit() {
        return this.suit;
    }

    public String toString() {
        var joiner = new StringJoiner(" : ");
        joiner.add(this.suit.getValue());
        joiner.add(this.number.getStringValue());
        return joiner.toString();
    }

}
