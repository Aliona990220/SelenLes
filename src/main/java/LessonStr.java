public class LessonStr {
    public static void main(String[] args) {
        String k = "Hello World";
        System.out.println(k.equals("Hello World"));
        System.out.println(k.equals("Hello!"));

        String k2 = "hello";

        System.out.println(k.equals(k2));
        k = "text";
        k2 = "TEXT";
        System.out.println(k.equals(k2));
        System.out.println(k.equalsIgnoreCase(k2));
    }
}
