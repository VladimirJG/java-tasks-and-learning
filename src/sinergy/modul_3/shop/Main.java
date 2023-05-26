package sinergy.modul_3.shop;

import sinergy.modul_3.shop.data.datasource.cart.CartDataSource;
import sinergy.modul_3.shop.data.datasource.cart.MockCartDataSource;
import sinergy.modul_3.shop.data.datasource.catalog.CatalogDataSource;
import sinergy.modul_3.shop.data.datasource.catalog.MockCatalogDataSource;
import sinergy.modul_3.shop.data.datasource.order.MockOrderDataSource;
import sinergy.modul_3.shop.data.datasource.order.OrderDataSource;
import sinergy.modul_3.shop.data.service.ShopService;

public class Main {
    public static void main(String[] args) {
        CatalogDataSource catalogDataSource = new MockCatalogDataSource();
        CartDataSource cartDataSource = new MockCartDataSource();
        OrderDataSource orderDataSource = new MockOrderDataSource();
        ShopService shopService = new ShopService(cartDataSource,catalogDataSource,orderDataSource);

        System.out.println(shopService.getCatalog());
        System.out.println(shopService.getCart());
        System.out.println(shopService.addToCart(shopService.getCatalog().get(0).id,5));
        System.out.println(shopService.getCart());
    }
}
