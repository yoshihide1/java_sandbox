package sandbox.sample.oop.oldmaid;

import java.util.Optional;

import sandbox.sample.oop.framework.trump.Card;
import sandbox.sample.oop.framework.trump.Hand;
import sandbox.sample.oop.framework.trump.Rule;
import sandbox.sample.oop.framework.trump.Table;

/**
 * ババ抜きのルール
 */
public class OldMaidRule implements Rule {

    @Override
    public Optional<Card[]> findCandidate(Hand hand, Table table) {
        var numberOfCards = hand.getNumberOfCards();
        for (var i = numberOfCards - 1; i >= 0; i--) {
            var candidateCate = hand.lookCard(i);
            for (var j = i - 1; j >= 0; j--) {
                var compareCard = hand.lookCard(j);
                if (candidateCate.getNumber() == compareCard.getNumber()) {
                    return Optional.of(new Card[] { hand.pickCard(i), hand.pickCard(j) });
                }
            }
        }
        return Optional.empty();
    }

}
