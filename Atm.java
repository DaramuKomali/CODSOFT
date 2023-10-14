import java.util.*;

public class Atm {
    private static int minBalance = 1000;
    private static int balance = 10000;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("ATM Interface");
        System.out.println("==============");
        System.out.println("Enter your pin");
        int mpin = sc.nextInt();

        while (true) {
            System.out.println("Enter the operation you want to perform:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int num = sc.nextInt();

            switch (num) {
                case 1:
                    withdraw();
                    break;

                case 2:
                    deposit();
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    exit();
                    break;

                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }

    private static void withdraw() {
        System.out.println("Enter the amount to withdraw:");
        int withdrawAmount = sc.nextInt();
        if (withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal is not possible due to insufficient balance.");
        }
    }

    private static void deposit() {
        System.out.println("Enter the amount to deposit:");
        int depositAmount = sc.nextInt();
        balance = balance + depositAmount;
        System.out.println("Deposit successful.");
    }

    private static void checkBalance() {
        if (balance < minBalance) {
            System.out.println("Your account has a low balance.");
        } else {
            System.out.println("Your current balance is: " + balance);
        }
    }

    private static void exit() {
        System.out.println("Exiting the ATM. Thank you!");
        System.exit(0);
    }
}
