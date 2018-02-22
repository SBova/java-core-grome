package lesson16;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String test = "someStringExample";

        System.out.println(test.isEmpty());
        System.out.println("".isEmpty());
        System.out.println(test.length());
        System.out.println(test.charAt(2));
        String res = (test.replace("me", "T"));
        System.out.println(res);
        System.out.println(test.replace("met", "T"));
        String test1 = "someString";
        System.out.println(test1.replaceAll("me", "T"));

        //String regex = "{a-Z}"; правило для стринга, что он содержит все буквы

        System.out.println(test.contains("meS"));
        System.out.println(test.contains("mes"));

        String phrase = "Hello there guys";
        System.out.println(Arrays.toString(phrase.split( " ")));
        System.out.println("test a".trim());
        System.out.println(phrase.substring(5));
        System.out.println(phrase.substring(5,8));
        System.out.println(test.toUpperCase());
        System.out.println(test.toLowerCase());

        System.out.println(test.getBytes());
        System.out.println(test.equals("eeee"));
        System.out.println(test.intern());
    }
}