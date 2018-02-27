package lesson22.repository;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        //UserRepository userRepository = new UserRepository();

        User user = new User(1001, "Daniil", "32434234sdsfuuuuo");
        UserRepository.save(user);

        System.out.println(Arrays.deepToString(UserRepository.getUsers()));

        User user2 = new User(1002, "Andrey", "ewrewrwer4343wef");
        UserRepository.save(user2);

        System.out.println(Arrays.deepToString(UserRepository.getUsers()));

        User user3 = new User(1001, "Test", "32434234sdsfuuuuo");
        UserRepository.update(user3);

        System.out.println(Arrays.deepToString(UserRepository.getUsers()));

        System.out.println(Arrays.deepToString(UserRepository.getUsers()));
    }
}