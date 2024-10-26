package sandbox.sample.oop.janken;

public class ObjectJanken {

  public static void main(String[] args) {
    var judge = new Judge();

    var player1 = new Player("村田さん");
    var player2 = new Player("山田さん");

    judge.startJanken(player1, player2);
  }
}
