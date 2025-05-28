Bank System
Overview
The Bank System is a Java-based console application designed to simulate core banking operations. It provides a user-friendly interface for managing customers, accounts, and transactions, supporting various account types such as Savings, Checking, Fixed Deposit, Islamic, and Loan accounts. This project was developed as an educational tool to demonstrate Object-Oriented Programming (OOP) principles, including inheritance, encapsulation, and polymorphism.
Developed by Abdulrahman Farhan under the supervision of Dr. Jalal Kiswani at Al-Zaytoonah University of Jordan, this system serves as a practical example of OOP concepts applied to a real-world banking scenario.
Features

Customer Management: Register and manage customer information (name, email, phone number).
Account Management: Create and manage different types of accounts (Savings, Checking, Fixed Deposit, Islamic, Loan).
Transaction Processing: Perform deposits, withdrawals, and view transaction history for each account.
Interest/Profit Calculation: Calculate interest for Savings and Fixed Deposit accounts, profit for Islamic accounts, and monthly payments for Loans.
Currency Conversion: Convert between USD and JOD using predefined rates.
User-Friendly Interface: Console-based menu system for easy navigation and operation.
Modular Design: Organized class structure following OOP principles.

Technologies Used

Java: Core programming language for the application.
Java Standard Library: Utilizes classes like ArrayList, Scanner, and LocalDate for data management and user input.
Object-Oriented Programming: Implements inheritance, encapsulation, and polymorphism.

Class Structure
The project is structured into multiple packages, each serving a specific purpose. Below is an overview of the key classes:
Package: com.bank.core

Bank: Manages the bank entity and maintains a list of customers.
Customer: Represents a bank customer, storing their details (ID, name, email, phone) and associated accounts.

Package: com.bank.accounts

Account (Abstract): Base class for all account types, handling balance, transactions, and basic operations (deposit, withdraw).
CheckingAccount: Extends Account, adds overdraft limit functionality.
FixedDepositAccount: Extends Account, supports fixed-term deposits with interest and restricted withdrawals.
IslamicAccount: Extends Account, implements profit-sharing calculations compliant with Islamic banking principles.
Loan: Extends Account, manages loan-specific features like interest rate and term.
SavingAccount: Extends Account, includes interest calculation and withdrawal limits.

Package: com.bank.transactions

Transaction: Represents a single transaction (deposit or withdrawal) with details like type, amount, and timestamp.

Package: com.bank.utilities

CurrencyConverter: Provides static methods for converting between USD and JOD.
InterestCalculator: Calculates simple interest or profit for applicable account types.

Package: com.bank.main

Bank_UI: Implements the console-based user interface for interacting with the system.
main: Entry point of the application, initializes the Bank_UI.

For a detailed class diagram, refer to the UML Class Diagram in the repository.
Installation
To run the Bank System locally, follow these steps:

Clone the Repository:
git clone https://github.com/abdulrahmanfarhan/Java-OOP.git
cd Java-OOP/BankSystem


Ensure Java is Installed:

Verify that you have Java Development Kit (JDK) 8 or higher installed:java -version




Compile the Project:

Navigate to the BankSystem directory and compile the Java files:javac -d . src/com/bank/*/*.java




Run the Application:

Execute the main class:java com.bank.main.main





Usage
Upon running the application, you will be prompted to enter the bank name. The system then displays a main menu with the following options:

Register New Customer: Add a new customer with name, email, and phone number.
Create New Account: Create an account (Savings, Checking, Fixed Deposit, Islamic, or Loan) for an existing customer.
Manage Accounts: Perform operations like deposit, withdrawal, view transactions, or calculate interest/profit for a selected account.
Currency Conversion: Convert amounts between USD and JOD.
Display Bank Info: View bank details and customer account summaries.
About: Display project information and credits.
Exit: Close the application.

Example Usage

Start the application:
java com.bank.main.main


Enter the bank name (e.g., "MyBank").

From the main menu, select option 1 to register a customer:

Input: Enter customer name: John Doe
Input: Enter email (optional): john.doe@example.com
Output: Success: Customer John Doe registered with ID 1001


Create a Savings Account (option 2):

Select customer, choose account type 1, enter initial balance (e.g., 1000), withdraw limit (e.g., 500), and interest rate (e.g., 0.05).
Output: Success: Account created with ID 1


Manage the account (option 3):

Perform a deposit or withdrawal, view transactions, or calculate interest.



UML Diagram
The class structure is visually represented in the UML Class Diagram included in the repository. This diagram illustrates the relationships between classes, including inheritance and associations.
Contributing
Contributions are welcome! To contribute to the Bank System project:

Fork the repository.
Create a new branch (git checkout -b feature/your-feature).
Make your changes and commit (git commit -m "Add your feature").
Push to the branch (git push origin feature/your-feature).
Open a pull request with a detailed description of your changes.

Please ensure your code adheres to the project's coding standards and includes appropriate comments.
License
This project is licensed under the MIT License. See the LICENSE file for details.
Contact
For questions or support, please contact Abdulrahman Farhan at [abdulrahmanfarhan1985@gmail.com] or open an issue on GitHub.
Acknowledgments

Dr. Jalal Kiswani: Project supervisor at Al-Zaytoonah University of Jordan.
