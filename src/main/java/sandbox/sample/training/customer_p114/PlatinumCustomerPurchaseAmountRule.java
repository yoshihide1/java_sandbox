package sandbox.sample.training.customer_p114;

/**
 * PlatinumCustomerPurchaseAmountRule
 */
public class PlatinumCustomerPurchaseAmountRule implements ExcellentCustomerRule {

    private final int TOTAL_AMOUNT = 1000000;

    @Override
    public boolean ok(PurchaseHistory history) {
        return TOTAL_AMOUNT <= history.totalAmount();
    }

}