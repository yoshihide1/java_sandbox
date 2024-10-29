package sandbox.sample.oop.fantan;

import java.util.Objects;

import sandbox.sample.oop.framework.trump.Card;
import sandbox.sample.oop.framework.trump.Table;

/**
 * 七並べのテーブルを表すクラス
 */
public class FantanTable implements Table {

    private Card[][] table = new Card[Card.SUIT_NUM][Card.CARD_NUM];

    /**
     * カードを置く
     */
    @Override
    public void putCard(Card[] card) {
        var number = card[0].getNumber();
        var suit = card[0].getSuit();
        this.table[suit - 1][number - 1] = card[0];

    }

    /**
     * カードを見る
     */
    @Override
    public Card[][] getCards() {
        var copyTable = new Card[Card.SUIT_NUM][Card.CARD_NUM];
        for (var i = 0; i < Card.SUIT_NUM; i++) {
            System.arraycopy(this.table[i], 0, copyTable[i], 0, Card.CARD_NUM);
        }
        return copyTable;
    }

    /**
     * テーブルを文字列で表現する
     */
    public String toString() {
        var joiner = new StringBuilder();
        for (var i = 0; i < Card.SUIT_NUM; i++) {
            for (var j = 0; j < Card.CARD_NUM; j++) {
                var card = this.table[i][j];
                joiner.append(Objects.isNull(card) ? "..." : card.toString());
                if (j < Card.CARD_NUM - 1) {
                    joiner.append(", ");
                }
            }
            joiner.append("\n");
        }
        return joiner.toString();
    }

}
