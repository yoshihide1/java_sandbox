package sandbox.sample.oop.babanuki;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 手札を表すクラス
 */
class Hand {
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
        return hand.remove(0);
    }

    /**
     * シャッフルする
     */
    void shuffle() {
        var number = hand.size();
        for (int i = 0; i < number * 2; i++) {
            var position = (int) (Math.random() * number);
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
     * ない場合はempty
     */
    Optional<Card[]> findSameNumberCard() {
        if (this.hand.isEmpty()) {// 0の場合はなにもしない
            return Optional.empty();
        }

        // 最後に追加されたカードを取得する
        var lastIndex = getNumberOfCards() - 1;
        var lastAddedCard = hand.get(lastIndex);
        // 最後に追加されたカードの数字を取得する
        var lastAddedCardNumber = lastAddedCard.getNumber();
        var sameCards = removeHandCard(lastIndex, lastAddedCardNumber);

        return sameCards;
    }

    /**
     * 同じカードがあった場合に捨てる
     * 
     * @param lastIndex
     * @param lastAddedCardNumber
     * @return
     */
    private Optional<Card[]> removeHandCard(int lastIndex, int lastAddedCardNumber) {
        Card[] sameCards = null;
        for (int i = 0; i < lastIndex; i++) {
            var card = hand.get(i);
            if (card.getNumber() == lastAddedCardNumber) {
                sameCards = new Card[2];
                sameCards[0] = hand.remove(lastIndex);
                sameCards[1] = hand.remove(i);
                return Optional.of(sameCards);
            }
        }
        return Optional.empty();
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
