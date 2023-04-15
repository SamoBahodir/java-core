package com.example.demo.search.for_lop;

public class KetmaKetlik {
    public static void main(String[] args) {
        int n = 4, a = 3, count=0,temp=0;
        for (int i = 0; i <n ; i++) {
            temp=temp*10+a;
            count=count+temp;
        }
        System.out.println(count);
    }
}
class KetmaKetlik1{
    public static void main(String[] args) {
        int a=6;
        double count=0;
        for (double i = 1; i <= a; i++) {
            count+=1/i;
        }
        System.out.println(count);
    }
}