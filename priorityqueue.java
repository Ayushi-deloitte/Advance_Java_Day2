////Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue. .
//        .
//        2. Write a Java program to iterate through all elements in priority queue. .
//        .
//        3. Write a Java program to add all the elements of a priority queue to another priority queue. .
//        .
//        4. Write a Java program to insert a given element into a priority queue. .
//        .
//        5. Write a Java program to remove all the elements from a priority queue. .
//        .
//        6. Write a Java program to count the number of elements in a priority queue. .
//        .
//        7. Write a Java program to compare two priority queues. .
//        .
//        8. Write a Java program to retrieve the first element of the priority queue. .
//        .
//        9. Write a Java program to retrieve and remove the first element. .
//        .
//        10. Write a Java program to convert a priority queue to an array containing all of the elements of the queue. .
//        .
//        11. Write a Java program to convert a Priority Queue elements to a string representation. .

//        12. Write a Java program to change priorityQueue to maximum priorityqueue. .
//

import java.util.*;

public class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Orange");
        pq.add("White");
        pq.add("Black");
        System.out.println("Elements of the Priority Queue: ");
        // iterate the Priority Queue
        for (String element : pq) {
            System.out.println(element);

            PriorityQueue<String> queue1 = new PriorityQueue<String>();
            queue1.add("Red");
            queue1.add("Green");
            queue1.add("Orange");
            System.out.println("Priority Queue1: "+queue1);
            PriorityQueue<String> queue2 = new PriorityQueue<String>();
            queue2.add("Pink");
            queue2.add("White");
            queue2.add("Black");
            System.out.println("Priority Queue2: "+queue2);
            queue2.offer("GRAY");
            System.out.println("Priority Queue2: "+queue2);
            queue2.removeAll(queue2);
            System.out.println("Priority Queue2: "+queue2);
            System.out.println(queue1.size());
            for (String v : queue1){
                System.out.println(queue2.contains(v) ? "Yes" : "No");
            }

            System.out.println(queue1.peek());
            System.out.println(queue1.poll());
            List<String> array_list = new ArrayList<String>(queue1);
            System.out.println("Array containing all of the elements in the queue: "+array_list);

            String str1;
            str1 = queue1.toString();
            System.out.println("String representation of the Priority Queue: "+str1);

            String val = null;
            while( (val = queue1.poll()) != null) {
                System.out.print(val+"  ");
            }
            System.out.print("\n");





        }
    }
}