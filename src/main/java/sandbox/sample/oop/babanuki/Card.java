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
        var stringBuffer = new StringBuffer();

        // スートを表す
        if (this.number > 0) {
            switch (this.suit) {
                case 1:
                    stringBuffer.append("S:");
                    break;
                case 2:
                    stringBuffer.append("D:");
                    break;
                case 3:
                    stringBuffer.append("C:");
                    break;
                case 4:
                    stringBuffer.append("H:");
                    break;
                default:
                    break;
            }
            // 数字を表す
            switch (this.number) {
                case 1:
                    stringBuffer.append("A");
                    break;
                case 10:
                    stringBuffer.append("T");
                    break;
                case 11:
                    stringBuffer.append("J");
                    break;
                case 12:
                    stringBuffer.append("Q");
                case 13:
                    stringBuffer.append("K");
                default:
                    stringBuffer.append(this.number);
                    break;
            }
        } else {
            stringBuffer.append("JK");
        }
        return stringBuffer.toString();

    }

}
