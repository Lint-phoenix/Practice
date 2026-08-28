public class StringMethod {
    public static void main(String[] args){
        String s = "Hello Java";
        System.out.println(s.length());

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(6));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(0,5));
        String a = "Hello_Java";
        System.out.println(s.equals(a));
        System.out.println(a.indexOf("J"));
        System.out.println(s+" Programming");
        String b = s.replace("Hello", "Welcome");
        System.out.println(b);
        String c = s.replace("o", "a");
        System.out.println(c);
        System.out.println(s.isEmpty());
    }
}
