package com.example.method;

public class MethodExample8 {
    public static void main(String[] args) {
        int day = 9;
        String dayOfTheWeek = dayOfTheWeek(day);
        System.out.println(dayOfTheWeek);
        System.out.println(dayOfTheWeek(day));
    }

    private static String dayOfTheWeek(int day) {
        String dayOfTheWeek = "";
        switch (day) {
            case 1 -> System.out.println(dayOfTheWeek + "Monday");
            case 2 -> System.out.println(dayOfTheWeek + "Tuesday");
            case 3 -> System.out.println(dayOfTheWeek + "Wednesday");
            case 4 -> System.out.println(dayOfTheWeek + "Thursday");
            case 5 -> System.out.println(dayOfTheWeek + "Friday");
            case 6 -> System.out.println(dayOfTheWeek + "Saturday");
            case 7 -> System.out.println(dayOfTheWeek + "Sunday");
            default -> System.out.println(dayOfTheWeek + "Such a day of the week");
        }
        return dayOfTheWeek;
    }
}
