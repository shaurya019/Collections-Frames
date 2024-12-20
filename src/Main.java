import java.util.*;

public class Main {
    public static void LearnMap() {
        Map<String,Integer> numbers = new HashMap<>();
        numbers.put("O",1);
        numbers.put("T",2);
        numbers.put("H",3);

        if(!numbers.containsKey("T")){
            numbers.put("T",23);
        }
        numbers.putIfAbsent("Two",25);
        System.out.println(numbers);

        for(Map.Entry<String,Integer> e:numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
    public static void LearnHashMaps() {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<5;i++) {
            set.add(i);
        }
        System.out.println(set);
        set.remove(1);
        System.out.println(set.contains(2));


    }

    public static void LearnSets() {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<5;i++) {
            set.add(i);
        }
        System.out.println(set);
        set.remove(1);
        System.out.println(set.contains(2));


    }
    public static void LearnPriorityQueue() {
//   min heap
       PriorityQueue<Integer> q = new PriorityQueue<>();
//   max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i=0;i<5;i++) {
            q.add(i);
        }

        System.out.println(q);

        System.out.println(q.poll());

        System.out.println(q.peek());
    }

    public static void LearnQueue() {
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<5;i++) {
            q.add(i);
        }

        System.out.println(q);

        System.out.println(q.poll());

        System.out.println(q.peek());
    }

    public static void LearnStack() {
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<5;i++) {
            st.push(i);
        }

        System.out.println(st.peek());

        st.pop();

        System.out.println(st.size());
    }
    public static void ArrayAdd() {
        List<Integer> list = new ArrayList();
        list.add(1);
        System.out.println(list);
       for(int i=0;i<list.size();i++){
           list.add(i+1);
       }
       list.add(3,8);
        System.out.println(list);
        List<Integer> newList = new ArrayList();
        newList.add(50);
        newList.add(51);
        list.addAll(newList);
        System.out.println(list);

        list.remove(1);
        list.remove(Integer.valueOf(50));
        list.clear();
        System.out.println(list);

        list.set(2,1000);

        System.out.println(list.contains(50));

        for(var x:list){
            System.out.println(x);
        }
        Collections.sort(list);
        Integer[] arr = {1,2,4,7,232,9,3};
        Arrays.sort(arr);
        int x = Collections.min(list);
        int y = Collections.max(list);
        int z = Collections.frequency(list,9);
    }

    public static void main(String[] args) {


    }
}