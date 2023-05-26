package sinergy.modul_3.shop.data.service;

import sinergy.modul_3.shop.data.datasource.cart.CartDataSource;
import sinergy.modul_3.shop.data.datasource.catalog.CatalogDataSource;
import sinergy.modul_3.shop.data.datasource.order.OrderDataSource;
import sinergy.modul_3.shop.data.models.CartItem;
import sinergy.modul_3.shop.data.models.Order;
import sinergy.modul_3.shop.data.models.Product;

import java.util.ArrayList;

public class ShopService {
    final CartDataSource cartDataSource;
    final CatalogDataSource catalogDataSource;
    final OrderDataSource orderDataSource;

    public ShopService(CartDataSource cartDataSource, CatalogDataSource catalogDataSource, OrderDataSource orderDataSource) {
        this.cartDataSource = cartDataSource;
        this.catalogDataSource = catalogDataSource;
        this.orderDataSource = orderDataSource;
    }

    public ArrayList<Product> getCatalog() {
        return catalogDataSource.getCatalog();
    }

    public boolean addToCart(String productId, int count) {
        ArrayList<Product> products = getCatalog();
        for (Product p : products) {
            if (p.id.equals(productId)) {
                cartDataSource.addToCart(p, count);
                return true;
            }
        }
        return false;
    }

    public ArrayList<CartItem> getCart() {
        return cartDataSource.getCart();
    }

    public void createOrder(String name, String phone, String address, String paymentTime, String deliveryTime) {
        ArrayList<CartItem> cart = getCart();
        Order order = new Order(name, phone, address,paymentTime,deliveryTime,cart);
        orderDataSource.createOrder(order);
    }
}
