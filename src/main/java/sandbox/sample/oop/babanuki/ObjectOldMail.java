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

        master.registerPlayers(murata, yamada, saito);

        // トランプを生成する
        var trump = createTrump();
        master.prepareGame(trump);

        master.startGame();
    }

    private static Hand createTrump() {
        var trump = new Hand();
        for (int number = 1; number <= 13; number++) {
            var cardNumber = new CardNumber(number);
            trump.addCard(new Card(CardSuit.CLUB, cardNumber));
            trump.addCard(new Card(CardSuit.DIAMOND, cardNumber));
            trump.addCard(new Card(CardSuit.HEART, cardNumber));
            trump.addCard(new Card(CardSuit.SPADE, cardNumber));
        }
        trump.addCard(new Card(CardSuit.JOKER, CardNumber.JOKER));
        return trump;
    }
}
