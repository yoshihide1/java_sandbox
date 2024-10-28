package sandbox.sample.oop.babanuki;

/**
 * トランプのカードを表すクラス
 */
/**
 * Card
 */
record Card(CardSuit suit, CardNumber number) {

    /**
     * 数字を取得する
     * 
     * @return
     */
    int getNumber() {
        return this.number.value();
    }

    /**
     * カードの文字列を見る
     */
    public String toString() {
        var stringBuffer = new StringBuffer();

        if (getNumber() > 0) {
            stringBuffer.append(this.suit.getValue());
            stringBuffer.append(this.number.getStringValue());
        } else {
            stringBuffer.append("JK");
        }
        return stringBuffer.toString();

    }

}
