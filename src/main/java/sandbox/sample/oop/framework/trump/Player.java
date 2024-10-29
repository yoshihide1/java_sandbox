package sandbox.sample.oop.framework.trump;

/**
 * プレイヤーを表すクラス
 */
public abstract class Player {

    /** 名前 */
    protected String name;

    /** 進行役 */
    protected Master master;

    /** フィールド */
    protected Table table;

    /** 手札 */
    protected Hand myHand;

    /** ルール */
    protected Rule rule;

    public Player(String name, Master master, Table table, Rule rule) {
        this.name = name;
        this.master = master;
        this.table = table;
        this.rule = rule;
        this.myHand = new Hand();
    }

    /**
     * 順番を指名する
     * 
     * @param nextPlayer 次のプレイヤー
     */
    public abstract void play(Player nextPlayer);

    /**
     * カードを配る
     * カードを受け取るときの処理を拡張する場合は、本メソッドをサブクラスでオーバーライドすること
     * 
     * @param card 受け取ったカード
     */
    public void receiveCard(Card card) {
        this.myHand.addCard(card);
    }

    /**
     * プレイヤーの名前を返す
     * 
     * @return プレイヤーの名前
     */
    public String toString() {
        return this.name;
    }
}
