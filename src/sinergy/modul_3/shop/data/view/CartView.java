package sinergy.modul_3.shop.data.view;

import sinergy.modul_3.shop.data.common.AppView;
import sinergy.modul_3.shop.data.models.CartItem;
import sinergy.modul_3.shop.data.service.ShopService;

import java.util.ArrayList;

public class CartView extends AppView {
    public ShopService shopService;

    public CartView(ShopService shopService) {
        super("Корзина", new ArrayList<>());
        this.shopService = shopService;

    }

    @Override
    public void action() {
        ArrayList<CartItem> cart = shopService.getCart();
        for (CartItem item : cart){
            System.out.println(item.product.id + " " + item.product.title+" "+ item.product.price);
        }
        System.out.println();
    }
}
