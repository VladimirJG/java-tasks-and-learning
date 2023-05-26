package sinergy.modul_3.shop.data.datasource.catalog;

import sinergy.modul_3.shop.data.models.Product;

import java.util.ArrayList;

public abstract class CatalogDataSource {
    public abstract ArrayList<Product> getCatalog();
}
