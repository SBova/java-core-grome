package lesson8.Arithmetic;

public class Arithmetic {


    public static boolean check(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int el : array) {
            if (el > max)
                max = el;
            if (el < min)
                min = el;

        }
        //System.out.println(max + min);
        return (max + min) > 100;
    }
}