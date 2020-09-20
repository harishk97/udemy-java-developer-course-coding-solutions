public class speedconverter {
    public static void main(String[] args) {
        double kilometers;
        toMilesPerHour(95.75);
        printConversion(95.75);

    }
    public static long toMilesPerHour(double kilometersPerHour){
        long rounded;
        if(kilometersPerHour<0) {
            return -1;
        }
        else{
            double value = kilometersPerHour * 0.6215040397762586;
            rounded = Math.round(value);
            return rounded;

        }
    }
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +
                    " km/h= " + milesPerHour +
                    " mi/h");
        }
    }


}
