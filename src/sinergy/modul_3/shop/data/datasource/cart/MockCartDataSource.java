package sinergy.modul_3.shop.data.datasource.cart;

import sinergy.modul_3.shop.data.models.CartItem;
import sinergy.modul_3.shop.data.models.Product;

import java.util.AbstractList;
import java.util.ArrayList;

public class MockCartDataSource extends CartDataSource {
    private ArrayList<CartItem> cart = new ArrayList<>();

    @Override
    public void addToCart(Product product, int count) {
        cart.add(new CartItem(product, count));
    }

    @Override
    public AbstractList<CartItem> getCart() {
        return cart;
    }
}
