Bank System
A Java-based console application for managing banking operations

📖 Overview
The Bank System is a console-based application developed in Java to simulate essential banking operations. It allows users to manage customers, create and handle various account types, process transactions, and perform currency conversions. Designed as an educational project to demonstrate Object-Oriented Programming (OOP) principles, it showcases inheritance, encapsulation, and polymorphism in a real-world banking context.
This project was developed by Abdulrahman Farhan under the supervision of Dr. Jalal Kiswani at Al-Zaytoonah University of Jordan for educational purposes.

✨ Features

Customer Management: Register and manage customer details (name, email, phone).
Account Management: Create and manage diverse account types:
Savings Account
Checking Account
Fixed Deposit Account
Islamic Account
Loan


Transaction Processing: Perform deposits, withdrawals, and view transaction histories.
Interest/Profit Calculation: Compute interest for Savings and Fixed Deposit accounts, profit for Islamic accounts, and monthly payments for Loans.
Currency Conversion: Convert between USD and JOD using fixed exchange rates.
User-Friendly Interface: Interactive console-based menu system for seamless navigation.
Modular Architecture: Organized code structure adhering to OOP principles.


🛠️ Technologies Used

Java: Core programming language for the application.
Java Standard Library:
ArrayList for dynamic data storage.
Scanner for user input.
LocalDate for handling dates.


OOP Principles: Inheritance, encapsulation, and polymorphism for modular design.


📚 Class Structure
The project is organized into several packages, each with specific responsibilities. Below is an overview of the key classes:
com.bank.core

Bank: Manages the bank entity and maintains a list of customers.
Customer: Stores customer information (ID, name, email, phone) and their associated accounts.

com.bank.accounts

Account (Abstract): Base class for all accounts, handling balance, transactions, and core operations (deposit, withdraw).
CheckingAccount: Extends Account, supports overdraft limits.
FixedDepositAccount: Extends Account, manages fixed-term deposits with interest and restricted withdrawals.
IslamicAccount: Extends Account, implements profit-sharing compliant with Islamic banking principles.
Loan: Extends Account, handles loan-specific features like interest rates and terms.
SavingAccount: Extends Account, includes interest calculations and withdrawal limits.

com.bank.transactions

Transaction: Represents a single transaction (deposit or withdrawal) with type, amount, and timestamp.

com.bank.utilities

CurrencyConverter: Provides static methods for USD-to-JOD and JOD-to-USD conversions.
InterestCalculator: Calculates simple interest or profit for applicable accounts.

com.bank.main

Bank_UI: Implements the console-based user interface for interacting with the system.
main: Entry point of the application, initializes Bank_UI.

For a detailed visualization, see the UML Class Diagram in the repository.

🚀 Installation
Follow these steps to set up and run the Bank System locally:

Clone the Repository:
git clone https://github.com/abdulrahmanfarhan/Java-OOP.git
cd Java-OOP/BankSystem


Verify Java Installation:Ensure Java Development Kit (JDK) 8 or higher is installed:
java -version


Compile the Project:Compile all Java files in the src directory:
javac -d . src/com/bank/*/*.java


Run the Application:Execute the main class:
java com.bank.main.main




📋 Usage
Upon launching the application, you will be prompted to enter the bank name. The system then presents a main menu with the following options:

Register New Customer: Add a customer with name, email, and phone number.
Create New Account: Create an account (Savings, Checking, Fixed Deposit, Islamic, or Loan) for an existing customer.
Manage Accounts: Perform operations like deposit, withdrawal, view transactions, or calculate interest/profit.
Currency Conversion: Convert amounts between USD and JOD.
Display Bank Info: View bank details and customer account summaries.
About: Display project information and credits.
Exit: Close the application.

Example Workflow

Start the Application:
java com.bank.main.main


Enter Bank Name:

Input: MyBank


Register a Customer (Option 1):

Input: Enter customer name: John Doe
Input: Enter email (optional): john.doe@example.com
Output: Success: Customer John Doe registered with ID 1001


Create a Savings Account (Option 2):

Select customer, choose 1 for Savings Account.
Input: Enter initial balance: 1000
Input: Enter withdraw limit: 500
Input: Enter annual interest rate (e.g., 0.05 for 5%): 0.05
Output: Success: Account created with ID 1


Manage Account (Option 3):

Select account and perform actions like deposit (1000), withdrawal (200), or view transactions.




📊 UML Diagram
The class relationships and structure are detailed in the UML Class Diagram included in the repository. This diagram illustrates inheritance, associations, and class attributes/methods.

🤝 Contributing
Contributions are welcome! To contribute to the Bank System:

Fork the repository.
Create a feature branch:git checkout -b feature/your-feature


Commit your changes:git commit -m "Add your feature"


Push to the branch:git push origin feature/your-feature


Open a pull request with a clear description of your changes.

Please ensure your code follows the project's coding standards and includes comments for clarity.

📜 License
This project is licensed under the MIT License. See the LICENSE file for details.

📬 Contact
For questions or support, please contact Abdulrahman Farhan at [abdulrahmanfarhan1985@gmail.com] or open an issue on GitHub.

🙏 Acknowledgments

Dr. Jalal Kiswani: Project supervisor at Al-Zaytoonah University of Jordan.
Al-Zaytoonah University of Jordan: For providing the academic environment to develop this project.


© 2025 Abdulrahman Farhan. All rights reserved.
