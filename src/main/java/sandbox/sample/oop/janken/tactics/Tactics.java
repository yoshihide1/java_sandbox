package sandbox.sample.oop.janken.tactics;

/**
 * じゃんけんの戦略インターフェース
 */
public interface Tactics {

    /**
     * 戦略を読み、じゃんけんの手を得る
     * 
     * @return
     */
    public int readTactics();
}
