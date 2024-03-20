package com.roze.varargs.cases;

public class OverloadingVarargsBadIdea {
    int sum(int a, int... b) {
        int sum = a;
        for (int temp : b) {
            sum = sum + temp;
        }
        return sum;
    }

    int sum(int a, int b, int... c) {
        int sum = a + b;
        for (int temp : c) {
            sum = sum + temp;
        }
        return sum;
    }

    public static void main(String[] args) {
        OverloadingVarargsBadIdea badIdea = new OverloadingVarargsBadIdea();
        //we can not initiate the value
        //jvm becomes confused which method to call
        //but method declaration it does not show compile time error
        //it will throw ambiguous problem reference to sum()
      //  badIdea.sum(1, 3, 5);
    }
}
