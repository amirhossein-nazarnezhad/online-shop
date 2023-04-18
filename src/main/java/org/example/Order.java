package org.example;

public class Order {

    User user;
    String name;
    String typeProduct;
    double price;

    boolean isConfirm = false;

    public void confirm1()
    {
        if(isConfirm == true)
        {
            Order order1 = new Order(user, name, typeProduct, price);
            user.setWallet(user.getWallet() - price);
            user.addOrder(order1);
        }

    }

    public Order(User user ,String name, String typeProduct, double price) {
        this.name = name;
        this.typeProduct = typeProduct;
        this.price = price;
        this.user=user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isConfirm() {
        return isConfirm;
    }

    public void setConfirm(boolean confirm) {
        isConfirm = confirm;
    }

}
