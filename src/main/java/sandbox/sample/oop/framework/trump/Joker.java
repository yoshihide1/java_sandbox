package sandbox.sample.oop.framework.trump;

public class Joker extends Card {

    private static final String NAME = "JOKER";

    /**
     * コンストラクタ
     * デフォルトはスート無しとして扱う
     */
    public Joker() {
        super(0, 0);
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
    public void setSuit(int suit) { // 値オブジェクトに変える？
        this.suit = suit;
    }

    /**
     * カードを文字列で表現する
     */
    public String toString() {
        return NAME;
    }

}
