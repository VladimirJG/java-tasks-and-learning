package sinergy.modul_3.shop.data.common;

import java.util.Scanner;

public class PageLoop {
    final AppView view;

    public PageLoop(AppView view) {
        this.view = view;
    }

    public void run() {
        while (true) {
            view.action();
            displayChildren();
            Scanner in = new Scanner(System.in);
            int value = in.nextInt();
            if (value < 0 || value > view.children.size() + 1) {
                System.out.println("Неверное сообщение");
            } else if (value == view.children.size() + 1) {
                break;
            } else {
                AppView selectedView = view.children.get(value - 1);
                new PageLoop(selectedView).run();
            }
        }
    }

    void displayChildren() {
        System.out.println(view.title);
        System.out.println("Выбери от 1 до " + (view.children.size() + 1) + "");
        for (int i = 0; i < view.children.size(); i++) {
            AppView vview = view.children.get(i);
            System.out.println(i + 1 + " - " + vview.title);
        }
        System.out.println(view.children.size() + 1 + " - Возврат в предыдущее меню");
    }
}
