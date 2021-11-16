public class ClassTest {
    public static void main(String[] args) {
       int x = 1;
       int y = 0;

    }

    public void minus(int a, int b) {
        int minusab;
        minusab = a - b;
        return;
    }

    public void int devide(int x, int y) {
        try {
            int dev = x / y;
            return dev;
        } catch (ArithmeticException e) {
            System.out.println("Cannot !");
        }


    }
}

