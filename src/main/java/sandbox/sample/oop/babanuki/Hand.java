package sandbox.sample.oop.babanuki;

import java.util.ArrayList;
import java.util.List;

/**
 * 手札を表すクラス
 */
public class Hand {
    private List<Card> hand = new ArrayList<Card>();

    /**
     * カードを加える
     */
    void addCard(Card card) {
        hand.add(card);
    }

    /**
     * カードを引く
     */
    Card pickCard() {
        var pickedCard = hand.remove(0);
        return pickedCard;
    }

    /**
     * シャッフルする
     */
    void shuffle() {
        var number = hand.size();

        for (int i = 0; i < number; i++) {
            var position = (int) Math.random() * number;
            var pickedCard = hand.remove(position);

            hand.add(pickedCard);
        }
    }

    /**
     * 枚数を数える
     */
    int getNumberOfCards() {
        return this.hand.size();
    }

    /**
     * 同じ数のカードを探す。
     * ない場合はNull
     */
    Card[] findSameNumberCard() {
        var numberOfCards = this.hand.size();
        Card[] sameCards = null; // ArrayListでEmptyとかにすべき？

        if (numberOfCards > 0) {
            // 最後に追加されたカードを取得する
            var lastIndex = numberOfCards - 1;
            var lastAddedCard = hand.get(lastIndex);
            // 最後に追加されたカードの数字を取得する
            var lastAddedCardNumber = lastAddedCard.getNumber();

            for (int i = 0; i < lastIndex; i++) {
                var card = hand.get(i);
                if (card.getNumber() == lastAddedCardNumber) {
                    // 最後に追加されたカードを同じカードが見つかった場合その組み合わせを代入する
                    sameCards = new Card[2];
                    sameCards[0] = hand.remove(lastIndex);
                    sameCards[1] = hand.remove(i);
                    break;
                }
            }
        }
        return sameCards;
    }

    /**
     * 手札にあるカードを文字列で表現する
     */
    public String toString() {
        var stringBuffer = new StringBuffer();
        var size = this.hand.size();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                var card = hand.get(i);

                stringBuffer.append(card);
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();

    }
}
