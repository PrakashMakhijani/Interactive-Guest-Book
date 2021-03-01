package io.pragra.inclass;

import java.util.Scanner;

public class MyGuestRun {


    public static void main(String[] args) throws InvalidAgeException {
        GuestArrayLIst myGuest = new GuestArrayLIst();
        Scanner sc = new Scanner(System.in);
        Guest firstGuest = new Guest(123, "Prakash", "9427181862", 90);
        Guest SecondGuest = new Guest(234, "Prakash2", "2323232", 45);

        int choice;
        do {
            choice = 0;
            System.out.println("Welcome in My Guest Book");
            System.out.println("Please enter you Choice from following");
            System.out.println("0 -  Exit");
            System.out.println("1 -  Add new Guest  ( Guest should have age > 18 , Name should be at-least 3 chars, phone should be 10 digit)");
            System.out.println("2 -  Print Guest By ID");
            System.out.println("3 -  Search and print guest by name // if guest is not available present proper message to user");
            System.out.println("4 -  Remove guest -- use should be able key in the Id to remove");
            System.out.println("5 -  Print the guest list");
            System.out.print("Your Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {

                    String s1 = "Prakash";

                    System.out.println("Please enter Guest following values");
                    System.out.print("Enter Name: ");
                    String s = sc.nextLine();
                    String s6 = "prakash";
                    System.out.println();
                    System.out.print("Enter Phone Number: ");
                    String Phone = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter ID: ");
                    int ID = Integer.parseInt(sc.nextLine());

                    String s5 = s6 + Phone;
                    Guest firstGuest1 = new Guest(ID, s5, Phone, age);
                    try {
                        myGuest.addGuest(firstGuest1);

                    } catch (InvalidAgeException | InvalidPhoneNUmber | InvalidGuestName e) {
                        e.printStackTrace();

                    } finally {
                        System.out.println();
                    }
                }
                break;
                //Print Guest by ID
                case 2: {
                    System.out.print("Please Enter ID of the GuestList: ");
                    int ID = sc.nextInt();
                    myGuest.printGuestById(ID);
                    System.out.println();
                    System.out.println();
                    System.out.println();
                }
                break;
                //Print Guest by Name
                case 3: {
                    System.out.print("Please Enter Name of the GuestList: ");
                    String name = sc.nextLine();
                    myGuest.printGuestbyName(name);
                    System.out.println();
                    System.out.println();
                    System.out.println();
                }
                break;
                // Remove Guest by ID
                case 4: {
                    System.out.println("Please Enter Guest ID: ");
                    int i = sc.nextInt();
                    myGuest.removeGuest(i);
                    System.out.println();
                    System.out.println();
                    System.out.println();
                }
                break;
                case 5: {
                    myGuest.PrintMyGuest();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                }
                break;
                case 0:
                    System.out.println("Thanks for Using my Guest Book");
            }

        } while (choice != 0);


    }

}




