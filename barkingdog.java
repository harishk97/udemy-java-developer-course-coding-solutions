//udemy java course-coding solutions

public class barkingdog {

    public static void main(String[] args) {
       shouldWakeUp(true ,44);
        //boolean test = 
        //System.out.println(test);


    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        System.out.println(hourOfDay);

        if((barking) && (hourOfDay<8 || hourOfDay>22) && (hourOfDay>=0&&hourOfDay<=23)){
            return true;
        }
        else {
           return false;
        }


    }

}
