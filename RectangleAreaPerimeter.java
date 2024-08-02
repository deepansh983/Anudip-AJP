import java.util.Scanner;

public class RectangleAreaPerimeter{
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);

        try{
            System.out.println("Enter the length of rectangle:");
            int length=scanner.nextInt();

            System.out.println("Enter the width of reactangle:");
            int width=scanner.nextInt();

            double area=length*width;
            double perimeter=2*(length+width);

            System.out.println("Area of rectangle:"+area);
            System.out.println("Perimeter of rectangle:"+perimeter);
        }
        catch(Exception e)
        {
            System.out.println("Error:Invalid input");
        }
        finally{
            scanner.close();
        }
    }
}