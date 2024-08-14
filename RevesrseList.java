import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class RevesrseList{
    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList=new ArrayList<>();
        stringList.add("apple");
        stringList.add("grapes");
        stringList.add("orange");
        stringList.add("kiwi");

        //print the original list
        System.out.println("Original list:"+stringList);

        //Reverse the list
        Collections.reverse(stringList);

        //print the reversed list
        System.out.println("Reversed list:"+stringList);

    }
}