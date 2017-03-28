package by.ekaterina.factory.creators;

import by.ekaterina.factory.products.ProductEmployee;



public class CreatorEmployee implements Creator {
    public ProductEmployee factoryMethod() { return new ProductEmployee(); }
}
