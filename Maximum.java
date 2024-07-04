import java.util.Scanner;
class Maximum{
    int num1,num2;
    public void initialize()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two number:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        
    }
    public void maxNumber()
    {
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("The maximum number is:"+max);
    }

    public static class MaximumExample{
        public static void main(String []args)
        {
            Maximum obj=new Maximum();
            obj.initialize();
            obj.maxNumber();
        }
    }
}