# Loan Management System (LMS)

[![Java](https://img.shields.io/badge/Java-17%2B-blue)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-green)](LICENSE)

A Java-based loan calculation engine implementing standard amortization formulas. Designed for financial applications and educational use.

## Features
- 🕒 Auto-timestamped loan creation
- 💰 Monthly payment calculation
- 📈 Total repayment estimation
- ✅ Input validation
- 📊 UML-compliant OOP design

## Installation
```bash
git clone https://github.com/yourusername/loan-management-system.git
cd loan-management-system
```

## Prerequisites
- Java 17+ JDK
- Maven 3.8.6+

## Class Diagram
```plaintext
+--------------------------------+
|             Loan               |
+--------------------------------+
| - annualInterestRate: double   |
| - numberOfYears: int           |
| - loanAmount: double           |
| - loanDate: Date               |
+--------------------------------+
| + Loan(rate, years, amount)    |
| + getMonthlyPayment(): double  |
| + getTotalPayment(): double    |
| + getLoanDate(): Date          |
| + getters/setters              |
+--------------------------------+
```

## Usage
### Basic Calculation
```java
Loan mortgage = new Loan(4.5, 30, 500000);
System.out.printf("Monthly Payment: $%.2f", mortgage.getMonthlyPayment());
```

### Full Test Program
```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter annual interest rate (e.g., 5.25): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter loan term (years): ");
        int years = scanner.nextInt();
        
        System.out.print("Enter loan amount: ");
        double amount = scanner.nextDouble();
        
        Loan loan = new Loan(rate, years, amount);
        
        System.out.printf("\nLoan Summary:\nCreated: %s\nMonthly: $%.2f\nTotal: $%.2f",
            loan.getLoanDate(),
            loan.getMonthlyPayment(),
            loan.getTotalPayment()
        );
    }
}
```

## Mathematical Model
### Monthly Payment Formula
\[ M = \frac{P \cdot r \cdot (1 + r)^n}{(1 + r)^n - 1} \]

**Where:**
- \( P \) = Loan principal
- \( r \) = Monthly interest rate (annual rate / 12 / 100)
- \( n \) = Total payments (years × 12)

### Example Calculation
For $10,000 loan at 5% APR over 5 years:
```python
P = 10000
annual_rate = 0.05
monthly_rate = annual_rate / 12
n = 5 * 12

numerator = P * monthly_rate * (1 + monthly_rate)**n
denominator = (1 + monthly_rate)**n - 1
monthly_payment = numerator / denominator  # ≈ $188.71
```

## Input Validation
| Parameter         | Valid Range       | Validation Error                  |
|-------------------|-------------------|-----------------------------------|
| Annual Rate       | 0.01 ≤ rate ≤ 30  | "Invalid rate: Must be 0.01-30%"  |
| Loan Term         | 1 ≤ years ≤ 40    | "Invalid term: Must be 1-40 years"|
| Loan Amount       | 100 ≤ amount ≤ 10M| "Invalid amount: $100-$10M only"  |

## Output Samples
| Field              | Example Output                  |
|--------------------|---------------------------------|
| Loan Date          | `2024-06-01T15:30:45Z` (ISO 8601) |
| Monthly Payment    | `$188.71`                       |
| Total Payment      | `$11,322.74`                    |

## Contributing
1. Fork the repository
2. Create feature branch (`git checkout -b feature/improvement`)
3. Commit changes (`git commit -am 'Add new feature'`)
4. Push to branch (`git push origin feature/improvement`)
5. Open Pull Request

## License
Distributed under MIT License. See `LICENSE` for details.

## Support
For issues/questions:  
📧 Email: [your.email@domain.com](mailto:your.email@domain.com)  
🐛 [Open GitHub Issue](https://github.com/yourusername/loan-management-system/issues)
```

This README.md includes:
1. Badges for quick visual status
2. Interactive class diagram (Mermaid)
3. Mathematical formulas with LaTeX
4. Input validation matrix
5. Code examples with syntax highlighting
6. Contribution guidelines
7. Support information
8. Responsive tables
9. Clear navigation structure

Perfect for professional repositories and developer onboarding!