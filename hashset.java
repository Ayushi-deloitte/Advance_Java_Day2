//1. Write a Java program to append the specified element to the end of a hash set. .
//        2. Write a Java program to iterate through all elements in a hash list. .
//        3. Write a Java program to get the number of elements in a hash set. .
//        4. Write a Java program to empty an hash set. .
//        5. Write a Java program to test a hash set is empty or not. .
//        6. Write a Java program to clone a hash set to another hash set. .
//        7. Write a Java program to convert a hash set to an array. .
//        8. Write a Java program to convert a hash set to a tree set. .
//        9. Write a Java program to convert a hash set to a List/ArrayList. .
//        10. Write a Java program to compare two hash set. .
//        11. Write a Java program to compare two sets and retain elements which are same on both sets. .
//        12. Write a Java program to remove all of the elements from a hash set. .
import java.util.*;
public class hashset {
    public static void main(String[] args)
    {
        Set<String> set=new HashSet<>();
        set.add("RED");
        set.add("ORANGE");
        set.add("BLUE");
        set.add("BLACK");
        for(String v:set)
        {
            System.out.println(v);
        }
        System.out.println(set.size());
        set.removeAll(set);
        System.out.println(set.isEmpty());
        set.add("RED");
        set.add("ORANGE");
        set.add("BLUE");
        set.add("BLACK");
        Set<String> set1;
        set1= (Set<String>) ((HashSet<String>) set).clone();
        System.out.println(set1);
        String[] new_array = new String[set.size()];
        set.toArray(new_array);

        // Displaying Array elements
        System.out.println("Array elements: ");
        for(String element : new_array){
            System.out.println(element);
        }

        Set<String> tree_set = new TreeSet<String>(set);

        // Display TreeSet elements
        System.out.println("TreeSet elements: ");
        for(String element : tree_set){
            System.out.println(element);
        }

        ArrayList<String> l=new ArrayList<>(set);
        System.out.println(l);
        HashSet<String> h_set = new HashSet<String>();
        // use add() method to add values in the hash set
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");

        HashSet<String>h_set2 = new HashSet<String>();
        h_set2.add("Red");
        h_set2.add("Pink");
        h_set2.add("Black");
        h_set2.add("Orange");
        //comparison output in hash set
        HashSet<String>result_set = new HashSet<String>();
        for (String element : h_set){
            System.out.println(h_set2.contains(element) ? "Yes" : "No");
        }
        h_set.retainAll(h_set2);
        System.out.println("HashSet content:");
        System.out.println(h_set);
        h_set.removeAll(h_set);
        System.out.println(h_set);






    }
}
