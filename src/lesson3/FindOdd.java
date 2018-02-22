package lesson3;

public class FindOdd {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 1000; i = i + 2) {
            sum = sum + i;
            System.out.println("Found");
        }
        long test = sum * 5;
        boolean result = false;
        if (test > 5000) result = true;
        if (result)
            System.out.println("Bigger");
        else
            System.out.println("Smaller or equal");
    }
}
