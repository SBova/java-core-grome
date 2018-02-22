package lesson18.Hw;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        SolutionVer1 solutionVer1 = new SolutionVer1();
        SolutionVer2 solutionVer2 = new SolutionVer2();

        String str = "The first 20 Fibonacci numbers are:\n" +
                " 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765";

        System.out.println(Arrays.toString(solutionVer1.findNumbers(str)));
        System.out.println();
        System.out.println(Arrays.toString(solutionVer2.findNumbers(str)));
    }
}