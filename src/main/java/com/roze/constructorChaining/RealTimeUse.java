package com.roze.constructorChaining;

public class RealTimeUse {
    private int id;
    private String name;
    private String email;

    public RealTimeUse(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public RealTimeUse(int id, String name, String email) {
        this(id, name);
        this.email = email;
    }

    public void displayTwoParameter() {
        System.out.println("Id: " + id + " Name: " + name);
    }

    public void displayThreeParameter() {
        System.out.println("Id: " + id + " Name: " + name + " Email: " + email);
    }

    public static void main(String[] args) {
        RealTimeUse realTimeUseTwo = new RealTimeUse(1, "Firoze");
        realTimeUseTwo.displayTwoParameter();
        RealTimeUse realTimeUseThree = new RealTimeUse(2, "Hossain", "firoze@gmail.com");
        realTimeUseThree.displayThreeParameter();
    }
}
