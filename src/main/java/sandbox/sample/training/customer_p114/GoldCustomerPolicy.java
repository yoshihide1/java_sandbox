package sandbox.sample.training.customer_p114;

/**
 * ゴールド会員の方針
 */
class GoldCustomerPolicy {
    private final ExcellentCustomerPolicy policy;

    GoldCustomerPolicy() {
        this.policy = new ExcellentCustomerPolicy();
        this.policy.add(new GoldCustomerPurchaseAmountRule());
        this.policy.add(new PurchaseFrequencyRule());
        this.policy.add(new ReturnRateRule());
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
