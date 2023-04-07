package org.example;

import java.util.ArrayList;

public class Clothes extends Products {

    //========================================================================

    //array lists
    ArrayList<Clothes> shirt = new ArrayList<>();
    ArrayList<Clothes> pants = new ArrayList<>();
    ArrayList<Clothes> hoodie = new ArrayList<>();
    ArrayList<Clothes> shoe = new ArrayList<>();
    ArrayList<Clothes> jacket = new ArrayList<>();
    ArrayList<Clothes> belt = new ArrayList<>();

    //=============================================================================

    //constructor

    public Clothes(double price, String name, String color, String weight, String typeProduct) {
        super(price, name, color, weight, typeProduct);
    }

    //================================================================================

    //just getter

    public ArrayList<Clothes> getShirt() {
        return shirt;
    }

    public ArrayList<Clothes> getPants() {
        return pants;
    }

    public ArrayList<Clothes> getHoodie() {
        return hoodie;
    }

    public ArrayList<Clothes> getShoe() {
        return shoe;
    }

    public ArrayList<Clothes> getJacket() {
        return jacket;
    }

    public ArrayList<Clothes> getBelt() {
        return belt;
    }

    //================================================================================================

    //add to list

    public void addShirt(Clothes shirt1)
    {
        shirt.add(shirt1);
    }

    public void addPants(Clothes pants1)
    {
        pants.add(pants1);
    }

    public void addHoodie(Clothes hoodie1)
    {
        hoodie.add(hoodie1);
    }

    public void addShoe(Clothes shoe1)
    {
        shoe.add(shoe1);
    }

    public void addJacket(Clothes jacket1)
    {
        jacket.add(jacket1);
    }

    public void addBelt(Clothes belt1)
    {
        belt.add(belt1);
    }







    //===========================================================================================

    //to string


    @Override
    public String toString() {
        return "Clothes{" +
                "shirt=" + shirt +
                ", pants=" + pants +
                ", hoodie=" + hoodie +
                ", shoe=" + shoe +
                ", jacket=" + jacket +
                ", belt=" + belt +
                '}';
    }
}
