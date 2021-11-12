import java.util.HashSet;
import java.util.Set;

public class CollectionSet {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(10);
        set.add(11);

        System.out.println(set.size());
        Iterator iterator = (Iterator) set.iterator();


    }
}
