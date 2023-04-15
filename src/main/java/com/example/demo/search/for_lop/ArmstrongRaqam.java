package com.example.demo.search.for_lop;

public class ArmstrongRaqam {
    public static void main(String[] args) {
        int n = 1634;
        int temp = n;
        int sum = 0;
        int m;
        int numberLenght = 0;

        // berilgan sonni uzunligini topish
        for( ;temp != 0; temp = temp / 10){
            m = temp % 10;
            if(m > 0){
                numberLenght ++;
            }

        }

        // numberLenght  berilgan n ning nechi xona ekanligini bildiradi.

        temp = n;
        // ketma ketlikni xisoblaymiz.
        for ( ; temp != 0;  temp = temp / 10) {
            m = temp % 10;

            int pow = 1;

            // raqamni  numberLenght-chi darajanini xisoblaymiz.Yaniy 1*1*1, 5*5*5*, 3*3*3,... shularni.
            for(int j=0; j< numberLenght; j++){
                pow = pow * m;
            }

            sum = sum + pow;
        }

        if (sum == n) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
