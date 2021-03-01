package io.pragra.inclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GuestArrayLIst {
    List<Guest> MyGuestList = new ArrayList<>();


    public void addGuest(Guest gu1) throws InvalidAgeException, InvalidPhoneNUmber, InvalidGuestName {
        if (gu1.getAge() < 18) {

            throw new InvalidAgeException("Guest Age should be at least 18");
        }
        if (gu1.getPhone().length() > 10) {
            throw new InvalidPhoneNUmber("Please enter Valid 10 digit Phone Number ");
        }
        if (gu1.getName().length() < 4) {
            throw new InvalidGuestName("Please Enter Valid Full Name");
        }

        MyGuestList.add(gu1);

    }

    public void removeGuest(int ID) {
        List<Guest> guestStream = MyGuestList.stream()
                .filter(Guest -> Guest.getGuestID() == ID).collect(Collectors.toList());

        MyGuestList.removeAll(guestStream);

    }

    public void printGuestById(int ID) {
        List<Guest> collect = MyGuestList.stream()
                .filter(Guest -> Guest.getGuestID() == ID)
                .collect(Collectors.toList());
        System.out.println(" { Guest ID :" + collect.get(0).getGuestID() +
                "GuestName: " + collect.get(0).getName() +
                " Age:" + collect.get(0).getAge() +
                "Guest Phone # : " + collect.get(0).getPhone() +
                " }");
    }

    public void printGuestbyName(String name) {
        List<Guest> collect = MyGuestList.stream()
                .filter(Guest -> Guest.getName() == name)
                .collect(Collectors.toList());
        System.out.println(" { Guest ID :" + collect.get(0).getGuestID() +
                "GuestName: " + collect.get(0).getName() +
                " Age:" + collect.get(0).getAge() +
                "Guest Phone # : " + collect.get(0).getPhone() +
                " }");
    }

    public void PrintMyGuest() {
        System.out.println("My Guest List");
        Iterator<Guest> myIter = MyGuestList.iterator();
        while (myIter.hasNext()) {
            Guest next = myIter.next();
            System.out.println(" { Guest ID :" + next.getGuestID() +
                    " GuestName: " + next.getName() +
                    " Age:" + next.getAge() +
                    " Guest Phone # : " + next.getPhone() +
                    " }");
        }


    }


}
