package org.example;

import java.util.ArrayList;

public class Seller {

//==========================================================
    private String companyName;
    private String password;
    private String forgottenCode;
    private double wallet;

    //=============================================================

    //constructor

    public Seller(String companyName, String password , String forgottenCode , double wallet)
    {
        this.companyName = companyName;
        this.password = password;
        this.forgottenCode = forgottenCode;
        this.wallet = wallet;
    }

    //==================================================================================

    //array lists


    ArrayList<BeautyAndHealth> beautyAndHealths = new ArrayList<>();
    ArrayList<BooksAndStationery> booksAndStationeries = new ArrayList<>();
    ArrayList<CarAndMotorcycle> carAndMotorcycles = new ArrayList<>();
    ArrayList<Clothes> clothes = new ArrayList<>();
    ArrayList<Digital> digitals = new ArrayList<>();
    ArrayList<HomeAndKitchen> homeAndKitchens = new ArrayList<>();
    ArrayList<Sport> sports = new ArrayList<>();
    ArrayList<Tools> tools = new ArrayList<>();
    ArrayList<Toys> toys = new ArrayList<>();






    //=====================================================================

    //getter and setter
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getForgottenCode() {
        return forgottenCode;
    }


    public void setForgottenCode(String forgottenCode) {
        this.forgottenCode = forgottenCode;
    }


        public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    //------------------------------------------------------------------------------------------

    //just getter
    public ArrayList<BeautyAndHealth> getBeautyAndHealths() {
        return beautyAndHealths;
    }

    public ArrayList<BooksAndStationery> getBooksAndStationeries() {
        return booksAndStationeries;
    }

    public ArrayList<CarAndMotorcycle> getCarAndMotorcycles() {
        return carAndMotorcycles;
    }

    public ArrayList<Clothes> getClothes() {
        return clothes;
    }

    public ArrayList<Digital> getDigitals() {
        return digitals;
    }

    public ArrayList<HomeAndKitchen> getHomeAndKitchens() {
        return homeAndKitchens;
    }

    public ArrayList<Sport> getSports() {
        return sports;
    }

    public ArrayList<Tools> getTools() {
        return tools;
    }

    public ArrayList<Toys> getToys() {
        return toys;
    }




    //============================================================================

    // add to array list
    public void addBeautyAndHealth(BeautyAndHealth beautyAndHealth)
    {
        beautyAndHealths.add(beautyAndHealth);
    }

    public void addBooksAndStationery(BooksAndStationery booksAndStationery)
    {
        booksAndStationeries.add(booksAndStationery);
    }

    public void addCarAndMotorcycle(CarAndMotorcycle carAndMotorcycle)
    {
        carAndMotorcycles.add(carAndMotorcycle);
    }

    public void addClothes(Clothes clothes1)
    {
        clothes.add(clothes1);
    }

    public void addDigital(Digital digital)
    {
        digitals.add(digital);
    }

    public void addHomeAndKitchen(HomeAndKitchen homeAndKitchen)
    {
        homeAndKitchens.add(homeAndKitchen);
    }

    public void addSport(Sport sport)
    {
        sports.add(sport);
    }

    public void addTools(Tools tools1)
    {
        tools.add(tools1);
    }

    public void addToys(Toys toys1)
    {
        toys.add(toys1);
    }


    //======================================================================================================

    //to string


    @Override
    public String toString() {
        return "Seller{" +
                "companyName='" + companyName + '\'' +
                ", password='" + password + '\'' +
                ", forgottenCode='" + forgottenCode + '\'' +
                ", wallet=" + wallet +
                ", beautyAndHealths=" + beautyAndHealths +
                ", booksAndStationeries=" + booksAndStationeries +
                ", carAndMotorcycles=" + carAndMotorcycles +
                ", clothes=" + clothes +
                ", digitals=" + digitals +
                ", homeAndKitchens=" + homeAndKitchens +
                ", sports=" + sports +
                ", tools=" + tools +
                ", toys=" + toys +
                '}';
    }
}
