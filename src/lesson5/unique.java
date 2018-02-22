package lesson5;

public class unique {
    public static void main(String[] args) {
        int[] array = {1, 12, 1, 5, 1, 4, 1, 77, 1, 1070, 1};
        System.out.println(uniqueCount(array));
    }

    public static int uniqueCount(int[] array) {
        int result = 0;
        int countUnique = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            countUnique++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                    break;
                }
            }
        }
        return result = countUnique - count;
    }
}
