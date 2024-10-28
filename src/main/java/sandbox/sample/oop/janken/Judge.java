package sandbox.sample.oop.janken;

import java.util.Optional;

/**
 * 審判クラス
 */
public class Judge {

  /**
   * じゃんけんを開始する
   */
  public void startJanken(Player player1, Player player2, int roundCount) {
    System.out.println("【ジャンケン開始】\n");

    for (var i = 0; i < roundCount; i++) {
      System.out.println(String.format("【%s回戦目】", i + 1));

      var winner = judgeJanken(player1, player2);

      if (winner.isPresent()) {
        System.out.println(String.format("%sが勝ちました\n" + //
            "", winner.get().getName()));
        winner.get().notifyResult(true);
      } else {
        System.out.println("引き分けです\n");
      }
    }
    System.out.println("【ジャンケン終了】\n");

    var finalWinner = judgeFinalWinner(player1, player2);
    System.out.println(String.format("%d 対 %dで", player1.getWinCount(), player2.getWinCount()));

    if (finalWinner.isPresent()) {
      System.out.println(String.format("%sの勝ちです\n", finalWinner.get().getName()));
    } else {
      System.out.println("引き分けです\n");
    }

  }

  /**
   * 勝敗を決める
   * 
   * @param player1
   * @param player2
   * @return 引き分けの場合はempty
   */
  private Optional<Player> judgeJanken(Player player1, Player player2) {
    Player winner = null;
    var hand1 = player1.showHand();
    var hand2 = player2.showHand();
    printHand(hand1);
    System.out.println(" vs. ");
    printHand(hand2);

    // プレイヤー１が勝つ場合
    if (hand1.beats(hand2)) {
      winner = player1;
    } else if (hand2.beats(hand1)) {
      winner = player2;
    }
    return Optional.ofNullable(winner);

  }

  /**
   * 最終的な勝者を判定する
   * 
   * @param player1
   * @param player2
   * @return
   */
  private Optional<Player> judgeFinalWinner(Player player1, Player player2) {

    var winCount1 = player1.getWinCount();
    var winCount2 = player2.getWinCount();

    Player winner = null;
    if (winCount1 > winCount2) {
      winner = player1;
    } else if (winCount2 > winCount1) {
      winner = player2;
    }
    return Optional.ofNullable(winner);
  }

  /**
   * ジャンケンの手を表示する
   * 
   * @param hand
   */
  private void printHand(Hand hand) {
    System.out.println(hand.getName());

  }
}
