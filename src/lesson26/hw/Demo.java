package lesson26.hw;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayListTest arrayListTest = new ArrayListTest();

        ArrayList arrayList = arrayListTest.useList();

        System.out.println("In main method: " + arrayList.toString());
    }
}