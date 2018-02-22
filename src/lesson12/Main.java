package lesson12;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bank euBank = new EUBank(1111, "Berlin", Currency.EUR, 5000, 1789, 4, 75896);
        Bank usBank = new USBank(2222, "USA", Currency.USD, 183, 4300, 5, 145698);
        Bank chBank = new ChinaBank(3333, "China", Currency.USD, 15, 1300, 3, 12000);

        User euUser1 = new User(4444, "Denis", 12200, 40, "BMV", 1500, euBank);
        User euUser2 = new User(5555, "Chris", 22000, 69, "F&F", 2000, euBank);

        User usUser1 = new User(6666, "John", 15040, 100, "GMD", 4000, usBank);
        User usUser2 = new User(7777, "Jack", 1040, 3, "IBM", 1000, usBank);

        User chUser1 = new User(8888, "Lee", 1342, 10, "SUHI", 100, chBank);
        User chUser2 = new User(9999, "Fu", 10020, 133, "Nike", 900, chBank);

        runBankOperations(usUser1, usUser2);
        runBankOperations(usUser2, usUser1);
        runBankOperations(euUser1, euUser2);
        runBankOperations(euUser2, euUser1);
        runBankOperations(chUser1, chUser2);
        runBankOperations(chUser2, chUser1);
    }

    private static void runBankOperations(User user, User userForTransfer) {
        BankSystem bankSystem = new UkrainianBankSystem();

        System.out.println();
        System.out.println("User " + user.getId() + " operations");

        System.out.println("Current balance: " + user.getBalance());
        System.out.println("Withdrawing 120");
        bankSystem.withdraw(user, 120);
        System.out.println("Balance after withdraw: " + user.getBalance());

        System.out.println("Pay salary: " + user.getSalary());
        bankSystem.paySalary(user);
        System.out.println("Balance after salary paid: " + user.getBalance());

        System.out.println("Fund 200");
        bankSystem.fund(user, 200);
        System.out.println("Balance after fund: " + user.getBalance());

        System.out.println("Transferring 100");
        bankSystem.transferMoney(user, userForTransfer, 100);
        System.out.println("Balance after transferring: " + user.getBalance());
    }
}
