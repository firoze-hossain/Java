package com.roze.interviewQAndAns.exceptionHandling.userDefinedException;

//if we extend throwable--> so when it is called in catch block it should be exact name or Throwable of exception class
//or use Exception class--> then the catch block of caller handle handle it super(Exception class) or exact name
public class InvalidAgeException extends Throwable {
    public InvalidAgeException(String message) {
        System.out.println(message);
    }
}
