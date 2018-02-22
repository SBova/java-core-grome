package lesson10.abstractfirstexample;

public abstract class DbProvider {
    // у абстрактно класса есть мкды и еонструко
    private String dbHost;

    //public DbProvider(String dbHost) {//конструктор используется не самим классом а его наследниками
    //  this.dbHost = dbHost;
    //}

    abstract void connectToDb();

    abstract void disconnectFromDb();

    void printDbHost() {
        System.out.println("DB host is" + dbHost);
    }

}
