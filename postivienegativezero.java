public class postivienegativezero {
    public static void main(String[] args){
        System.out.println("Enter the number for check the value");
        Scanner s = new Scanner(System.in);
        int value= s.nextInt();
        checknumber(value);
    }

    public static int checknumber(int number)
    {
        if(number>0)
        {
            System.out.println("This is positive");
        }
        else if(number<0)
        {
            System.out.println("the number is negative");
        }
        else{
            System.out.println("this is zero");
        }
        return 1;
    }
}
