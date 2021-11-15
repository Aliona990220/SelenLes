public class Exclusion {
    public static void main(String[] args) {
       try {
           devide(10,0);
       }catch (ArithmeticException e) {
           e.printStackTrace();

       }

    }

    public static void devide(int a, int b) throws ArithmeticException{
//        try {
//            System.out.println("Result is: " + a/b);
//
//        } catch (ArithmeticException e) {
//            System.out.println("Problem!");
//        } finally {
//            System.out.println("Finish!");
//        }

        if (b == 0) {
            throw new ArithmeticException("Don`t / by zero");

        }else {
            System.out.println("Result is: " + a / b);
        }

    }
}


