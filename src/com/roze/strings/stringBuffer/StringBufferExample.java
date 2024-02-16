package com.roze.strings.stringBuffer;

public class StringBufferExample {
    public static void main(String[] args) {
        //initial capacity is 16 of StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        //we can create constructor defining the capacity
        StringBuffer stringBuffer1 = new StringBuffer(30);
        //we can create instance initialize new object
        StringBuffer stringBuffer2 = new StringBuffer("Hello Firoze");
        System.out.println(stringBuffer1.capacity());
        System.out.println(stringBuffer.capacity());
        stringBuffer.append("Welcome to buffer");
        //more different methods
        //add string without without creating new object
        stringBuffer.append(" Firoze");
        //replace() method(suppose index 1 to 5 i want to replace it with another string )
        // and it will not count the last index like index five, counted to 4th index
        //  stringBuffer.replace(1,5,"last");
        // insert() method
        stringBuffer.insert(0, "age ");
        //delete(index i, index(n-1))
        stringBuffer.delete(0, 3);
        String s = stringBuffer.toString();
        System.out.println(s);
    }
}
