public class StringEx {
    public static void main(String[] args) {
//        String a = "dev";
//        String b = "dev";
//        String s = new String("dev");
//
//        System.out.println(a == b);
//        System.out.println(a == s.intern());

        String brand = "Dev";
        String courseName = new String("Dev");

        System.out.println(brand);
        System.out.println(courseName);

        brand = "Devand";
        System.out.println(brand);
        System.out.println(courseName);

        String brand1 = "Honda";
        String brand2 = "Honda";




        String xyz = "hello";
        String wxyz = "hello";

        System.out.println(xyz == wxyz);
        System.out.println(xyz.equals(wxyz));



        String xyz2 = new String("FOO");
        String wxyz2 = new String("FOO");

        System.out.println(xyz2 == wxyz2);
        System.out.println(xyz2.equals(wxyz2));



         int[]  array=  {1,2,3};
         for (int i=0; i <3; i++){
         System.out.println(array[i]);

           }
}
}
