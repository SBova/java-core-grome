package lesson4.hw;

public class count {
    public static void main(String[] args) {
        System.out.println(findDivCount((short) (1), (short) (10), 2));
    }

    public static int findDivCount(short a, short b, int n) {
        int findDivCount = 0;
        for (int i = a; i <= b; i++) {
            if (i % n == 0)
                findDivCount++;
        }
        return findDivCount;
    }
}
