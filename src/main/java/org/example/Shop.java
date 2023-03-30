package org.example;

import java.util.ArrayList;

public class Shop {

        //Digikala



        //========================================
        //arrayLists

        ArrayList<User> users = new ArrayList<User>();
        ArrayList<Admin> admins = new ArrayList<Admin>();
        ArrayList<Seller> sellers = new ArrayList<Seller>();

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
                        if( i.getUsername().contains(username) && i.getPassword().equals(password) )
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
                        if( i.getCompanyName().contains(companyName) && i.getPassword().equals(password) )
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
                        if( i.getUsername().contains(username) && i.getPassword().equals(password) )
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
                        if( i.getUsername().contains(username) && i.getEmailAddress().equals(emailAddress) )
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
                        if( i.getUsername().contains(username) && i.getEmailAddress().equals(emailAddress) )
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
                        if ( i.getCompanyName().contains(companyName) && i.getForgottenCode().equals(forgottenPassword))
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

        //list of all users and things
        //sefareshat va kol sood kasb shode
}
