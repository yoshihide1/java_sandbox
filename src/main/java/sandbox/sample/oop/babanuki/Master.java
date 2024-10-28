package sandbox.sample.oop.babanuki;

import java.util.ArrayList;
import java.util.List;

public class Master {
    private List<Player> players = new ArrayList<>();

    /**
     * トランプを進行役の手札をして渡す
     */
    public void prepareGame(Hand cards) {
        System.out.println("【カードを配ります】");
        cards.shuffle();

        var numberOfCards = cards.getNumberOfCards();

        var numberOfPlayers = players.size();

        for (int i = 0; i < numberOfCards; i++) {
            var card = cards.pickCard();
            var player = players.get(i % numberOfPlayers);
            player.receiveCard(card);
        }
    }

    /**
     * ゲームを開始する
     */
    public void startGame() {
        System.out.println("【ばば抜きを開始します】");

        // プレイヤーの人数を取得する
        for (int i = 0; players.size() > 1; i++) { // プレイヤーが2人以上の場合はゲームが続行されるためこのような条件になっている
            var playerIndex = i % players.size();
            var nextPlayerIndex = (i + 1) % players.size();
            // 指名するプレイヤーの取得
            var player = players.get(playerIndex);
            var nextPlayer = players.get(nextPlayerIndex);

            System.out.println(player + "さんの番です");
            player.play(nextPlayer);
        }
        System.out.println("【ババ抜きが終了しました】");
    }

    /**
     * 上がり宣言をする
     */
    public void declareWin(Player winner) {
        System.out.println(winner + "さんが上がりました！");

        // 上がったプレイヤーをリストから外す
        players.remove(players.indexOf(winner));

        // 残りが一人の場合は敗者を表示する
        if (players.size() == 1) {
            var loser = players.get(0);
            System.out.println(loser + "さんの負けです！");
        }
    }

    /**
     * ゲームに参加するプレイヤーを登録する
     */
    public void registerPlayer(Player player) {
        players.add(player);
    }
}
