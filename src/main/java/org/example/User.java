package org.example;

public class User {

        //create sefaresh class ***


        //==============================================================

        private String username;
        private String password;
        private String emailAddress;
        private String phoneNumber;
        private String address;
        private double wallet;
        //================================================================

        //constructor
        public User(String userName, String password, String emailAddress, String phoneNumber, String address)
        {
                this.username = userName;
                this.password = password;
                this.emailAddress = emailAddress;
                this.phoneNumber = phoneNumber;
                this.address = address;
        }

        //======================================================================

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

        public String getPhoneNumber() {
                return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public double getWallet() {
                return wallet;
        }

        public void setWallet(double wallet) {
                this.wallet = wallet;
        }

        //==================================================================================


        //1- sabad kharid
        //2- list sefareshat
        //3- list of mahsoolat kharidari shode
        //4- kif pool
        //5- safhe namaye bara inke admin ha betoonan bebinan

    }
