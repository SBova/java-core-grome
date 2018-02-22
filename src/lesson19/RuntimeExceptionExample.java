package lesson19;

public class RuntimeExceptionExample {
    public static void main(String[] args) {

         arithmeticException(2);

        try {
            arithmeticException(0);
        } catch (ArithmeticException e) {
            System.out.println("something wrong");
        }

        npe(new Object());
        npe(null);

    }

    private static void arithmeticException(int a) {
        System.out.println(10 / a);
    }

    /* так писать нельзя
    private static void npe(Object object) {

        try {
            System.out.println(object.hashCode());
        }
        cathc (NullPointerException e){
        System.out.println();}
        }
        */
    private static void npe(Object object) {
        if (object != null) {
            System.out.println(object.hashCode());
        }
    }


}