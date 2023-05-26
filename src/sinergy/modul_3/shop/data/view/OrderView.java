package sinergy.modul_3.shop.data.view;

import sinergy.modul_3.shop.data.common.AppView;
import sinergy.modul_3.shop.data.service.ShopService;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderView extends AppView {
    final ShopService shopService;

    public OrderView(ShopService shopService) {
        super("Страница заказа", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите свое имя");
        String name = in.nextLine();
        System.out.println("Введите свой номер телефона");
        String phone = in.nextLine();
        shopService.createOrder(name, phone, "address", "Visa", "aniTime");
    }

}
