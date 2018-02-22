package lesson8.Arithmetic;

public class Demo {
    public static void main(String[] args) {
        Adder adder = new Adder();
        int[] array = {-10, 0, 11, 555, 60, 10};
        System.out.println(adder.check(array));
        System.out.println(adder.add(-500000000, 500000000));
    }
}
