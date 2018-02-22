package lesson15.equals.cast;

public class Demo {
    public static void main(String[] args) {
        InternetProvider provider = (InternetProvider) test();
        System.out.println(provider);
        FoodProvider foodProvider = (FoodProvider) testFood();

    }
    private static Provider test(){
        //logic
        return new InternetProvider();
    }

    private static Provider testFood(){
        //logic
        return new InternetProvider();
    }
}