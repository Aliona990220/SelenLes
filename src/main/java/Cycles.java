public class Cycles {
    public static void main(String[] args) {
        System.out.println("Start");
        for (int i = 0; i < 5; i++){
            System.out.println(i *10);
        }
        System.out.println("End");
        System.out.println();

        for (int i = 10; i > 0; i--){
            System.out.println(i );
        }
        int[] array = new int[10];
        System.out.println();
        for (int i = 0; i < 10; i++){
            array[i] = i * 2;
        }
        for (int i = 0; i < 10; i++){
            System.out.println("Element index " + i + " is: " + array[i]);
        }
    }
}
