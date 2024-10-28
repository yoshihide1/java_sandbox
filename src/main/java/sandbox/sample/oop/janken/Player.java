package sandbox.sample.oop.janken;

import sandbox.sample.oop.janken.tactics.Tactics;

public class Player {

  /**
   * じゃんけんの手を表す
   * TODO ENUMにすべきかも
   */
  public static final int STONE = 0;
  public static final int SCISSORS = 1;
  public static final int PAPER = 2;

  private Tactics tactics;

  /**
   * プレイヤーの名前
   */
  private String name;

  private int winCount;

  Player(String name) {
    this.name = name;
  }

  String getName() {
    return this.name;
  }

  void setTactics(Tactics tactics) {
    this.tactics = tactics;
  }

  /**
   * じゃんけんの手を出す
   */
  int showHand() {
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
