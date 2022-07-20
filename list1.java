//Write a Java program to create a new array list, add some colors (string) and print out the collection.
//Write a Java program to iterate through all elements in a array list.
//Write a Java program to insert an element into the array list at the first position.
//Write a Java program to retrieve an element (at a specified index) from a given array list.
//Write a Java program to update specific array element by given element.
//Write a Java program to remove the third element from a array list.
//Write a Java program to search an element in a array list.
//Write a Java program to sort  array list.
//Write a Java program to copy one array list into another.
//Write a Java program to shuffle elements in a array list.
//Write a Java program to reverse elements in a array list.
//Write a Java program to extract a portion of a array list.
//Write a Java program to compare two array lists.
// Write a Java program of swap two elements in an array list.
//Write a Java program to join two array lists.
//Write a Java program to clone an array list to another array list. .
//Write a Java program to empty an array list. .
// Write a Java program to test an array list is empty or not.
// 19. Write a Java program to trim the capacity of an array list the current list size.
// Write a Java program to increase the size of an array list.
// Write a Java program to replace the second element of a ArrayList with the specified element. .
// Write a Java program to print all the elements of a ArrayList using the position of the elements. .
import java.util.*;
public class list1 {
    public static void main(String args[])
    {
        List<String> l1=new ArrayList<>();
        l1.add("RED");
        l1.add("BLUE");
        l1.add("GREEN");
        System.out.println(l1);
        for(String v:l1)
        {
            System.out.println(v);
        }
         l1.add(0,"BLACK");
        System.out.println(l1);
        System.out.println(l1.get(1));

        l1.add(1,"GRAY");
        System.out.println(l1);
        l1.remove(2);
        System.out.println(l1);
        System.out.println(l1.contains("BLUE"));
        Collections.sort(l1);
        System.out.println(l1);
        List<String> l2=new ArrayList<>();
        l2.addAll(l1);
        System.out.println(l2);
        Collections.shuffle(l2);
        System.out.println(l2);
        Collections.reverse(l2);
        System.out.println(l2);
        List<String> sub_List = l2.subList(0, 2);
        System.out.println("List of first two elements: " + sub_List);
        System.out.println(l1.equals(l2));
        System.out.println(l1);
        Collections.swap(l1 ,0, 2);
        System.out.println(l1);
        List<String> l3=new ArrayList<>();
        l2.add("Orange");
        l2.add("Cyan");
        l3.addAll(l1);
        l3.addAll(l2);
        System.out.println(l3);
        List<String> l4= (ArrayList<String>) ((ArrayList<String>) l3).clone();
        System.out.println(l4);
        l4.removeAll(l4);
        System.out.println("Removed all elements"+l4);
        System.out.println(l4.isEmpty());
        ((ArrayList<String>) l1).trimToSize();
        System.out.println(l1);
        ((ArrayList<String>) l1).ensureCapacity(6);
        l1.add("White");
        l1.add("Pink");
        l1.add("Yellow");
        System.out.println("New array list: " + l1);
        l1.set(2,"SKYBLUE");
        System.out.println(l1);
        for(int i=0;i<l1.size();i++)
        {
            System.out.println(i+" "+l1.get(i));
        }











    }

}
