package sinergy.modul_3.shop.data.datasource.cart;

import sinergy.modul_3.shop.data.models.CartItem;
import sinergy.modul_3.shop.data.models.Product;

import java.util.ArrayList;

public abstract class CartDataSource {
    public abstract void addToCart(Product product, int count);
    public abstract ArrayList<CartItem> getCart();
}
