package sandbox.sample.oop.framework.trump;

public interface Rule {

    /**
     * テーブルにおけるカードを探す
     */
    public Card[] findCandidate(Hand hand, Table table);
}
