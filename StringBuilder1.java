public class StringBuilder1 {
    public static void main (String[] args){
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java Programming");
        System.out.println(sb);
        sb.delete(5,10);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
    }
}