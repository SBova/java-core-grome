package lesson10.polyexample;

public class Demo {
    public static void main(String[] args) {
        Human human = new Human("Test");
        run(human);

        System.out.println();

        User user = new User("Jack");
        run(user);

        /*/private static void run(User user){
            //
        user.run();
    }/*/
    }

    //не правильный способ решения когда для каждого класса, для каждого обьекта своя реализация
    //полиморфиз писать одинаковый код для разных типов
    private static void run(Human human) {// метод ран который принимает объект human поскольку User наследует  human он тоже является объектом  human
        human.run();
    }
}
