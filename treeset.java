//1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set. .
//        2. Write a Java program to iterate through all elements in a tree set. .
//        3. Write a Java program to add all the elements of a specified tree set to another tree set. .
//        4. Write a Java program to create a reverse order view of the elements contained in a given tree set. .
//        5. Write a Java program to get the first and last elements in a tree set. .
//        6. Write a Java program to clone a tree set list to another tree set. .
//        7. Write a Java program to get the number of elements in a tree set. .
//        8. Write a Java program to compare two tree sets. .
//        9. Write a Java program to find the numbers less than 7 in a tree set. .
//        10. Write a Java program to get the element in a tree set which is greater than or equal to the given element. .
//        11. Write a Java program to get the element in a tree set which is less than or equal to the given element. .
//        12. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element. .
//        13. Write a Java program to get an element in a tree set which is strictly less than the given element. .
//        14. Write a Java program to retrieve and remove the first element of a tree set. .
//        15. Write a Java program to retrieve and remove the last element of a tree set. .
//        16. Write a Java program to remove a given element from a tree set. .


import java.util.Iterator;
import java.util.TreeSet;
public class treeset {
    public static void main(String[] args) {
        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("Red");
        tree_set.add("Green");
        tree_set.add("Orange");
        tree_set.add("White");
        tree_set.add("Black");
        System.out.println("Tree set: ");
        System.out.println(tree_set);
        for (String element : tree_set) {
            System.out.println(element);
        }
        TreeSet<String> tree_set1 = new TreeSet<String>();
        tree_set1.add("Red");
        tree_set1.add("Green");
        tree_set1.add("Orange");
        System.out.println("Tree set1: "+tree_set1);
        TreeSet<String> tree_set2 = new TreeSet<String>();
        tree_set2.add("Pink");
        tree_set2.add("White");
        tree_set2.add("Black");
        System.out.println("Tree set2: "+tree_set2);
        // adding treetwo to treeone
        tree_set1.addAll(tree_set2);
        System.out.println("Tree set1: "+tree_set1);

        Iterator it = tree_set.descendingIterator();
        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Object first_element = tree_set.first();
        System.out.println("First Element is: "+first_element);

        // Find last element of the tree set
        Object last_element = tree_set.last();
        System.out.println("Last Element is: "+last_element);
        System.out.println("Original tree set:" + tree_set);
        TreeSet<String> new_t_set = (TreeSet<String>)tree_set.clone();
        System.out.println("Cloned tree list: " + new_t_set);
        System.out.println("Size of the tree set: " + tree_set.size());

        for (String element : tree_set1){
            System.out.println(tree_set2.contains(element) ? "Yes" : "No");
        }

        TreeSet <Integer>treeheadset = new TreeSet<Integer>();
        TreeSet <Integer>tree_num = new TreeSet<Integer>();

        // Add numbers in the tree
        tree_num.add(1);
        tree_num.add(2);
        tree_num.add(3);
        tree_num.add(5);
        tree_num.add(6);
        tree_num.add(7);
        tree_num.add(8);
        tree_num.add(9);
        tree_num.add(10);

        // Find numbers less than 7
        treeheadset = (TreeSet)tree_num.headSet(7);

        // create an iterator
        Iterator iterator;
        iterator = treeheadset.iterator();

        //Displaying the tree set data
        System.out.println("Tree set data: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }

        System.out.println("Greater than or equal to 86 : "+tree_num.ceiling(86));
        System.out.println("Greater than or equal to 29 : "+tree_num.ceiling(29));

        System.out.println("Less than or equal to 86 : "+tree_num.floor(86));
        System.out.println("Less than or equal to 29 : "+tree_num.floor(29));

        System.out.println("Greater than or equal to 86 : "+tree_num.ceiling(86));
        System.out.println("Greater than or equal to 29 : "+tree_num.ceiling(29));

        System.out.println("Strictly greater than 76 : "+tree_num.higher(76));
        System.out.println("Strictly greater than 31 : "+tree_num.higher(31));

        System.out.println("Original tree set: "+tree_num);
        System.out.println("Removes the first(lowest) element: "+tree_num.pollFirst());
        System.out.println("Tree set after removing first element: "+tree_num);

        System.out.println("Original tree set: "+tree_num);
        System.out.println("Removes the last element: "+tree_num.pollLast());
        System.out.println("Tree set after removing last element: "+tree_num);
        System.out.println("Original tree set: "+tree_num);

        System.out.println("Removes 70 from the list: "+tree_num.remove(70));
        System.out.println("Tree set after removing last element: "+tree_num);


    }



    }

