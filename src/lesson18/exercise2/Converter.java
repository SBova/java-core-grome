package lesson18.exercise2;

public class Converter {
    public static void main(String[] args) {
        System.out.println(intToString(111231));
        System.out.println(stringToInt("11"));
        System.out.println(intToString(Integer.MAX_VALUE));
        System.out.println(stringToInt("11a"));
        System.out.println(intToString(Integer.MIN_VALUE));
        System.out.println(stringToInt("Hi"));
        System.out.println(intToString(Integer.MAX_VALUE + Integer.MAX_VALUE));
        System.out.println(stringToInt("a11"));
        System.out.println(intToString(Integer.MIN_VALUE - 111231));
        System.out.println(stringToInt("1dd1"));
            }


    public static String intToString(int input) {
        try {
            return String.valueOf(input);
        } catch (Exception e) {
            System.out.println(input + " can not be converted to string");
            return null;
        }
    }

    public static int stringToInt(String input) {

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {       //type of exception
            System.out.println(input + " can not be converted to int");
            return 0;
        }
    }
}