package by.ekaterina.factory.creators;

import by.ekaterina.factory.products.ProductStatus;


public class CreatorStatus implements Creator {
    public ProductStatus factoryMethod() { return new ProductStatus(); }
}
