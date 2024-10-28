package sandbox.sample.oop.janken.tactics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import sandbox.sample.oop.janken.Player;

/**
 * 標準入力によりじゃんけんの手をユーザーに聞く戦略クラス
 */
public class AskTactics implements Tactics {

    @Override
    public int readTactics() {
        var br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("じゃんけんの手を入力してください");
        System.out.println("0: グー, 1: チョキ, 2: パー");
        System.out.println("? ");

        int hand = 0;

        while (true) {
            try {
                var inputString = br.readLine();
                hand = Integer.parseInt(inputString);

                if (hand == Player.STONE || hand == Player.SCISSORS || hand == Player.PAPER) {
                    break;
                } else {
                    System.out.println("入力が正しくありません。再度入力してください");
                    System.out.print("? ");
                }
            } catch (Exception ex) {
                System.out.println("入力が正しくありません。再度入力してください");
                System.out.print("? ");
            }
        }
        return hand;
    }

}
