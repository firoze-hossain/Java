package com.roze.strings;

import java.util.HashMap;

class Demo {
    @Override
    public int hashCode() {
        System.out.println("hashcode called");
        return super.hashCode();
    }
}

public class StringAsKeyInHashMap {
    public static void main(String[] args) {
        /*HashMap for object to check for hashcode invoking*/
//        HashMap<Demo, Integer> hashMap = new HashMap<>();
//        Demo demo = new Demo();
//        hashMap.put(demo, 1);
//        hashMap.get(demo);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("aa", 1);//hash=3104
        map.get("aa");//hash=3104
        map.get("aa");//hash=3104
        map.get("aa");//hash=3104
    }
}
