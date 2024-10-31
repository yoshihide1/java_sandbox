package sandbox.sample.oop.framework.trump;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 手札を表すクラス
 */
public class Hand {
    private List<Card> hand = new ArrayList<Card>();

    /**
     * カードを加える
     */
    public void addCard(Card card) {
        this.hand.add(card);
    }

    /**
     * カードを見る
     * 
     * @return 指定された位置のカード
     */
    public Card lookCard(int position) {
        Card lookingCard = null;
        if (0 <= position && position < this.hand.size()) { // メソッドにする、対象の位置にカードがあるかの判定
            lookingCard = this.hand.get(position);
        }
        return lookingCard;
    }

    /**
     * カードを引く
     */
    public Card pickCard(int position) {
        Card pickedCard = null;
        if (0 <= position && position < this.hand.size()) { // メソッドにする、対象の位置にカードがあるかの判定
            pickedCard = this.hand.remove(position);
        }
        return pickedCard;
    }

    /**
     * シャッフルする
     */
    public void shuffle() {
        Collections.shuffle(this.hand);
    }

    /**
     * 手札の数を数える
     */
    public int getNumberOfCards() {
        return this.hand.size();
    }

    /**
     * 手札にあるカードを文字列で表現する
     */
    public String toString() {
        return this.hand.stream().map(Object::toString).collect(Collectors.joining(":"));
    }

}
