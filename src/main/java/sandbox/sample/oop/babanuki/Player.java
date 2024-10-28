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
        // 次のプレイヤーに手札を出してもらう
        var nextHand = nextPlayer.showHand();

        // 相手の手札からカードを引く
        var pickedCard = nextHand.pickCard();

        // 引いた結果を表示
        System.out.println(this + ":" + nextPlayer + "さんから " + pickedCard + " を引きました");

        // 引いたカードを自分の手札に加え同じカードがあったら捨てる
        dealCard(pickedCard);

        // 手札が0になったかどうか調べる
        if (this.myHand.getNumberOfCards() == 0) {
            // 進行役に上がりを宣言する
            master.declareWin(this);
        } else {
            // 現在の手札を表示する
            System.out.println(this + ":残りの手札は " + this.myHand + "です");
        }
    }

    /**
     * 手札を見せる
     * 
     * @return
     */
    Hand showHand() {
        // この時点で残り位置枚なら上りになるので宣言する
        if (this.myHand.getNumberOfCards() == 1) {
            master.declareWin(this);
        }

        // 見せる前にシャッフルする
        this.myHand.shuffle();
        return this.myHand;
    }

    /**
     * カードを受け取る
     */
    void receiveCard(Card card) {
        // 引いたカードを自分の手札に加え、同じ数のカードがあったら捨てる
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
        // 同じカードの組み合わせが存在した場合
        if (sameCards != null) {
            System.out.print(this + ":");
            table.disposeCard(sameCards);
        }
    }

    public String toString() {
        return this.name;
    }
}
