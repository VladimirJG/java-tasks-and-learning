package sinergy.modul_3.shop;

import sinergy.modul_3.shop.data.common.AppView;
import sinergy.modul_3.shop.data.common.PageLoop;
import sinergy.modul_3.shop.data.datasource.cart.CartDataSource;
import sinergy.modul_3.shop.data.datasource.cart.MockCartDataSource;
import sinergy.modul_3.shop.data.datasource.catalog.CatalogDataSource;
import sinergy.modul_3.shop.data.datasource.catalog.MockCatalogDataSource;
import sinergy.modul_3.shop.data.datasource.order.MockOrderDataSource;
import sinergy.modul_3.shop.data.datasource.order.OrderDataSource;
import sinergy.modul_3.shop.data.service.ShopService;
import sinergy.modul_3.shop.data.view.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CatalogDataSource catalogDataSource = new MockCatalogDataSource();
        CartDataSource cartDataSource = new MockCartDataSource();
        OrderDataSource orderDataSource = new MockOrderDataSource();
        ShopService shopService = new ShopService(cartDataSource,catalogDataSource,orderDataSource);

        AppView addToCartView = new AddToCartView(shopService);
        ArrayList<AppView> catalogChildren = new ArrayList<>();
        catalogChildren.add(addToCartView);

        AppView catalogView = new CatalogView(shopService,catalogChildren);

        AppView cartView = new CartView(shopService);

        AppView orderView = new OrderView(shopService);


        ArrayList<AppView> mainChildren = new ArrayList<>();
        mainChildren.add(catalogView);
        mainChildren.add(cartView);
        mainChildren.add(orderView);


        AppView mainView = new MainView(mainChildren);

        new PageLoop(mainView).run();


       /* System.out.println(shopService.getCatalog());
        System.out.println(shopService.getCart());
        System.out.println(shopService.addToCart(shopService.getCatalog().get(0).id,5));
        System.out.println(shopService.getCart());*/
    }
}
