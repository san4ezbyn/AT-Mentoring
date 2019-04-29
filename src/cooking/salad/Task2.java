package cooking.salad;

import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {

//1)add ArrayList
        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("sun");
        stringList.add("spring");
        stringList.add("love");
        stringList.add("peace");
        stringList.add("future");
        stringList.add("love");

        System.out.println("ArrayList add " + stringList);
//2) find
        List<String> i = (stringList
                .stream()
                .filter(item -> item.equalsIgnoreCase("LOVE")))
                .collect(Collectors.toList());

        System.out.println("ArrayList FIND " + i.toString());

        if (stringList.contains("love")) {
            System.out.println("ArrayList: TRUE: match is found");
        }
//3 remove
        System.out.println("ArraysList before remove " + stringList.size());
        stringList.remove(2);
        System.out.println("ArraysList after remove " + stringList.size());

        //1)add LinkedList
        List<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("sun");
        stringLinkedList.add("spring");
        stringLinkedList.add("love");
        stringLinkedList.add("peace");
        stringLinkedList.add("future");
        stringLinkedList.add("love");

        System.out.println("LinkedList add " + stringLinkedList);
//2) find
        List<String> iLL = (stringLinkedList
                .stream()
                .filter(item -> item.equalsIgnoreCase("LOVE")))
                .collect(Collectors.toList());

        System.out.println("LinkedList find " + iLL.toString());

        if (stringLinkedList.contains("love")) {
            System.out.println("LinkedList: TRUE: match in LinkedList");
        }


        //3 remove  Linked


        System.out.println("LinkedList size before remove " + stringLinkedList.size());
        stringLinkedList.remove("spring");
        System.out.println("LinkedList after remove " + stringLinkedList.size());

  ///////SETS/////////////////////SETS/////////////////////SETS/////////////////////////////////

        //1)add SETS
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("sun");
        stringHashSet.add("spring");
        stringHashSet.add("love");
        stringHashSet.add("peace");
        stringHashSet.add("future");
        stringHashSet.add("love");

        System.out.println("HashSet add " + stringHashSet);
//2) find

        if (stringHashSet.contains("love")) {
            System.out.println("HashSet: TRUE match");
        }


        //3 remove  HashSet


        System.out.println("HashSet size before remove " + stringHashSet.size()+stringHashSet);
        stringHashSet.remove("spring");
        System.out.println("HashSet after remove " + stringHashSet.size()+stringHashSet);

        //1)add TreeSETS
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("sun");
        stringTreeSet.add("spring");
        stringTreeSet.add("love");
        stringTreeSet.add("peace");
        stringTreeSet.add("future");
        stringTreeSet.add("love");

        System.out.println("TreeSet add " + stringTreeSet);
//2) find

        if (stringTreeSet.contains("love")) {
            System.out.println("TreeSet: TRUE match");
        }


        //3 remove  HashSet


        System.out.println("TreeSet size before remove " + stringTreeSet.size()+stringTreeSet);
        stringTreeSet.remove("spring");
        System.out.println("TreeSet after remove " + stringTreeSet.size()+stringTreeSet);
///////MAPS////////MAPS///////MAPS//////////MAPS///////////MAPS//////////////////////////////////////////////////
        //1)add HashMap
        HashMap<Integer, String> stringHashMap = new HashMap();
        stringHashMap.put(1, "sun");
        stringHashMap.put(0,"spring");
        stringHashMap.put(3,"love");
        stringHashMap.put(2,"peace");
        stringHashMap.put(5,"future");
        stringHashMap.put(4,"love");

        System.out.println("HashMap add " + stringHashMap);
//2) find

        if (stringHashMap.containsValue("love")) {
            System.out.println("HashMap: TRUE match");
        }


        //3 remove  HashMap


        System.out.println("HashMap size before remove " + stringHashMap.size()+stringHashMap);
        stringHashMap.remove(3, "future");
        stringHashMap.remove(4, "future");
        System.out.println("HashMap after remove " + stringHashMap.size()+stringHashMap);

///////////TreeMap/////////TreeMap///////
        //1)add TreeMap
        Map<Integer, String> stringTreeMap = new TreeMap<>();
        stringTreeMap.put(1, "sun");
        stringTreeMap.put(0,"spring");
        stringTreeMap.put(3,"love");
        stringTreeMap.put(2,"peace");
        stringTreeMap.put(5,"future");
        stringTreeMap.put(4,"love");

        System.out.println("TreeMap add " + stringTreeMap);
//2) find

        if (stringTreeMap.containsValue("love")) {
            System.out.println("TreeMap: TRUE match");
        }


        //3 remove  TreeMap


        System.out.println("TreeMap size before remove " + stringTreeMap.size()+stringTreeMap);
        stringTreeMap.remove(3, "future");
        stringTreeMap.remove(4, "future");
        System.out.println("TreeMap after remove " + stringTreeMap.size()+stringTreeMap);





    }
}
