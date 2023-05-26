package sinergy.modul_3.shop.data.common;

import java.util.ArrayList;

public abstract class AppView {
public final String title;
public final ArrayList<AppView> children;

    public AppView(String title, ArrayList<AppView> children) {
        this.title = title;
        this.children = children;
    }

    public abstract void action();
}
