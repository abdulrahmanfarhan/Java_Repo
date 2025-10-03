package chapter9.objectsClasses.Account;

/**
 *
 * @author Abdulrahman
 */
public class TestAccount {

    public static void main(String[] args) {
        //creat object(Account)
        Account AC = new Account(2004, 1000000);
        AC.setAnnualInterestRate(4.5);
        AC.withdraw(700);
        AC.deposit(700);

        System.out.println("Account ID: " + AC.getId());
        System.out.println("Balance: $" + AC.getBalance());
        System.out.println("Monthly Interest: $" + AC.getMonthlyInterest());
        System.out.println("Date Created: " + AC.getDateCreated());
    }
}
