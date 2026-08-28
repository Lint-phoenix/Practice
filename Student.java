class Students {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Student {
    public static void main(String[] args) {
        Students obj = new Students();
        obj.setName("Neetu");
        obj.setAge(19);
        System.out.println("Student Name: " + obj.getName());
        System.out.println("Student Age: " + obj.getAge());
    }
}
