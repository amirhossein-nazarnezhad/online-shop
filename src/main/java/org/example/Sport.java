package org.example;

import java.util.ArrayList;

public class Sport extends Products {


    //=============================================================================

    //constructor

    public Sport(double price, String name, String color, String weight, String typeProduct) {
        super(price, name, color, weight, typeProduct);
    }

    //=================================================================================

    //array lists

    ArrayList<Sport> ball = new ArrayList<>();
    ArrayList<Sport> racket = new ArrayList<>();
    ArrayList<Sport> skate = new ArrayList<>();
    ArrayList<Sport> whistle = new ArrayList<>(); //soot


    //=========================================================================================

    //just getter

    public ArrayList<Sport> getBall() {
        return ball;
    }

    public ArrayList<Sport> getRacket() {
        return racket;
    }

    public ArrayList<Sport> getSkate() {
        return skate;
    }

    public ArrayList<Sport> getWhistle() {
        return whistle;
    }

    //===========================================================================================

    //add to list

    public void addBall(Sport ball1)
    {
        ball.add(ball1);
    }

    public void addRacket(Sport racket1)
    {
        racket.add(racket1);
    }

    public void addSkate(Sport skate1)
    {
        skate.add(skate1);
    }

    public void addWhistle(Sport whistle1)
    {
        whistle.add(whistle1);
    }


    //==========================================================================================

    //to string


    @Override
    public String toString() {
        return "Sport{" +
                "ball=" + ball +
                ", racket=" + racket +
                ", skate=" + skate +
                ", whistle=" + whistle +
                '}';
    }
}
