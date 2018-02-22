package lesson4.hw;

//import org.junit.jupiter.api.Test;

public class compareSumm {
    public static void main(String[] args) {
        System.out.println(compareSums(5, 7, 1, 3));
    }

        public static boolean compareSums(int a, int b, int c, int d) {
        return sum(a, b) > sum(c, d);
    }

    public static long sum(int from, int to) {
        long sum = 0;
        for (long i = from; i <= to; i++) {
            sum += i;
        }
        return sum;
    }
}