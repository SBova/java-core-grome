package lesson10.abstractfirstexample;

public class OracleDbProvider extends DbProvider {
    //  private String dbHost;

    @Override
    void connectToDb() {
        //logic for Oracle
    }

    @Override
    void disconnectFromDb() {
        //logic for Oracle
    }

    /*/void printDbHost()
    {
        System.out.println("DB host is " + dbHost);
    }/*/
}
