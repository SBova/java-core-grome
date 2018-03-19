package lesson23;

public class Demo {
    public static void main(String[] args) {
       /*
       1 variant
        Validator validator = new Validator("user", 5);

        System.out.println(validator.getCheckCount());*/
        Validator validator1 = new Validator("user");
        System.out.println(validator1.getCheckCount());

        Validator validator2 = new Validator("compani");
        System.out.println(validator2.getCheckCount());
    }
}
