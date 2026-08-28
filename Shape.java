public abstract class Shape{
    public abstract double area();
    public abstract double perimeter();

    public void display() {
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}

class Circle extends Shape{
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
class Shapes{
    public static void main(String[] args) {
        Circle c = new Circle(10);
        c.display();
    }
}
