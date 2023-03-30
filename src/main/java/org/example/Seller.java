package org.example;

public class Seller {

//==========================================================
    private String companyName;
    private String password;
    private String forgottenCode;

    //=============================================================

    //constructor

    public Seller(String companyName, String password , String forgottenCode)
    {
        this.companyName = companyName;
        this.password = password;
        this.forgottenCode = forgottenCode;
    }

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
    //============================================================================


    //list of mahsoolat mojood
    //ye chiz dige ke nafahmidam chi mige
}
