package sandbox.sample.oop.oldmaid;

import sandbox.sample.oop.framework.trump.Card;
import sandbox.sample.oop.framework.trump.Hand;

/**
 * 裏側からみた手札クラス
 * カードを引かせる際に必要なメソッドのみに制限している
 */
public class BackHand {

    private Hand hand;

    public BackHand(Hand hand) {
        this.hand = hand;
    }

    /**
     * 枚数を数える
     */
    public int getNumberOfCards() {
        return this.hand.getNumberOfCards();
    }

    /**
     * カードを引く
     * 引いたカードは手札から削除される
     */
    public Card pickCard(int position) {
        return this.hand.pickCard(position);
    }
}
