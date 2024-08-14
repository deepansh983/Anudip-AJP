import java.util.ArrayList;
import java.util.List;
public class SumEvenNumbers {
    public static void main(String[] args) {
        //Create an arraylist of integers
        List<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        //Calculate the sum of even numbers
        int sum=calculateSumOfEvenNumbers(numbers);

        //print the result
        System.out.println("Sum of even numbers:"+sum);
    }
    public static int calculateSumOfEvenNumbers(List<Integer>numbers)
    {
        int sum=0;
        for(int number:numbers){
            if(number%2==0)
            {
                sum+=number;
            }
        }
        return sum;
    }
    
}
