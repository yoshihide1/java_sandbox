package sandbox.sample.training.customer_p114;

/**
 * 購入履歴
 */
record PurchaseHistory(
        int totalAmount,
        int purchaseFrequencyPerMonth,
        float returnRate) {

    /**
     * コンパクトコンストラクタ
     * https://docs.oracle.com/javase/jp/15/language/records.html
     * 
     * @param totalAmount
     * @param purchaseFrequencyPerMonth
     * @param returnRate
     */
    public PurchaseHistory {
        if (totalAmount < 0) {
            throw new IllegalArgumentException("合計金額は0以上で指定してください");
        }
        if (purchaseFrequencyPerMonth < 0) {
            throw new IllegalArgumentException("購入周期は0以上で指定してください");
        }
        if (returnRate < 0) {
            throw new IllegalArgumentException("返品率は0以上で指定してください");
        }
        // 上記の検証後に暗黙的にフィールドに代入される
    }
}
