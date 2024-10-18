package sandbox.sample.training.customer_p114;

public class CustomerSample {
    public static void main(String[] args) {
        var history = new PurchaseHistory(10000000, 10, 0.01f);
        showCustomerLank(history);
    }

    /**
     * 顧客のランクを表示する
     * 
     * @param history
     */
    private static void showCustomerLank(PurchaseHistory history) {
        var lank = new CustomerLank(history);
        lank.show();
    }

}
