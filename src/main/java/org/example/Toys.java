package org.example;

import java.util.ArrayList;

public class Toys extends Products {


    //=============================================================================

    //constructor

    public Toys(double price, String name, String color, String weight, String typeProduct) {
        super(price, name, color, weight, typeProduct);
    }

    //================================================================================

    //array lists

    ArrayList<Toys> puzzle = new ArrayList<>();
    ArrayList<Toys> doll = new ArrayList<>();
    ArrayList<Toys> gun = new ArrayList<>();
    ArrayList<Toys> bike = new ArrayList<>();
    ArrayList<Toys> car = new ArrayList<>();

    //=====================================================================================

    //just getter

    public ArrayList<Toys> getPuzzle() {
        return puzzle;
    }

    public ArrayList<Toys> getDoll() {
        return doll;
    }

    public ArrayList<Toys> getGun() {
        return gun;
    }

    public ArrayList<Toys> getBike() {
        return bike;
    }

    public ArrayList<Toys> getCar() {
        return car;
    }
    //===============================================================================================

    //add to list

    public void addPuzzle(Toys puzzle1)
    {
        puzzle.add(puzzle1);
    }

    public void addDoll(Toys doll1)
    {
        doll.add(doll1);
    }

    public void addGun(Toys gun1)
    {
        gun.add(gun1);
    }

    public void addBike(Toys bike1)
    {
        bike.add(bike1);
    }

    public void addCar(Toys car1)
    {
        car.add(car1);
    }

    //===================================================================================

    //to string


    @Override
    public String toString() {
        return "Toys{" +
                "puzzle=" + puzzle +
                ", doll=" + doll +
                ", gun=" + gun +
                ", bike=" + bike +
                ", car=" + car +
                '}';
    }
}
