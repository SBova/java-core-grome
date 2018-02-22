package lesson9.utils;

public class Checker {

    // МОДИФИКАТОР ДОСТУПА ИЛИ ОБЛАСТЬ ВИДИМОСТИ

    //public - доступно из любой точки проекта( любого пакета, класса)
    //private - элемент (поле, конструктор, метод) доступен только внутри этого  класса
    // public + private = 90% всего кода
    // default + protected = остальные 10%
    //default (package-private) доступен всем внутри текущего пакета
    //protected (доступен внутри текущего класса, внутри пакета где лежит класс, во всех наследниках этого класса)

    // в порядке по возрастанию
    //private                     самый узкий
    //default (package-private)
    //protected
    //public                       самый широкий

    // негласное правило все поля класса должны быть приватными бывают исключения

    private int companyNamesValydatedCount = 0;

    public boolean checkCompanyName(String companiName) {
//        if (companiName == "Google" || companiName == "Amazon")
//            return false;
//            return true;
// тоже самое
        if (companyNamesValydatedCount > 10)
            return false;
        companyNamesValydatedCount++;
        return companiName != "Google" && companiName != "Amazon";
    }
}
