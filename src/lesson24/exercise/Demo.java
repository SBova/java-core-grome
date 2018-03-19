package lesson24.exercise;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        GeneralDAO<Sys> systemDAO = new GeneralDAO<>();
        Sys system1 = new Sys(5, "...");
        systemDAO.save(system1);

        System.out.println(Arrays.deepToString(systemDAO.getAll()));

        systemDAO.save(system1);

        System.out.println(Arrays.deepToString(systemDAO.getAll()));

        GeneralDAO<Tool> toolDAO = new GeneralDAO<>();
        Tool tool1 = new Tool("java", "core");
        toolDAO.save(tool1);

        System.out.println(Arrays.deepToString(toolDAO.getAll()));

        //   GeneralDAO<Order> orderDAO = new GeneralDAO<>();

    }
}
