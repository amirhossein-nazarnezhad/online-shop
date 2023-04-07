package org.example;

import java.util.Scanner;

public class Main {
    //=== -> ---
    //--- -> ***

    // list kar haye ezafi :

    //1- ID bezaram bara hame chiz
    //2- recommendation user va password
    //3- strong recommendation for Products
    //4- list code takhfif
    //5- regex
    //6- javafx
    //7- DataBase
    //8- not robot
    //9- ye boolean takhfif bara har kala ke age true shod ye darsadi takhfif(az seller miporse) bokhore
    //10- dastresi haye mokhtalef be admin haye jadid  -> handle with boolean



    static Shop shop = new Shop(); // -> Digikala


    //=======================================================
    public static void main(String[] args)
    {
        runStartMenu();
    }

    //=======================================================


    public static void runStartMenu()
    {
        String Digikala = "Digikala";
        shop.setName(Digikala);
        String PhoneNumber = "012345678";
        shop.setPhoneNumber(PhoneNumber);
        String WebAddress = "www.Digikala.com";
        shop.setWebAddress(WebAddress);

        String username = "driver";
        String password = "12345";
        String emailAddress = "amirhossein283@gmail.com";
        Admin admin = new Admin(username , password ,emailAddress);
        shop.admins.add(admin);

        

        System.out.println("       Digikala       ");
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("Hello welcome to Digikala ");

        System.out.println("web address : " + shop.getWebAddress());
        System.out.println("phone number : " + shop.getPhoneNumber());

        System.out.println("Do you want sign up or log in?");
        System.out.println("1- sign up ");
        System.out.println("2- log in ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number == 1)
        {
            signUp();
        }

        else if(number == 2)
        {
            logIn();
        }

        else
        {
            System.out.println("please enter valid input");
            runStartMenu();

        }


    }

    //=============================================================================


    public static void signUp()
    {

        System.out.println("Do you want to register as a seller or a user?");
        System.out.println("1- seller");
        System.out.println("2- user");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number == 1)
        {
            System.out.println("Please enter companyName");
            String companyName = input.next();

            if(shop.doesCompanyExist(companyName))
            {
                System.out.println("This companyName does exist please enter another companyName");
                signUp();
            }

            else
            {


                System.out.println("please enter your password");
                String password = input.next();

                if(password.length()<7)
                {
                    System.out.println("your password is short, please enter more than seven characters");
                    signUp();
                }

                else
                {

                    System.out.println("please confirm your password");
                    String confirmPassword = input.next();

                    System.out.println("please enter a code that you can use to recover your password if you forget it");
                    String forgottenCode = input.next();

                    if(confirmPassword.equalsIgnoreCase(password))
                    {
                        double wallet = 0;
                        Seller seller = new Seller(companyName , password , forgottenCode , wallet);
                        shop.createSellerAccount(seller);
                        sellerMenu(companyName);
                    }

                    else
                    {
                        System.out.println("Please confirm your password correctly");
                        signUp();
                    }
                }
            }


        }

//-----------------------------------------------------------------------------------------------------------

        else if(number == 2)
        {


            System.out.println("Please enter username");
            String username = input.next();

            if(shop.doesUserExist(username))
            {
                System.out.println("This username does exist please enter another username");
                signUp();
            }

            else
            {


                System.out.println("please enter your password");
                String password = input.next();


                if(password.length()<7)
                {
                    System.out.println("your password is short, please enter more than seven characters");
                    signUp();
                }
                else
                {

                    System.out.println("please confirm your password");
                    String confirmPassword = input.next();

                    if(confirmPassword.equalsIgnoreCase(password))
                    {

                        System.out.println("Please enter your emailAddress");
                        String emailAddress = input.next();

                        System.out.println("Please enter your phoneNumber");
                        String phoneNumber = input.next();

                        System.out.println("Please enter your address");
                        String address = input.next();

                        User user = new User(username , password , emailAddress , phoneNumber , address);
                        shop.createUserAccount(user);

                        System.out.println("welcome to Digikala " + username);
                        userMenu(username);
                    }

                    else
                    {

                        System.out.println("Please confirm your password correctly");
                        signUp();
                    }
                }
            }

        }

        else
        {
            System.out.println("you are entered invalid input So try again to sign up ");
            signUp();
        }




    }



    //=============================================================================================

    public static void logIn()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want login as a user or seller or admin? , or forgot password? ");
        System.out.println("1- admin");
        System.out.println("2- seller ");
        System.out.println("3- user");
        System.out.println("4- forgot password");
        int number = input.nextInt();

        //------------------------------------------------------------------------------
        //admin

        if(number == 1)
        {

            System.out.println("Please enter username");
            String username = input.next();
            if(!shop.doesAdminExist(username))
            {
                System.out.println("This username does not exist please enter valid username");
                System.out.println("Do you want to try again or log out?");
                System.out.println("1- log in");
                System.out.println("2 -log out");
                int n = input.nextInt();

                if(n == 1)
                {
                    logIn();
                }

                else if(n == 2)
                {
                    logOut();
                }

                else
                {
                    System.out.println("you are entered invalid input So try again to log in ");
                    logIn();
                }

            }

            else
            {

                System.out.println("please enter your password");
                String password = input.next();

                if(!shop.doesAdminPasswordCorrect(username , password))
                {
                    System.out.println("The password entered is incorrect please try again");
                    logIn();
                }

                else
                {
                    System.out.println("welcome " + username);
                    adminMenu(username);
                }

            }
        }

        //---------------------------------------------------------------------------------

        //seller

        else if(number == 2)
        {
            System.out.println("Please enter companyName");
            String companyName = input.next();
            if(!shop.doesCompanyExist(companyName))
            {
                System.out.println("This company does not exist please enter valid companyName");
                System.out.println("Do you want to try again or log out?");
                System.out.println("1- log in");
                System.out.println("2 -log out");
                int n = input.nextInt();

                if(n == 1)
                {
                    logIn();
                }

                else if(n == 2)
                {
                    logOut();
                }

                else
                {
                    System.out.println("you are entered invalid input So try again to log in ");
                    logIn();
                }

            }

            else
            {

                System.out.println("please enter your password");
                String password = input.next();

                if(!shop.doesCompanyPasswordCorrect(companyName , password))
                {
                    System.out.println("The password entered is incorrect please try again");
                    logIn();
                }

                else
                {
                    System.out.println("welcome " );
                    sellerMenu(companyName);
                }

            }
        }

        //-------------------------------------------------------------------------------------

        //user

        else if(number == 3)
        {


            System.out.println("Please enter username");
            String username = input.next();
            if(!shop.doesUserExist(username))
            {
                System.out.println("This username does not exist please enter valid username");
                System.out.println("Do you want to try again or log out?");
                System.out.println("1- log in");
                System.out.println("2 -log out");
                int n = input.nextInt();

                if(n == 1)
                {
                    logIn();
                }

                else if(n == 2)
                {
                    logOut();
                }

                else
                {
                    System.out.println("you are entered invalid input So try again to log in ");
                    logIn();
                }

            }

            else
            {

                System.out.println("please enter your password");
                String password = input.next();

                if(!shop.doesUserPasswordCorrect(username , password))
                {
                    System.out.println("The password entered is incorrect please try again");
                    logIn();
                }

                else
                {
                    System.out.println("welcome " + username);
                    userMenu(username);
                }

            }
        }

        //----------------------------------------------------------------------------------------
        //forgot password
        else if(number == 4)
        {

            System.out.println("Are you Admin or seller or user?");
            System.out.println("1- Admin");
            System.out.println("2- seller");
            System.out.println("3- user");
            int n = input.nextInt();
//***************************************************************************************

            //admin

            if(n == 1)
            {
                System.out.println("please enter your username");
                String username = input.next();
                if(shop.doesAdminExist(username))
                {
                    System.out.println("please enter your email address");
                    String emailAddress = input.next();

                    if(shop.doesAdminEmailAddressCorrect(username , emailAddress))
                    {
                        System.out.println("your password is :");
                        System.out.println(shop.getAdminPassword(username));

                        System.out.println("Do you want continue?");
                        System.out.println("1- yes ");
                        System.out.println("2- no");

                        int num = input.nextInt();

                        if(num == 1)
                        {
                            runStartMenu();
                        }

                        else if(num == 2)
                        {
                            System.out.println("good bye :)");
                        }

                        else
                        {
                            System.out.println("please enter valid input");
                            logIn();
                        }
                    }

                    else
                    {
                        System.out.println("The email address you entered does not belong to this username");
                        logIn();
                    }
                }

                else
                {
                    System.out.println("this username not exist please try again");
                    logIn();
                }

            }
//************************************************************************************************

            //seller

            else if(n == 2)
            {
                System.out.println("please enter your company name");
                String companyName = input.next();
                if(shop.doesCompanyExist(companyName))
                {
                    System.out.println("please enter your forgotten password");
                    String forgottenPassword = input.next();

                    if(shop.doesCompanyForgottenPasswordCorrect(companyName , forgottenPassword))
                    {
                        System.out.println("your password is :");
                        System.out.println(shop.getCompanyPassword(companyName));

                        System.out.println("Do you want continue?");
                        System.out.println("1- yes ");
                        System.out.println("2- no");

                        int num = input.nextInt();

                        if(num == 1)
                        {
                            runStartMenu();
                        }

                        else if(num == 2)
                        {
                            System.out.println("good bye :)");
                        }

                        else
                        {
                            System.out.println("please enter valid input");
                            logIn();
                        }
                    }

                    else
                    {
                        System.out.println("The forgotten password you entered does not belong to this username");
                        logIn();
                    }
                }

                else
                {
                    System.out.println("this company name not exist please try again");
                    logIn();
                }

            }


//**************************************************************************************************************

            //user


            else if (n == 3)
            {
                System.out.println("please enter your username");
                String username = input.next();

                if(shop.doesUserExist(username))
                {
                    System.out.println("please enter your email address");
                    String emailAddress = input.next();

                    if(shop.doesUserEmailAddressCorrect(username , emailAddress))
                    {
                        System.out.println("your password is :");
                        System.out.println(shop.getUserPassword(username));

                        System.out.println("Do you want continue?");
                        System.out.println("1- yes ");
                        System.out.println("2- no");

                        int num = input.nextInt();

                        if(num == 1)
                        {
                            runStartMenu();
                        }

                        else if(num == 2)
                        {
                            System.out.println("good bye :)");
                        }

                        else
                        {
                            System.out.println("please enter valid input");
                            logIn();
                        }
                    }

                    else
                    {
                        System.out.println("The email address you entered does not belong to this username");
                        logIn();
                    }
                }

                else
                {
                    System.out.println("this username not exist please try again");
                    logIn();
                }

            }



            else
            {
                System.out.println("please enter valid input");
                logIn();
            }


        }

        //---------------------------------------------------------------------------------------

        else
        {
            System.out.println("you are entered invalid input So try again to log in ");
            logIn();
        }



    }

    //==============================================================================================

    public static void userMenu(String username)
    {
        Scanner input = new Scanner(System.in);

        User user = shop.whichUser(username);
        System.out.println("please select one of the options below");
        System.out.println("1- view profile");
        System.out.println("2- update profile");
        System.out.println("3- view Products");  // -> dakhel in be sabad kharid ezafe kone
        System.out.println("4- search Products");  // -> dakhel in be sabad kharid ezafe kone
        System.out.println("5- increase the wallet");
        System.out.println("6- log out");

        //view sabad kharid and can buy 976857668#%&#&%#%#%76875487664875

        int number = input.nextInt();
        //-----------------------------------------------------------------------------------------

        // view profile

        if(number == 1)
        {
            System.out.println("your user name is:");
            System.out.println(user.getUsername());
            System.out.println("your password is:");
            System.out.println(user.getPassword());
            System.out.println("your phone number is:");
            System.out.println(user.getPhoneNumber());
            System.out.println("your email address is:");
            System.out.println(user.getEmailAddress());
            System.out.println("your address is:");
            System.out.println(user.getAddress());
            System.out.println("your wallet is:");
            System.out.println(user.getWallet());
            System.out.println();
            System.out.println("Do you want continue?");
            System.out.println("1- yes");
            System.out.println("2- no");

            int n = input.nextInt();

            if(n == 1)
            {
                userMenu(username);
            }
            else if(n == 2)
            {
                System.out.println("good bye :)");
            }

            else
            {
                System.out.println("you made a wrong entry and we will show the first page again by default");
                userMenu(username);
            }
        }
        //----------------------------------------------------------------------------------------------

        // update profile

        else if(number == 2)
        {

            System.out.println("which item do you want to update?");
            System.out.println("1- username");
            System.out.println("2- password");
            System.out.println("3- phone number");
            System.out.println("4- email address");
            System.out.println("5- address");

            int number1 = input.nextInt();

            if(number1 == 1)
            {
                System.out.println("please enter your considered username");
                String newUsername = input.next();
                user.setUsername(newUsername);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    userMenu(newUsername);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    userMenu(username);
                }

            }

            else if(number1 == 2)
            {
                System.out.println("please enter your considered password");
                String newPassword = input.next();
                user.setPassword(newPassword);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    userMenu(username);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    userMenu(username);
                }

            }

            else if(number1 == 3)
            {
                System.out.println("please enter your considered phone number");
                String newPhoneNumber = input.next();
                user.setPhoneNumber(newPhoneNumber);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    userMenu(username);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    userMenu(username);
                }

            }

            else if(number1 == 4)
            {
                System.out.println("please enter your considered email address");
                String newEmailAddress = input.next();
                user.setEmailAddress(newEmailAddress);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    userMenu(username);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    userMenu(username);
                }

            }

            else if(number1 == 5)
            {
                System.out.println("please enter your considered address");
                String newAddress = input.next();
                user.setAddress(newAddress);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    userMenu(username);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    userMenu(username);
                }

            }

            else
            {
                System.out.println("please enter valid input , try again");
                userMenu(username);
            }


        }

        //--------------------------------------------------------------------------------------------------

        // view Products

        else if(number == 3)
        {
            //todo
        }

        //---------------------------------------------------------------------------------------------------

        // search Products

        else if(number == 4)
        {
            //todo
        }

        //-----------------------------------------------------------------------------------------------------

        //increase the wallet

        else if(number == 5)
        {
            //todo
        }

        //------------------------------------------------------------------------------------------------------------

        //log out

        else if( number == 6)
        {
            logOut();
        }

        //------------------------------------------------------------------------------------------------

        else
        {
            System.out.println("please enter valid input and try again");
            userMenu(username);
        }


    }





    //============================================================================================


    public static void sellerMenu(String companyName)
    {
        Seller seller = shop.whichSeller(companyName);

        Scanner input = new Scanner(System.in);

        System.out.println("please select one of the options below");
        System.out.println("1- view profile");
        System.out.println("2- update profile");
        System.out.println("3- view Products");
        System.out.println("4- search Products");
        System.out.println("5- view the wallet");
        System.out.println("6- add Products");
        System.out.println("7- log out");

        int number = input.nextInt();
        //----------------------------------------------------------------

        //view profile

        if(number == 1)
        {
            System.out.println("your company name is:");
            System.out.println(seller.getCompanyName());
            System.out.println("your password is:");
            System.out.println(seller.getPassword());
            System.out.println("your forgotten password is:");
            System.out.println(seller.getForgottenCode());
            System.out.println();


            System.out.println("Do you want continue?");
            System.out.println("1- yes");
            System.out.println("2- no");

            int n = input.nextInt();

            if(n == 1)
            {
                sellerMenu(companyName);
            }
            else if(n == 2)
            {
                System.out.println("good bye :)");
            }

            else
            {
                System.out.println("you made a wrong entry and we will show the first page again by default");
                sellerMenu(companyName);
            }
        }

        //-------------------------------------------------------------------------

        //update profile

        else if(number == 2)
        {



            System.out.println("which item do you want to update?");
            System.out.println("1- company name");
            System.out.println("2- password");
            System.out.println("3- forgotten password");

            int number1 = input.nextInt();

            if(number1 == 1)
            {
                System.out.println("please enter your considered company name");
                String newCompanyName = input.next();
                seller.setCompanyName(newCompanyName);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(newCompanyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }

            }

            else if(number1 == 2)
            {
                System.out.println("please enter your considered password");
                String newPassword = input.next();
                seller.setPassword(newPassword);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            else if(number1 == 3)
            {
                System.out.println("please enter your considered forgotten password");
                String newForgottenPassword = input.next();
                seller.setForgottenCode(newForgottenPassword);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            else
            {
                System.out.println("please enter valid input and try again");
                sellerMenu(companyName);
            }



        }

        //----------------------------------------------------------------------------

        //view Products

        else if(number == 3)
        {
            //todo
        }

        //-----------------------------------------------------------------------------

        //search Products

        else if(number == 4)
        {
            //todo
        }

        //------------------------------------------------------------------------------------

        //view the wallet

        else if(number == 5)
        {
            System.out.println(seller.getWallet());

            System.out.println("Do you want continue?");
            System.out.println("1- yes");
            System.out.println("2- no");

            int n = input.nextInt();

            if(n == 1)
            {
                sellerMenu(companyName);
            }
            else if(n == 2)
            {
                System.out.println("good bye :)");
            }

            else
            {
                System.out.println("you made a wrong entry and we will show the first page again by default");
                sellerMenu(companyName);
            }
        }

        //--------------------------------------------------------------------------------------

        //add Products

        else if(number == 6)
        {
            addProductBySeller(companyName);
        }

        //-------------------------------------------------------------------------------------

        //log out

        else if(number == 7)
        {
            logOut();
        }

        //---------------------------------------------------------------------------------------------

        else
        {
            System.out.println("please enter valid input and try again");
            sellerMenu(companyName);
        }



    }

    //==============================================================================================

    // add product


    public static void addProductBySeller(String companyName)
    {
        Seller seller = shop.whichSeller(companyName);

        Scanner input = new Scanner(System.in);

        System.out.println("please enter the type of product you want too add");
        System.out.println("1- Beauty and health");
        System.out.println("2- book and stationery");
        System.out.println("3- car and motorcycle");
        System.out.println("4- clothes");
        System.out.println("5- digital");
        System.out.println("6- home and kitchen");
        System.out.println("7- sport");
        System.out.println("8- tools");
        System.out.println("9- toys");

        int number = input.nextInt();

        //--------------------------------------------------------------------------------

        //add Beauty and health


        if(number == 1)
        {

            System.out.println("please specify which product you want to add");
            System.out.println("1- cream");
            System.out.println("2- mask");
            System.out.println("3-shampoo");
            System.out.println("4- tooth brush");
            System.out.println("5- tooth paste");
            System.out.println("6- perfume"); // odkolon

            int number1 = input.nextInt();

            //**************************************************************************************

            //add cream


            if(number1 == 1)
            {
                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "BeautyAndHealth";

                BeautyAndHealth cream = new BeautyAndHealth(price , name , color , weight , typeProduct);
                cream.addCream(cream);
                shop.addBeautyAndHealth(cream);
                seller.addBeautyAndHealth(cream);


                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }


            }

            //********************************************************************************************************

            //add mask

            else if(number1 == 2)
            {
                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "BeautyAndHealth";

                BeautyAndHealth mask = new BeautyAndHealth(price , name , color , weight , typeProduct);
                mask.addMask(mask);
                shop.addBeautyAndHealth(mask);
                seller.addBeautyAndHealth(mask);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //**********************************************************************************************

            //add shampoo


            else if(number1 == 3)
            {
                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "BeautyAndHealth";

                BeautyAndHealth shampoo = new BeautyAndHealth(price , name , color , weight , typeProduct);
                shampoo.addShampoo(shampoo);
                shop.addBeautyAndHealth(shampoo);
                seller.addBeautyAndHealth(shampoo);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //**********************************************************************************************

            //add tooth brush

            else if(number1 == 4)
            {
                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "BeautyAndHealth";

                BeautyAndHealth toothBrush = new BeautyAndHealth(price , name , color , weight , typeProduct);
                toothBrush.addToothbrush(toothBrush);
                shop.addBeautyAndHealth(toothBrush);
                seller.addBeautyAndHealth(toothBrush);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //***************************************************************************************************

            //add toothpaste

            else if(number1 == 5)
            {
                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "BeautyAndHealth";

                BeautyAndHealth toothPaste = new BeautyAndHealth(price , name , color , weight , typeProduct);
                toothPaste.addToothpaste(toothPaste);
                shop.addBeautyAndHealth(toothPaste);
                seller.addBeautyAndHealth(toothPaste);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //***********************************************************************************************

            //add perfume

            else if(number1 == 6)
            {
                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "BeautyAndHealth";

                BeautyAndHealth perfume = new BeautyAndHealth(price , name , color , weight , typeProduct);
                perfume.addPerfume(perfume);
                shop.addBeautyAndHealth(perfume);
                seller.addBeautyAndHealth(perfume);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //*****************************************************************************************8


            else
            {
                System.out.println("please enter valid input and try again");
                addProductBySeller(companyName);
            }




        }

        //--------------------------------------------------------------------------------------------

        //add book and stationery

        else if(number == 2)
        {

            System.out.println("please specify which product you want to add");
            System.out.println("1- pencil");
            System.out.println("2- pen");
            System.out.println("3- table");
            System.out.println("4- pencil case");
            System.out.println("5- notebook");
            System.out.println("6- eraser");
            System.out.println("7- ruler");


            int number1 = input.nextInt();

            //************************************************************************************

            //add pencil

            if(number1 == 1)
            {
                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "BookAndStationery";

                BooksAndStationery pencil = new BooksAndStationery(price , name , color , weight , typeProduct);
                pencil.addPencil(pencil);
                shop.addBooksAndStationery(pencil);
                seller.addBooksAndStationery(pencil);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //***************************************************************************************

            //add pen

            else if(number1 == 2)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "BookAndStationery";

                BooksAndStationery pen = new BooksAndStationery(price , name , color , weight , typeProduct);
                pen.addPen(pen);
                shop.addBooksAndStationery(pen);
                seller.addBooksAndStationery(pen);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //*****************************************************************************************

            //add table

            else if(number1 == 3)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "BookAndStationery";

                BooksAndStationery table = new BooksAndStationery(price , name , color , weight , typeProduct);
                table.addTable(table);
                shop.addBooksAndStationery(table);
                seller.addBooksAndStationery(table);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //**********************************************************************************************

            //add pencil case

            else if(number1 == 4)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "BookAndStationery";

                BooksAndStationery pencilCase = new BooksAndStationery(price , name , color , weight , typeProduct);
                pencilCase.addPencilCase(pencilCase);
                shop.addBooksAndStationery(pencilCase);
                seller.addBooksAndStationery(pencilCase);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //*************************************************************************************

            //add notebook

            else if(number1 == 5)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "BookAndStationery";

                BooksAndStationery notebook = new BooksAndStationery(price , name , color , weight , typeProduct);
                notebook.addNotebook(notebook);
                shop.addBooksAndStationery(notebook);
                seller.addBooksAndStationery(notebook);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //*************************************************************************************************

            //add eraser

            else if(number1 == 6)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "BookAndStationery";

                BooksAndStationery eraser = new BooksAndStationery(price , name , color , weight , typeProduct);
                eraser.addEraser(eraser);
                shop.addBooksAndStationery(eraser);
                seller.addBooksAndStationery(eraser);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //***********************************************************************************************

            //add ruler

            else if(number1 == 7)
            {
                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "BookAndStationery";

                BooksAndStationery ruler = new BooksAndStationery(price , name , color , weight , typeProduct);
                ruler.addRuler(ruler);
                shop.addBooksAndStationery(ruler);
                seller.addBooksAndStationery(ruler);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            else
            {
                System.out.println("please enter valid input and try again");
                addProductBySeller(companyName);
            }

        }

        //----------------------------------------------------------------------------------------------

        //add car and motorcycle

        else if(number == 3)
        {

            System.out.println("please specify which product you want to add");
            System.out.println("1- car");
            System.out.println("2- motorcycle");
            System.out.println("3- tire");



            int number1 = input.nextInt();

            //*****************************************************************************************

            //add car

            if(number1 == 1)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "CarAndMotorcycle";

                CarAndMotorcycle car = new CarAndMotorcycle(price , name , color , weight , typeProduct);
                car.addCar(car);
                shop.addCarAndMotorcycle(car);
                seller.addCarAndMotorcycle(car);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //****************************************************************************************************

            //add motorcycle

            else if(number1 == 2)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "CarAndMotorcycle";

                CarAndMotorcycle motorcycle = new CarAndMotorcycle(price , name , color , weight , typeProduct);
                motorcycle.addMotorcycle(motorcycle);
                shop.addCarAndMotorcycle(motorcycle);
                seller.addCarAndMotorcycle(motorcycle);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //*********************************************************************************************

            //add tire

            else if(number1 == 3)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "CarAndMotorcycle";

                CarAndMotorcycle tire = new CarAndMotorcycle(price , name , color , weight , typeProduct);
                tire.addTire(tire);
                shop.addCarAndMotorcycle(tire);
                seller.addCarAndMotorcycle(tire);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //************************************************************************************************

            else
            {
                System.out.println("please enter valid input and try again");
                addProductBySeller(companyName);
            }

        }

        //------------------------------------------------------------------------------------------------

        //add clothes

        else if(number == 4)
        {

            System.out.println("please specify which product you want to add");
            System.out.println("1- shirt");
            System.out.println("2- pants");
            System.out.println("3- hoodie");
            System.out.println("4- shoe");
            System.out.println("5- jacket");
            System.out.println("6- belt");


            int number1 = input.nextInt();

            //*******************************************************************************8

            //add shirt

            if(number1 == 1)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Clothes";

                Clothes shirt = new Clothes(price , name , color , weight , typeProduct);
                shirt.addShirt(shirt);
                shop.addClothes(shirt);
                seller.addClothes(shirt);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //**********************************************************************************************

            //add pants

            else if(number1 == 2)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Clothes";

                Clothes pants = new Clothes(price , name , color , weight , typeProduct);
                pants.addPants(pants);
                shop.addClothes(pants);
                seller.addClothes(pants);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //***********************************************************************************************

            //add hoodie

            else if(number1 == 3)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Clothes";

                Clothes hoodie = new Clothes(price , name , color , weight , typeProduct);
                hoodie.addHoodie(hoodie);
                shop.addClothes(hoodie);
                seller.addClothes(hoodie);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //**********************************************************************************************

            //add shoe

            else if(number1 == 4)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Clothes";

                Clothes shoe = new Clothes(price , name , color , weight , typeProduct);
                shoe.addShoe(shoe);
                shop.addClothes(shoe);
                seller.addClothes(shoe);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //**********************************************************************************************

            //add jacket

            else if(number1 == 5)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Clothes";

                Clothes jacket = new Clothes(price , name , color , weight , typeProduct);
                jacket.addJacket(jacket);
                shop.addClothes(jacket);
                seller.addClothes(jacket);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //***********************************************************************************************

            //add belt

            else if(number1 == 6)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Clothes";

                Clothes belt = new Clothes(price , name , color , weight , typeProduct);
                belt.addBelt(belt);
                shop.addClothes(belt);
                seller.addClothes(belt);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //**********************************************************************************************

            else
            {
                System.out.println("please enter valid input and try again");
                addProductBySeller(companyName);
            }

        }

        //------------------------------------------------------------------------------------------------

        //add digital

        else if(number == 5)
        {

            System.out.println("please specify which product you want to add");
            System.out.println("1- mobile");
            System.out.println("2- tv");
            System.out.println("3- headphone");
            System.out.println("4- memory");
            System.out.println("5- camera");
            System.out.println("6- computer");
            System.out.println("7- playstation");


            int number1 = input.nextInt();

            //*****************************************************************************************8

            //add mobile

            if(number1 == 1)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Digital";

                Digital mobile = new Digital(price , name , color , weight , typeProduct);
                mobile.addMobile(mobile);
                shop.addDigital(mobile);
                seller.addDigital(mobile);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //***********************************************************************************************

            //add tv

            else if(number1 == 2)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Digital";

                Digital tv = new Digital(price , name , color , weight , typeProduct);
                tv.addTv(tv);
                shop.addDigital(tv);
                seller.addDigital(tv);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //***************************************************************************************************

            //add headphone

            else if(number1 == 3)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Digital";

                Digital headphone = new Digital(price , name , color , weight , typeProduct);
                headphone.addHeadphone(headphone);
                shop.addDigital(headphone);
                seller.addDigital(headphone);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //************************************************************************************************

            //add memory

            else if(number1 == 4)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Digital";

                Digital memory = new Digital(price , name , color , weight , typeProduct);
                memory.addMemory(memory);
                shop.addDigital(memory);
                seller.addDigital(memory);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //*******************************************************************************************************

            //add camera

            else if(number1 == 5)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Digital";

                Digital camera = new Digital(price , name , color , weight , typeProduct);
                camera.addCamera(camera);
                shop.addDigital(camera);
                seller.addDigital(camera);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //***************************************************************************************************

            //add computer

            else if(number1 == 6)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Digital";

                Digital computer = new Digital(price , name , color , weight , typeProduct);
                computer.addComputer(computer);
                shop.addDigital(computer);
                seller.addDigital(computer);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //****************************************************************************************************

            //add playstation

            else if(number1 == 7)
            {
                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Digital";

                Digital playstation = new Digital(price , name , color , weight , typeProduct);
                playstation.addPlaystation(playstation);
                shop.addDigital(playstation);
                seller.addDigital(playstation);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //****************************************************************************************************


            else
            {
                System.out.println("please enter valid input and try again");
                addProductBySeller(companyName);
            }

        }

        //-----------------------------------------------------------------------------------------------------

        //add home and kitchen

        else if(number == 6)
        {

            System.out.println("please specify which product you want to add");
            System.out.println("1- refrigerator");
            System.out.println("2- carpet");
            System.out.println("3- sofa");
            System.out.println("4- washingMachine");
            System.out.println("5- gas");
            System.out.println("6- cooler");


            int number1 = input.nextInt();

            //************************************************************************************************

            //add refrigerator

            if(number1 == 1)
            {
                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "HomeAndKitchen";

                HomeAndKitchen refrigerator = new HomeAndKitchen(price , name , color , weight , typeProduct);
                refrigerator.addRefrigerator(refrigerator);
                shop.addHomeAndKitchen(refrigerator);
                seller.addHomeAndKitchen(refrigerator);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //*****************************************************************************************************

            //add carpet

            else if(number1 == 2)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "HomeAndKitchen";

                HomeAndKitchen carpet = new HomeAndKitchen(price , name , color , weight , typeProduct);
                carpet.addCarpet(carpet);
                shop.addHomeAndKitchen(carpet);
                seller.addHomeAndKitchen(carpet);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //**************************************************************************************************8

            //add sofa

            else if(number1 == 3)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "HomeAndKitchen";

                HomeAndKitchen sofa = new HomeAndKitchen(price , name , color , weight , typeProduct);
                sofa.addSofa(sofa);
                shop.addHomeAndKitchen(sofa);
                seller.addHomeAndKitchen(sofa);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //***************************************************************************************************

            //add washingMachine

            else if(number1 == 4)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "HomeAndKitchen";

                HomeAndKitchen washingMachine = new HomeAndKitchen(price , name , color , weight , typeProduct);
                washingMachine.addWashingMachine(washingMachine);
                shop.addHomeAndKitchen(washingMachine);
                seller.addHomeAndKitchen(washingMachine);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //************************************************************************************************

            //add gas

            else if(number1 == 5)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "HomeAndKitchen";

                HomeAndKitchen gas = new HomeAndKitchen(price , name , color , weight , typeProduct);
                gas.addGas(gas);
                shop.addHomeAndKitchen(gas);
                seller.addHomeAndKitchen(gas);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //************************************************************************************************

            //add cooler

            else if(number1 == 6)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "HomeAndKitchen";

                HomeAndKitchen cooler = new HomeAndKitchen(price , name , color , weight , typeProduct);
                cooler.addCooler(cooler);
                shop.addHomeAndKitchen(cooler);
                seller.addHomeAndKitchen(cooler);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            else
            {
                System.out.println("please enter valid input and try again");
                addProductBySeller(companyName);
            }

        }

        //-------------------------------------------------------------------------------------------------

        //add sport

        else if(number == 7)
        {

            System.out.println("please specify which product you want to add");
            System.out.println("1- ball");
            System.out.println("2- racket");
            System.out.println("3- skate");
            System.out.println("4- Whistle");


            int number1 = input.nextInt();

            //***********************************************************************************************

            //add ball

            if(number1 == 1)
            {
                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Sport";

                Sport ball = new Sport(price , name , color , weight , typeProduct);
                ball.addBall(ball);
                shop.addSport(ball);
                seller.addSport(ball);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //*********************************************************************************************

            //add racket

            else if(number1 == 2)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Sport";

                Sport racket = new Sport(price , name , color , weight , typeProduct);
                racket.addRacket(racket);
                shop.addSport(racket);
                seller.addSport(racket);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //************************************************************************************************

            //add skate

            else if(number1 == 3)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Sport";

                Sport skate = new Sport(price , name , color , weight , typeProduct);
                skate.addSkate(skate);
                shop.addSport(skate);
                seller.addSport(skate);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //************************************************************************************************

            //add whistle

            else if(number1 == 4)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Sport";

                Sport whistle = new Sport(price , name , color , weight , typeProduct);
                whistle.addWhistle(whistle);
                shop.addSport(whistle);
                seller.addSport(whistle);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //*************************************************************************************************

            else
            {
                System.out.println("please enter valid input and try again");
                addProductBySeller(companyName);
            }

        }

        //-----------------------------------------------------------------------------------------------------

        //add tools

        else if(number == 8)
        {

            System.out.println("please specify which product you want to add");
            System.out.println("1- wrench");
            System.out.println("2- screwDriver");
            System.out.println("3- screw");
            System.out.println("4- nut");
            System.out.println("5- saw");
            System.out.println("6- nails");


            int number1 = input.nextInt();

            //******************************************************************************************

            //add wrench

            if(number1 == 1)
            {
                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Tools";

                Tools wrench = new Tools(price , name , color , weight , typeProduct);
                wrench.addWrench(wrench);
                shop.addTools(wrench);
                seller.addTools(wrench);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }

            }

            //*****************************************************************************************

            //add screwDriver

            else if(number1 == 2)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Tools";

                Tools screwDriver= new Tools(price , name , color , weight , typeProduct);
                screwDriver.addScrewDriver(screwDriver);
                shop.addTools(screwDriver);
                seller.addTools(screwDriver);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //*******************************************************************************************

            //add screw

            else if(number1 == 3)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Tools";

                Tools screw = new Tools(price , name , color , weight , typeProduct);
                screw.addScrew(screw);
                shop.addTools(screw);
                seller.addTools(screw);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //**********************************************************************************************

            //add nut

            else if(number1 == 4)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Tools";

                Tools nut = new Tools(price , name , color , weight , typeProduct);
                nut.addNut(nut);
                shop.addTools(nut);
                seller.addTools(nut);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //***************************************************************************************************

            //add saw

            else if(number1 == 5)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Tools";

                Tools saw = new Tools(price , name , color , weight , typeProduct);
                saw.addSaw(saw);
                shop.addTools(saw);
                seller.addTools(saw);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //***********************************************************************************************

            //add nails

            else if(number1 == 6)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Tools";

                Tools nails = new Tools(price , name , color , weight , typeProduct);
                nails.addNails(nails);
                shop.addTools(nails);
                seller.addTools(nails);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //***********************************************************************************************

            else
            {
                System.out.println("please enter valid input and try again");
                addProductBySeller(companyName);
            }

        }

        //-----------------------------------------------------------------------------------------------------

        //add toys

        else if(number == 9)
        {

            System.out.println("please specify which product you want to add");
            System.out.println("1- puzzle");
            System.out.println("2- doll");
            System.out.println("3- gun");
            System.out.println("4- bike");
            System.out.println("5- car");


            int number1 = input.nextInt();

            //********************************************************************************************

            //add puzzle

            if(number1 == 1)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Toys";

                Toys puzzle = new Toys(price , name , color , weight , typeProduct);
                puzzle.addPuzzle(puzzle);
                shop.addToys(puzzle);
                seller.addToys(puzzle);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //************************************************************************************************

            //add doll

            else if(number1 == 2)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Toys";

                Toys doll = new Toys(price , name , color , weight , typeProduct);
                doll.addDoll(doll);
                shop.addToys(doll);
                seller.addToys(doll);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //**********************************************************************************************

            //add gun

            else if(number1 == 3)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Toys";

                Toys gun = new Toys(price , name , color , weight , typeProduct);
                gun.addGun(gun);
                shop.addToys(gun);
                seller.addToys(gun);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //************************************************************************************************

            //add bike

            else if(number1 == 4)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Toys";

                Toys bike = new Toys(price , name , color , weight , typeProduct);
                bike.addBike(bike);
                shop.addToys(bike);
                seller.addToys(bike);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //************************************************************************************************

            //add car

            else if(number1 == 5)
            {

                System.out.println("please enter price");
                double price = input.nextDouble();
                System.out.println("please enter name");
                String name = input.next();
                System.out.println("please enter color");
                String color = input.next();
                System.out.println("please enter weight");
                String weight = input.next();
                String typeProduct = "Toys";

                Toys car = new Toys(price , name , color , weight , typeProduct);
                car.addCar(car);
                shop.addToys(car);
                seller.addToys(car);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    sellerMenu(companyName);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    sellerMenu(companyName);
                }
            }

            //************************************************************************************************8

            else
            {
                System.out.println("please enter valid input and try again");
                addProductBySeller(companyName);
            }

        }

        //--------------------------------------------------------------------------------------------------

        else
        {
            System.out.println("please enter valid input and try again");
            addProductBySeller(companyName);
        }


    }



    //============================================================================================

    public static void adminMenu(String username)
    {
        Admin admin = shop.whichAdmin(username);


        Scanner input = new Scanner(System.in);

        System.out.println("please select one of the options below");
        System.out.println("1- view profile");
        System.out.println("2- update profile");
        System.out.println("3- view Products");
        System.out.println("4- search Products");
        System.out.println("5- view the amount of money in the shop");
        System.out.println("6- view users profile");
        System.out.println("7- view sellers profile");
        System.out.println("8- add admin");
        System.out.println("9- remove users");
        System.out.println("10- remove sellers");
        System.out.println("11- view user orders");
        System.out.println("12- view the sales list of sellers");  // list foroosh
        System.out.println("13- add discount code");
        System.out.println("14- view discount code list");
        System.out.println("15- log out");

        int number = input.nextInt();
        //-----------------------------------------------------------

        //view profile

        if(number == 1)
        {
            System.out.println("your username is:");
            System.out.println(admin.getUsername());
            System.out.println("your password is:");
            System.out.println(admin.getPassword());
            System.out.println("your email address is:");
            System.out.println(admin.getEmailAddress());
            System.out.println();
            System.out.println("Do you want continue?");
            System.out.println("1- yes");
            System.out.println("2- no");

            int n = input.nextInt();

            if(n == 1)
            {
                adminMenu(username);
            }
            else if(n == 2)
            {
                System.out.println("good bye :)");
            }

            else
            {
                System.out.println("you made a wrong entry and we will show the first page again by default");
                adminMenu(username);
            }


        }

        //--------------------------------------------------------------------------

        //update profile

        else if(number == 2)
        {





            System.out.println("which item do you want to update?");
            System.out.println("1- username");
            System.out.println("2- password");
            System.out.println("3- email address");

            int number1 = input.nextInt();


            if(number1 == 1)
            {
                System.out.println("please enter your considered username");
                String newUsername = input.next();
                admin.setUsername(newUsername);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    adminMenu(newUsername);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    adminMenu(username);
                }

            }

            else if(number1 == 2)
            {
                System.out.println("please enter your considered password");
                String newPassword = input.next();
                admin.setPassword(newPassword);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    adminMenu(username);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    adminMenu(username);
                }

            }


            else if(number1 == 3)
            {
                System.out.println("please enter your considered email address");
                String newEmailAddress = input.next();
                admin.setEmailAddress(newEmailAddress);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    adminMenu(username);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    adminMenu(username);
                }

            }




        }

        //------------------------------------------------------------------------------

        //view Products


        else if(number == 3)
        {

        }

        //------------------------------------------------------------------------------------

        //search Products


        else if(number == 4)
        {

        }

        //---------------------------------------------------------------------------------------

        //view the amount of money in the shop

        else if(number == 5)
        {

            System.out.println(shop.getTotalMoney());


            System.out.println("Do you want continue?");
            System.out.println("1- yes");
            System.out.println("2- no");

            int n = input.nextInt();

            if(n == 1)
            {
                adminMenu(username);
            }
            else if(n == 2)
            {
                System.out.println("good bye :)");
            }

            else
            {
                System.out.println("you made a wrong entry and we will show the first page again by default");
                adminMenu(username);
            }

        }

        //----------------------------------------------------------------------------------------------

        //view users profile

        else if(number == 6)
        {
            System.out.println("please enter the username of the desired user");
            String userUsername = input.next();
            if(shop.doesUserExist(userUsername))
            {
                User user = shop.whichUser(userUsername);

                System.out.println("username is:");
                System.out.println(user.getUsername());
                System.out.println("password is:");
                System.out.println(user.getPassword());
                System.out.println("phone number is:");
                System.out.println(user.getPhoneNumber());
                System.out.println("email address is:");
                System.out.println(user.getEmailAddress());
                System.out.println("address is:");
                System.out.println(user.getAddress());
                System.out.println("wallet is:");
                System.out.println(user.getWallet());
                System.out.println();
                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    adminMenu(username);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    adminMenu(username);
                }
            }

            else
            {
                System.out.println("there is no user with this username , please try again");
                adminMenu(username);
            }
        }

        //---------------------------------------------------------------------------------------------

        //view sellers profile

        else if(number == 7)
        {
            System.out.println("please enter the company name of the desired seller");
            String companyName = input.next();

            if(shop.doesCompanyExist(companyName))
            {
                Seller seller = shop.whichSeller(companyName);


                System.out.println("company name is:");
                System.out.println(seller.getCompanyName());
                System.out.println("password is:");
                System.out.println(seller.getPassword());
                System.out.println("forgotten password is:");
                System.out.println(seller.getForgottenCode());
                System.out.println();


                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    adminMenu(username);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    adminMenu(username);
                }

            }

            else
            {
                System.out.println("this company does not exist , please try again");
                adminMenu(username);
            }
        }

        //----------------------------------------------------------------------------------------

        //add admin

        else if(number == 8)
        {

        }

        //------------------------------------------------------------------------------------------

        //remove users

        else if(number == 9)
        {
            System.out.println("please enter the username of the desired user");
            String userUsername = input.next();
            if(shop.doesUserExist(userUsername))
            {
                shop.removeUser(userUsername);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    adminMenu(username);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    adminMenu(username);
                }


            }

            else
            {
                System.out.println("there is no user with this username , please try again");
                adminMenu(username);
            }


        }

        //------------------------------------------------------------------------------------------------

        //remove sellers

        else if(number == 10)
        {


            System.out.println("please enter the company name of the desired seller");
            String companyName = input.next();
            if(shop.doesCompanyExist(companyName))
            {
                shop.removeSeller(companyName);

                System.out.println("Do you want continue?");
                System.out.println("1- yes");
                System.out.println("2- no");

                int n = input.nextInt();

                if(n == 1)
                {
                    adminMenu(username);
                }
                else if(n == 2)
                {
                    System.out.println("good bye :)");
                }

                else
                {
                    System.out.println("you made a wrong entry and we will show the first page again by default");
                    adminMenu(username);
                }


            }

            else
            {
                System.out.println("this company does not exist , please try again");
                adminMenu(username);
            }




        }

        //-------------------------------------------------------------------------------------------------

        //view user orders

        else if(number == 11)
        {

        }

        //---------------------------------------------------------------------------------------------------

        //view the sales list of sellers

        else if(number == 12)
        {

        }

        //--------------------------------------------------------------------------------------------------

        //add discount code

        else if(number == 13)
        {
            System.out.println("please enter discount code");
            String discountCode = input.next();
            shop.addDiscountCode(discountCode);

            System.out.println("Do you want continue?");
            System.out.println("1- yes");
            System.out.println("2- no");

            int n = input.nextInt();

            if(n == 1)
            {
                adminMenu(username);
            }
            else if(n == 2)
            {
                System.out.println("good bye :)");
            }

            else
            {
                System.out.println("you made a wrong entry and we will show the first page again by default");
                adminMenu(username);
            }


        }

        //---------------------------------------------------------------------------------------------------

        //view discount code list

        else if(number == 14)
        {

            System.out.println(shop.getDiscountCodes());


            System.out.println("Do you want continue?");
            System.out.println("1- yes");
            System.out.println("2- no");

            int n = input.nextInt();

            if(n == 1)
            {
                adminMenu(username);
            }
            else if(n == 2)
            {
                System.out.println("good bye :)");
            }

            else
            {
                System.out.println("you made a wrong entry and we will show the first page again by default");
                adminMenu(username);
            }

        }




        //---------------------------------------------------------------------------------------------------

        //log out

        else if(number == 15)
        {
            logOut();
        }

        //-----------------------------------------------------------------------------------------------------

        else
        {
            System.out.println("please enter valid input and try again");
            adminMenu(username);
        }








    }


    //=============================================================================================

    public static void logOut()
    {
        System.out.println("You have successfully logged out of your account");
        System.out.println();
        runStartMenu();
    }


    //==================================================================================================





}