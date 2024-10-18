package sandbox.sample.training.customer_p114;

import java.util.HashSet;
import java.util.Set;

/**
 * 優良顧客の方針を表現するクラス
 */
class ExcellentCustomerPolicy {
    private final Set<ExcellentCustomerRule> rules;

    ExcellentCustomerPolicy() {
        this.rules = new HashSet<>();
    }

    /**
     * ルールを追加する
     * 
     * @param rule
     */
    void add(final ExcellentCustomerRule rule) {
        this.rules.add(rule);
    }

    boolean complyWithAll(final PurchaseHistory history) {
        for (var rule : this.rules) {
            if (!rule.ok(history)) {
                return false;
            }
        }
        return true;
    }
}
