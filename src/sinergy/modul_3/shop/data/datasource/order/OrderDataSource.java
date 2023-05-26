package sinergy.modul_3.shop.data.datasource.order;

import sinergy.modul_3.shop.data.models.Order;

public abstract class OrderDataSource {
    public abstract void createOrder(Order order);

    public abstract Order getOrder();
}
