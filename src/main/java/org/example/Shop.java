package org.example;

import java.util.ArrayList;
import java.util.Scanner;

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

        //-----------------------------------------------------------------

        //request list

        ArrayList<Request> requestsForWallet = new ArrayList<>();

        ArrayList<Order> requestForBuyProduct = new ArrayList<>();

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

        //just getter account type
        public ArrayList<User> getUsers() {
                return users;
        }

        public ArrayList<Admin> getAdmins() {
                return admins;
        }

        public ArrayList<Seller> getSellers() {
                return sellers;
        }

        //=======================================================================================

        //getter products

        public ArrayList<BeautyAndHealth> getCream()
        {
                ArrayList<BeautyAndHealth> creams = null;
                for (BeautyAndHealth i : beautyAndHealths)
                {
                        creams = i.getCream();
                }
                
                return creams;

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

        public void addAdmin(Admin admin)
        {
                admins.add(admin);
        }

        //===============================================================================

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

        public String getUserEmail(String username)
        {
                for (User i : users)
                {
                        if( i.getUsername().equals(username) )
                        {
                                return i.getEmailAddress();
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

        //============================================================================================================

        //search product

        public void searchCream(String name)
        {
                for(BeautyAndHealth i : beautyAndHealths)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }



        public void searchMask(String name)
        {
                for(BeautyAndHealth i : beautyAndHealths)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }



        public void searchShampoo(String name)
        {
                for(BeautyAndHealth i : beautyAndHealths)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }


        public void searchToothbrush(String name)
        {
                for(BeautyAndHealth i : beautyAndHealths)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchToothpaste(String name)
        {
                for(BeautyAndHealth i : beautyAndHealths)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchPerfume(String name)
        {
                for(BeautyAndHealth i : beautyAndHealths)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        //------------------------------------------------------------------------------------------------------

        public void searchPen(String name)
        {
                for(BooksAndStationery i : booksAndStationeries)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }


        public void searchPencil(String name)
        {
                for(BooksAndStationery i : booksAndStationeries)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchTable(String name)
        {
                for(BooksAndStationery i : booksAndStationeries)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchPencilCase(String name)
        {
                for(BooksAndStationery i : booksAndStationeries)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchNotebook(String name)
        {
                for(BooksAndStationery i : booksAndStationeries)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchEraser(String name)
        {
                for(BooksAndStationery i : booksAndStationeries)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchRuler(String name)
        {
                for(BooksAndStationery i : booksAndStationeries)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        //-----------------------------------------------------------------------------------------------------

        public void searchCar(String name)
        {
                for(CarAndMotorcycle i : carAndMotorcycles)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchMotorcycle(String name)
        {
                for(CarAndMotorcycle i : carAndMotorcycles)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchTire(String name)
        {
                for(CarAndMotorcycle i : carAndMotorcycles)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        //----------------------------------------------------------------------------------------------------------



        public void searchShirt(String name)
        {
                for(Clothes i : clothes)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }


        public void searchPants(String name)
        {
                for(Clothes i : clothes)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchHoodie(String name)
        {
                for(Clothes i : clothes)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchShoe(String name)
        {
                for(Clothes i : clothes)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }


        public void searchJacket(String name)
        {
                for(Clothes i : clothes)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchBelt(String name)
        {
                for(Clothes i : clothes)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        //------------------------------------------------------------------------------------------------------


        public void searchTv(String name)
        {
                for(Digital i : digitals)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchMobile(String name)
        {
                for(Digital i : digitals)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchHeadphone(String name)
        {
                for(Digital i : digitals)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchMemory(String name)
        {
                for(Digital i : digitals)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchCamera(String name)
        {
                for(Digital i : digitals)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchComputer(String name)
        {
                for(Digital i : digitals)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchPlaystation(String name)
        {
                for(Digital i : digitals)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        //---------------------------------------------------------------------------------------------------


        public void searchGas(String name)
        {
                for(HomeAndKitchen i : homeAndKitchens)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchRefrigerator(String name)
        {
                for(HomeAndKitchen i : homeAndKitchens)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchCarpet(String name)
        {
                for(HomeAndKitchen i : homeAndKitchens)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchSofa(String name)
        {
                for(HomeAndKitchen i : homeAndKitchens)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchWashingMachine(String name)
        {
                for(HomeAndKitchen i : homeAndKitchens)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchCooler(String name)
        {
                for(HomeAndKitchen i : homeAndKitchens)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        //-------------------------------------------------------------------------------------------------------

        public void searchBall(String name)
        {
                for(Sport i : sports)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchRacket(String name)
        {
                for(Sport i : sports)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchSkate(String name)
        {
                for(Sport i : sports)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchWhistle(String name)
        {
                for(Sport i : sports)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        //----------------------------------------------------------------------------------------------


        public void searchNut(String name)
        {
                for(Tools i : tools)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchWrench(String name)
        {
                for(Tools i : tools)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchScrewdriver(String name)
        {
                for(Tools i : tools)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchScrew(String name)
        {
                for(Tools i : tools)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchSaw(String name)
        {
                for(Tools i : tools)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchNails(String name)
        {
                for(Tools i : tools)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        //--------------------------------------------------------------------------------------------------------


        public void searchCarForToys(String name)
        {
                for(Toys i : toys)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }


        public void searchPuzzle(String name)
        {
                for(Toys i : toys)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchDoll(String name)
        {
                for(Toys i : toys)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchGun(String name)
        {
                for(Toys i : toys)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        public void searchBike(String name)
        {
                for(Toys i : toys)
                {
                        if(i.getName().equals(name))
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                                 
                        }
                }
        }

        //===========================================================================================================
        
        //search by price

        public void searchBeautyAndHealthByPrice(double price)
        {
                for(BeautyAndHealth i : beautyAndHealths)
                {
                        if(i.getPrice()==price)
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("name is : " + i.getName());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this price");
                                 
                        }
                }
        }

        public void searchBookAndStationeryByPrice(double price)
        {
                for(BooksAndStationery i : booksAndStationeries)
                {
                        if(i.getPrice()==price)
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("name is : " + i.getName());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this price");
                                 
                        }
                }
        }

        public void searchCarAndMotorcycleByPrice(double price)
        {
                for(CarAndMotorcycle i : carAndMotorcycles)
                {
                        if(i.getPrice()==price)
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("name is : " + i.getName());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this price");
                                 
                        }
                }
        }

        public void searchClothesByPrice(double price)
        {
                for(Clothes i : clothes)
                {
                        if(i.getPrice()==price)
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("name is : " + i.getName());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this price");
                                 
                        }
                }
        }

        public void searchDigitalByPrice(double price)
        {
                for(Digital i : digitals)
                {
                        if(i.getPrice()==price)
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("name is : " + i.getName());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this price");
                                 
                        }
                }
        }

        public void searchHomeAndKitcheByPrice(double price)
        {
                for(HomeAndKitchen i : homeAndKitchens)
                {
                        if(i.getPrice()==price)
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("name is : " + i.getName());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this price");
                                 
                        }
                }
        }

        public void searchSportByPrice(double price)
        {
                for(Sport i : sports)
                {
                        if(i.getPrice()==price)
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("name is : " + i.getName());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this price");
                                 
                        }
                }
        }

        public void searchToolsByPrice(double price)
        {
                for(Tools i : tools)
                {
                        if(i.getPrice()==price)
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("name is : " + i.getName());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this price");
                                 
                        }
                }
        }

        public void searchToysByPrice(double price)
        {
                for(Toys i : toys)
                {
                        if(i.getPrice()==price)
                        {
                                System.out.println("color is : " + i.getColor());
                                System.out.println("name is : " + i.getName());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());
                                 
                        }

                        else
                        {
                                System.out.println("there is no product with this price");
                                 
                        }
                }
        }
        
        //================================================================================================================

        public void searchBeautyAndHealthByColor(String color)
        {
                for(BeautyAndHealth i : beautyAndHealths)
                {
                        if(i.getColor().equals(color))
                        {
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("name is : " + i.getName());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());

                        }

                        else
                        {
                                System.out.println("there is no product with this price");

                        }
                }
        }


        public void searchBookAndStationeryByColor(String color)
        {
                for(BooksAndStationery i : booksAndStationeries)
                {
                        if(i.getColor().equals(color))
                        {
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("name is : " + i.getName());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());

                        }

                        else
                        {
                                System.out.println("there is no product with this price");

                        }
                }
        }

        public void searchCarAndMotorcycleByColor(String color)
        {
                for(CarAndMotorcycle i : carAndMotorcycles)
                {
                        if(i.getColor().equals(color))
                        {
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("name is : " + i.getName());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());

                        }

                        else
                        {
                                System.out.println("there is no product with this price");

                        }
                }
        }

        public void searchClothesByColor(String color)
        {
                for(Clothes i : clothes)
                {
                        if(i.getColor().equals(color))
                        {
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("name is : " + i.getName());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());

                        }

                        else
                        {
                                System.out.println("there is no product with this price");

                        }
                }
        }

        public void searchDigitalByColor(String color)
        {
                for(Digital i : digitals)
                {
                        if(i.getColor().equals(color))
                        {
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("name is : " + i.getName());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());

                        }

                        else
                        {
                                System.out.println("there is no product with this price");

                        }
                }
        }

        public void searchHomeAndKitchenByColor(String color)
        {
                for(HomeAndKitchen i : homeAndKitchens)
                {
                        if(i.getColor().equals(color))
                        {
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("name is : " + i.getName());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());

                        }

                        else
                        {
                                System.out.println("there is no product with this price");

                        }
                }
        }

        public void searchSportByColor(String color)
        {
                for(Sport i : sports)
                {
                        if(i.getColor().equals(color))
                        {
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("name is : " + i.getName());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());

                        }

                        else
                        {
                                System.out.println("there is no product with this price");

                        }
                }
        }

        public void searchToolsByColor(String color)
        {
                for(Tools i : tools)
                {
                        if(i.getColor().equals(color))
                        {
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("name is : " + i.getName());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());

                        }

                        else
                        {
                                System.out.println("there is no product with this price");

                        }
                }
        }

        public void searchToysByColor(String color)
        {
                for(Toys i : toys)
                {
                        if(i.getColor().equals(color))
                        {
                                System.out.println("price is : " + i.getPrice());
                                System.out.println("name is : " + i.getName());
                                System.out.println("number is :" + i.getNumber());
                                System.out.println("weight is :" + i.getWeight());
                                System.out.println("type product is :" + i.getTypeProduct());

                        }

                        else
                        {
                                System.out.println("there is no product with this price");

                        }
                }
        }

        //================================================================================================================
        //==================================================================================================================
        //===================================================================================================================

        //buy product



        public void buyCream(User user , String name)
        {
                for(BeautyAndHealth i : beautyAndHealths)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                      requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }



        public void buyMask(User user , String name)
        {
                for(BeautyAndHealth i : beautyAndHealths)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }




        public void buyShampoo(User user , String name)
        {
                for(BeautyAndHealth i : beautyAndHealths)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }



        public void buyToothBrush(User user , String name)
        {
                for(BeautyAndHealth i : beautyAndHealths)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }
                }
        }


        public void buyToothpaste(User user , String name)
        {
                for(BeautyAndHealth i : beautyAndHealths)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }
                }
        }


        public void buyPerfume(User user , String name)
        {
                for(BeautyAndHealth i : beautyAndHealths)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }

        //------------------------------------------------------------------------------------------------------

        public void buyPen(User user , String name)
        {
                for(BooksAndStationery i : booksAndStationeries)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }
                }
        }


        public void buyPencil(User user , String name)
        {
                for(BooksAndStationery i : booksAndStationeries)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }
                }
        }

        public void buyTable(User user , String name)
        {
                for(BooksAndStationery i : booksAndStationeries)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }
                }
        }

        public void buyPencilCase(User user , String name)
        {
                for(BooksAndStationery i : booksAndStationeries)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }
                }
        }

        public void buyNotebook(User user , String name)
        {
                for(BooksAndStationery i : booksAndStationeries)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }

        public void buyEraser(User user , String name)
        {
                for(BooksAndStationery i : booksAndStationeries)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }

        public void buyRuler(User user , String name)
        {
                for(BooksAndStationery i : booksAndStationeries)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }
        //-----------------------------------------------------------------------------------------------------

        public void buyCar(User user , String name)
        {
                for(CarAndMotorcycle i : carAndMotorcycles)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }
        public void buyMotorcycle(User user  ,String name)
        {
                for(CarAndMotorcycle i : carAndMotorcycles)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }

        public void buyTire(User user , String name)
        {
                for(CarAndMotorcycle i : carAndMotorcycles)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }

        //----------------------------------------------------------------------------------------------------------



        public void buyShirt(User user , String name)
        {
                for(Clothes i : clothes)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }


        public void buyPants(User user , String name)
        {
                for(Clothes i : clothes)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }


        public void buyHoodie(User user , String name)
        {
                for(Clothes i : clothes)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }


        public void buyShoe(User user ,String name)
        {
                for(Clothes i : clothes)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }


        public void buyJacket(User user , String name)
        {
                for(Clothes i : clothes)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }

        public void buyBelt(User user , String name)
        {
                for(Clothes i : clothes)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }


        //------------------------------------------------------------------------------------------------------


        public void buyTv(User user , String name)
        {
                for(Digital i : digitals)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }

        public void buyMobile(User user , String name)
        {
                for(Digital i : digitals)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }
        public void buyHeadphone(User user , String name)
        {
                for(Digital i : digitals)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }

        public void buyMemory(User user , String name)
        {
                for(Digital i : digitals)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }

        public void buyCamera(User user ,String name)
        {
                for(Digital i : digitals)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }

        public void buyComputer(User user , String name)
        {
                for(Digital i : digitals)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }

        public void buyPlaystation(User user , String name)
        {
                for(Digital i : digitals)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }

        //---------------------------------------------------------------------------------------------------


        public void buyGas(User user , String name)
        {
                for(HomeAndKitchen i : homeAndKitchens)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }

        public void buyRefrigerator(User user , String name)
        {
                for(HomeAndKitchen i : homeAndKitchens)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }


        public void buyCarpet(User user , String name)
        {
                for(HomeAndKitchen i : homeAndKitchens)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }


        public void buySofa(User user , String name)
        {
                for(HomeAndKitchen i : homeAndKitchens)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }

        public void buyWashingMachine(User user , String name)
        {
                for(HomeAndKitchen i : homeAndKitchens)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }


        public void buyCooler(User user , String name)
        {
                for(HomeAndKitchen i : homeAndKitchens)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }


        //-------------------------------------------------------------------------------------------------------

        public void buyBall(User user , String name)
        {
                for(Sport i : sports)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }

        public void buyRacket(User user , String name)
        {
                for(Sport i : sports)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }

        public void buySkate(User user , String name)
        {
                for(Sport i : sports)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }
        public void buyWhistle(User user , String name)
        {
                for(Sport i : sports)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }

        //----------------------------------------------------------------------------------------------


        public void buyNut(User user , String name)
        {
                for(Tools i : tools)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }

        public void buyWrench(User user , String name)
        {
                for(Tools i : tools)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }


        public void buyScrewdriver(User user  , String name)
        {
                for(Tools i : tools)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }


        public void buyScrew(User user , String name)
        {
                for(Tools i : tools)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }


        public void buySaw(User user , String name)
        {
                for(Tools i : tools)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }


        public void buyNails(User user , String name)
        {
                for(Tools i : tools)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }


        //--------------------------------------------------------------------------------------------------------


        public void buyCarForToys(User user , String name)
        {
                for(Toys i : toys)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }


        public void buyPuzzle(User user , String name)
        {
                for(Toys i : toys)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }

        public void buyDoll(User user , String name)
        {
                for(Toys i : toys)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }

        public void buyGun(User user , String name)
        {
                for(Toys i : toys)
                {


                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }
        public void buyBike(User user , String name)
        {
                for(Toys i : toys)
                {
                        if(i.getName().equals(name))
                        {


                                if(i.getPrice()<= user.getWallet())
                                {
                                        Order order = new Order(user ,i.getName() , i.getTypeProduct() , i.getPrice());
                                        requestForBuyProduct.add(order);
                                }

                                else
                                {
                                        System.out.println("your inventory is lower than the price of this product");
                                }


                        }

                        else
                        {
                                System.out.println("there is no product with this name");
                        }

                }
        }
        
        



        //=================================================================================================================
        public void addRequestForIncreaseWallet(Request request1)
        {
                requestsForWallet.add(request1);
        }


        //====================================================================================================

        public void getRequestForIncreaseMoney()
        {

                Scanner input = new Scanner(System.in);
              for(Request i : requestsForWallet)
              {

                      System.out.println(i.user);
                      System.out.println(i.money);
                      System.out.println("are you do you agree to add this money to the user?");
                      System.out.println("1- yes");
                      System.out.println("2- no");

                      int number4 = input.nextInt();

                      if(number4 == 1)
                      {
                              i.isConfirm = true;
                              i.confirm1();
                      }

                      else if(number4 == 2)
                      {
                             i.isConfirm = false;
                      }

              }



        }


        public void getRequestForBuyProduct()
        {
                Scanner input = new Scanner(System.in);
                for(Order i : requestForBuyProduct)
                {

                        System.out.println("user : " + i.user);
                        System.out.println("type product : " + i.typeProduct);
                        System.out.println("name :" + i.name);
                        System.out.println("price :" + i.price);

                        System.out.println("are you do agree to this buy?");

                        System.out.println("1- yes");
                        System.out.println("2- no");

                        int number4 = input.nextInt();

                        if(number4 == 1)
                        {
                                i.isConfirm = true;
                                i.confirm1();
                        }

                        else if(number4 == 2)
                        {
                                i.isConfirm = false;

                        }



                }
        }

        //===================================================================================================



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
