package sandbox.sample.training.shopping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ショッピングカートを表すクラス
 */
public class Cart {
    private static final int MAX_PRODUCT_COUNT = 10;
    private final List<Product> products;

    public Cart() {
        this.products = new ArrayList<Product>();
    }

    private Cart(List<Product> products) {
        this.products = products;
    }

    /**
     * カートに商品を追加する
     * 
     * @param product
     */
    public Cart add(final Product product) {
        if (isFull()) {
            throw new RuntimeException(String.format("カートに追加できる商品は%s個までです。", MAX_PRODUCT_COUNT));
        }
        var adding = new ArrayList<>(this.products);
        adding.add(product);
        return new Cart(adding);
    }

    /**
     * 対象の商品をカートから削除する
     * 
     * @param product
     */
    public Cart remove(final Product product) {
        if (notExists(product)) {
            throw new IllegalArgumentException("カートの中に対象の商品がありません");
        }
        var removing = new ArrayList<>(this.products);
        removing.removeIf(p -> p.id() == product.id());
        return new Cart(removing);
    }

    /**
     * カートの中身を表示する
     */
    public void display() {
        this.products.stream().forEach(p -> {
            System.out.println(String.format("Id: %s", p.id()));
            System.out.println(String.format("Name: %s", p.name()));
            System.out.println(String.format("Price: %s", p.price()));
            System.out.println(String.format("Quantity: %s", p.quantity()));
        });
    }

    /**
     * 
     * @return カートの中身を取得する(変更不可)
     */
    public List<Product> getProducts() {
        return Collections.unmodifiableList(this.products);
    }

    /**
     * 
     * @return カート内の商品数を取得する
     */
    public int getCount() {
        return this.products.size();
    }

    /**
     * 
     * @return カートの中身がいっぱいの場合true
     */
    private boolean isFull() {
        return this.products.size() >= MAX_PRODUCT_COUNT;
    }

    /**
     * @return 指定された商品が存在しない場合にtrue
     */
    private boolean notExists(final Product product) {
        return this.products.stream().noneMatch(p -> p.id() == product.id());
    }

    /**
     * @return カートの中身を削除した新しいカートを返す
     */
    public Cart removeAll() {
        return new Cart();
    }

}
