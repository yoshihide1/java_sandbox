package sandbox.sample.oop.framework.trump;

public class Joker extends Card {

    /**
     * コンストラクタ
     * デフォルトはスート無しとして扱う
     */
    public Joker() {
        super(CardSuit.JOKER, 0);
    }

    /**
     * 数を変更する
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * スートを変更する
     */
    public void setSuit(CardSuit suit) {
        this.suit = suit;
    }

    /**
     * カードを文字列で表現する
     */
    public String toString() {
        return CardSuit.JOKER.value();
    }

}
