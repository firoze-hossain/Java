package com.roze.varargs;

public class VarargsOperation {
    int sum = 0;

    void m1(int... num) {
        System.out.println("Length: " + num.length);
        System.out.println("Element at Index(2): " + num[1]);
    }

    int add(int... num) {
        for (int element : num) {
            sum += element;
        }
        return sum;
    }

    public static void main(String[] args) {
        VarargsOperation operation = new VarargsOperation();
        int[] num = {10, 1, 3};
//        int resultByElement = operation.add(1, 10);
//        System.out.println(resultByElement);
        System.out.println("***********");
        int resultByArr = operation.add(num);
        System.out.println(resultByArr);
        System.out.println("Varargs as array");
        operation.m1(1, 6, 3);
    }
}
