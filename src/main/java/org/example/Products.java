package org.example;

import java.util.ArrayList;

public class Products {

    //====================================================================

    //array list

    ArrayList<String> ideas = new ArrayList<>();

    //==================================================================
    private double price;
    private int number;
    private String name;
    private String color;
    private String weight;
    private String typeProduct;

//  private boolean discount;

    //===========================================================================

    //constructor

    public Products(double price, String name, String color, String weight , String typeProduct) {
        this.price = price;
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.typeProduct = typeProduct;
    }


    //========================================================================

    //getter and setter


    public ArrayList<String> getIdeas()
    {
        return ideas;
    }

    public void setIdeas(ArrayList<String> ideas) {
        this.ideas = ideas;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }
}
