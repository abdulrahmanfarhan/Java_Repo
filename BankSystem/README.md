# 💼 Bank System

**A Java-based console application for managing banking operations**

---

## 📖 Overview

The **Bank System** is a console-based application built in **Java** to simulate core banking operations. It enables users to manage customers, create and handle various account types, process transactions, and perform currency conversions. Designed as an educational project, it demonstrates **Object-Oriented Programming (OOP)** principles, including **inheritance**, **encapsulation**, and **polymorphism**, applied to a real-world banking scenario.

> **Developed by**: Abdulrahman Farhan  
> **Supervised by**: Dr. Jalal Kiswani  
> **Institution**: Al-Zaytoonah University of Jordan  
> **Purpose**: Educational demonstration of OOP concepts

---

## ✨ Features

- **Customer Management**: Register and manage customer details (name, email, phone).
- **Account Management**: Create and manage multiple account types:
  - 🏦 Savings Account
  - 💳 Checking Account
  - 📅 Fixed Deposit Account
  - 🕌 Islamic Account
  - 💸 Loan
- **Transaction Processing**: Perform deposits, withdrawals, and view transaction histories.
- **Financial Calculations**:
  - Interest for Savings and Fixed Deposit accounts
  - Profit for Islamic accounts
  - Monthly payments for Loans
- **Currency Conversion**: Convert between USD and JOD using fixed exchange rates.
- **User-Friendly Interface**: Interactive console-based menu for easy navigation.
- **Modular Design**: Clean, OOP-based code structure for maintainability.

---

## 🛠️ Technologies Used

- **Java**: Core programming language.
- **Java Standard Library**:
  - `ArrayList`: For dynamic data storage.
  - `Scanner`: For handling user input.
  - `LocalDate`: For date management.
- **OOP Principles**: Inheritance, encapsulation, and polymorphism for modular design.

---

## 📚 Class Structure

The project is organized into well-defined packages, each serving a specific purpose:

### `com.bank.core`
- **`Bank`**: Manages the bank entity and maintains a list of customers.
- **`Customer`**: Stores customer details (ID, name, email, phone) and their accounts.

### `com.bank.accounts`
- **`Account` (Abstract)**: Base class for all accounts, handling balance, transactions, and core operations (deposit, withdraw).
- **`CheckingAccount`**: Supports overdraft limits for flexible withdrawals.
- **`FixedDepositAccount`**: Manages fixed-term deposits with restricted withdrawals and interest calculations.
- **`IslamicAccount`**: Implements profit-sharing compliant with Islamic banking principles.
- **`Loan`**: Handles loan-specific features, including interest rates and payment terms.
- **`SavingAccount`**: Supports interest calculations and withdrawal limits.

### `com.bank.transactions`
- **`Transaction`**: Represents a single transaction (deposit or withdrawal) with type, amount, and timestamp.

### `com.bank.utilities`
- **`CurrencyConverter`**: Provides static methods for USD-to-JOD and JOD-to-USD conversions.
- **`InterestCalculator`**: Calculates simple interest or profit for applicable accounts.

### `com.bank.main`
- **`Bank_UI`**: Implements the console-based user interface for seamless interaction.
- **`main`**: Entry point of the application, initializing `Bank_UI`.

📌 **Class Diagram**: For a detailed visualization, refer to the [UML Class Diagram](BankSystem/UML%20class.pdf) in the repository.

---

## 🚀 Installation

Follow these steps to set up and run the **Bank System** locally:

### Prerequisites
- Java Development Kit (JDK) 8 or higher.

### Steps
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/abdulrahmanfarhan/Java-OOP.git
   cd Java-OOP/BankSystem
   ```

2. **Verify Java Installation**:
   ```bash
   java -version
   ```
   Ensure JDK 8 or higher is installed.

3. **Compile the Project**:
   ```bash
   javac -d . src/com/bank/*/*.java
   ```

4. **Run the Application**:
   ```bash
   java com.bank.main.main
   ```

---

## 📋 Usage

Upon launching, the application prompts for the **bank name** and displays a main menu with the following options:

1. **Register New Customer**: Add a customer with name, email, and phone number.
2. **Create New Account**: Create an account (Savings, Checking, Fixed Deposit, Islamic, or Loan).
3. **Manage Accounts**: Perform deposits, withdrawals, view transactions, or calculate interest/profit.
4. **Currency Conversion**: Convert between USD and JOD.
5. **Display Bank Info**: View bank details and customer account summaries.
6. **About**: Display project information and credits.
7. **Exit**: Close the application.

### Example Workflow
1. **Start the Application**:
   ```bash
   java com.bank.main.main
   ```

2. **Enter Bank Name**:
   ```
   MyBank
   ```

3. **Register a Customer** (Option 1):
   ```
   Enter customer name: John Doe
   Enter email (optional): john.doe@example.com
   ✅ Success: Customer John Doe registered with ID 1001
   ```

4. **Create a Savings Account** (Option 2):
   ```
   Select customer: John Doe
   Choose: 1 (Savings Account)
   Enter initial balance: 1000
   Enter withdraw limit: 500
   Enter annual interest rate (e.g., 0.05 for 5%): 0.05
   ✅ Success: Account created with ID 1
   ```

5. **Manage Account** (Option 3):
   - Deposit: `1000`
   - Withdraw: `200`
   - View transactions or calculate interest.

---

## 📊 UML Diagram

The class structure and relationships (inheritance, associations, attributes, and methods) are detailed in the [UML Class Diagram](BankSystem/UML%20class.pdf) included in the repository.

---

## 🤝 Contributing

We welcome contributions to enhance the **Bank System**! To contribute:

1. Fork the repository.
2. Create a feature branch:
   ```bash
   git checkout -b feature/your-feature
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add your feature"
   ```
4. Push to the branch:
   ```bash
   git push origin feature/your-feature
   ```
5. Open a pull request with a detailed description of your changes.

Please adhere to the project's coding standards and include clear comments.

---

## 📜 License

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.

---

## 📬 Contact

For questions or support, please contact:  
📧 **Abdulrahman Farhan** – [abdulrahmanfarhan1985@gmail.com](mailto:abdulrahmanfarhan1985@gmail.com)  
Or open an issue on [GitHub](https://github.com/abdulrahmanfarhan/Java-OOP/issues).

---

## 🙏 Acknowledgments

- **Dr. Jalal Kiswani**: Project supervisor at Al-Zaytoonah University of Jordan.
- **Al-Zaytoonah University of Jordan**: For providing the academic environment for this project.

---

**© 2025 Abdulrahman Farhan. All rights reserved.**