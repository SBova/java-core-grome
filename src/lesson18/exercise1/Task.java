package lesson18.exercise1;

public class Task {
    public static void main(String[] args) {
        FileStorage fileStorage = new FileStorage();
        String[] fileNames = {"test1", "test2"};
        String[] fileNames1 = {"test1", "test2", "test3", "test4"};
        String[] fileNames2 = {"test1", "test2", "test3", "test4", "test5", "test6" };
        fileStorage.setFiles(fileNames);
        fileStorage.setFiles(fileNames1);
        fileStorage.setFiles(fileNames2);
        System.out.println("Start printing name...");
        printer(fileStorage);
        System.out.println();
        System.out.println("Done");
        System.out.println("Start printing name...");
        printer(fileStorage);
        System.out.println("Done");
        System.out.println();
        System.out.println("Done");
        System.out.println("Start printing name...");
        printer(fileStorage);
        System.out.println("Done");
    }

    public static void printer(Storage storage) {

        String[] names = storage.getFiles();

        try {
            System.out.println("5th name is " + names[4]);
        } catch (Exception e) {
            System.out.println("5th name can not be found...");
            //System.err.println(e.getMessage());
        }
// solution 2
// без try и catch
// Hw

    }
}