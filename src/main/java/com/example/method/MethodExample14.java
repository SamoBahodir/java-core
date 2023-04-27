package com.example.method;

public class MethodExample14 {
    public static void main(String[] args) {
        int t = 27;
        Selsiy(t);
        int C = Selsiy1(t);
        System.out.println(C + " Kelvin");
    }

    public static void Selsiy(int t) {
        int C = t + 273;
        System.out.println(C + " Kelvin");
    }

    public static int Selsiy1(int t) {
        return t + 273;
    }
}
