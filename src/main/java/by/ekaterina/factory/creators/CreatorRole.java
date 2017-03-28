package by.ekaterina.factory.creators;

import by.ekaterina.factory.products.ProductRole;


public class CreatorRole implements Creator {
    public ProductRole factoryMethod() { return new ProductRole(); }
}
