package sandbox.sample.oop.janken;

import sandbox.sample.oop.janken.tactics.Tactics;

class Player {

  /**
   * プレイヤーの名前
   */
  private final String name;

  /**
   * 戦略
   */
  private final Tactics tactics;

  private int winCount;

  Player(String name, Tactics cyclicTactics) {
    this.name = name;
    this.tactics = cyclicTactics;
  }

  String getName() {
    return this.name;
  }

  /**
   * じゃんけんの手を出す
   */
  Hand showHand() {
    var hand = this.tactics.readTactics();
    return hand;

  }

  /**
   * 審判から勝敗を聞く
   */
  void notifyResult(boolean result) {
    if (result) {
      this.winCount++;
    }
  }

  /**
   * 勝った回数を取得する
   */
  int getWinCount() {
    return this.winCount;
  }
}
