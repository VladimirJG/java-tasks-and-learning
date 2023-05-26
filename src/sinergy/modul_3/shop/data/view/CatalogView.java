package sinergy.modul_3.shop.data.view;

import sinergy.modul_3.shop.data.common.AppView;
import sinergy.modul_3.shop.data.models.Product;
import sinergy.modul_3.shop.data.service.ShopService;

import java.util.ArrayList;

public class CatalogView extends AppView {
    final ShopService shopService;

    public CatalogView(ShopService shopService, ArrayList<AppView> children) {
        super("Каталог", children);
        this.shopService = shopService;
    }

    @Override
    public void action() {
        ArrayList<Product> catalog = shopService.getCatalog();
        for (Product p : catalog) {
            System.out.println(p.id + " " + p.title + " " + p.price);
        }
        System.out.println();
    }
}
