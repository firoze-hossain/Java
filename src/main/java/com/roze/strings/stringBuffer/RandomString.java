package com.roze.strings.stringBuffer;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        int size = 5;
        String randomString = generate(size);
        System.out.println(randomString);
    }

    public static String generate(int size) {
        StringBuffer sb = new StringBuffer(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int randomNum = 97 + (int) (random.nextFloat() * 26);
            sb.append((char) randomNum);
        }
        return sb.toString();
    }
}
