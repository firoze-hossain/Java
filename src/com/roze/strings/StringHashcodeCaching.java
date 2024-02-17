package com.roze.strings;

public class StringHashcodeCaching {
    public static void main(String[] args) {
        String name = "Firoze";
        // hashcode will generate just for one time
        //in the string object it will be cached
        // it will not be change, cause string is immutable
        // for time consuming it will be generated for one time
        // suppose for large string it will check every character of the string
        // if it is generated again again what time will be wasted
        name.hashCode();//hash=2104517003
        name.hashCode();//hash=2104517003
        name.hashCode();//hash=2104517003
    }
}
