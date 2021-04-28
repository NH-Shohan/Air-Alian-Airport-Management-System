import Classes.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.Scanner;

class AirAlianStart {

    public static void main(String[] args) {

        try {

            Formatter formatter = new Formatter("E:\\2nd Semester\\OOP\\Works\\Project\\AirAlian\\FileIO\\History.txt");

            Scanner input = new Scanner(System.in);

            String name;
            int Password1;

            System.out.print("\n\tEnter Your Email Address : ");
            name = input.next();
            formatter.format("Your Mail Address is : %s \r\n", name);
            System.out.print("\n\tEnter Your 8 Digit User Password : ");
            Password1 = input.nextInt();
            formatter.format("Your Password is : %s", Password1);

            if (Password1 > 9999999 && Password1 <= 99999999) {

                try {

                    AirAlian();

                } catch (InputMismatchException e) // Exeception Handeling
                {
                    System.out.println("\n\t *** Sorry. You Have Entered A Wrong Input.  Please Try Again. ***");
                    System.out.println("\n\t*** Please Do Not Enter Any Wrong Input. It's Your Last Chance. ***");
                    AirAlian();
                }

            } else {

                System.out.println("\n\tSorry. Your Password Must In 8 Character. Please Try Again.");

            }

            formatter.close();
        } catch (FileNotFoundException e) {
            System.out.println("\n\tThe File Is Not Found.");
        }

    }

    public static void AirAlian() {

        Scanner jin = new Scanner(System.in);

        System.out.print("\n\tEnter Your User Name : ");
        String Name = jin.nextLine();

        System.out.println("\n\t  A  " + "\tIIIII" + "\tR R  " + "\t\t  A  " + "\tL    " + "\tIIIII" + "\t  A  "
                + "\tN   N" + "\t\t  A  " + "\tIIIII" + "\tR R  " + "\tP P  " + "    O  " + "  R R  " + "  TTTTT");
        System.out.println("\t A A " + "\t  I  " + "\tR   R" + "\t\t A A " + "\tL    " + "\t  I  " + "\t A A "
                + "\tNN  N" + "\t\t A A " + "\t  I  " + "\tR   R" + "\tP   P" + "   O O " + "  R   R" + "    T  ");
        System.out.println("\tAAAAA" + "\t  I  " + "\tR R  " + "\t\tAAAAA" + "\tL    " + "\t  I  " + "\tAAAAA"
                + "\tN N N" + "\t\tAAAAA" + "\t  I  " + "\tR R  " + "\tP P  " + "  O   O" + "  R R  " + "    T  ");
        System.out.println("\tA   A" + "\t  I  " + "\tR  R " + "\t\tA   A" + "\tL    " + "\t  I  " + "\tA   A"
                + "\tN  NN" + "\t\tA   A" + "\t  I  " + "\tR  R " + "\tP    " + "   O O " + "  R  R " + "    T  ");
        System.out.println("\tA   A" + "\tIIIII" + "\tR   R" + "\t\tA   A" + "\tLLLLL" + "\tIIIII" + "\tA   A"
                + "\tN   N" + "\t\tA   A" + "\tIIIII" + "\tR   R" + "\tP    " + "    O  " + "  R   R" + "    T  ");

        Airport A = new Airport();
        double balance = 50000;
        double[] m = new double[10];
        double TA = 0;
        double TM = 0;

        for (int j = 0; j < 10; j++) {
            m[j] = 0;
        }
        int k = 0;

        boolean again = true;

        System.out.println("\n\t|-----------------\\");
        System.out.println("\t|   User Name is   } " + Name);
        System.out.println("\t|-----------------/");

        while (again) {

            System.out.println("\n\t\t+===========>>>-HOME_PAGE-<<<===========+");
            System.out.println("\t\t|                                       |");
            System.out.println("\t\t|      Enter 1 To Flight List           |");
            System.out.println("\t\t|      Enter 2 To Ticket Section        |");
            System.out.println("\t\t|      Enter 3 To Passenger Section     |");
            System.out.println("\t\t|      Enter 4 To Worker Section        |");
            System.out.println("\t\t|      Enter 5 To Exit                  |");
            System.out.println("\t\t|                                       |");
            System.out.println("\t\t+=======================================+");

            System.out.print("\n\tEnter The Number You Want to Work on : ");
            int n1 = jin.nextInt();

            switch (n1) {
            case 1:

                Flightes F = new Flightes();
                Flightes F0 = new Flightes();
                Flightes F1 = new Flightes();
                Flightes F2 = new Flightes();
                Flightes F3 = new Flightes();
                Flightes F4 = new Flightes();
                F0.SetDetails("AirAlian", "F19002", "07:30 PM", "Dhaka", "London");
                F1.SetDetails("AirAlian", "F18903", "08:00 PM", "Dhaka", "Kolkata");
                F2.SetDetails("AirAlian", "F19001", "08:30 PM", "Dhaka", "Nepal");
                F3.SetDetails("AirAlian", "F17057", "09:00 PM", "Dhaka", "USA");
                F4.SetDetails("AirAlian", "F10007", "10:30 PM", "Dhaka", "Canada");
                F.ShowFlightesName();
                F0.ShowFlightes();
                F1.ShowFlightes();
                F2.ShowFlightes();
                F3.ShowFlightes();
                F4.ShowFlightes();
                break;

            case 2:
                System.out.println("\n\tYou have Chosen The Ticket Section");

                System.out.println("\n\t\t+========>>>-TICKET_SELECTION-<<<========+");
                System.out.println("\t\t|                                        |");
                System.out.println("\t\t|    Enter 1 To Buy An Online Ticket     |");
                System.out.println("\t\t|    Enter 2 To Buy An Offline Ticket    |");
                System.out.println("\t\t|                                        |");
                System.out.println("\t\t+========================================+");

                System.out.print("\n\tEnter The Number You Want To Work on : ");
                int op = jin.nextInt();

                switch (op) {
                case 1:
                    boolean again1 = true;
                    while (again1) {

                        System.out.println("\n\t\t    >>> You have the option below <<<");

                        System.out.println("\n\t\t+=========>>>-TICKET_SECTION-<<<=========+");
                        System.out.println("\t\t|                                        |");
                        System.out.println("\t\t|    Enter 1 For Ticket Selection        |");
                        System.out.println("\t\t|    Enter 2 For Payment Management      |");
                        System.out.println("\t\t|    Enter 3 For going Back Home Page    |");
                        System.out.println("\t\t|                                        |");
                        System.out.println("\t\t+========================================+");

                        System.out.print("\n\tEnter The Number You Want To Work on : ");
                        int TS = jin.nextInt();

                        switch (TS) {
                        case 1:
                            System.out.println("\n\t\t\t>>>-TICKET_SELECTION-<<<");

                            System.out.println("\n\t\t-----DESTINATIONS-----");
                            System.out.println("\t\t!                    !");
                            System.out.println("\t\t!     1. London      !");
                            System.out.println("\t\t!     2. Kolkata     !");
                            System.out.println("\t\t!     3. Nepal       !");
                            System.out.println("\t\t!     4. USA         !");
                            System.out.println("\t\t!     5. Canada      !");
                            System.out.println("\t\t!                    !");
                            System.out.println("\t\t----------------------");

                            System.out.print("\n\tEnter Your Name : ");
                            String n = jin.next();
                            System.out.print("\n\tEnter The Number Of Your Destination : ");
                            int t = jin.nextInt();
                            System.out.println("\n\t\t>>>-Your_Ticket-<<<");

                            Flightes F5 = new Flightes();
                            Flightes F6 = new Flightes();
                            Flightes F7 = new Flightes();
                            Flightes F8 = new Flightes();
                            Flightes F9 = new Flightes();
                            F5.SetDetails("AirAlian", "F19002", "07:30 PM", "Dhaka", "London");
                            F6.SetDetails("AirAlian", "F18903", "08:00 PM", "Dhaka", "Kolkata");
                            F7.SetDetails("AirAlian", "F19001", "08:30 PM", "Dhaka", "Nepal");
                            F8.SetDetails("AirAlian", "F17057", "09:00 PM", "Dhaka", "USA");
                            F9.SetDetails("AirAlian", "F10007", "10:30 PM", "Dhaka", "Canada");

                            if (t == 1) {
                                System.out.println(
                                        "\n\t|``````````````````````````````````````````````````````````````````````````````````````|");
                                System.out.println("\t\t\t    Passenger name is : " + n + " ");
                                System.out.println(
                                        "\t|______________________________________________________________________________________|");
                                System.out.println("\t|   " + "Flight Name" + "\t   " + "Flight Code" + "\t\t"
                                        + "Source" + "\t\t" + "Destination" + "\t" + "Flight Time    |");
                                System.out.println(
                                        "\t|                                                                                      |");
                                F5.ShowFlightes();
                            } else if (t == 2) {
                                System.out.println(
                                        "\n\t|``````````````````````````````````````````````````````````````````````````````````````|");
                                System.out.println("\t\t\t    Passenger name is : " + n + " ");
                                System.out.println(
                                        "\t|______________________________________________________________________________________|");
                                System.out.println("\t|   " + "Flight Name" + "\t   " + "Flight Code" + "\t\t"
                                        + "Source" + "\t\t" + "Destination" + "\t" + "Flight Time    |");
                                System.out.println(
                                        "\t|                                                                                      |");
                                F6.ShowFlightes();
                            } else if (t == 3) {
                                System.out.println(
                                        "\n\t|``````````````````````````````````````````````````````````````````````````````````````|");
                                System.out.println("\t\t\t    Passenger name is : " + n + " ");
                                System.out.println(
                                        "\t|______________________________________________________________________________________|");
                                System.out.println("\t|   " + "Flight Name" + "\t   " + "Flight Code" + "\t\t"
                                        + "Source" + "\t\t" + "Destination" + "\t" + "Flight Time    |");
                                System.out.println(
                                        "\t|                                                                                      |");
                                F7.ShowFlightes();
                            } else if (t == 4) {
                                System.out.println(
                                        "\n\t|``````````````````````````````````````````````````````````````````````````````````````|");
                                System.out.println("\t\t\t    Passenger name is : " + n + " ");
                                System.out.println(
                                        "\t|______________________________________________________________________________________|");
                                System.out.println("\t|   " + "Flight Name" + "\t   " + "Flight Code" + "\t\t"
                                        + "Source" + "\t\t" + "Destination" + "\t" + "Flight Time    |");
                                System.out.println(
                                        "\t|                                                                                      |");
                                F8.ShowFlightes();
                            } else if (t == 5) {
                                System.out.println(
                                        "\n\t|``````````````````````````````````````````````````````````````````````````````````````|");
                                System.out.println("\t\t\t    Passenger name is : " + n + " ");
                                System.out.println(
                                        "\t|______________________________________________________________________________________|");
                                System.out.println("\t|   " + "Flight Name" + "\t   " + "Flight Code" + "\t\t"
                                        + "Source" + "\t\t" + "Destination" + "\t" + "Flight Time    |");
                                System.out.println(
                                        "\t|                                                                                      |");
                                F9.ShowFlightes();
                            } else {
                                System.out.println("Your have Entered invalid number. Please try again.");
                            }
                            break;

                        case 2:

                            boolean again3 = true;
                            while (again3) {
                                System.out.println("\n\t\t    >>> You have the option below <<<");

                                System.out.println("\n\t\t+=======>>>-PAYMENT_MANAGEMENT-<<<======+");
                                System.out.println("\t\t|                                       |");
                                System.out.println("\t\t|    Enter 1 To Pay for a Ticket        |");
                                System.out.println("\t\t|    Enter 2 To Cancel a Ticket         |");
                                System.out.println("\t\t|    Enter 3 To Transaction Details     |");
                                System.out.println("\t\t|    Enter 4 To Go Back To Home Page    |");
                                System.out.println("\t\t|                                       |");
                                System.out.println("\t\t+=======================================+");

                                System.out.print("\n\tEnter the number you want to work on : ");
                                int n2 = jin.nextInt();

                                switch (n2) {
                                case 1:

                                    System.out.println("\nYou Have Total Amont : " + balance + " $");
                                    System.out.print("\nTo Buy A Ticket Enter The Amount You Have To Pay : ");
                                    m[k++] = jin.nextDouble();
                                    System.out.println("\n\tYou Have Chosen For Payment");

                                    if (balance < m[k - 1]) {
                                        System.out.println("\n Sorry. Not Enough Money.");
                                    } else {

                                        balance -= m[k - 1];
                                        TA += m[k - 1];
                                        System.out.println("\n\tYour Current Balance is : " + balance + " $");

                                    }
                                    break;

                                case 2:
                                    System.out.println("\n\tYou have chosen To Cancel Ticket.");

                                    if (balance == 5000) {
                                        System.out.println("sorry! you haven't buy ticket yet.");
                                    } else {
                                        balance += m[--k];
                                        TM += m[k];
                                        System.out.println("\n\tYour " + m[k]
                                                + " $ has been returned to Your Account. Thank You.");
                                        System.out.println("\n\tYour Current balance is : " + balance + " $");
                                    }
                                    break;

                                case 3:
                                    System.out.println("\n\tYou have Chosen to See The Transaction\n");

                                    System.out.println("\t\t--------------------------------------");
                                    System.out.println("\t\t!    Your Current Balance is : " + balance + " $");
                                    System.out.println("\t\t!    You have paid amount    : " + TA + " $");
                                    System.out.println("\t\t!    Returned Amount to You  : " + TM + " $");
                                    System.out.println("\t\t--------------------------------------");

                                    break;

                                case 4:
                                    System.out.println("\n\t\t     Thank You. Home Page is Below.");
                                    again3 = false;
                                    break;

                                default:
                                    System.out.println("Your have Entered invalid number. Please try again.");
                                    break;
                                }
                            }
                            break;
                        case 3:
                            System.out.println("\n\t\t     Thank You. Home Page is Below.");
                            again1 = false;
                            break;

                        default:
                            System.out.println("Sorry. Wrong input. Please try agian.");
                            break;
                        }
                    }
                    break;

                case 2:
                    boolean again2 = true;
                    while (again2) {
                        System.out.println("\n\t\t    >>> You have the option below <<<");

                        System.out.println("\n\t\t+=========>>>-TICKET_SECTION-<<<=========+");
                        System.out.println("\t\t|                                        |");
                        System.out.println("\t\t|    Enter 1 For Ticket Selection        |");
                        System.out.println("\t\t|    Enter 2 For Payment Management      |");
                        System.out.println("\t\t|    Enter 3 For going Back Home Page    |");
                        System.out.println("\t\t|                                        |");
                        System.out.println("\t\t+========================================+");

                        System.out.print("\n\tEnter The Number You Want To Work on : ");
                        int TS = jin.nextInt();

                        switch (TS) {
                        case 1:
                            System.out.println("\n\t\t\t>>>-TICKET_SELECTION-<<<");

                            System.out.println("\n\t\t-----DESTINATIONS-----");
                            System.out.println("\t\t!                    !");
                            System.out.println("\t\t!     1. London      !");
                            System.out.println("\t\t!     2. Kolkata     !");
                            System.out.println("\t\t!     3. Nepal       !");
                            System.out.println("\t\t!     4. USA         !");
                            System.out.println("\t\t!     5. Canada      !");
                            System.out.println("\t\t!                    !");
                            System.out.println("\t\t----------------------");

                            System.out.print("\n\tEnter Your Name : ");
                            String n = jin.next();
                            System.out.print("\n\tEnter The Number Of Your Destination : ");
                            int t = jin.nextInt();
                            System.out.println("\n\t\t>>>-Your_Ticket-<<<");

                            Flightes F5 = new Flightes();
                            Flightes F6 = new Flightes();
                            Flightes F7 = new Flightes();
                            Flightes F8 = new Flightes();
                            Flightes F9 = new Flightes();
                            F5.SetDetails("AirAlian", "F19002", "07:30 PM", "Dhaka", "London");
                            F6.SetDetails("AirAlian", "F18903", "08:00 PM", "Dhaka", "Kolkata");
                            F7.SetDetails("AirAlian", "F19001", "08:30 PM", "Dhaka", "Nepal");
                            F8.SetDetails("AirAlian", "F17057", "09:00 PM", "Dhaka", "USA");
                            F9.SetDetails("AirAlian", "F10007", "10:30 PM", "Dhaka", "Canada");

                            if (t == 1) {
                                System.out.println(
                                        "\n\t|``````````````````````````````````````````````````````````````````````````````````````|");
                                System.out.println("\t\t\t    Passenger name is : " + n + " ");
                                System.out.println(
                                        "\t|______________________________________________________________________________________|");
                                System.out.println("\t|   " + "Flight Name" + "\t   " + "Flight Code" + "\t\t"
                                        + "Source" + "\t\t" + "Destination" + "\t" + "Flight Time    |");
                                System.out.println(
                                        "\t|                                                                                      |");
                                F5.ShowFlightes();
                            } else if (t == 2) {
                                System.out.println(
                                        "\n\t|``````````````````````````````````````````````````````````````````````````````````````|");
                                System.out.println("\t\t\t    Passenger name is : " + n + " ");
                                System.out.println(
                                        "\t|______________________________________________________________________________________|");
                                System.out.println("\t|   " + "Flight Name" + "\t   " + "Flight Code" + "\t\t"
                                        + "Source" + "\t\t" + "Destination" + "\t" + "Flight Time    |");
                                System.out.println(
                                        "\t|                                                                                      |");
                                F6.ShowFlightes();
                            } else if (t == 3) {
                                System.out.println(
                                        "\n\t|``````````````````````````````````````````````````````````````````````````````````````|");
                                System.out.println("\t\t\t    Passenger name is : " + n + " ");
                                System.out.println(
                                        "\t|______________________________________________________________________________________|");
                                System.out.println("\t|   " + "Flight Name" + "\t   " + "Flight Code" + "\t\t"
                                        + "Source" + "\t\t" + "Destination" + "\t" + "Flight Time    |");
                                System.out.println(
                                        "\t|                                                                                      |");
                                F7.ShowFlightes();
                            } else if (t == 4) {
                                System.out.println(
                                        "\n\t|``````````````````````````````````````````````````````````````````````````````````````|");
                                System.out.println("\t\t\t    Passenger name is : " + n + " ");
                                System.out.println(
                                        "\t|______________________________________________________________________________________|");
                                System.out.println("\t|   " + "Flight Name" + "\t   " + "Flight Code" + "\t\t"
                                        + "Source" + "\t\t" + "Destination" + "\t" + "Flight Time    |");
                                System.out.println(
                                        "\t|                                                                                      |");
                                F8.ShowFlightes();
                            } else if (t == 5) {
                                System.out.println(
                                        "\n\t|``````````````````````````````````````````````````````````````````````````````````````|");
                                System.out.println("\t\t\t    Passenger name is : " + n + " ");
                                System.out.println(
                                        "\t|______________________________________________________________________________________|");
                                System.out.println("\t|   " + "Flight Name" + "\t   " + "Flight Code" + "\t\t"
                                        + "Source" + "\t\t" + "Destination" + "\t" + "Flight Time    |");
                                System.out.println(
                                        "\t|                                                                                      |");
                                F9.ShowFlightes();
                            } else {
                                System.out.println("Your have Entered invalid number. Please try again.");
                            }
                            break;

                        case 2:

                            boolean again3 = true;
                            while (again3) {
                                System.out.println("\n\t\t    >>> You have the option below <<<");

                                System.out.println("\n\t\t+=======>>>-PAYMENT_MANAGEMENT-<<<======+");
                                System.out.println("\t\t|                                       |");
                                System.out.println("\t\t|    Enter 1 To Pay for a Ticket        |");
                                System.out.println("\t\t|    Enter 2 To Cancel a Ticket         |");
                                System.out.println("\t\t|    Enter 3 To Transaction Details     |");
                                System.out.println("\t\t|    Enter 4 To Go Back To Home Page    |");
                                System.out.println("\t\t|                                       |");
                                System.out.println("\t\t+=======================================+");

                                System.out.print("\n\tEnter the number you want to work on : ");
                                int n2 = jin.nextInt();

                                switch (n2) {
                                case 1:
                                    System.out.println("\nYou Have Total Amont : " + balance + " $");
                                    System.out.print("\nTo Buy A Ticket Enter The Amount You Have To Pay : ");
                                    m[k++] = jin.nextDouble();
                                    System.out.println("\n\tYou Have Chosen For Payment");

                                    if (balance < m[k - 1]) {
                                        System.out.println("\n Sorry. Not Enough Money.");
                                    } else {
                                        balance -= m[k - 1];
                                        TA += m[k - 1];
                                        System.out.println("\n\tYour Current Balance is : " + balance + " $");
                                    }
                                    break;

                                case 2:
                                    System.out.println("\n\tYou have chosen To Cancel Ticket.");

                                    if (balance == 5000) {
                                        System.out.println("sorry! you haven't buy ticket yet.");
                                    } else {
                                        balance += m[--k];
                                        TM += m[k];
                                        System.out.println("\n\tYour " + m[k] + " money has been returned. Thank You.");
                                        System.out.println("\n\tYour Current balance is : " + balance + " $");
                                    }
                                    break;

                                case 3:
                                    System.out.println("\n\tYou have Chosen to See The Transaction\n");

                                    System.out.println("\t\t--------------------------------------");
                                    System.out.println("\t\t!    Your Current Balance is : " + balance + " $");
                                    System.out.println("\t\t!    You have paid amount    : " + TA + " $");
                                    System.out.println("\t\t!    Returned Amount to You  : " + TM + " $");
                                    System.out.println("\t\t--------------------------------------");

                                    break;

                                case 4:
                                    System.out.println("\n\t\t     Thank You. Home Page is Below.");
                                    again3 = false;
                                    break;

                                default:
                                    System.out.println("Your have Entered invalid number. Please try again.");
                                    break;
                                }
                            }
                            break;
                        case 3:
                            System.out.println("\n\t\t     Thank You. Home Page is Below.");
                            again2 = false;
                            break;

                        default:
                            System.out.println("Sorry. Wrong input. Please try agian.");
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n\t\t     Thank You.");
                    again1 = false;
                    break;
                default:
                    System.out.println("Sorry. Wrong input. Please try agian.");
                    break;
                }
                break;

            case 3:
                System.out.println("\n\t\t\t{{{ Passenger Section }}}");

                boolean replay = true;
                while (replay) {
                    System.out.println("\n\t\t    >>> You have the option below <<<");

                    System.out.println("\n\t\t+=======>>>-PASSENGER_SECTION-<<<=======+");
                    System.out.println("\t\t|                                       |");
                    System.out.println("\t\t|    Enter 1 To Add a Passenger         |");
                    System.out.println("\t\t|    Enter 2 To Remove a Passenger      |");
                    System.out.println("\t\t|    Enter 3 To Show all a Passenger    |");
                    System.out.println("\t\t|    Enter 4 To Search a Passenger      |");
                    System.out.println("\t\t|    Enter 5 To Go Back To Home Page    |");
                    System.out.println("\t\t|                                       |");
                    System.out.println("\t\t+=======================================+");

                    System.out.print("\nEnter the number you want to work on : ");
                    int n3 = jin.nextInt();

                    switch (n3) {
                    case 1:
                        System.out.print("\nHow many Passengers do you want to add : ");
                        int x = jin.nextInt();

                        System.out.println("\n\t\t>>>-Add Passenger-<<<");

                        for (int i = 0; i < x; i++) {
                            // String a;
                            System.out.print("\n\t Enter " + (i + 1) + " Passenger First Name      : ");
                            String a = jin.next();
                            System.out.print("\t Enter " + (i + 1) + " Passenger Age             : ");
                            int b = jin.nextInt();
                            System.out.print("\t Enter " + (i + 1) + " Passenger Address         : ");
                            String c = jin.next();
                            System.out.print("\t Enter " + (i + 1) + " Passenger Passport Number : ");
                            String d = jin.next();
                            System.out.print("\t Enter " + (i + 1) + " Passenger Phone Number    : ");
                            String e = jin.next();
                            System.out.print("\t Enter " + (i + 1) + " Passenger Genger          : ");
                            String f = jin.next();
                            System.out.print("\t Enter " + (i + 1) + " Passenger Nationality     : ");
                            String g = jin.next();
                            System.out.print("\n\t Enter " + (i + 1) + " Passenger's Code          : ");
                            int h = jin.nextInt();

                            Passenger P1 = new Passenger();
                            P1.setName(a);
                            P1.setAge(b);
                            P1.setAddress(c);
                            P1.setPassportNumber(d);
                            P1.setPhoneNumber(e);
                            P1.setGender(f);
                            P1.setNationality(g);
                            P1.setCodeName(h);

                            if (A.AddPassenger(P1)) {
                                System.out.println(
                                        "\nCode with " + P1.getCodeName() + " Passenger is Added Successfully.");
                            } else {
                                System.out.println("Sorry. Passenger can not be Added.");
                            }
                        }
                        break;

                    case 2:

                        System.out.println("\n\t>>>-Remove an Existing Passenger-<<<\n");

                        System.out.print("Enter the Passenger Code You want to remove : ");
                        int h1 = jin.nextInt();

                        Passenger P2 = A.searchPassenger(h1);

                        if (P2 != null) {
                            if (A.RemovePassenger(P2)) {
                                System.out.println(
                                        "\nPassenger with Code " + P2.getCodeName() + " is removed Successfully.\n");
                            } else {
                                System.out.println("Sorry. The Passenger can not be Removed.");
                            }
                        } else {
                            System.out.println("Sorry. The Passenger Does Not Exist.");
                        }
                        break;

                    case 3:
                        System.out.println("\n\t>>>-See All The Passengers-<<<\n");

                        A.ShowAllPassenger();
                        break;

                    case 4:
                        System.out.println("\n\t>>>-Search a Passenger-<<<\n");

                        System.out.print("Enter the Passenger Code Please : ");
                        int h3 = jin.nextInt();

                        Passenger P3 = A.searchPassenger(h3);

                        if (P3 != null) {
                            System.out.println("\n\t>>> Passenger Found <<<\n");
                            System.out.println("The Passenger Name is            : " + P3.getName());
                            System.out.println("The Passenger Age is             : " + P3.getAge());
                            System.out.println("The Passenger Address is         : " + P3.getAddress());
                            System.out.println("The Passenger Passport Number is : " + P3.getPassportNumber());
                            System.out.println("The Passenger Phone Number is    : " + P3.getPhoneNumber());
                            System.out.println("The Passenger Gender is          : " + P3.getGender());
                            System.out.println("The Passenger Nationality is     : " + P3.getNationality());
                            System.out.println("\nThe Passenger's Code is          : " + P3.getCodeName());
                        } else {
                            System.out.println("\nSorry. Passenger Does Not Exist.\n");
                        }
                        break;
                    case 5:
                        System.out.println("\n\t\t     Thank You. Home Page is Below.");
                        replay = false;
                        break;
                    default:
                        System.out.println("Sorry. Wrong input. Please try agian.");
                        break;
                    }
                }
                break;

            case 4:
                System.out.println("\n\t\t\t{{{ Worker Section }}}");

                boolean replay1 = true;
                while (replay1) {
                    System.out.println("\n\t\t    >>> You have the option below <<<");

                    System.out.println("\n\t\t+========>>>-WORKER_SECTION-<<<=======+");
                    System.out.println("\t\t|                                     |");
                    System.out.println("\t\t|      Enter 1 Add a Worker           |");
                    System.out.println("\t\t|      Enter 2 Remove a Worker        |");
                    System.out.println("\t\t|      Enter 3 Show all a Worker      |");
                    System.out.println("\t\t|      Enter 4 Search a Worker        |");
                    System.out.println("\t\t|      Enter 5 Go Back Home Page      |");
                    System.out.println("\t\t|                                     |");
                    System.out.println("\t\t+=====================================+");

                    System.out.print("\nEnter The Number you want to work on : ");
                    int h4 = jin.nextInt();

                    switch (h4) {
                    case 1:
                        System.out.println("\n\t>>>-Add a Worker-<<<\n");

                        System.out.print("How Many Workers Do You Wnat To Add : ");
                        int y = jin.nextInt();

                        for (int i = 0; i < y; i++) {

                            System.out.print("\n\tEnter " + (i + 1) + " Worker Name         : ");
                            String a1 = jin.next();
                            System.out.print("\tEnter " + (i + 1) + " Worker ID           : ");
                            int b1 = jin.nextInt();
                            System.out.print("\tEnter " + (i + 1) + " Worker Age          : ");
                            int c1 = jin.nextInt();
                            System.out.print("\tEnter " + (i + 1) + " Worker Address      : ");
                            String d1 = jin.next();
                            System.out.print("\tEnter " + (i + 1) + " Worker Phone Number : ");
                            int e1 = jin.nextInt();
                            System.out.print("\tEnter " + (i + 1) + " Worker Genger       : ");
                            String f1 = jin.next();

                            Worker W1 = new Worker();
                            W1.setName(a1);
                            W1.setID(b1);
                            W1.setAge(c1);
                            W1.setAddress(d1);
                            W1.setPhoneNumber(e1);
                            W1.setGender(f1);

                            if (A.AddWorker(W1)) {
                                System.out.println("\nID with " + W1.getID() + " Worker is Added Successfully");
                            } else {
                                System.out.println("Sorry. The Worker can not be Added.");
                            }
                        }
                        break;

                    case 2:
                        System.out.println("\n\t>>>-Remove an Existing Worker-<<<");

                        System.out.print("\nEnter the Worker ID you want to remove : ");
                        int id1 = jin.nextInt();

                        Worker W2 = A.searchWorker(id1);

                        if (W2 != null) {
                            if (A.RemoveWorker(W2)) {
                                System.out.println("\nWorker with ID " + W2.getID() + " is successfully Removed.");
                            } else {
                                System.out.println("Sorry. The Worker can not be Removed.");
                            }
                        } else {
                            System.out.println("\nSorry. The Worker is not Exist. Please Try Again.");
                        }
                        break;

                    case 3:
                        System.out.println("\n\t>>>-See All The Worker-<<<");

                        A.ShowAllWorker();

                        break;

                    case 4:
                        System.out.println("\n\t>>>-Search a Worker-<<<");

                        System.out.print("\nEnter the Worker ID you want to Search : ");
                        int id2 = jin.nextInt();

                        Worker W3 = A.searchWorker(id2);

                        if (W3 != null) {
                            System.out.println("\n>>> The Worker Found <<<");
                            System.out.println("\nWorker ID is           : " + W3.getID());
                            System.out.println("\nWorker Name is         : " + W3.getName());
                            System.out.println("Worker Age is          : " + W3.getAge());
                            System.out.println("Worker Address is      : " + W3.getAddress());
                            System.out.println("Worker Phone Number is : " + W3.getPhoneNumber());
                            System.out.println("Worker Gender is       : " + W3.getGender());
                        } else {
                            System.out.println("Sorry. The Worker Does Not Exist.");
                        }
                        break;

                    case 5:
                        System.out.println("\n\t\t     Thank You. Home Page is Below.");
                        replay1 = false;
                        break;

                    default:
                        System.out.println("\nSorry. Invalide Input. Please Try Again.");
                        break;
                    }
                }
                break;

            case 5:
                System.out.println("\n\tTTTTTTT" + "\tH   H" + "\t   A   " + "\tN     N" + "\t K    K " + "\tY     Y"
                        + "\t  O  " + "\tU     U");
                System.out.println("\t   T  " + "\tH   H" + "\t  A A  " + "\tNN    N" + "\t K   K  " + "\t Y   Y "
                        + "\t O O " + "\tU     U");
                System.out.println("\t   T  " + "\tH   H" + "\t A   A " + "\tN N   N" + "\t K  K   " + "\t  Y Y  "
                        + "\tO   O" + "\tU     U");
                System.out.println("\t   T  " + "\tHHHHH" + "\tAAAAAAA" + "\tN  N  N" + "\t KKK    " + "\t   Y   "
                        + "\tO   O" + "\tU     U");
                System.out.println("\t   T  " + "\tH   H" + "\tA     A" + "\tN   N N" + "\t K  K   " + "\t   Y   "
                        + "\tO   O" + "\tU     U");
                System.out.println("\t   T  " + "\tH   H" + "\tA     A" + "\tN    NN" + "\t K   K  " + "\t   Y   "
                        + "\t O O " + "\t U   U ");
                System.out.println("\t   T  " + "\tH   H" + "\tA     A" + "\tN     N" + "\t K    K " + "\t   Y   "
                        + "\t  O  " + "\t   U   " + "\n");
                again = false;
                break;

            default:
                System.out.println("Your have Enter invalid number. Please try again.");
                break;
            }
        }
    }
}