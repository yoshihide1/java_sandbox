package sandbox.sample.oop.framework.trump;

import java.util.ArrayList;
import java.util.List;

public class Master {
    private List<Player> players = new ArrayList<>();

    /**
     * トランプを進行役の手札にして渡す（準備）
     */
    public void prepareGame(Hand cards) {
        System.out.println("【カードを配ります】");
        cards.shuffle();

        var numberOfCards = cards.getNumberOfCards();

        var numberOfPlayers = players.size();

        for (int i = 0; i < numberOfCards; i++) {
            var card = cards.pickCard(0);
            var player = players.get(i % numberOfPlayers);
            player.receiveCard(card);
        }
    }

    /**
     * ゲームを開始する
     */
    public void startGame() {
        System.out.println("【ゲームを開始します】");

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
        System.out.println("【ゲームを終了しました】");
    }

    /**
     * 上がり宣言をする
     */
    public void declareWin(Player winner) {
        System.out.println(winner + "さんが上がりました！");
        deregisterPlayer(winner);

    }

    /**
     * ゲームに参加するプレイヤーを登録する
     */
    public void registerPlayers(Player... players) {
        for (var player : players) {
            this.players.add(player);
        }
    }

    /**
     * ゲームに参加するプレイヤーを削除する
     * 勝ったプレイヤーをゲームから抜くときに使用する
     */
    public void deregisterPlayer(Player player) {
        // 上がったプレイヤーをリストから外す
        players.remove(players.indexOf(player));

        // 残りが一人の場合は敗者を表示する
        if (players.size() == 1) {
            var loser = players.get(0);
            System.out.println(loser + "さんの負けです！");
        }
    }
}
