package sandbox.sample.oop.janken;

import sandbox.sample.oop.janken.tactics.CyclicTactics;
import sandbox.sample.oop.janken.tactics.RandomTactics;

public class ObjectJanken {

  /**
   * TODO 参加者が3人以上の場合を考える！
   * 
   * @param args
   */
  public static void main(String[] args) {
    var judge = new Judge();

    var murata = new Player("村田さん", new CyclicTactics());
    var yamada = new Player("山田さん", new RandomTactics());

    judge.startJanken(murata, yamada, 10);
  }
}
