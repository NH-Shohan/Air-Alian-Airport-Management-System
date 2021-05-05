package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.Scanner;
import Classes.AirAlian;

public class FileReadWrite {

    public void FileWrite() {
        try {
			
            Formatter formatter = new Formatter("E:/2nd Semester/OOP/Works/Project/AirAlian/FileIO/History.txt");

            Scanner input = new Scanner(System.in);

            String mail;
            int Password1;

            System.out.print("\n\tEnter Your Email Address : ");
            mail = input.next();
            formatter.format("\r\n Your Mail Address was : %s \r\n", mail);
            System.out.print("\n\tEnter Your 8 Digit User Password : ");
            Password1 = input.nextInt();
            formatter.format("\r\n Your Password is : %s", Password1);

            if (Password1 > 9999999 && Password1 <= 99999999) {

                try {
					
                    AirAlian A = new AirAlian();
                    A.AirAlian1();

                } catch (InputMismatchException e) // Exeception Handeling
                {
                    System.out.println("\n\t *** Sorry. You Have Entered A Wrong Input.  Please Try Again. ***");
                    System.out.println("\n\t*** Please Do Not Enter Any Wrong Input. It's Your Last Chance. ***");
					
                    AirAlian A = new AirAlian();
                    A.AirAlian1();
                }

            } else {

                System.out.println("\n\tSorry. Your Password Must In 8 Character. Please Try Again.");

            }

            formatter.close();
        } catch (FileNotFoundException e) {
            System.out.println("\n\t The File Is Not Found.");
        }
    }

    public void FileRead() {
        try {

            File file = new File("E:/2nd Semester/OOP/Works/Project/AirAlian/FileIO/History.txt");

            Scanner input1 = new Scanner(file);

            while (input1.hasNextLine()) {
                System.out.println(input1.nextLine());
            }
        } catch (Exception ex) {

        }
    }
}
