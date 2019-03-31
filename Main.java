package com.company;

import java.util.IllformedLocaleException;
import java.util.Scanner;
public class Main
{
    public static void main (String [] args)
    {
        System.out.println("Welcome to Call care Online Customer Service!!!");
        System.out.println("Kindly enter your name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("How can we help you today?  " + name);
        System.out.println("To change your preferred language! please Press 1");
        System.out.println("To Make enquiries about your device, press 2");

        Scanner cus = new Scanner(System.in);
        int x = cus.nextInt();
        if (x == 1) {
            System.out.println("For English Press 1");
            System.out.println("For Spanish Press 2");
            System.out.println("For French Press 3");

            Scanner cuss = new Scanner(System.in);
            int y = cuss.nextInt();
            switch (y) {
                case 1:
                    System.out.println("English as been set as your preferred language");
                    break;
                case 2:
                    System.out.println("Spanish as been set as your preferred language");
                    break;
                case 3:
                    System.out.println("French as been set as your preferred language");
                    break;
            }

        }else if (x == 2){
            System.out.println("To Check your line status press 1");
            System.out.println("To Check your phone number press 2");
            System.out.println("To Check your account balance 3");
            Scanner stat = new Scanner(System.in);
            int s = stat.nextInt();

            if (s == 1){
                System.out.println("Your line status Verification in process");
                for (int i=0; i<=5; i++)
                {
                    System.out.println(".............");
                }
                System.out.println("Signal Check Okay");
                for (int i=0; i<=5; i++)
                {
                    System.out.println(".............");
                }
                System.out.println("Call Connectivity Okay");
                for (int i=0; i<=5; i++)
                {
                    System.out.println(".............");
                }
                System.out.println("Sms Check Okay");
                for (int i=0; i<=5; i++)
                {
                    System.out.println(".............");
                }
                System.out.println("Status Okay");
            }

            if (s == 2){
                System.out.println("Your Phone number is: ");
                System.out.println("090761257389");
            }
            if (s == 3){
                System.out.println("Your Current Account balance is:");
                System.out.println("234.34$");
            }
            else {
                System.out.println("error");
            }
        }
        else
        {
            System.out.println("Invalid Selection");
        }


    }
}