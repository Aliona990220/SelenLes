import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapCollection {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Black");
        map.put(2, "Yellow");
        System.out.println(map.get(1));
        System.out.println(map.size());
//        map.clear();
        System.out.println(map.size());
        System.out.println(map.containsKey(90));
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Yellow"));
        Set<Integer> keys = map.keySet();
        Iterator iterator = (Iterator) keys.iterator();





    }
}
