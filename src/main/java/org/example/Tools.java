package org.example;

import java.util.ArrayList;

public class Tools extends Products {


    //=============================================================================

    //constructor

    public Tools(double price, String name, String color, String weight, String typeProduct) {
        super(price, name, color, weight, typeProduct);
    }

    //======================================================================================

    //array lists

    ArrayList<Tools> wrench = new ArrayList<>(); // achar
    ArrayList<Tools> screwDriver = new ArrayList<>(); //pich gooshti
    ArrayList<Tools> screw = new ArrayList<>(); //pich
    ArrayList<Tools> nut = new ArrayList<>(); //mohre
    ArrayList<Tools> saw = new ArrayList<>(); //are
    ArrayList<Tools> nails = new ArrayList<>(); //mikh

    //=====================================================================================================

    //just getter

    public ArrayList<Tools> getWrench() {
        return wrench;
    }

    public ArrayList<Tools> getScrewDriver() {
        return screwDriver;
    }

    public ArrayList<Tools> getScrew() {
        return screw;
    }

    public ArrayList<Tools> getNut() {
        return nut;
    }

    public ArrayList<Tools> getSaw() {
        return saw;
    }

    public ArrayList<Tools> getNails() {
        return nails;
    }

    //===========================================================================================

    //add to list

    public void addWrench(Tools wrench1)
    {
        wrench.add(wrench1);
    }

    public void addScrewDriver(Tools screwDriver1)
    {
        screwDriver.add(screwDriver1);
    }

    public void addScrew(Tools screw1)
    {
        screw.add(screw1);
    }

    public void addNut(Tools nut1)
    {
        nut.add(nut1);
    }

    public void addSaw(Tools saw1)
    {
        saw.add(saw1);
    }

    public void addNails(Tools nails1)
    {
        nails.add(nails1);
    }




    //=======================================================================================

    //to string


    @Override
    public String toString() {
        return "Tools{" +
                "wrench=" + wrench +
                ", screwDriver=" + screwDriver +
                ", screw=" + screw +
                ", nut=" + nut +
                ", saw=" + saw +
                ", nails=" + nails +
                '}';
    }
}
