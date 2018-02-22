package lesson17;

import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {
        String test = "test str here was here two times or not no test";

        System.out.println(deleteDuplicates(test));

        System.out.println(Arrays.toString(countDuplicates(test, new String[]{"test", "here", "not"})));
        String str = "Today is good day... Hello dpsd";
        // da -> PPPPPPPPPPP
        //[14;27]
        System.out.println(replace(str, "is", "that"));
        System.out.println(replace(str, "o", " "));
        System.out.println(replace(str, "To", "PPPP"));
        System.out.println(replace(str, "lo", "X"));

    }

    // delete replacing worlds ( удаляет повторяющиеся слова)
    public static String deleteDuplicates(String input) {
        // найти повторения
        // удалить повторения
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j]))
                    words[j] = "";
            }
        }
        String res = "";
        for (String word : words) {
            res += word;

            if (!word.isEmpty())
                res += " ";
        }
        return res;
    }

    // count replaces (подсчитывает кол-во повторов определенного String
    public static int[] countDuplicates(String input, String[] words) {
        String[] strings = input.split(" ");

        int[] res = new int[words.length];

        for (String string : strings) {
            for (int i = 0; i < words.length; i++) {
                if (string.equals(words[i])) {
                    res[i]++;
                }
            }
        }

        return res;

    }

    /* метод replace работает только по первому вхождению */
    public static String replace(String input, String target, String replacement) {
        /*
        найти где возможна замена
        проверить замену
        если ок- заменить
        если массив findStartIndexes пустой то не чего не делается и возвращается наш String input
        */

        int[] indexes = findStartIndexes(input.toCharArray(), target.charAt(0));

        if (indexes.length == 0)
            return input;

        for (int index : indexes) {
            if (checkReplaces(input, target, index)) {
                return replace(input, target, replacement, index);
            }
        }
        return input;
    }

    private static String replace(String input, String target, String replacement, int index) {

        // создаем масив чаров который заполняется от начала String до 1-го индекса где нужно заменить слово
        char[] res1 = new char[index];

        for (int i = 0; i < index; i++) {
            res1[i] = input.toCharArray()[i];
        }
        // создаем массив из оставшейся части не проверенного текста
        char[] res3 = new char[input.length() - res1.length - target.length()];
        for (int i = 0, j = res1.length + target.length(); i < res3.length && j < input.length(); i++,j++) {
            res3[i] = input.toCharArray()[j];
        }
//делаем конкатенацию берем масив из 1 части, добавляем элемент замены и оставшуюся чась массива
        return new String(res1) + replacement + new String(res3);
    }


    private static boolean checkReplaces(String input, String target, int index) {
        char[] inputChars = input.toCharArray();
        char[] replaceChars = target.toCharArray();

        for (int i = 0; i < replaceChars.length && index < inputChars.length; i++, index++) {
            // сравниваем по символьно что заменить и если что-то не совпадает то return false
            if (inputChars[index] != replaceChars[i]) {
                return false;
            }
        }
        return true;
    }

    /* Сравниваем первую букву стринга на который хотим заменить(char beginningChar)
     со всем текстом (char[] inputChars)*/
    private static int[] findStartIndexes(char[] inputChars, char beginningChar) {
        int count = 0;
        for (char ch : inputChars) {
            if (ch == beginningChar) {
                count++;
            }
        }

        int[] indexes = new int[count];
        int in = 0;

        int index = 0;
        for (char ch : inputChars) {
            if (ch == beginningChar) {
                indexes[in] = index;
                in++;
            }
            index++;
        }
        return indexes;
    }
}