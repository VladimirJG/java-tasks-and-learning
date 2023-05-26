package sinergy.modul_3.shop.data.datasource.catalog;

import sinergy.modul_3.shop.data.models.Product;

import java.util.ArrayList;

public class MockCatalogDataSource extends CatalogDataSource {
    @Override
    public ArrayList<Product> getCatalog() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("01", "Phone", "Tak sebe", 12000, true));
        products.add(new Product("17", "milk", "overdue", 64, true));
        products.add(new Product("08", "Headphones", "Lenkovo", 2537, false));
        products.add(new Product("56", "Car", "Bently", 12_000_000, true));
        products.add(new Product("69", "Prostitute", "Malenia", 15_000, true));
        return products;
    }
}
