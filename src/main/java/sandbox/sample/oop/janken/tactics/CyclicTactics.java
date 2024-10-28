package sandbox.sample.oop.janken.tactics;

/**
 * グー、チョキ、パーの順番で出す戦略
 */
public class CyclicTactics implements Tactics {

    private int lastHand = -1;

    @Override
    public int readTactics() {
        this.lastHand = (this.lastHand + 1) % 3;
        return this.lastHand;
    }

}
