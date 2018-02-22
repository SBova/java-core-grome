package lesson15.equals.HWUserRepository;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User(11, "Ann", "1w21212");
        User user2 = new User(12, "Ann", "1w21222");
        User user3 = new User(11, "Ann", "1w21212");

        System.out.println(user1.equals(user2));

        System.out.println(user1.hashCode());
        System.out.println(user3.hashCode());
        System.out.println(user1.equals(user3));

        System.out.println(user1 == user3);
    }
}