package sandbox.sample.training.customer_p114;

/**
 * ゴールド会員の購入金額ルール
 */
class GoldCustomerPurchaseAmountRule implements ExcellentCustomerRule {

    private static final int TOTAL_AMOUNT = 10000;

    @Override
    public boolean ok(PurchaseHistory history) {
        return TOTAL_AMOUNT <= history.totalAmount();
    }

}
