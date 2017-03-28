package by.ekaterina.factory.creators;

import by.ekaterina.factory.products.ProductItemTransation;


public class CreatorItemTransation implements Creator {
    public ProductItemTransation factoryMethod() { return new ProductItemTransation(); }
}
