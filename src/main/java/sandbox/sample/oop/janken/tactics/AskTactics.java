package sandbox.sample.oop.janken.tactics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import sandbox.sample.oop.janken.Hand;

/**
 * 標準入力によりじゃんけんの手をユーザーに聞く戦略クラス
 */
public class AskTactics implements Tactics {

    @Override
    public Hand readTactics() {
        var br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("じゃんけんの手を入力してください");
        System.out.println("0: グー, 1: チョキ, 2: パー");
        System.out.print("? ");

        int handNumber;

        while (true) {
            try {
                var inputString = br.readLine();
                handNumber = Integer.parseInt(inputString);
                return Hand.fromValue(handNumber);

            } catch (Exception ex) {
                System.out.println("入力が正しくありません。再度入力してください");
                System.out.print("? ");
            }
        }
    }

}
