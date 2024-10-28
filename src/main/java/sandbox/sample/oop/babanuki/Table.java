package sandbox.sample.oop.babanuki;

import java.util.ArrayList;
import java.util.List;

/**
 * テーブルを表すクラス
 */
class Table {

    /** 捨てられたカード */
    private List<Card[]> disposedCards = new ArrayList<>();

    /**
     * カードを捨てる
     */
    void disposeCard(Card cards[]) {
        for (int i = 0; i < cards.length; i++) {
            System.out.print(cards[i] + " ");
        }
        System.out.print("を捨てました\n");

        disposedCards.add(cards);
    }
}
