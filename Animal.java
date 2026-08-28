public class Animal {
    public String sound();
    public String play();

    public void display() {
        System.out.println("sound: " + sound());
        System.out.println("play: " + play());
    }
}
class Dog extends Animal{
    @Override
    public String sound(){
        return "bow";
    }
    @Override
    public String play(){
        return "play";
    }
}
class Cat extends Animal{
    @Override
    public String sound() {
        return "meow";
    }
    @Override
    public String play(){
        return "plays";
    }
}
class Animal01{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
        Cat c = new Cat();
        c.display();
    }
}