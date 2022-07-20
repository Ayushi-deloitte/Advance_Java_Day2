/*
1. Write a Java program to associate the specified value with the specified key in a Tree Map.
2. Write a Java program to copy a Tree Map content to another Tree Map.
3. Write a Java program to search a key in a Tree Map.
4. Write a Java program to search a value in a Tree Map.
5. Write a Java program to get all keys from the given a Tree Map.
6. Write a Java program to delete all elements from a given Tree Map.
7. Write a Java program to sort keys in Tree Map by using comparator.
8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
10. Write a Java program to get a reverse order view of the keys contained in a given map.
11. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
12. Write a Java program to get the greatest key less than or equal to the given key.
13. Write a Java program to get the portion of a map whose keys are strictly less than a given key.
14. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
15. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.
16. Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.
17. Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.
18. Write a Java program to get NavigableSet view of the keys contained in a map.
19. Write a Java program to remove and get a key-value mapping associated with the least key in a map.
20. Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.
21. Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive).
22. Write a Java program to get the portion of a map whose keys range from a given key to another key.
23. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
24. Write a Java program to get a portion of a map whose keys are greater than to a given key.
25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.
26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key
*/

import java.util.*;

public class TreeMapSolutions {
    public static void main(String[] args){
        TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();
        tree_map.put(1, "Red");
        tree_map.put(2, "Green");
        tree_map.put(3, "Black");
        tree_map.put(4, "White");
        tree_map.put(5, "Blue");

        for (Map.Entry<Integer,String> entry : tree_map.entrySet())
        {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        //copy a Tree Map content to another Tree Map
        TreeMap<Integer,String> tree_map2 = new TreeMap<Integer,String>();
        tree_map2.put(6, "Orange");
        tree_map2.put(7, "Pink");
        System.out.println("Tree Map 2: "+tree_map2);
        tree_map.putAll(tree_map2);
        for (Map.Entry<Integer,String> entry : tree_map.entrySet())
        {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        //search a key in a Tree Map.
        if(tree_map.containsKey(5)){
            System.out.println("The Tree Map contains key 5");
        } else {
            System.out.println("The Tree Map does not contain key 5");
        }

        //search a value in a Tree Map
        if(tree_map.containsValue("Orange")){
            System.out.println("The TreeMap contains value Orange");
        } else {
            System.out.println("The TreeMap does not contain value Orange");
        }

        //get all keys from the given a Tree Map
        for(Integer key: tree_map.keySet()){
            System.out.println(key);
        }

        //delete all elements from a treeMap
        tree_map.clear();
        System.out.println("TreeMap : "+tree_map);

        //sort keys using comparator
        TreeMap<String,String> tree_map1 = new TreeMap<String,String>(new sort_key());
        tree_map1.put("C2", "Red");
        tree_map1.put("C4", "Green");
        tree_map1.put("C3", "Black");
        tree_map1.put("C1", "White");
        System.out.println(tree_map1);

        //get a key-value mapping associated with the greatest key and the least key in a map.
        System.out.println("Greatest key: " + tree_map1.firstEntry());
        System.out.println("Least key: " + tree_map1.lastEntry());

        // first (lowest) key and the last (highest) key currently in a map.
        System.out.println("Greatest key: " + tree_map1.firstKey());
        System.out.println("Least key: " + tree_map1.lastKey());

        //reverse order view of the keys contained in a given map.
        System.out.println("Reverse order view of the keys: " + tree_map1.descendingKeySet());

        TreeMap < Integer, String > NewMap = new TreeMap < Integer, String > ();

        // Put elements to the map
        NewMap.put(10, "Red");
        NewMap.put(20, "Green");
        NewMap.put(40, "Black");
        NewMap.put(50, "White");
        NewMap.put(60, "Pink");

        //greatest key less than or equal to the given key
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key is: " + NewMap.floorKey(10));
        System.out.println("Checking the entry for 30: ");
        System.out.println("Key is: " + NewMap.floorKey(30));

        //keys are strictly less than a given key
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key(s): " + NewMap.headMap(10));
        System.out.println("Checking the entry for 30: ");
        System.out.println("Key(s): " + NewMap.headMap(30));

        //keys are less than (or equal to, if inclusive is true) a given key.
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s): " + NewMap.headMap(20, true));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Key(s): " + NewMap.headMap(70, true));

        //least key strictly greater than the given key. Return null if there is no such key.
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key(s): "+NewMap.higherEntry(10));
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s): "+NewMap.higherEntry(20));

        //greatest key strictly less than the given key. Return null if there is no such key.
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key(s): "+NewMap.lowerEntry(10));
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s): "+NewMap.lowerEntry(20));

        //greatest key strictly less than the given key. Return null if there is no such key.
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key(s): " + NewMap.lowerKey(10));
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s): " + NewMap.lowerKey(20));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Key(s): " + NewMap.lowerKey(70));

        //NavigableSet view of the keys contained in a map
        System.out.println("Original TreeMap content: " + NewMap.navigableKeySet());

        //remove and get a key-value mapping associated with the least key in a map
        System.out.println("Value before poll: " + NewMap);
        System.out.println("Value returned: " + NewMap.pollFirstEntry());
        System.out.println("Value after poll: " + NewMap);

        //remove and get a key-value mapping associated with the greatest key in this map
        System.out.println("Value before poll: " + NewMap);
        System.out.println("Value returned: " + NewMap.pollLastEntry());
        System.out.println("Value after poll: " + NewMap);

        NewMap.put(10, "Red");
        NewMap.put(20, "Pink");

        //get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive)
        SortedMap< Integer, String > sub_tree_map = new TreeMap < Integer, String > ();
        System.out.println("Original TreeMap content: " + NewMap);
        sub_tree_map = NewMap.subMap(20, 50);
        System.out.println("Sub map key-values: " + sub_tree_map);

        //get the portion of a map whose keys range from a given key to another key.
        sub_tree_map = NewMap.subMap(20, true, 40, true);
        System.out.println("Sub map key-values: " + sub_tree_map);

        //get a portion of a map whose keys are greater than or equal to a given key.
        System.out.println("Keys are greater than or equal to 20: " + NewMap.tailMap(20));

        //get a portion of a map whose keys are greater than the  given key.
        System.out.println("Keys are greater than 20: " + NewMap.tailMap(20, false));

        //least key greater than or equal to the given key. Return null if there is no such key
        System.out.println("Keys greater than or equal to 20: " + NewMap.ceilingEntry(20));
        System.out.println("Keys greater than or equal to 40: " + NewMap.ceilingEntry(40));
        System.out.println("Keys greater than or equal to 50: " + NewMap.ceilingEntry(50));

        //least key greater than or equal to the given key. Returns null if there is no such key.
        System.out.println("Keys greater than or equal to 20: " + NewMap.ceilingKey(20));
        System.out.println("Keys greater than or equal to 30: " + NewMap.ceilingKey(30));
        System.out.println("Keys greater than or equal to 50: " + NewMap.ceilingKey(50));
    }

}
class sort_key implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }

}

