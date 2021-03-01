package io.pragra.inclass;

public class Guest {
    private int guestID;
    private String name;
    private String phone;
    private int age;

    public Guest(int guestID, String name, String phone, int age) {
        this.guestID = guestID;
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public int getGuestID() {
        return guestID;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }
}
