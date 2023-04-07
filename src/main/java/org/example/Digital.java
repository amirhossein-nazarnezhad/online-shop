package org.example;

import java.util.ArrayList;

public class Digital extends Products {

    //=======================================================================================

    //array lists
    ArrayList<Digital> mobile = new ArrayList<>();
    ArrayList<Digital> tv = new ArrayList<>();
    ArrayList<Digital> headphone = new ArrayList<>();
    ArrayList<Digital> memory = new ArrayList<>();
    ArrayList<Digital> camera = new ArrayList<>();
    ArrayList<Digital> computer = new ArrayList<>();
    ArrayList<Digital> playstation = new ArrayList<>();


    //=============================================================================

    //constructor

    public Digital(double price, String name, String color, String weight, String typeProduct) {
        super(price, name, color, weight, typeProduct);
    }

    //===========================================================================================

    //just getter

    public ArrayList<Digital> getMobile() {
        return mobile;
    }

    public ArrayList<Digital> getTv() {
        return tv;
    }

    public ArrayList<Digital> getHeadphone() {
        return headphone;
    }

    public ArrayList<Digital> getMemory() {
        return memory;
    }

    public ArrayList<Digital> getCamera() {
        return camera;
    }

    public ArrayList<Digital> getComputer() {
        return computer;
    }

    public ArrayList<Digital> getPlaystation() {
        return playstation;
    }

    //====================================================================================================

    //add to list

    public void addMobile(Digital mobile1)
    {
        mobile.add(mobile1);
    }

    public void addTv(Digital tv1)
    {
        tv.add(tv1);
    }

    public void addHeadphone(Digital headphone1)
    {
        headphone.add(headphone1);
    }

    public void addMemory(Digital memory1)
    {
        memory.add(memory1);
    }

    public void addCamera(Digital camera1)
    {
        camera.add(camera1);
    }

    public void addComputer(Digital computer1)
    {
        computer.add(computer1);
    }

    public void addPlaystation(Digital playstation1)
    {
        playstation.add(playstation1);
    }






    //=====================================================================================================

    //to string


    @Override
    public String toString() {
        return "Digital{" +
                "mobile=" + mobile +
                ", tv=" + tv +
                ", headphone=" + headphone +
                ", memory=" + memory +
                ", camera=" + camera +
                ", computer=" + computer +
                ", playstation=" + playstation +
                '}';
    }
}
