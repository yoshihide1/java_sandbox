package sandbox.sample.training.customer_p114;

/**
 * 顧客の会員ランクを表すクラス
 */
public class CustomerLank {

    private final PurchaseHistory purchaseHistory;
    private final PlatinumCustomerPolicy platinumCustomerPolicy;
    private final GoldCustomerPolicy goldCustomerPolicy;
    private final SilverCustomerPolicy silverCustomerPolicy;

    public CustomerLank(PurchaseHistory history) {
        this.purchaseHistory = history;
        this.platinumCustomerPolicy = new PlatinumCustomerPolicy();
        this.goldCustomerPolicy = new GoldCustomerPolicy();
        this.silverCustomerPolicy = new SilverCustomerPolicy();
    }

    /**
     * 会員ランクを表示する
     */
    public void show() {

        if (this.platinumCustomerPolicy.complyWithAll(purchaseHistory)) {
            System.out.println("プラチナ会員です");
            return;
        }
        if (this.goldCustomerPolicy.complyWithAll(purchaseHistory)) {
            System.out.println("ゴールド会員です");
            return;
        }
        if (this.silverCustomerPolicy.complyWithAll(purchaseHistory)) {
            System.out.println("シルバー会員です");
            return;
        }
        System.out.println("ブロンズ会員です");

    }
}
