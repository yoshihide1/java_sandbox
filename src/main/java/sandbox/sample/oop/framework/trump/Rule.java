package sandbox.sample.oop.framework.trump;

import java.util.Optional;

public interface Rule {

    /**
     * テーブルにおけるカードを探す
     */
    public Optional<Card[]> findCandidate(Hand hand, Table table);
}
