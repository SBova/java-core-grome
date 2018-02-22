package lesson10.abstractbigexampl;

public class EmployeeController {
    // этот класс условно отвечает за все действия с employee
    private Employee[] employees = new Employee[100];

    //это универсальный код даже если добавить еще классы
    void paySalaryToEmployees() {
        for (Employee employee : employees) {
            employee.paySalary();
            System.out.println("Salary was paid successefully to " + employee.getName() + "employee");
        }
    }





/* так писать не правильно, потому что эсли добавится еще 1 класс и другой тип выплаты зарплаты
придется много кусков кода переписать

    void paySalaryToEmployees(){
        for (Employee employee : employees){
            if(employee instanceof DeveloperEmployee){
                int newBalance = employee.getBankAccount().getBalance() + employee.getSalaryPerMonth() + 1000;
                employee.getBankAccount().setBalance(newBalance);
            }
            else if (employee instanceof ManagerEmployee){
                int newBalance = employee.getBankAccount().getBalance() + employee.getSalaryPerMonth();
                newBalance += newBalance * 0.25;
                employee.getBankAccount().setBalance(newBalance);
            }

            System.out.println("Salary was paid successefully to " + employee.getName() + "employee");
        }
    }
*/
}
