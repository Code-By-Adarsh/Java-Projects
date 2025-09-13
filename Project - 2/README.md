# 💳 Bank Management System (Java)

Welcome to the **Smart Bank Management System** 🚀  
This project is a **Java-based CLI (Command Line Interface) application** that simulates core banking operations like account creation, deposits, withdrawals, and account management.

---

## ✨ Features

✔️ **Create Account** – Add a new customer with an initial balance  
✔️ **Deposit Money** – Deposit funds into an existing account  
✔️ **Withdraw Money** – Withdraw funds if sufficient balance exists  
✔️ **Account Details** – View individual account details  
✔️ **Delete Account** – Remove an account from the bank database  
✔️ **Bank Database** – Display all accounts with their balances  
✔️ **Exit Option** – Gracefully exit the program  

---

## 🛠️ Tech Stack

- **Language:** Java ☕  
- **Concepts Used:**  
  - OOP (Encapsulation & Abstraction)  
  - HashMap for account storage  
  - Conditional statements & loops  
  - CLI-based menu system  

---

## 📂 Project Structure

BankManageMentSystem.java
│
├── class Bank
│ ├── createAccount()
│ ├── deposit()
│ ├── withdraw()
│ ├── display()
│ ├── deleteAccount()
│ └── bankDatabase()
│
└── public class BankManageMentSystem
└── main() → Menu-driven banking operations

yaml
Copy code

---

## ▶️ How to Run

1. Clone or download this repository  
2. Compile the Java file:  
   ```bash
   javac BankManageMentSystem.java
Run the program:

bash
Copy code
java BankManageMentSystem
📖 Sample Menu
markdown
Copy code
---Welcome to Smart Bank---

-----Menu-----
1. Create Account
2. Deposit Amount
3. Withdraw Amount
4. Account Detail
5. Delete Account
6. Bank Database
7. Exit
🔑 Example Workflow
Create an account → Deposit money → Withdraw money → View details → Delete account → Exit

👨‍💻 Author
Adarsh Jayprakash Mishra
📌 B.Sc. Computer Science Student
📌 Passionate about Java, OOPs, and CLI projects

🚀 Future Enhancements
Add PIN authentication for accounts

Store accounts in a file/database for persistence

Implement interest calculation and loan system

Add GUI version using JavaFX/Swing