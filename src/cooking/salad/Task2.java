package cooking.salad;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {

//1)add ArrayList

        long start = System.nanoTime();
        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("sun");
        stringList.add("spring");
        stringList.add("love");
        stringList.add("peace");
        stringList.add("future");
        stringList.add("love");

        long finish = System.nanoTime();
        long timeConsumedMillis = finish - start;
        System.out.println("ArrayList: ADD - " + timeConsumedMillis);

//2) find
        long startALF = System.nanoTime();
        if (stringList.contains("love")) {
        }
        long finishALF = System.nanoTime();
        long diffALF = finishALF - startALF;
        System.out.println("ArrayList FIND - " + diffALF);
//3 remove
        long startALR = System.nanoTime();
        stringList.remove(2);
        long finishALR = System.nanoTime();
        long diffALR = finishALR - startALR;
        System.out.println("ArraysList Delete: - " + diffALR + "\n");

        //1)add LinkedList
        long startLLA = System.nanoTime();
        List<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("sun");
        stringLinkedList.add("spring");
        stringLinkedList.add("love");
        stringLinkedList.add("peace");
        stringLinkedList.add("future");
        stringLinkedList.add("love");
        long finishLLA = System.nanoTime();
        long diffLLA = finishLLA - startLLA;
        System.out.println("LinkedList add - " + diffLLA);


        //2) find
        long startLLF = System.nanoTime();
        stringLinkedList.contains("love");
        long finishLLF = System.nanoTime();
        long diffLLF = finishLLF - startLLF;
        System.out.println("LinkedList Find - " + diffLLF);

        //3 remove  Linked
        long startLLR = System.nanoTime();
        stringLinkedList.remove("spring");
        long finishLLR = System.nanoTime();
        long diffLLR = finishLLR - startLLR;
        System.out.println("LinkedList Delete - " + diffLLR + "\n");

        long startHSA = System.nanoTime();
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("sun");
        stringHashSet.add("spring");
        stringHashSet.add("love");
        stringHashSet.add("peace");
        stringHashSet.add("future");
        stringHashSet.add("love");
        long finishHSA = System.nanoTime();
        long diffHSA = finishHSA - startHSA;
        System.out.println("HashSet add - " + diffHSA);
//2) find
        long startHSF = System.nanoTime();
        stringHashSet.contains("love");
        long finishHSF = System.nanoTime();
        long diffHSF = finishHSA - startHSA;
        System.out.println("HashSet Find - " + diffHSF);
        //3 remove  HashSet
        long startHSR = System.nanoTime();
        stringHashSet.remove("spring");
        long finishHSR = System.nanoTime();
        long diffHSR = finishHSR - startHSR;
        System.out.println("HashSet Delete - " + diffHSR + "\n");
        //1)add TreeSETS
        long startTSA = System.nanoTime();
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("sun");
        stringTreeSet.add("spring");
        stringTreeSet.add("love");
        stringTreeSet.add("peace");
        stringTreeSet.add("future");
        stringTreeSet.add("love");
        long finishTSA = System.nanoTime();
        long diffTSA = finishTSA - startTSA;
        System.out.println("TreeSet add " + diffTSA);
//2) find
        long startTSF = System.nanoTime();
        stringTreeSet.contains("love");
        long finishTSF = System.nanoTime();
        long diffTSF = finishTSF - startTSF;
        System.out.println("TreeSet Find - " + diffTSF);

        //3 remove  HashSet
        long startTSR = System.nanoTime();
        stringTreeSet.remove("spring");
        long finishTSR = System.nanoTime();
        long diffTSR = finishTSR - startTSR;
        System.out.println("TreeSet Delete - " + diffTSR + "\n");
///////MAPS////////MAPS///////MAPS//////////MAPS///////////MAPS//////////////////////////////////////////////////
        //1)add HashMap
        long startHMA = System.nanoTime();
        HashMap<Integer, String> stringHashMap = new HashMap();
        stringHashMap.put(1, "sun");
        stringHashMap.put(0, "spring");
        stringHashMap.put(3, "love");
        stringHashMap.put(2, "peace");
        stringHashMap.put(5, "future");
        stringHashMap.put(4, "love");

        long finishHMA = System.nanoTime();
        long diffHMA = finishHMA - startHMA;
        System.out.println("HashMap add " + diffHMA);
//2) find
        long startHMF = System.nanoTime();
        stringHashMap.containsValue("love");
        long finishHMF = System.nanoTime();
        long diffHMF = finishHMF - startHMF;
        System.out.println("HashMap Find- " + diffHMF);


        //3 remove  HashMap
        long startHMR = System.nanoTime();
        stringHashMap.remove(4, "future");
        long finishHMR = System.nanoTime();
        long diffHMR = finishHMF - startHMF;
        System.out.println("HashMap Delete - " + diffHMR + "\n");

///////////TreeMap/////////TreeMap///////
        //1)add TreeMap
        long startTMA = System.nanoTime();
        Map<Integer, String> stringTreeMap = new TreeMap<>();
        stringTreeMap.put(1, "sun");
        stringTreeMap.put(0, "spring");
        stringTreeMap.put(3, "love");
        stringTreeMap.put(2, "peace");
        stringTreeMap.put(5, "future");
        stringTreeMap.put(4, "love");
        long finishTMA = System.nanoTime();
        long diffTMA = finishTMA - startTMA;
        System.out.println("TreeMap add " + diffTMA);
//2) find
        long startTMF = System.nanoTime();
        stringTreeMap.containsValue("love");
        long finishTMF = System.nanoTime();
        long diffTMF = finishTMF - startTMF;
        System.out.println("TreeMap Find - " + diffTMF);

        //3 remove  TreeMap
        long startTMR = System.nanoTime();
        stringTreeMap.remove(4, "future");
        long finishTMR = System.nanoTime();
        long diffTMR = finishTMR - startTMR;
        System.out.println("TreeMap Delete - " + diffTMR);
    }
}
