package sandbox.sample.oop.oldmaid;

import sandbox.sample.oop.framework.trump.Card;
import sandbox.sample.oop.framework.trump.CardSuit;
import sandbox.sample.oop.framework.trump.Hand;
import sandbox.sample.oop.framework.trump.Joker;

public class ObjectOldMaid {

    public static void main(String[] args) {
        var master = new OldMaidMaster();
        var table = new OldMaidTable();
        var rule = new OldMaidRule();

        var saito = new OldMaidPlayer("斎藤", master, table, rule);
        var murata = new OldMaidPlayer("村田", master, table, rule);
        var kojima = new OldMaidPlayer("児島", master, table, rule);

        master.registerPlayers(saito, murata, kojima);

        master.prepareGame(createTrump());
        master.startGame();

    }

    private static Hand createTrump() {
        var trump = new Hand();
        for (var i = 1; i < Card.CARD_NUM; i++) {
            trump.addCard(new Card(CardSuit.CLUB, i));
            trump.addCard(new Card(CardSuit.SPADE, i));
            trump.addCard(new Card(CardSuit.DIAMOND, i));
            trump.addCard(new Card(CardSuit.HEART, i));
        }
        trump.addCard(new Joker());
        return trump;
    }
}
