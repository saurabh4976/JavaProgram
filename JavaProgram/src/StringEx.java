public class StringEx {
    public static void main(String[] args) {
        String a = "dev";
        String b = "dev";
        String s = new String("dev");

        System.out.println(a == b);
        System.out.println(a == s.intern());


    }
}
