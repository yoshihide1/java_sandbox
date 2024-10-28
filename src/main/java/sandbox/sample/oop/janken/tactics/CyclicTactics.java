package sandbox.sample.oop.janken.tactics;

import sandbox.sample.oop.janken.Hand;

/**
 * グー、チョキ、パーの順番で出す戦略
 */
public class CyclicTactics implements Tactics {

    private int lastHand = -1;

    @Override
    public Hand readTactics() {
        this.lastHand = (this.lastHand + 1) % 3;
        return Hand.fromValue(this.lastHand);
    }

}
