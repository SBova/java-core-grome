package lesson10.abstractbigexampl;

public abstract class Employee {
    private String name;
    private int age;
    private int yearsOfExperience;

    private String curPosition;

    private int salaryPerMonth;
    private BankAccount bankAccount;
    private Company[] companiesWorked = new Company[10];
    private String[] positionsWorked = new String[10];

    abstract void paySalary();/*/{
        int newBalanse = bankAccount.getBalance() + salaryPerMonth;
        bankAccount.setBalance(newBalanse);
    ПОСКОЛЬКУ РЕАЛИЗАЦИЯ МЕТОДА НЕ ГДЕ НЕ ИСПОЛЬЗУЕТСЯ МЫ ЕЕ УДАЛЯЕМ И ДЕЛАЕМ МЕТОД АБСТРАКТНЫМ И
    КЛАСС СООТВЕТСТВЕННО ТОЖЕ
    }/*/

    void changePosition(String newPosition) {
        //СОХРАНИТЬ ТЕКЮЩЮЮ ПОЗИЦИЮ В ИСТОРИЮ
        //ПОМЕНЯТЬ ПОЗИЦИЮ
        saveCurPositionToHistory();
        curPosition = newPosition;
    }

    private void saveCurPositionToHistory() {
        int index = 0;
        for (String pos : positionsWorked) {
            if (pos == null) { //ЕСЛИ ЕСТЬ МЕСТО ТО СОХРАНИТ МОЮ ПОЗИЦИЮ
                positionsWorked[index] = curPosition;
                break;
            }
            index++;
        }
    }

    int getBalance() {
        return bankAccount.getBalance();
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public String getName() {
        return name;
    }
}