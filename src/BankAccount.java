import java.util.ArrayList;

public class BankAccount {
    String owner;
    double balance;
    ArrayList<Transaction> transactions = new ArrayList<>();

    BankAccount(String owner, double startBalance){
        this.owner = owner;
        this.balance = startBalance;
         this.transactions = new ArrayList<>();
    }

    void deposit(double amount){
        balance+=amount;
        Transaction transaction = new Transaction("deposit", amount);
        transactions.add(transaction);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            Transaction transaction = new Transaction("withdraw", amount);
            transactions.add(transaction);
        }

    }

    void printTransactionHistory(){
        for(Transaction transaction : transactions)
            System.out.println(transaction);
    }

    double getBalance(){
        return balance;
    }










}
