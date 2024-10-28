package sandbox.sample.oop.janken.tactics;

import sandbox.sample.oop.janken.Hand;

/**
 * じゃんけんの戦略インターフェース
 */
public interface Tactics {

    /**
     * 戦略を読み、じゃんけんの手を得る
     * 
     * @return
     */
    public Hand readTactics();
}
