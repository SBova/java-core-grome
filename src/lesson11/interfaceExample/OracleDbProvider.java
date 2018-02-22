package lesson11.interfaceExample;

public class OracleDbProvider implements DbProvider {

    @Override
    public void connectToDb() {
        //some logic for Oracle
    }

    @Override
    public void disconnectFromDb() {
        //some logic for Oracle
    }

    @Override
    public void encryptData() {
        //some logic for Oracle
    }
}
