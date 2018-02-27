package lesson22.hw;

import lesson22.hw.exception.BadRequestException;

public class Controller {

    public Transaction save (Transaction transaction) throws Exception
    {
        return TransactionDAO.save(transaction);
    }

    public Transaction[] transactionList()
    {
        return TransactionDAO.transactionList();
    }

    public Transaction[] transactionList(String city) throws Exception
    {
        return TransactionDAO.transactionList(city);
    }

    public Transaction[] transactionList(int amount)
    {
        return TransactionDAO.transactionList(amount);
    }

    public void printTransactions ()
    {
        TransactionDAO.printTransactions();
    }
}