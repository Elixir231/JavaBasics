package com.company;

import java.util.Scanner;
public class Main
{
    public static void main (String [] args)
    {
        System.out.println("Welcome to Call care Online Customer Service!!!");
        System.out.println("How can we help you?");
        System.out.println("To change your preferred language! please Press 1");

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

        }else
        {
            System.out.println("Invalid Selection");
        }


    }
}