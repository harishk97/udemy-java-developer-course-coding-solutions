package com.company.learning;

public class equalsumchecker {
    public static void main(String[] args) {
        boolean output=hasEqualSum(1,-1,0);
        System.out.println(output);
    }
    public static boolean hasEqualSum(int num1, int num2, int num3){
        int value1=num1+num2;
        if(value1==num3){
            return true;
        }
        return false;
    }
}
