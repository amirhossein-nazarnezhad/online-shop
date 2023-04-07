package org.example;

import java.util.ArrayList;

public class Shop {

        //Digikala

        private double totalMoney;



        //========================================

        //arrayLists

        ArrayList<User> users = new ArrayList<User>();
        ArrayList<Admin> admins = new ArrayList<Admin>();
        ArrayList<Seller> sellers = new ArrayList<Seller>();

        //----------------------------------------------

        //all products
        ArrayList<BeautyAndHealth> beautyAndHealths = new ArrayList<>();
        ArrayList<BooksAndStationery> booksAndStationeries = new ArrayList<>();
        ArrayList<CarAndMotorcycle> carAndMotorcycles = new ArrayList<>();
        ArrayList<Clothes> clothes = new ArrayList<>();
        ArrayList<Digital> digitals = new ArrayList<>();
        ArrayList<HomeAndKitchen> homeAndKitchens = new ArrayList<>();
        ArrayList<Sport> sports = new ArrayList<>();
        ArrayList<Tools> tools = new ArrayList<>();
        ArrayList<Toys> toys = new ArrayList<>();

        //----------------------------------------------------------------

        //discount code

        ArrayList<String> discountCodes = new ArrayList<>();



        //=====================================================


        private String name;
        private String webAddress;
        private String phoneNumber;



        //=======================================================================

        //getter and setter


        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getWebAddress() {
                return webAddress;
        }

        public void setWebAddress(String webAddress) {
                this.webAddress = webAddress;
        }

        public String getPhoneNumber() {
                return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
        }

        public double getTotalMoney() {
                return totalMoney;
        }

        public void setTotalMoney(double totalMoney) {
                this.totalMoney = totalMoney;
        }

        //-----------------------------------------------------------------------------

        //just getter
        public ArrayList<User> getUsers() {
                return users;
        }

        public ArrayList<Admin> getAdmins() {
                return admins;
        }

        public ArrayList<Seller> getSellers() {
                return sellers;
        }

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


        //==============================================================================

        public void createUserAccount(User user)
        {
                users.add(user);
                System.out.println("Your account has been successfully created");

        }

        //=========================================================================


        public void createSellerAccount(Seller seller)
        {
                sellers.add(seller);
                System.out.println("Your account has been successfully created");

        }

        //=========================================================================

        public boolean doesUserExist(String username)
        {
                for (User i : users)
                {
                        if( i.getUsername().equals(username))
                        {
                                return true;
                        }

                }
                return false;
        }

        //===========================================================================================
        public boolean doesUserPasswordCorrect(String username , String password)
        {
                for (User i : users)
                {
                        if( i.getUsername().equals(username) && i.getPassword().equals(password) )
                        {
                                return true;
                        }

                }
                return false;
        }

        //=====================================================================================================



        public boolean doesCompanyExist(String companyName)
        {
                for (Seller i : sellers)
                {
                        if( i.getCompanyName().equals(companyName))
                        {
                                return true;
                        }

                }
                return false;
        }

        //===========================================================================================
        public boolean doesCompanyPasswordCorrect(String companyName , String password)
        {
                for (Seller i : sellers)
                {
                        if( i.getCompanyName().equals(companyName) && i.getPassword().equals(password) )
                        {
                                return true;
                        }

                }
                return false;
        }

        //=====================================================================================================


        public boolean doesAdminExist(String username)
        {
                for (Admin i : admins)
                {
                        if( i.getUsername().equals(username))
                        {
                                return true;
                        }

                }
                return false;
        }

        //===========================================================================================
        public boolean doesAdminPasswordCorrect(String username , String password)
        {
                for (Admin i : admins)
                {
                        if( i.getUsername().equals(username) && i.getPassword().equals(password) )
                        {
                                return true;
                        }

                }
                return false;
        }

        //==================================================================================================

        public boolean doesUserEmailAddressCorrect(String username , String emailAddress)
        {
                for (User i : users)
                {
                        if( i.getUsername().equals(username) && i.getEmailAddress().equals(emailAddress) )
                        {
                                return true;
                        }

                }
                return false;
        }

        //==================================================================================================


        public boolean doesAdminEmailAddressCorrect(String username , String emailAddress)
        {
                for (Admin i : admins)
                {
                        if( i.getUsername().equals(username) && i.getEmailAddress().equals(emailAddress) )
                        {
                                return true;
                        }

                }
                return false;
        }

        //==================================================================================================


        public String getAdminPassword(String username)
        {
                for (Admin i : admins)
                {
                        if( i.getUsername().equals(username) )
                        {
                                return i.getPassword();
                        }

                }
                return null;
        }


//=========================================================================================================



        public String getUserPassword(String username)
        {
                for (User i : users)
                {
                        if( i.getUsername().equals(username) )
                        {
                                return i.getPassword();
                        }

                }
                return null;
        }


//=========================================================================================================

        public boolean doesCompanyForgottenPasswordCorrect(String companyName , String forgottenPassword)
        {
                for (Seller i : sellers)
                {
                        if ( i.getCompanyName().equals(companyName) && i.getForgottenCode().equals(forgottenPassword))
                        {
                                return true;
                        }

                }
                return false;
        }

        //==================================================================================================



        public String getCompanyPassword(String companyName)
        {
                for (Seller i : sellers)
                {
                        if( i.getCompanyName().equals(companyName) )
                        {
                                return i.getPassword();
                        }

                }
                return null;
        }


//=========================================================================================================


        public User whichUser(String username)
        {
                for (User i : users)
                {
                        if( i.getUsername().equals(username) )
                        {
                                return i;
                        }

                }
                return null;
        }

        //=======================================================================================================



        public Seller whichSeller(String companyName)
        {
                for (Seller i : sellers)
                {
                        if( i.getCompanyName().equals(companyName) )
                        {
                                return i;
                        }

                }
                return null;
        }

        //=======================================================================================================


        public Admin whichAdmin(String username)
        {
                for (Admin i : admins)
                {
                        if( i.getUsername().equals(username) )
                        {
                                return i;
                        }

                }
                return null;
        }

        //=======================================================================================================

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




//===================================================================================================================

        //remove


        public void removeUser(String username)
        {
                for (User i : users)
                {
                        if( i.getUsername().equals(username))
                        {
                                users.remove(i);
                                break;
                        }

                }

        }



        public void removeSeller(String companyName)
        {
                for (Seller i : sellers)
                {
                        if( i.getCompanyName().equals(companyName))
                        {
                                sellers.remove(i);
                                break;
                        }

                }

        }


        //================================================================================================

        //discount code getter and setter
        public void addDiscountCode(String discountCode)
        {
                discountCodes.add(discountCode);
        }


        public ArrayList<String> getDiscountCodes() {
                return discountCodes;
        }

        //=================================================================================================================
        public static void addRequest()
        {
                //for user and seller

        }

        //====================================================================================================

        public static void getRequest()
        {
                //for admin


        }

        //===================================================================================================


        //mohtaviat array list ro address hashoono chap mikone
        @Override
        public String toString() {
                return "Shop{" +
                        "totalMoney=" + totalMoney +
                        ", users=" + users +
                        ", admins=" + admins +
                        ", sellers=" + sellers +
                        ", beautyAndHealths=" + beautyAndHealths +
                        ", booksAndStationeries=" + booksAndStationeries +
                        ", carAndMotorcycles=" + carAndMotorcycles +
                        ", clothes=" + clothes +
                        ", digitals=" + digitals +
                        ", homeAndKitchens=" + homeAndKitchens +
                        ", sports=" + sports +
                        ", tools=" + tools +
                        ", toys=" + toys +
                        ", name='" + name + '\'' +
                        ", webAddress='" + webAddress + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        '}';
        }
}
