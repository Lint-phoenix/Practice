import java.util .*;
public class StudentMarks {
    public static void main(String[] args){
        Map<Integer, String> students = new HashMap<>();
        students.put(101, "[Siya: 80]");
        students.put(102, "[Moksha: 85]");
        students.put(103, "[Neetu: 88]");
        students.put(104, "[Freya: 90]");
        System.out.println(students);

        System.out.println("check the value: "+ students.containsValue("Siya: 80"));
        System.out.println("check the Key: "+ students.containsKey(3));

        students.replace(103, "[Neetu: 88]", "[Neetu: 91]");
        System.out.println("After updating: "+students);

        students.remove(101);
        System.out.println(students);
    }
}
