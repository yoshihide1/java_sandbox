package sandbox.sample.oop.janken.tactics;

import sandbox.sample.oop.janken.Hand;

/** ランダムに手を決める戦略クラス */
public class RandomTactics implements Tactics {

    @Override
    public Hand readTactics() {
        var randomNumber = (int) (Math.random() * 3);
        return Hand.fromValue(randomNumber);
    }

}
