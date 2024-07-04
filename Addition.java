import java.util.Scanner;
class Addition {
    int num1,num2;
    public void initialize(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any two number");
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("------------------------------------");
    }

    public void addNumber(){
        System.out.println("Sum of "+num1+" and "+num2+" is:"+(num1+num2));
    }

    public static class AdditionExample{
        public static void main(String []args)
        {
            Addition obj=new Addition();
            obj.initialize();
            obj.addNumber();
            
        }
    }

}
