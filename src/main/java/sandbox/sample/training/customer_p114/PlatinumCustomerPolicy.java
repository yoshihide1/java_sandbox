package sandbox.sample.training.customer_p114;

/**
 * プラチナ会員の方針
 */
public class PlatinumCustomerPolicy {
    private final ExcellentCustomerPolicy policy;

    PlatinumCustomerPolicy() {
        this.policy = new ExcellentCustomerPolicy();
        this.policy.add(new PlatinumCustomerPurchaseAmountRule());
        this.policy.add(new PurchaseFrequencyRule());
    }

    /**
     * 
     * @param history 購入履歴
     * @return ルールをすべて満たす場合にtrue
     */
    boolean complyWithAll(final PurchaseHistory history) {
        return this.policy.complyWithAll(history);
    }
}
