import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Marks {
    public static void main(String[] args){
        List<Integer>marks=new ArrayList<>();
        marks.add(85);
        marks.add(92);
        marks.add(78);
        marks.add(90);
        marks.add(65);
        marks.add(88);
        marks.add(76);
        System.out.println("Marks: "+marks);

        int max = marks.get(0);
        for (int i = 1; i < marks.size(); i++) {
            if (marks.get(i) > max) {
                max = marks.get(i);
            }
        }
        System.out.println("highest marks is: "+max);
        int min = marks.get(0);
        for (int j = 1; j < marks.size(); j++) {
            if (marks.get(j) < min) {
                min = marks.get(j);
            }
        }
        System.out.println("lowest marks is: "+min);

        int sum = 0;
        int avg = 0;
        for(int i=0; i<marks.size(); i++){
            sum = sum + marks.get(i);
        }
        avg = sum/(marks.size());
        System.out.println("The average of the marks is: "+avg);

        for(int j=0; j<marks.size(); j++){
            if(marks.get(j)<80){
                marks.remove(j);
            }
        }
        System.out.println("All the marks above 80: "+marks);

        System.out.println("90 is in the list: "+marks.contains(90));
    }
}
