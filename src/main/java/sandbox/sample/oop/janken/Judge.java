package sandbox.sample.oop.janken;

/**
 * 審判クラス
 */
public class Judge {

  /**
   * じゃんけんを開始する
   */
  public void startJanken(Player player1, Player player2) {
    System.out.println("【ジャンケン開始】\n");

    for (var i = 0; i < 3; i++) {
      System.out.println(String.format("【%s回戦目】", i + 1));

      Player winner = judgeJanken(player1, player2);

      if (winner != null) {
        System.out.println(String.format("%sが勝ちました\n" + //
            "", winner.getName()));
        winner.notifyResult(true);
      } else {
        System.out.println("引き分けです\n");
      }
    }
    System.out.println("【ジャンケン終了】\n");

    var finalWinner = judgeFinalWinner(player1, player2);
    System.out.println(String.format("%d 対 %dで", player1.getWinCount(), player2.getWinCount()));

    if (finalWinner != null) {
      System.out.println(String.format("%sの勝ちです\n", finalWinner.getName()));
    } else {
      System.out.println("引き分けです\n");
    }

  }

  /**
   * 勝敗を決める
   * 
   * @param player1
   * @param player2
   * @return
   */
  private Player judgeJanken(Player player1, Player player2) {
    Player winner = null;
    var hand1 = player1.showHand();
    var hand2 = player2.showHand();
    printHand(hand1);
    System.out.println(" vs. ");
    printHand(hand2);

    // プレイヤー１が勝つ場合
    if ((hand1 == Player.STONE && hand2 == Player.SCISSORS) || (hand1 == Player.SCISSORS && hand2 == Player.PAPER)
        || (hand1 == Player.PAPER && hand2 == Player.STONE)) {
      winner = player1;

    } else if ((hand2 == Player.STONE && hand1 == Player.SCISSORS)
        || (hand2 == Player.SCISSORS && hand1 == Player.PAPER)
        || (hand2 == Player.PAPER && hand1 == Player.STONE)) {
      winner = player2;
    }
    return winner;

  }

  /**
   * 最終的な勝者を判定する
   * 
   * @param player1
   * @param player2
   * @return
   */
  private Player judgeFinalWinner(Player player1, Player player2) {
    Player winner = null;

    var winCount1 = player1.getWinCount();
    var winCount2 = player2.getWinCount();

    if (winCount1 > winCount2) {
      winner = player1;
    } else if (winCount2 > winCount1) {
      winner = player2;
    }
    return winner;
  }

  /**
   * ジャンケンの手を表示する
   * 
   * @param hand
   */
  private void printHand(int hand) {
    switch (hand) {
      case Player.STONE:
        System.out.println("グー");
        break;
      case Player.SCISSORS:
        System.out.println("チョキ");
        break;
      case Player.PAPER:
        System.out.println("パー");
      default:
        break;
    }

  }
}
