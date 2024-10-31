package sandbox.sample.oop.oldmaid;

import sandbox.sample.oop.framework.trump.Card;
import sandbox.sample.oop.framework.trump.Master;
import sandbox.sample.oop.framework.trump.Player;
import sandbox.sample.oop.framework.trump.Rule;
import sandbox.sample.oop.framework.trump.Table;

public class OldMaidPlayer extends Player {
    /** 裏側から見た手札 */
    private BackHand backHand = new BackHand(this.myHand);

    public OldMaidPlayer(String name, Master master, Table table, Rule rule) {
        super(name, master, table, rule);
    }

    /**
     * カードを配る
     */
    @Override
    public void receiveCard(Card card) {
        super.receiveCard(card);
        playIfCandidateExists();

    }

    /**
     * 候補のカードをテーブルに出す
     */
    private void playIfCandidateExists() {
        var candidateCard = this.rule.findCandidate(this.myHand, this.table);
        if (candidateCard.isPresent()) {
            System.out.println(this + ":");
            this.table.putCard(candidateCard.get());
            if (this.myHand.getNumberOfCards() == 0) {
                this.master.declareWin(this);
            }
        }
        System.out.println(this + ":残りの手札は " + this.myHand + "です");
    }

    /**
     * プレイする
     */
    @Override
    public void play(Player nextPlayer) {
        var nextHand = ((OldMaidPlayer) nextPlayer).showHand();
        var numberOfHand = nextHand.getNumberOfCards();
        var pickedCard = nextHand.pickCard((int) Math.random() * numberOfHand);
        System.out.println(this + ":" + nextPlayer + "さんから " + pickedCard + " を引きました");

        this.myHand.addCard(pickedCard);

        playIfCandidateExists();

    }

    /**
     * 手札を見せる
     * 
     * @return 自分の手札
     */
    private BackHand showHand() {
        if (this.myHand.getNumberOfCards() == 1) {
            this.master.declareWin(this);
        }
        this.myHand.shuffle();
        return this.backHand;
    }

}
