package sandbox.sample.oop.janken.tactics;

import sandbox.sample.oop.janken.Player;

/** ランダムに手を決める戦略クラス */
public class RandomTactics implements Tactics {

    @Override
    public int readTactics() {
        var randomNumber = Math.random() * 3;
        if (randomNumber < 1) {
            return Player.STONE;
        }
        if (randomNumber < 2) {
            return Player.SCISSORS;
        }
        return Player.PAPER;
    }

}
