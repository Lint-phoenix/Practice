import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args){
        Map<Integer, String> names = new HashMap<>();
        names.put(1, "Siya");
        names.put(2, "Moksha");
        names.put(3, "Neetu");
        names.put(4, "Freya");
        System.out.println(names.get(1));
        System.out.println("check the value: "+ names.containsValue("Siya"));
        System.out.println("check the key: "+ names.containsKey(1));
        names.remove(1);
        System.out.println(names.get(1));
        System.out.println("find the size: " +names.size());
        System.out.println(names);
    }
}
