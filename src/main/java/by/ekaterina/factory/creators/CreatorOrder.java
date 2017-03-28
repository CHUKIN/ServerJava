package by.ekaterina.factory.creators;

import by.ekaterina.factory.products.ProductOrder;


public class CreatorOrder implements Creator {
    public ProductOrder factoryMethod() { return new ProductOrder(); }
}