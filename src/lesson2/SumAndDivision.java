package lesson2;

public class SumAndDivision {
    public static void main(String[] args) {
        int n = 0;
        long sum = 0;
        while (n <= 1000) {
            sum += n;
            n++;
        }
        int a = 1234;
        long b = sum / a;
        float c = sum % a;
        if (c > b) {
            System.out.println(true);
 //           break;
            while (c > b) {
                System.out.println(true);
                break;
            }
        }
    }
}
