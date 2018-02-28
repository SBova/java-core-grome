package lesson22hw;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Transaction tr1 = new Transaction(1, "Kiev", 105, "***", TransactionType.INCOME, new Date());
        Transaction tr2 = new Transaction(2, "Slovyansk", 505, "***", TransactionType.INCOME, new Date());
        Transaction tr3 = new Transaction(73, "Odessa", 10, "***", TransactionType.INCOME, new Date());

        Transaction tr4 = new Transaction(4, null, 1055, "***", TransactionType.INCOME, new Date());
        Transaction tr5 = new Transaction(21, "Kiev", 1, "***", TransactionType.INCOME, new Date());


        Controller controller = new Controller();

        System.out.println("TEST 1 add correct");
        try {
            controller.save(null);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        controller.printTransactions();

        System.out.println("\n\nTEST 2 add nurmal");

        try {
            controller.save(tr1);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        controller.printTransactions();

       System.out.println("\n\nTEST 3 limit amount Exceed");

        try {
            controller.save(tr3);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        controller.printTransactions();

        System.out.println("\n\nTEST 4 wrong city");

        try {
            controller.save(tr2);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        controller.printTransactions();

        System.out.println("\n\nTEST 5 amount per day limit");
        for (int i = 0; i < 10 ; i++)
        try {
            controller.save(new Transaction(9 + i*3, "Kiev", 300 , "***", TransactionType.INCOME, new Date()));        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        controller.printTransactions();

        System.out.println("\n\nTEST 6 count per day limit");

        for (int i = 0; i < 12 ; i++)
            try {
                controller.save(new Transaction(25 + i*4, "Odessa", 500 , "***", TransactionType.INCOME, new Date()));
            } catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        controller.printTransactions();


        System.out.println("\n\nTEST 7 count limit");

        try {
            controller.save(new Transaction(22 , "Odessa", 120 , "***", TransactionType.INCOME, new Date()));
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        controller.printTransactions();

        System.out.println("\n\nTEST 8 city filter");

        try {
            System.out.println(Arrays.toString(controller.transactionList("Slovyansk")));
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("\n\nTEST 9 city filter");

        try {
            System.out.println(Arrays.toString(controller.transactionList("Kiev")));
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}