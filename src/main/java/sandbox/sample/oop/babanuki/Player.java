package sandbox.sample.oop.babanuki;

public class Player {
    /** 進行役 */
    private Master master;

    private Table table;

    private Hand myHand = new Hand();

    private String name;

    Player(String name, Master master, Table table) {
        this.name = name;
        this.master = master;
        this.table = table;
    }

    /**
     * 順番を指名する
     */
    void play(Player nextPlayer) {
        var nextHand = nextPlayer.showHand();
        var pickedCard = nextHand.pickCard();
        System.out.println(this + ":" + nextPlayer + "さんから " + pickedCard + " を引きました");
        dealCard(pickedCard);
        if (this.myHand.getNumberOfCards() == 0) {
            master.declareWin(this);
        } else {
            System.out.println(this + ":残りの手札は " + this.myHand + "です");
        }
    }

    /**
     * 手札を見せる
     * 
     * @return
     */
    Hand showHand() {
        // この時点で残り1枚なら上りになるので宣言する
        if (this.myHand.getNumberOfCards() == 1) {
            master.declareWin(this);
        }
        this.myHand.shuffle();
        return this.myHand;
    }

    /**
     * 進行役からカードを受け取る
     * 受け取ったときに同じカードがあれば捨てる
     */
    void receiveCard(Card card) {
        dealCard(card);
    }

    /**
     * カードを自分の手札に加え、同じカードがあったら捨てる
     * 
     * @param card
     */
    private void dealCard(Card card) {
        this.myHand.addCard(card);
        var sameCards = this.myHand.findSameNumberCard();
        if (sameCards.isPresent()) {
            System.out.print(this + ":");
            table.disposeCard(sameCards.get());
        }
    }

    public String toString() {
        return this.name;
    }
}
