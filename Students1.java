public class Students1 {
    int rollno;

    Students1(int rollno) {
        this.rollno = rollno;
    }

    void showRollNo() {
        System.out.println("Roll Number: " + rollno);
    }
}

class Person1 {
    String name;
    int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}

class Person2 extends Person1 {
    Person2(String name, int age) {
        super(name, age);
    }

    @Override
    void display() {
        super.display(); // call parent display
        System.out.println("This is Person2’s display method.");
    }
}

class Main {
    public static void main(String[] args) {
        Person1 p1 = new Person1("Neetu", 19);
        p1.display();

        Person2 p2 = new Person2("Rahul", 20);
        p2.display();

        Students1 s1 = new Students1(101);
        s1.showRollNo();
    }
}
