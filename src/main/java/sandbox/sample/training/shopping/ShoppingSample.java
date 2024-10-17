package sandbox.sample.training.shopping;

import java.util.ArrayList;
import java.util.List;

public class ShoppingSample {
    public static void main(String[] args) {
        var products = initialize();
        var cart = new Cart();

        for (var product : products) {
            cart = cart.add(product);
        }

        cart.display();
        var removed = cart.removeAll();

    }

    private static List<Product> initialize() {
        var list = new ArrayList<Product>();
        var product1 = new Product(1, "望遠鏡", 10000, 2);
        var product2 = new Product(2, "カミソリ", 1300, 3);
        var product3 = new Product(3, "植物", 800, 3);
        list.add(product1);
        list.add(product2);
        list.add(product3);
        return list;

    }
}
