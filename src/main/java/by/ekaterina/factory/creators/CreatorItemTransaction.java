package by.ekaterina.factory.creators;

import by.ekaterina.factory.products.ProductItemTransaction;


public class CreatorItemTransaction implements Creator {
    public ProductItemTransaction factoryMethod() { return new ProductItemTransaction(); }
}
