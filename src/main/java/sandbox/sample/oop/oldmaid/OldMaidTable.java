package sandbox.sample.oop.oldmaid;

import java.util.ArrayList;
import java.util.List;

import sandbox.sample.oop.framework.trump.Card;
import sandbox.sample.oop.framework.trump.Table;

/**
 * カードを捨てるフィールド
 */
public class OldMaidTable implements Table {

    private List<Card[]> field = new ArrayList<>();

    @Override
    public void putCard(Card[] card) {
        System.out.println(card[0] + "を捨てました");
        this.field.add(card);
    }

    /**
     * 使わない
     */
    @Override
    public Card[][] getCards() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCards'");
    }

}
