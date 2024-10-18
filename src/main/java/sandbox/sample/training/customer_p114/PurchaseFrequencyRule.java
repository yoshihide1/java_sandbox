package sandbox.sample.training.customer_p114;

/**
 * 購入頻度のルール
 */
class PurchaseFrequencyRule implements ExcellentCustomerRule {
    private static final int FREQUENCY = 10;

    @Override
    public boolean ok(PurchaseHistory history) {
        return FREQUENCY <= history.purchaseFrequencyPerMonth();
    }

}
