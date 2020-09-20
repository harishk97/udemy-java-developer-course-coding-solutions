package com.company.learning;

public class leapyear {
    public static void main(String[] args) {
        boolean value = isLeapYear(2400);
        System.out.println("from main="+value);

    }

    public static boolean isLeapYear(int year){
        if(year>=1 && year<=9999){
            //System.out.println(year);

            if(year%4==0 && year%100!=0 || year%400==0){
                //System.out.println(year);
                return true;
            }
        }
        return false;

    }
}
