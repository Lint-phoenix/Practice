public class CallStack {

    public static void main(String[] args){
        System.out.println("Inside main");
        a();
        System.out.println("back to main");

    }

    public static void a(){
        System.out.println("Inside a()");
        b();
        System.out.println("back to b()");

    }

    public static void b(){
        System.out.println("Inside b()");
        c();
        System.out.println("back to c()");

    }

    public static void c(){
        System.out.println("Inside c()");
    }
}
