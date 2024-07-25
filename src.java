import java.util.Scanner;

public class ATM {
    private double balance;
    private int pin;
    
    public ATM(double initialBalance, int pin) {
        this.balance = initialBalance;
        this.pin = pin;
    }
    
    public void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }
    
    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }
    
    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            checkBalance();
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    
    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            checkBalance();
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    
    public boolean authenticate(int enteredPin) {
        return enteredPin == pin;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(1000.00, 1234); // Initial balance of $1000 and PIN 1234
        
        System.out.print("Enter your PIN: ");
        int enteredPin = scanner.nextInt();
        
        if (atm.authenticate(enteredPin)) {
            int option;
            do {
                atm.displayMenu();
                option = scanner.nextInt();
                
                switch (option) {
                    case 1:
                        atm.checkBalance();
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: $");
                        double depositAmount = scanner.nextDouble();
                        atm.depositMoney(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: $");
                        double withdrawAmount = scanner.nextDouble();
                        atm.withdrawMoney(withdrawAmount);
                        break;
                    case 4:
                        System.out.println("Exiting... Thank you for using ATM.");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } while (option != 4);
        } else {
            System.out.println("Invalid PIN. Access denied.");
        }
        
        scanner.close();
    }
}
