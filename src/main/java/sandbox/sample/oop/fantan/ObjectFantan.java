package sandbox.sample.oop.fantan;

import sandbox.sample.oop.framework.trump.Card;
import sandbox.sample.oop.framework.trump.CardSuit;
import sandbox.sample.oop.framework.trump.Hand;

public class ObjectFantan {

    public static void main(String[] args) {
        var master = new FantanMaster();// 進行役
        var table = new FantanTable();
        var rule = new FantanRule();

        var saito = new FantanPlayer("斎藤さん", master, table, rule);
        var murata = new FantanPlayer("村田さん", master, table, rule);
        var kojima = new FantanPlayer("コジマさん", master, table, rule);

        master.registerPlayers(saito, murata, kojima);

        var trump = createTrump();
        master.prepareGame(trump);
        master.startGame();
    }

    /**
     * 52枚のトランプを生成する
     * 
     * @return
     */
    private static Hand createTrump() {
        var trump = new Hand();
        for (var number = 1; number <= Card.CARD_NUM; number++) {
            trump.addCard(new Card(CardSuit.CLUB, number));
            trump.addCard(new Card(CardSuit.DIAMOND, number));
            trump.addCard(new Card(CardSuit.HEART, number));
            trump.addCard(new Card(CardSuit.SPADE, number));
        }
        return trump;

    }

}
