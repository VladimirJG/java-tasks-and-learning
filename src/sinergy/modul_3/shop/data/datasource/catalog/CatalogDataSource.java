package sinergy.modul_3.shop.data.datasource.catalog;

import sinergy.modul_3.shop.data.models.Product;

import java.util.AbstractList;

public abstract class CatalogDataSource {
    public abstract AbstractList<Product> getCatalog();
}
