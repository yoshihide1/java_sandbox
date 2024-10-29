package sandbox.sample.oop.fantan;

import sandbox.sample.oop.framework.trump.Card;
import sandbox.sample.oop.framework.trump.Master;
import sandbox.sample.oop.framework.trump.Player;
import sandbox.sample.oop.framework.trump.Rule;
import sandbox.sample.oop.framework.trump.Table;

/**
 * 七並べプレイヤークラス
 */
public class FantanPlayer extends Player {

    private int pass = 0;

    public FantanPlayer(String name, Master master, Table table, Rule rule) {
        super(name, master, table, rule);
    }

    /**
     * カードを配る
     * 7だった場合はそのままテーブルに置く
     * 
     * @param card
     */
    @Override
    public void receiveCard(Card card) {

        if (card.getNumber() == 7) {
            System.out.println(this.name + ":" + card + "置きました");
            this.table.putCard(new Card[] { card });

        } else {
            super.receiveCard(card);
        }

    }

    @Override
    public void play(Player nextPlayer) {
        System.out.println(" " + this.myHand);
        var candidate = rule.findCandidate(super.myHand, super.table);
        if (candidate != null) {
            System.out.println(" " + candidate[0] + "を置きました。");
            super.table.putCard(candidate);
            System.out.println(this.table);

            if (this.myHand.getNumberOfCards() == 0) {
                this.master.declareWin(this);
            }
        } else {
            this.pass++;
            ((FantanMaster) this.master).pass(this); // 気になる...
            if (this.pass > FantanMaster.PASS_LIMIT) {
                var numberOfHand = this.myHand.getNumberOfCards();
                for (var count = 0; count < numberOfHand; count++) {
                    this.table.putCard(new Card[] { this.myHand.pickCard(0) });
                }
            }
        }
    }

    /**
     * 
     * @return パスした回数
     */
    public int getPass() {
        return this.pass;
    }

}
