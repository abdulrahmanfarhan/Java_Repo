package chapter10.ObjectOrientedThinking.ATM;

import Extra.utils.Validation;
import Extra.EnglishLettersArrays.EnglishLettersArrays;

public class ATM {

    public static void main(String[] args) {
        Account[] acc = new Account[10];
        for (int id = 0; id < 10; id++) {
            acc[id] = new Account(id, 100);
        }
        System.out.println("The ID is from 0 to 9 only");
        int ch = 0;
        while (true) {
            System.out.print("Enter the ID:");
            int id = Validation.getIntInRange(0, 9);
            do {
                menu();
                System.out.print("Enter Your Choise:");
                ch = Validation.getIntInRange(1, 5);
                switch (ch) {
                    case 1:
                        getBalance(acc[id]);
                        break;
                    case 2:
                        Withdraw(acc[id]);
                        break;
                    case 3:
                        Deposit(acc[id]);
                        break;
                    case 4:
                        printArray(acc);

                }
            } while (ch == 1 || ch == 2 || ch == 3 || ch == 4);
            System.out.println("-------Sign out from the account-------");
        }
    }

    public static void menu() {
        System.out.println("--------------------------");
        System.out.println("       Main Menu         ");
        System.out.println("--------------------------");
        System.out.printf("  1 %-20s\n", "View Balance");
        System.out.printf("  2 %-20s\n", "Withdraw");
        System.out.printf("  3 %-20s\n", "Deposit");
        System.out.printf("  4 %-20s\n", "Show all the Accounts");
        System.out.printf("  5 %-20s\n", "Exit");
        System.out.println("--------------------------");
    }

    public static void getBalance(Account ac) {
        System.out.println("The balance is :" + ac.getBalance());
    }

    public static void Withdraw(Account ac) {
        System.out.print("Enter the amount:");
        double amount = Validation.getDoubleInRange(0, ac.getBalance());
        ac.withdraw(amount);
        System.out.println("Done!");
    }

    public static void Deposit(Account ac) {
        System.out.print("Enter the amount:");
        double amount = Validation.getDoubleFrom(0);
        ac.deposit(amount);
        System.out.println("Done!");
    }

    public static void printArray(Account[] acc) {
        System.out.println("---------------------------");
        for (int i = 0; i < acc.length; i++) {
            System.out.println(acc[i].toString());
            System.out.println("---------------------------");
        }
    }
}
