package sandbox.sample.oop.babanuki;

/**
 * ババ抜き実行クラス
 */
public class ObjectOldMail {
    public static void main(String[] args) {
        var master = new Master();

        var table = new Table();

        var murata = new Player("村田", master, table);
        var yamada = new Player("山田", master, table);
        var saito = new Player("斎藤", master, table);

        master.registerPlayer(murata);
        master.registerPlayer(yamada);
        master.registerPlayer(saito);

        // トランプを生成する
        var trump = createTrump();
        master.prepareGame(trump);

        master.startGame();
    }

    private static Hand createTrump() {
        var trump = new Hand();
        for (int number = 1; number <= 13; number++) {
            trump.addCard(new Card(Card.SUIT_CLUB, number));
            trump.addCard(new Card(Card.SUIT_DIAMOND, number));
            trump.addCard(new Card(Card.SUIT_HEART, number));
            trump.addCard(new Card(Card.SUIT_SPADE, number));
        }
        trump.addCard(new Card(0, Card.JOKER));
        return trump;
    }
}
