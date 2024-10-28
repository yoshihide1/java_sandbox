package sandbox.sample.oop.janken.tactics;

import sandbox.sample.oop.janken.Player;

/** グー大好き戦略 */
public class StoneOnlyTactics implements Tactics {

    @Override
    public int readTactics() {
        return Player.STONE;
    }

}
