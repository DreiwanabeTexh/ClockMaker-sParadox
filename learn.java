import java.util.Scanner;

public class learn {

    static double balance = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int password = 1234;
        int enteredpin;
        int choice;

        System.out.println("----------------------------------");
        System.out.println("Welcome to the World Bank");
        System.out.println("----------------------------------");
        System.out.print("Enter your pin: ");
        enteredpin = scanner.nextInt();

        if (enteredpin == password) {
            do {
                System.out.println("");
                System.out.println("Access Granted ");
                System.out.println("----------------------------------");
                System.out.println("Choose your option: ");
                System.out.println("----------------------------------");
                System.out.println("[1] Check Balance");
                System.out.println("[2] Deposit");
                System.out.println("[3] Withdraw");
                System.out.println("[4] Exit");
                System.out.print("Choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        checkbalance();
                        break;
                    case 2:
                        deposit(scanner);
                        break;
                    case 3:
                        withdraw(scanner);
                        break;
                    case 4:
                        System.out.println("Thank you for using World Bank!!!");
                        break;
                    default:
                        System.out.println("Invalid Input, Please try again.");
                        break;
                }
            } while (choice != 4);
        } else {
            System.out.println("Access Denied, Incorrect Pin.");
        }
    }

    static void checkbalance() {
        System.out.println("Your current balance is " + balance);
    }

    static void deposit(Scanner scanner) {
        double deposit;
        System.out.print("Enter the amount you want to deposit: ");
        deposit = scanner.nextDouble();
        if(deposit <=0){
            System.out.println("Invalid amount Please try again.");
        }else{
        System.out.println("You have successfully deposited " + deposit + " to your account.");
        balance += deposit;
        System.out.printf("Your new balance is %.2f%n", balance);
        }
    }

    static void withdraw(Scanner scanner) {
        double withdraw;
        System.out.print("Enter the amount you want to withdraw: ");
        withdraw = scanner.nextDouble();
        scanner.nextLine(); // consume newline left by nextDouble()

        if (withdraw > balance) {
            System.out.println("Insufficient Balance, Please try again.");
            return;
        } else {
            System.out.println("You are about to withdraw " + withdraw + " from your account.");
            System.out.print("Type CONFIRM to proceed: ");
            String confirm = scanner.nextLine().toUpperCase();

            if (confirm.equals("CONFIRM")) {
                System.out.println("You have successfully withdrawn " + withdraw + " from your account.");
                balance -= withdraw;
                System.out.printf("Your new balance is %.2f%n", balance);
            } else {
                System.out.println("Transaction cancelled.");
            }
        }
    }
}
