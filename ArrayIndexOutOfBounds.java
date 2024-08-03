public class ArrayIndexOutOfBounds{
    public static void main(String[]args)
    {
        //initialize an array withy 5 element
        int arr[]={1,2,3,4,5};

        //loop through the array and attempt to access one element beyond the last index
        for(int i=0;i<=arr.length;i++)
        {
            try{
                System.out.println("Element at index"+i+":"+arr[i]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                // Catch the exception and print a message
                System.out.println("exception caught"+e);
            }
        }


    }
}
