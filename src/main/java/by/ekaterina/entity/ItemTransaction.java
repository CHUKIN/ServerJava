package by.ekaterina.entity;


public class ItemTransaction implements Entity{
    int id;
    String name;
    int count;
    int idOrder;

    public ItemTransaction(int id, String name, int count, int idOrder) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.idOrder = idOrder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }
}
