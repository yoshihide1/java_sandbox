package sandbox.sample.training.customer_p114;

interface ExcellentCustomerRule {

    /**
     * 
     * @param history 購入履歴
     * @return 条件を満たす場合はtrue
     */
    boolean ok(final PurchaseHistory history);
}
