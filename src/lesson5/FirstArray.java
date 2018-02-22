package lesson5;

import java.util.Arrays;

public class FirstArray {
    public static void main(String[] args) {

        int a;   //declaration
        a = 10;  //initialization


        //type of array [] name of arrey = new type of arrey[length of arrey]
        int[] firstArray = new int[4];  //declaration
        System.out.println(Arrays.toString(firstArray));
        //array name [index] - get array element
        firstArray[0] = 11;
        firstArray[1] = 200;
        firstArray[2] = -10;


        //for (int i = 0; i < 3; i++){
        for (int i = 0; i < firstArray.length; i++) {
            System.out.println(firstArray[i]);
        }
        //System.out.println(firstArray[0]);
        //System.out.println(firstArray[1]);
        //System.out.println(firstArray[2]);
        //System.out.println(firstArray);
        System.out.println(Arrays.toString(firstArray));

        //int b = 10;
        int[] secondArray = {1, 10, 15, 20, -50};
        System.out.println(Arrays.toString(secondArray));
//for-each

        for (int element : secondArray) {
            System.out.println(element);
        }
        for (int i = 0; i < firstArray.length; i++) {
            int element = firstArray[i];
            System.out.println(element);
        }

    }
}
