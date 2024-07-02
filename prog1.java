import java.util.Scanner;
public class prog1
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println(c);
        sc.close();
    }
}