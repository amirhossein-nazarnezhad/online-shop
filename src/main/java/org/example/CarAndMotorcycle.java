package org.example;

import java.util.ArrayList;

public class CarAndMotorcycle extends Products {

    //==================================================================================

    //array lists
    ArrayList<CarAndMotorcycle> car = new ArrayList<>();
    ArrayList<CarAndMotorcycle> motorcycles = new ArrayList<>();
    ArrayList<CarAndMotorcycle> tire = new ArrayList<>();


    //===============================================================================================

    //constructor

    public CarAndMotorcycle(double price, String name, String color, String weight, String typeProduct) {
        super(price, name, color, weight, typeProduct);
    }


    //=======================================================================================================

    //just getter

    public ArrayList<CarAndMotorcycle> getCar() {
        return car;
    }

    public ArrayList<CarAndMotorcycle> getMotorcycles() {
        return motorcycles;
    }

    public ArrayList<CarAndMotorcycle> getTire() {
        return tire;
    }

    //=====================================================================================================

    //add to list

    public void addCar(CarAndMotorcycle car1)
    {
        car.add(car1);
    }


    public void addMotorcycle(CarAndMotorcycle motorcycle1)
    {
        motorcycles.add(motorcycle1);
    }


    public void addTire(CarAndMotorcycle tire1)
    {
        tire.add(tire1);
    }




    //=======================================================================================================

    //to string


    @Override
    public String toString() {
        return "CarAndMotorcycle{" +
                "car=" + car +
                ", motorcycles=" + motorcycles +
                ", tire=" + tire +
                '}';
    }
}
