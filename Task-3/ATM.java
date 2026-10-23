import java.util.Scanner;

class BankAccount {
    private double Balance;

    public BankAccount(double initialBalance) {
        Balance = initialBalance;
    }

    public void deposit(double Amount) {
        if (Amount > 0) {
            Balance += Amount;
            System.out.println("Amount Deposited Successfully.");
        } else {
            System.out.println("Invalid Deposit Amount.");
        }
    }

    public void withdraw(double Amount) {
        if (Amount <= 0) {
            System.out.println("Invalid Withdrawal Amount.");
        } else if (Amount > Balance) {
            System.out.println("Insufficient Balance!");
        } else {
            Balance -= Amount;
            System.out.println("Please Collect Your Cash.");
        }
    }

    public void checkBalance() {
        System.out.printf("Available Balance : Rs. %.2f%n", Balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount Acc = new BankAccount(10000.00);
        int choice = 0;
        do {
            System.out.println("\n------ ATM MENU ------");
            System.out.println("1. Check Balance.");
            System.out.println("2. Deposit Money.");
            System.out.println("3. Withdraw Money.");
            System.out.println("4. Exit.");
            System.out.println("Enter Your Choice : ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid Input!! Please Enter a Number.");
                sc.next();
                continue;
            }
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Acc.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter Amount to Deposit : Rs. ");
                    if (sc.hasNextDouble()) {
                        double DepositAmt = sc.nextDouble();
                        Acc.deposit(DepositAmt);
                    } else {
                        System.out.println("Invalid Amount!!");
                        sc.next();
                    }
                    break;
                case 3:
                    System.out.println("Enter Amount to Withdraw : Rs. ");
                    if (sc.hasNextDouble()) {
                        double WithdrawAmt = sc.nextDouble();
                        Acc.withdraw(WithdrawAmt);
                    } else {
                        System.out.println("Invalid Amount!!");
                        sc.next();
                    }
                    break;
                case 4:
                    System.out.println("Thank You! for using our BANK ATM!!\n");
                    break;

                default:
                    System.out.println("Invalid choice!! Please Try Again.\n");
                    break;
            }

        } while (choice != 4);
        sc.close();
    }
}