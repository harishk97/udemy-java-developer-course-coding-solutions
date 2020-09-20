package com.company.learning;

public class teennumberchecker {
    public static void main(String[] args) {
        boolean out=hasTeen(19,23,45);
        boolean out1=isTeen(19);
        System.out.println(out);
        System.out.println(out1);
    }
    public static boolean hasTeen(int age1, int age2, int age3){
        if( (age1>=13&&age1<=19) || (age2>=13&&age2<=19) || (age3>=13&&age3<=19) ){
            return true;
        }
        return false;
    }
    public static boolean isTeen(int age){
        if(age>=13&&age<=19){
            return true;
        }
        return false;

    }
}
