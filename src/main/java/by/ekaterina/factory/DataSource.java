package by.ekaterina.factory;


import by.ekaterina.factory.creators.*;
import by.ekaterina.factory.products.Product;

public class DataSource {
    Product employee;
    Product item;
    Product itemTransaction;
    Product order;
    Product role;
    Product status;

    DataSource(){
        employee = new CreatorEmployee().factoryMethod();
        item= new CreatorItem().factoryMethod();
        itemTransaction= new CreatorItemTransaction().factoryMethod();
        order= new CreatorOrder().factoryMethod();
        role= new CreatorRole().factoryMethod();
        status= new CreatorStatus().factoryMethod();
    }

    public Product getEmployee() {
        return employee;
    }

    public Product getItem() {
        return item;
    }

    public Product getItemTransaction() {
        return itemTransaction;
    }

    public Product getOrder() {
        return order;
    }

    public Product getRole() {
        return role;
    }

    public Product getStatus() {
        return status;
    }
}
