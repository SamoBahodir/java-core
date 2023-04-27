package com.example.java;

import java.util.Random;

public class OTP {
    public static void main(String[] args) {
        String number = "0123456789";
        int length = 6;
        char[] otp = new char[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            otp[i] = number.charAt(random.nextInt(number.length()));
        }
        System.out.println("OTP: " + new String(otp));
    }
}
