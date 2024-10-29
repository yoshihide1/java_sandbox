package sandbox.sample.oop.framework.trump;

public interface Table {

    /**
     * カードを置く
     */
    public void putCard(Card[] card);// TODO Listじゃだめなのか？

    /**
     * カードを見る
     */
    public Card[][] getCards();// TODO Listじゃだめなのか？
}
