package org.example;

import java.util.Scanner;

public class Main {
    //=== -> ---
    //--- -> ***

    //not robot

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
                    Seller seller = new Seller(companyName , password , forgottenCode);
                    shop.createSellerAccount(seller);
                    sellerMenu();
                }

                else
                {
                    System.out.println("Please confirm your password correctly");
                    signUp();
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
                    userMenu();
                }

                else
                {

                    System.out.println("Please confirm your password correctly");
                    signUp();
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
                    adminMenu();
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
                    sellerMenu();
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
                    userMenu();
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

    public static void userMenu()
    {
        runStartMenu();
    }

    //============================================================================================

    public static void sellerMenu()
    {
        runStartMenu();
    }

    //============================================================================================

    public static void adminMenu()
    {
        runStartMenu();
    }

    //=============================================================================================





    public static void logOut()
    {
        System.out.println("You have successfully logged out of your account");
        runStartMenu();
    }

    //==================================================================================================





}