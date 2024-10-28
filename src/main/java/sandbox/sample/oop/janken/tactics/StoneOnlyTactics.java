package sandbox.sample.oop.janken.tactics;

import sandbox.sample.oop.janken.Hand;

/** グー大好き戦略 */
public class StoneOnlyTactics implements Tactics {

    @Override
    public Hand readTactics() {
        return Hand.STONE;
    }

}
