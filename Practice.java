//encapsulation
public abstract class Shape{
    private String color;

    public Shape(String color){
        this.color = color;
    }
//getters
    public String getColor(){
        return color;
    }

    public abstract double calculateArea();
}
//inheritance and abstraction
public class Circle extends Shape{
    private double radius;
//encapsulation
    public Circle(String color, double radius){
        super(color);
        this.radius=radius;
    }
//polimorphism-dynamic
    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}
//inheritance and abstraction
public class Rectangle extends Shape{
    private double width;
    private double height;
//encapsulation
    public Rectangle(String color, double width, double height){
        super(color);
        this.width=width;
        this.height=height;
    }
//polymorphism-dynamic
    @Override
    public double calculateArea(){
        return width*height;
    }
}
//main class
public class Practice {
    public static void main(String[] args){

    }
}