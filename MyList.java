import java.util.ArrayList;
import java.util.List;  // Import the List interface

public class MyList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Siya");
        list.add("Moksha");
        list.add("Neetu");
        list.add("Freya");

        System.out.println(list);
        System.out.println("Access the index element: "+list.get(2));
        list.remove("Siya");
        System.out.println("List of students: "+list);
        list.add(3, "Naina");
        System.out.println("List of the students: "+list);
        System.out.println("Size of the list: "+list.size());
        for (String s : list){
            System.out.println(s);
        }
        list.clear();
        System.out.println("Size of the list: "+list.size());
    }
}
