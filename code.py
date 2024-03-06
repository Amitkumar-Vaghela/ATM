import sys
import time

class ATM:
    def __init__(self):
        self.balance = 0

    def check_balance(self):
        print(f"Your balance is: ${self.balance}")
        time.sleep(5)  # Wait for 5 seconds

    def deposit(self, amount):
        self.balance += amount
        print(f"${amount} has been deposited into your account.")
        time.sleep(5)  # Wait for 5 seconds
        self.check_balance()

    def withdraw(self, amount):
        if amount > self.balance:
            print("Insufficient funds.")
        else:
            self.balance -= amount
            print(f"${amount} has been withdrawn from your account.")
            time.sleep(5)  # Wait for 5 seconds
            self.check_balance()

def main():
    atm = ATM()
    while True:
        print("\nWelcome to the ATM!")
        print("1. Check Balance")
        print("2. Deposit")
        print("3. Withdraw")
        print("4. Exit")

        choice = sys.stdin.readline().strip()

        if choice == '1':
            atm.check_balance()
        elif choice == '2':
            amount = float(input("Enter amount to deposit: $"))
            atm.deposit(amount)
        elif choice == '3':
            amount = float(input("Enter amount to withdraw: $"))
            atm.withdraw(amount)
        elif choice == '4':
            print("Thank you for using the ATM. Goodbye!")
            break
        else:
            print("Invalid choice. Please enter a number between 1 and 4.")

if __name__ == "__main__":
    main()
