package lesson4;

public class count {
    public static void main(String[] args) {
        System.out.println(findDivCount((short) (1), (short) (10), 2));
    }

    private static int findDivCount(short a, short b, int n) {
        int findDivCount = 0;
        for (int i = a; i <= b; i++) {
            if (i % n == 0)
                findDivCount++;
        }
        return findDivCount;
    }
}
