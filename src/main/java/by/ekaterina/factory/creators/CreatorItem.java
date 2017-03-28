package by.ekaterina.factory.creators;

import by.ekaterina.factory.products.ProductItem;


public class CreatorItem implements Creator {
    public ProductItem factoryMethod() { return new ProductItem(); }
}