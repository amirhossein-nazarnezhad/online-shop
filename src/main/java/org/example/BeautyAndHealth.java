package org.example;

import java.util.ArrayList;

public class BeautyAndHealth extends Products {

    //====================================================================================

    //array lists
    ArrayList<BeautyAndHealth> cream = new ArrayList<>();
    ArrayList<BeautyAndHealth> mask = new ArrayList<>();
    ArrayList<BeautyAndHealth> shampoo = new ArrayList<>();
    ArrayList<BeautyAndHealth> toothbrush = new ArrayList<>();
    ArrayList<BeautyAndHealth> toothpaste = new ArrayList<>();
    ArrayList<BeautyAndHealth> perfume = new ArrayList<>(); // odkolon


    //=====================================================================================

    //constructor

    public BeautyAndHealth(double price, String name, String color, String weight, String typeProduct) {
        super(price, name, color, weight, typeProduct);
    }


    //==================================================================================

    //just getter

    public ArrayList<BeautyAndHealth> getCream() {
        return cream;
    }

    public ArrayList<BeautyAndHealth> getMask() {
        return mask;
    }

    public ArrayList<BeautyAndHealth> getShampoo() {
        return shampoo;
    }

    public ArrayList<BeautyAndHealth> getToothbrush() {
        return toothbrush;
    }

    public ArrayList<BeautyAndHealth> getToothpaste() {
        return toothpaste;
    }

    public ArrayList<BeautyAndHealth> getPerfume() {
        return perfume;
    }

    //=========================================================================================================

    //add to list

    public void addCream(BeautyAndHealth cream1)
    {
        cream.add(cream1);
    }


    public void addMask(BeautyAndHealth mask1)
    {
        mask.add(mask1);
    }

    public void addShampoo(BeautyAndHealth shampoo1)
    {
        shampoo.add(shampoo1);
    }

    public void addToothbrush(BeautyAndHealth toothbrush1)
    {
        toothbrush.add(toothbrush1);
    }

    public void addToothpaste(BeautyAndHealth toothpaste1)
    {
        toothpaste.add(toothpaste1);
    }

    public void addPerfume(BeautyAndHealth perfume1)
    {
        perfume.add(perfume1);
    }


    //==========================================================================================================

    //to string


    @Override
    public String toString() {
        return "BeautyAndHealth{" +
                "cream=" + cream +
                ", mask=" + mask +
                ", shampoo=" + shampoo +
                ", toothbrush=" + toothbrush +
                ", toothpaste=" + toothpaste +
                ", perfume=" + perfume +
                '}';
    }
}
