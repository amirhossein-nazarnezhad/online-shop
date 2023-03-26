package org.example;

public class Admin {


    //===================================================================================
    private String username;
    private String password;
    private String emailAddress;

    //=====================================================================================

    //constructor

    public Admin(String username, String password, String emailAddress)
    {
        this.username = username;
        this.password = password;
        this.emailAddress = emailAddress;
    }

    //==========================================================================================

    //getter and setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    //=================================================================================


    //admin haye jadid faghat tavasot baghie admin ha entekhab mishavand
    // aval kar bayad ye admin dashte bashim
}
