package sandbox.sample.oop.janken;

public class Player {

  /**
   * じゃんけんの手を表す
   * TODO ENUMにすべきかも
   */
  public static final int STONE = 0;
  public static final int SCISSORS = 1;
  public static final int PAPER = 2;

  /**
   * プレイヤーの名前
   */
  private String name;

  private int winCount;

  public Player(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  /**
   * じゃんけんの手を出す
   */
  public int showHand() {
    var randomNumber = Math.random() * 3;
    if (randomNumber < 1) {
      return STONE;
    }
    if (randomNumber < 2) {
      return SCISSORS;
    }
    return PAPER;
  }

  /**
   * 審判から勝敗を聞く
   */
  public void notifyResult(boolean result) {
    if (result) {
      this.winCount++;
    }
  }

  /**
   * 勝った回数を取得する
   */
  public int getWinCount() {
    return this.winCount;
  }
}
