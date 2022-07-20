//1. Write a Java program to append the specified element to the end of a linked list.
//        2. Write a Java program to iterate through all elements in a linked list.
//        3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
//        4. Write a Java program to iterate a linked list in reverse order. .
//        5. Write a Java program to insert the specified element at the specified position in the linked list. .
//        6. Write a Java program to insert elements into the linked list at the first and last position. .
//        7. Write a Java program to insert the specified element at the front of a linked list. .
//        8. Write a Java program to insert the specified element at the end of a linked list. .
//        9. Write a Java program to insert some elements at the specified position into a linked list. .
//        10. Write a Java program to get the first and last occurrence of the specified elements in a linked list. .
//        11. Write a Java program to display the elements and their positions in a linked list. .
//        12. Write a Java program to remove a specified element from a linked list. .
//        13. Write a Java program to remove first and last element from a linked list. .
//        14. Write a Java program to remove all the elements from a linked list. .
//        15. Write a Java program of swap two elements in a linked list. .
//        16. Write a Java program to shuffle the elements in a linked list. .
//        17. Write a Java program to join two linked lists. .
//        18. Write a Java program to clone an linked list to another linked list. .
//        19. Write a Java program to remove and return the first element of a linked list. .
//        20. Write a Java program to retrieve but does not remove, the first element of a linked list. .
//        21. Write a Java program to retrieve but does not remove, the last element of a linked list. .
//        22. Write a Java program to check if a particular element exists in a linked list. .
//        23. Write a Java program to convert a linked list to array list. .
//        24. Write a Java program to compare two linked lists. .
//        25. Write a Java program to test an linked list is empty or not. .
//        26. Write a Java program to replace an element in a linked list. .

import java.util.*;

public class linkedlist{
    public static void main(String args[])
    {

        //Q1
        LinkedList<String> l_list1 = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list1.add("Red");
        l_list1.add("Green");
        l_list1.add("Black");
        l_list1.add("White");
        l_list1.add("Pink");
        l_list1.add("Yellow");

        // print the list
        System.out.println("The linked list: " + l_list1);

        //Q2
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("A");
        ll.add("E");
        ll.add("F");
        ll.add("B");

        ll.addLast("C");
        for(String str:ll){
            System.out.println(str);
        }

        //Q3
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        // set Iterator at specified index
        Iterator p = l_list.listIterator(1);

        // print list from second position
        while (p.hasNext()) {
            System.out.println(p.next());
        }

        //Q4
        LinkedList<String> l_list0 = new LinkedList<String>();

        l_list0.add("Red");
        l_list0.add("Green");
        l_list0.add("Black");
        l_list0.add("Pink");
        l_list0.add("orange");


        System.out.println("Original linked list:" + l_list0);

        Iterator it = l_list0.descendingIterator();

        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Q5
        LinkedList <String> l_list2 = new LinkedList <String> ();
        // use add() method to add values in the linked list
        l_list2.add("Red");
        l_list2.add("Green");
        l_list2.add("Black");
        l_list2.add("White");
        l_list2.add("Pink");
        System.out.println("Original linked list: ");
        System.out.println("Let add the Yellow color after the Red Color: " + l_list2);
        l_list2.add(1, "Yellow");
        // print the list
        System.out.println("The linked list:" + l_list2);



        //Q6
        LinkedList<String> l_list3 = new LinkedList<String>();

        l_list3.add("Red");
        l_list3.add("Green");
        l_list3.add("Black");
        System.out.println("Original linked list:" + l_list3);

        l_list3.addFirst("White");


        l_list3.addLast("Pink");
        System.out.println("Final linked list:" + l_list3);


        LinkedList<String> l_list4 = new LinkedList<String>();

        l_list4.add("Red");
        l_list4.add("Green");
        l_list4.add("Black");
        System.out.println("Original linked list:" + l_list4);

        l_list4.offerFirst("Pink");
        System.out.println("Final linked list:" + l_list4);

        //Q7
        LinkedList<String> l_list5 = new LinkedList<String>();

        l_list5.add("Red");
        l_list5.add("Green");
        l_list5.add("Black");
        System.out.println("Original linked list:" + l_list5);

        l_list5.offerLast("Pink");
        System.out.println("Final linked list:" + l_list5);

        //Q8
        LinkedList<String> l_list6 = new LinkedList<String>();

        l_list6.add("Red");
        l_list6.add("Green");
        l_list6.add("Black");
        System.out.println("Original linked list:" + l_list6);

        l_list6.offerLast("Pink");
        System.out.println("Final linked list:" + l_list6);

        //Q9
        LinkedList <String> l_list8 = new LinkedList <String> ();
        // use add() method to add values in the linked list
        l_list8.add("Red");
        l_list8.add("Green");
        l_list8.add("Black");


        System.out.println("Original linked list:" + l_list8);



        LinkedList <String> new_l_list = new LinkedList <String> ();
        new_l_list.add("White");
        new_l_list.add("Pink");


        l_list.addAll(1, new_l_list);

        System.out.println("LinkedList:" + l_list);

        //Q10

        LinkedList<String> l_list9 = new LinkedList<String>();


        l_list9.add("Red");
        l_list9.add("Green");
        l_list9.add("Black");
        l_list9.add("Pink");
        l_list9.add("orange");

        System.out.println("Original linked list:" + l_list9);


        Object first_element = l_list9.getFirst();
        System.out.println("First Element is: "+first_element);


        Object last_element = l_list9.getLast();

        //Q11
        LinkedList<String> l_list10 = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list10.add("Red");
        l_list10.add("Green");
        l_list10.add("Black");
        l_list10.add("Pink");
        l_list10.add("orange");

        // print original list
        System.out.println("Original linked list:" + l_list10);
        for(int q=0; q < l_list10.size(); q++)
        {
            System.out.println("Element at index "+p+": "+l_list10.get(q));
        }

        //Q12
        LinkedList <String> l_list11 = new LinkedList <String> ();

        l_list11.add("Red");
        l_list11.add("Green");
        l_list11.add("Black");
        l_list11.add("Pink");
        l_list11.add("orange");


        System.out.println("The Original linked list: " + l_list11);


        l_list11.remove(2);
        System.out.println("The New linked list: " + l_list11);

        //Q13
        LinkedList<String> l_list12 = new LinkedList<String>();

        l_list12.add("Red");
        l_list12.add("Green");
        l_list12.add("Black");
        l_list12.add("Pink");
        l_list12.add("orange");


        System.out.println("The Original linked list: " + l_list12);


        Object firstElement = l_list12.removeFirst();
        System.out.println("Element removed: "+ firstElement);


        Object lastElement = l_list12.removeLast();
        System.out.println("Element removed: "+ lastElement);
        System.out.println("The New linked list: " + l_list12);

        //Q14
        LinkedList<String> l_list14 = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list14.add("Red");
        l_list14.add("Green");
        l_list14.add("Black");
        l_list14.add("Pink");
        l_list14.add("orange");

        // print the list
        System.out.println("The Original linked list: " + l_list14);

        // Removing all the elements from the linked list
        l_list14.clear();

        System.out.println("The New linked list: " + l_list14);

        //Q15
        LinkedList <String> l_list15 = new LinkedList <String> ();
        // use add() method to add values in the linked list
        l_list15.add("Red");
        l_list15.add("Green");
        l_list15.add("Black");
        l_list15.add("Pink");
        l_list15.add("orange");
        // print the list
        System.out.println("The Original linked list: " + l_list15);

        //Swapping 1st(index 0) element(Red) with the 3rd(index 2) element (Black)
        Collections.swap(l_list15, 0, 2);
        System.out.println("The New linked list after swap: " + l_list15);


        //Q16
        LinkedList <String> l_list17 = new LinkedList <String> ();
        // use add() method to add values in the linked list
        l_list17.add("Red");
        l_list17.add("Green");
        l_list17.add("Black");
        l_list17.add("Pink");
        l_list17.add("orange");
        // print the list
        System.out.println("Linked list before shuffling:\n" + l_list17);
        Collections.shuffle(l_list17);
        System.out.println("Linked list after shuffling:\n" + l_list17);

        //Q17

        LinkedList <String> c1 = new LinkedList <String> ();

        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("List of first linked list: " + c1);
        LinkedList <String> c2 = new LinkedList <String> ();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("List of second linked list: " + c2);

        // Let join above two list
        LinkedList <String> a = new LinkedList <String> ();
        a.addAll(c1);
        a.addAll(c2);
        System.out.println("New linked list: " + a);


        //Q18
        LinkedList <String> c3 = new LinkedList <String> ();
        c3.add("Red");
        c3.add("Green");
        c3.add("Black");
        c3.add("White");
        c3.add("Pink");
        System.out.println("Original linked  list: " + c3);
        LinkedList <String> newc1 = new LinkedList <String> ();
        newc1 = (LinkedList)c3.clone();
        System.out.println("Cloned linked list: " + newc1);

        //Q19

        LinkedList <String> c4 = new LinkedList <String> ();
        c4.add("Red");
        c4.add("Green");
        c4.add("Black");
        c4.add("White");
        c4.add("Pink");
        System.out.println("Original linked  list: " + c4);

        System.out.println("Removed element: "+c4.pop());

        System.out.println("Linked list after pop operation: "+c4);


        //Q20
        LinkedList <String> c5 = new LinkedList <String> ();
        c5.add("Red");
        c5.add("Green");
        c5.add("Black");
        c5.add("White");
        c5.add("Pink");
        System.out.println("Original linked list: " + c5);
        // Retrieve but does not remove, the first element of a linked list
        String x = c5.peekFirst();
        System.out.println("First element in the list: " + x);
        System.out.println("Original linked list: " + c5);

        //Q21
        LinkedList <String> c6 = new LinkedList <String> ();
        c6.add("Red");
        c6.add("Green");
        c6.add("Black");
        c6.add("White");
        c6.add("Pink");
        System.out.println("Original linked list: " + c6);
        // Retrieve but does not remove, the last element of a linked list
        String y = c6.peekLast();
        System.out.println("Last element in the list: " + y);
        System.out.println("Original linked list: " + c6);

        //Q22
        LinkedList <String> c7 = new LinkedList <String> ();
        c7.add("Red");
        c7.add("Green");
        c7.add("Black");
        c7.add("White");
        c7.add("Pink");
        System.out.println("Original linked list: " + c7);

        // Checks whether the color "Green" exists or not.
        if (c7.contains("Green")) {
            System.out.println("Color Green is present in the linked list.");
        } else {
            System.out.println("Color Green is not present in the linked list.");
        }

        // Checks whether the color "Orange" exists or not.
        if (c7.contains("Orange")) {
            System.out.println("Color Orange is present in the linked list.");
        } else {
            System.out.println("Color Orange is not present in the linked list.");
        }

        //Q23

        LinkedList <String> linked_list = new LinkedList <String> ();
        linked_list.add("Red");
        linked_list.add("Green");
        linked_list.add("Black");
        linked_list.add("White");
        linked_list.add("Pink");
        System.out.println("Original linked list: " + linked_list);

        //Convert a linked list to array list
        List<String> list = new ArrayList<String>(linked_list);

        for (String str : list){
            System.out.println(str);
        }


        //Q24
        LinkedList<String> c12= new LinkedList<String>();
        c12.add("Red");
        c12.add("Green");
        c12.add("Black");
        c12.add("White");
        c12.add("Pink");

        LinkedList<String> c13= new LinkedList<String>();
        c13.add("Red");
        c13.add("Green");
        c13.add("Black");
        c13.add("Orange");

        //comparison output in linked list
        LinkedList<String> c14 = new LinkedList<String>();
        for (String e : c12)
            c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println(c13);

        //Q25
        LinkedList<String> c15= new LinkedList<String>();
        c15.add("Red");
        c15.add("Green");
        c15.add("Black");
        c15.add("White");
        c15.add("Pink");
        System.out.println("Original linked list: " + c15);
        System.out.println("Check the above linked list is empty or not! "+c15.isEmpty());
        c1.removeAll(c15);
        System.out.println("Linked list after remove all elements "+c15);
        System.out.println("Check the above linked list is empty or not! "+c15.isEmpty());

        //Q26
        LinkedList<String> c16= new LinkedList<String>();
        c16.add("Red");
        c16.add("Green");
        c16.add("Black");
        c16.add("White");
        c16.add("Pink");
        System.out.println("Original linked list: " + c16);
        // Replacing 2nd element with new value
        c16.set(1, "Orange");
        System.out.println("The value of second element changed.");
        System.out.println("New linked list: " + c16);
    }
}


