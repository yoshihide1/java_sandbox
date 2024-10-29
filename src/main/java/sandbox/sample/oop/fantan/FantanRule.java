package sandbox.sample.oop.fantan;

import sandbox.sample.oop.framework.trump.Card;
import sandbox.sample.oop.framework.trump.Hand;
import sandbox.sample.oop.framework.trump.Rule;
import sandbox.sample.oop.framework.trump.Table;

public class FantanRule implements Rule {

    /**
     * 場に出せるカードを探す
     * 
     * @return 出せるカードがない場合はnullを返す
     */
    @Override
    public Card[] findCandidate(Hand hand, Table table) {
        Card[] candidate = null;

        var numberOfHand = hand.getNumberOfCards();
        for (var position = 0; position < numberOfHand; position++) {
            var lockingCard = hand.lookCard(position);
            var number = lockingCard.getNumber();
            var suit = lockingCard.getSuit();

            // 左か右にカードがあれば、カードをおける
            var leftNumber = (number != 1) ? number - 1 : Card.CARD_NUM;
            var rightNumber = (number != Card.CARD_NUM) ? number + 1 : 1;

            if (isThereCard(table, suit, leftNumber) || isThereCard(table, suit, rightNumber)) {
                candidate = new Card[1];
                candidate[0] = hand.pickCard(position);
                break;
            }
        }
        return candidate;

    }

    /**
     * テーブルにカードが存在するか
     * 
     * @param table
     * @param suit
     * @param number
     * @return 存在する場合はtrue
     */
    private boolean isThereCard(Table table, int suit, int number) {
        var tableCard = table.getCards()[suit - 1][number - 1];
        return tableCard != null;
    }

}
