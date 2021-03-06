import java.util.ArrayList;
import java.util.List;

public class Roster {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(9);
        System.out.println(list.get(1));

        list.set(2, 100);
        System.out.println(list.get(2));
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.get(1));

        System.out.println(list.size());
        list.add(30);
        System.out.println(list.size());
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        System.out.println(list.size());
        list.addAll(list2);
        System.out.println(list.size());

        System.out.println(list.size());
        list.removeAll(list2);
        System.out.println(list.size());

        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());


        System.out.println(list.contains(9));

        list.addAll(list2);
        System.out.println(list.containsAll(list2));



//        list.clear();
//        System.out.println(list.size());
    }
}
