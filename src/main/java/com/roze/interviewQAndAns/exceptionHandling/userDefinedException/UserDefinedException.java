package com.roze.interviewQAndAns.exceptionHandling.userDefinedException;

public class UserDefinedException {
    public static void vote(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not Eligible for voting");
        } else {
            System.out.println("Eligible for voting");
        }
    }

    public static void main(String[] args) {
        //age should be greater than or equal to 18
        try {
            vote(10);
        } catch (Throwable e) {
            System.out.println("Age should be greater than or equal to 18");
        }


    }
}
