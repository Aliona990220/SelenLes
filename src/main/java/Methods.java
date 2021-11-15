public class Methods {
    public static void main(String[] args) {
        int a = 13;
        int b = 3;

        int sum = getSum(a,b);
        System.out.println(sum);
        sum = getSum(10,150);
        System.out.println(sum);
        show(10, 35, 198);
    }
    static int getSum(int x, int y){
        int sum;
        sum = x + y;
        return sum;
    }

    static void show(int x, int y, int z) {
        int sum = x + y + z;
        System.out.println("Sum is " + sum);
    }


}
