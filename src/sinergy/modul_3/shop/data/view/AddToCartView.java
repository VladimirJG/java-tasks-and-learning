package sinergy.modul_3.shop.data.view;

import sinergy.modul_3.shop.data.common.AppView;
import sinergy.modul_3.shop.data.service.ShopService;

import java.util.ArrayList;
import java.util.Scanner;

public class AddToCartView extends AppView {
    final ShopService shopService;

    public AddToCartView(ShopService shopService) {
        super("Добавление товара в корзину", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Id  продукта");
        String productId = in.nextLine();
        if (productId == null) {
            return;
        }
        System.out.println("Введите позицию: ");
        int count = in.nextInt();
        final boolean res = shopService.addToCart(productId,count);
        if (res){
            System.out.println("Операция успешно завершена");
        }else{
            System.out.println("Ошибка выполнения операции");
        }
    }
}
