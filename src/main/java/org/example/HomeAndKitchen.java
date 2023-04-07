package org.example;

import java.util.ArrayList;

public class HomeAndKitchen extends Products {
    //=====================================================================================

    //array lists

    ArrayList<HomeAndKitchen> refrigerator = new ArrayList<>();
    ArrayList<HomeAndKitchen> carpet = new ArrayList<>(); // farsh
    ArrayList<HomeAndKitchen> sofa = new ArrayList<>();
    ArrayList<HomeAndKitchen> washingMachine = new ArrayList<>();
    ArrayList<HomeAndKitchen> gas = new ArrayList<>();
    ArrayList<HomeAndKitchen> cooler = new ArrayList<>();



    //=============================================================================

    //constructor

    public HomeAndKitchen(double price, String name, String color, String weight, String typeProduct) {
        super(price, name, color, weight, typeProduct);
    }


    //=================================================================================================

    //just getter

    public ArrayList<HomeAndKitchen> getRefrigerator() {
        return refrigerator;
    }

    public ArrayList<HomeAndKitchen> getCarpet() {
        return carpet;
    }

    public ArrayList<HomeAndKitchen> getSofa() {
        return sofa;
    }

    public ArrayList<HomeAndKitchen> getWashingMachine() {
        return washingMachine;
    }

    public ArrayList<HomeAndKitchen> getGas() {
        return gas;
    }

    public ArrayList<HomeAndKitchen> getCooler() {
        return cooler;
    }

    //=============================================================================================================

    //add to list

    public void addRefrigerator(HomeAndKitchen refrigerator1)
    {
        refrigerator.add(refrigerator1);
    }

    public void addCarpet(HomeAndKitchen carpet1)
    {
        carpet.add(carpet1);
    }

    public void addSofa(HomeAndKitchen sofa1)
    {
        sofa.add(sofa1);
    }

    public void addWashingMachine(HomeAndKitchen washingMachine1)
    {
        washingMachine.add(washingMachine1);
    }

    public void addGas(HomeAndKitchen gas1)
    {
        gas.add(gas1);
    }

    public void addCooler(HomeAndKitchen cooler1)
    {
        cooler.add(cooler1);
    }


    //==============================================================================================================

    //to string


    @Override
    public String toString() {
        return "HomeAndKitchen{" +
                "refrigerator=" + refrigerator +
                ", carpet=" + carpet +
                ", sofa=" + sofa +
                ", washingMachine=" + washingMachine +
                ", gas=" + gas +
                ", cooler=" + cooler +
                '}';
    }
}
