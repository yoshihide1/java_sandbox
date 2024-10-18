package sandbox.sample.training.customer_p114;

/**
 * 返品率のルール
 */
public class ReturnRateRule implements ExcellentCustomerRule {
    private static final float RETURN_RATE = 0.001f;

    @Override
    public boolean ok(PurchaseHistory history) {
        return RETURN_RATE >= history.returnRate();
    }

}
