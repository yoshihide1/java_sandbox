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

    var murata = new Player("村田さん");
    var murataTactics = new CyclicTactics();
    murata.setTactics(murataTactics);
    var yamada = new Player("山田さん");
    var yamadaTactics = new RandomTactics();
    yamada.setTactics(yamadaTactics);

    judge.startJanken(murata, yamada);
  }
}
