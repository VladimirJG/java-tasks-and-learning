package sinergy.modul_3.shop.data.datasource.order;

import sinergy.modul_3.shop.data.models.Order;

public class MockOrderDataSource extends OrderDataSource{
    private Order order;
    @Override
    public void createOrder(Order order) {
        this.order = order;
    }

    @Override
    public Order getOrder() {
        return order;
    }
}
